# Serialization và Deserialization
## Nội Dung
1. [Serialization trong Java](#1)
2. [Deserialization trong Java](#2)
3. [Serialization với Inheritance (Mối quan hệ IS-A)](#3)
4. [Serialization với Aggregation (Mối quan hệ HAS-A)](#4)
5. [Serialization với static data member](#5)
6. [Serialization với Array hoặc Collection](#6)
7. [Externalizable trong Java](#7)
8. [transient keyword trong Java](#8)
9. [serialVersionUID field khi implements Serializable](#9)

## 1. Serialization trong Java <a id="1"></a>
* Serialization (tuần tự hóa) trong Java là 1 cơ chế để ghi trạng thái của 1<br/>
đối tượng vào 1 byte-stream (luồng byte).
  
* Serialization chủ yếu được sử dụng trong các công nghệ Hibernate, RMI,<br/>
JPA, EJB và JMS.
  
* hoạt động ngược lại của Serialization là Deserialization.
* **ưu điểm của Serialization**
    * nó chủ yếu được sử dụng để truyền trạng thái của đối tượng qua<br/>
    mạng (được biết đến như là marshaling).

* **Serializable _interface_**
    * được cài đặt trong package **java.io.Serializable**
    * **Serializable** _interface_ là 1 Marker _interface_ (là _interface_ không chứa<br/>
      bất cứ thứ gì bên trong), được sử dụng để đánh dấu những class đã<br/>
      implements nó, để các đối tượng của các class này có thể nhận<br/>
      được 1 khả năng nhất định (với Seriablizable là khả năng<br/> Serialization).
      >ví dụ: **Cloneable**, **Remote**, ... cũng là những Marker _interface_
    * **Serializable** phải được implements bởi lớp có đối tượng cần được<br/>
  Serialization.
      
    * String class và các Wrapper class mặc định đã implements<br/>
  **Serializable** _interface_.
      
* **ví dụ về việc implements Serializable**
```java
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1427461703707854023L;

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```
* trong ví dụ trên: **Student class** đã **implements Serializable _interface_**,<br/>
vì thế các **object** của **Student class** có thể chuyển đổi thành stream <br/>
  (Serialization).

## 2. Deserialization trong Java <a id="2"></a>
* Deserialization là quá trình tái thiết lập lại đối tượng từ trạng thái đã được<br/>
serialized, đây là hoạt động ngược lại của Serialization.
  
* ví dụ, nếu ta muốn ghi thuộc tính của 1 đối tượng vào 1 file, ta sử<br/>
dụng cơ chế Serialization, khi muốn đọc 1 file để lấy được đối tượng<br/>
  ban đầu ta sử dụng cơ chế Deserialization, bằng 2 method:
    * writeObject()
    * readObject()
  
* nếu không có Serialization ta phải lưu từng field của đối tượng vào<br/>
1 file như plain text, sau đó để khôi phục giá trị ban đầu của đối tượng<br/>
  ta phải đọc dữ liệu từ file, tạo 1 đối tượng mới, set giá trị từng field đọc<br/>
  được cho đối tượng mới, rất rườm rà phức tạp.
  
>1 class muốn thực hiện cơ chế Serialization hoặc Deserialization đều<br/> 
>cần phải **implements Serializable**
> > **ObjectOutputStream** class chứa method ``writeObject()`` cho quá<br/>
> > trình Serialization
> 
> > **ObjectInputStream** class chứa method ``readObject()``   cho quá<br/>
> > trình Deserialization
## 3. Serialization với Inheritance (Mối<br/> quan hệ IS-A) <a id="3"></a>
* nếu 1 class **implements Serializable** thì tất cả subclass của nó cũng sẽ<br/>
được Serialization.
  
* xét ví dụ sau: ta có Person class là superclass của Engineer class, và<br/>
Person class thì implements Serializabl _interface_, do đó Engineer cũng<br/>
  có được cơ chế Serialization như Person, từ đó các đối tượng của <br/>
  Engineer class cũng sẽ được truyền vào byte-stream và lấy ra khỏi<br/>
  byte-stream.
```java
import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersioUID = 1234567890L;

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
```
```java
public class Engineer extends Person {
    private String certificate;

    public Engineer(int id, String name, String certificate) {
        super(id, name);
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Engineer [certificate=" + certificate + ", " + super.toString() + "]";
    }
}
```
```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UsingOutputStream {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("Engineer.txt"));
            Engineer engineer = new Engineer(22, "Jack", "Java");
            oos.writeObject(engineer);
            oos.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("success...");
    }
}
```
* sau khi sử dụng OutputStream thực hiện ghi đối tượng vào file, kết quả
```
OUTPUT
success...
```
* sử dụng InputStream thực hiện đọc từ file để lấy ra thông tin đối tượng
```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UsingInputStream {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Engineer.txt"));
            Engineer engineer = (Engineer) ois.readObject();
            System.out.println(engineer);
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
```
```
OUTPUT
Engineer [certificate=Java, Person [id=22, name=Jack]]
```
## 4. Serialization với Aggregation (Mối<br/> quan hệ HAS-A) <a id="4"></a>
* khi 1 class có tham chiếu của 1 class khác bên trong nó, thì tất cả các<br/>
tham chiếu đó cũng phải implements Serializable _interface_.
  
* nếu các tham chiếu đó không được implemets Serializable, thì cơ chế<br/>
Serialization sẽ không được thực hiện.
  
* khi đó **NotSerializableException** sẽ được ném ra.

* **xét ví dụ sau**, ta có 1 class Address và class này không được<br/>
implements Serializable _interface_, 1 class Company chứa tham chiếu<br/>
  của Address class và được implements Serializable _interface_, khi thực<br/>
  hiện ghi thông tin của đối tượng Company vào luồng OutputStream, thì<br/>
  **NotSerializableException** sẽ bị ném ra, vì đối tượng của Address chưa<br/>
  được đánh dấu là Serializable, nên không có khả năng đưa vào stream.  
```java
public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}
```
```java
import java.io.Serializable;

public class Company implements Serializable {
    public static final long serialVersionUID = 1222333333L;

    private int id;
    private String name;
    private Address address; // HAS-A relationship

    public Company(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
```
```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Company.txt"));
            Address address = new Address("14", "HCM", "South");
            Company company = new Company(9, "TheCompany", address);
            oos.writeObject(company);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }

        System.out.printf("success...");
    }
}
```
```
OUTPUT
java.io.NotSerializableException: _45_Java_IO._01_Serialization_Deserialization._03_Serializable_Aggregation.Address
	at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1185)
	at java.base/java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1553)
	at java.base/java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1510)
	at java.base/java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1433)
	at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1179)
	at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:349)
	at _45_Java_IO._01_Serialization_Deserialization._03_Serializable_Aggregation.Main.main(Main.java:14)
success...
```
* vì Address class không **implements Serializable** _interface_, nên dù class<br/>
Company có **implements Serializable** _interface_, thì cơ chế Serialization<br/>
  cũng không thể thực hiện được (do Company object chứa Address <br/>
  object)
 
## 5. Serialization với static data member <a id="5"></a>
* **static data member** sẽ không được **serialize**, bởi vì **static** thuộc về<br/>
class chứ không của riêng đối tượng cụ thể nào.
  
```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // thông tin ban đầu của đối tượng trước khi serialized
        Student studentObj = new Student(20, "Jack", 20);
        String fileName = "students.txt";

        // Serialization
        try {
            // thiết lập stream
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // ghi đối tượng vào stream
            out.writeObject(studentObj);

            // đóng stream
            file.close();
            out.close();

            System.out.println("studentObj has been serialized");
            System.out.println("data before deserialization");
            printData(studentObj);

            System.out.println("change value of data static member: count 20 -> 2000");
            studentObj.count = 2000;
        } catch (IOException e) {
            e.printStackTrace();
        }

        studentObj = null;
        System.out.println("set studentObj=null to get data from InputStream");

        // Deserialization
        try {
            // thiết lập stream
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            // đọc đối tượng từ stream
            studentObj = (Student) in.readObject();
            
            // đóng stream
            file.close();
            in.close();

            System.out.println("studentObj has been deserialized");
            System.out.println("data after deserialization");
            printData(studentObj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printData(Student student) {
        System.out.println("student static count: " + student.count);
        System.out.println("student name: " + student.name);
        System.out.println("student age: " + student.age);
    }
}
```
```
OUTPUT
studentObj has been serialized
data before deserialization
student static count: 20
student name: Jack
student age: 20
change value of data static member: count 20 -> 2000
set studentObj=null to get data from InputStream
studentObj has been deserialized
data after deserialization
student static count: 2000
student name: Jack
student age: 20
```
> từ output trên ta thấy:<br/>
> static count = 20 (ban đầu)<br/>
> sau đó tất cả thông tin đều ghi ra file gồm: static count, name, age<br/>
> tiếp theo bên ngoài ta gán static count=2000<br/>
> static count=2000 không liên quan gì đến static count=20 trong file<br/>
> kế đến ta gán object=null (mọi dữ liệu của object đều mất trừ static <br/>count)<br/>
> vì static count là thuộc về class, không thuộc object<br/>
> cuối cùng ta dùng object=null hứng dữ liệu từ file<br/>
> ta thấy static count của object = 2000, mặc dù lúc đầu khi ghi ra file là<br/>
> 20<br/>
> kết luận là **static data member** SẼ KHÔNG ĐƯỢC GHI RA FILE
> 
## 6. Serialization với Array hoặc<br/> Collection <a id="6"></a>
* ngoài kiểu String và các kiểu Wrapper (Integer, Long, Double, ...) đã <br/>
**implements Serializable** sẽ có khả năng Serialization.
  
* nhưng nếu 1 object array hoặc 1 object collection chứa kiểu dữ liệu<br/>
khác String hoặc Wrapper, thì kiểu dữ liệu đó phải **implements<br/>
  Serializable**, nếu không cơ chế Serialization sẽ thất bại.
## 7. Externalizable trong Java <a id="7"></a>
* **Externalizable** _interface_ cung cấp khả năng ghi trạng thái của 1 đối <br/>
tượng vào 1 byte-stream ở định dạng nén, nó không phải Marker<br/>
  _interface_
  
* **Externalizable** _interface_ cung cấp 2 abstract method:
  * ``public void writeExternal(ObjectOutput oo) throws IOException``
  * ``public void readExternal(ObjectInput oi) throws IOException``
## 8. transient keyword trong Java <a id="8"></a>
* nếu **static data member** sẽ không bị ảnh hưởng bởi cơ chế <br/>**Serialization**.
* thì với keyword **transient** cũng có tác dụng tương tự như vậy.
* nếu ta muốn **1 data member** bỏ qua quá trình **serialized**, nhưng không<br/>
muốn nó là **static**, thì giải pháp là dùng **transient**.
  
* **transient data member** thuộc về đối tượng, nhưng nó không được<br/>
**serialized**, khi cơ chế **Deserialization** xảy ra, các **transient data<br/>
  member** sẽ được trả về với giá trị mặc định.
  
* xét ví dụ sau:
```java
import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 123321231L;

    transient int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
```
```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "Employee.txt";
        Employee employee = new Employee(10, "Jack", 20);

        // Serialization
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(employee);

            System.out.println("employee object has been serialized");
            System.out.println("data before Deserialization");
            printData(employee);

            employee = null;
            System.out.println("assign employee object = null to get data during deserialization");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Deserialization
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            employee = (Employee) in.readObject();

            System.out.println("employee object has been deserialization");
            System.out.println("data after Deserialization");
            printData(employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printData(Employee employee) {
        System.out.println("Employee:");
        System.out.println("\t id=" + employee.id);
        System.out.println("\t name=" + employee.name);
        System.out.println("\t age=" + employee.age);
    }
}
```
```
OUTPUT
employee object has been serialized
data before Deserialization
Employee:
	 id=10
	 name=Jack
	 age=20
assign employee object = null to get data during deserialization
employee object has been deserialization
data after Deserialization
Employee:
	 id=0
	 name=Jack
	 age=20
```
* ở ví dụ trên transient id đã không được serialized.
  * đầu tiên ta có transient id = 10
  * thực hiện Serialization
  * cho employee = null để hứng dữ liệu khi Deserialization
  * thực hiện Deserialization
  * ta có transient id = 0

* suy ra, transient id đã không được ghi ra file, nếu đã ghi thì khi đọc từ<br/>
file dữ liệu trả về phải = 10, nhưng nó trả về giá trị mặc định của kiểu int.
  
## 9. serialVersionUID field khi implements <br/>Serializable <a id="9"></a>
* **Serialization Runtime** liên kết (associate) 1 version number với mỗi<br/>
class **implements Serializable**, version number được gọi là <br/>
  **serialVersionUID**, là thứ sẽ được sử dụng trong **Deserialization** để<br/>
  xác minh **writeObject()** và **readObject()** của 1 đối tượng serialized đã<br/>
  tải các class cho đối tượng đó, mà class đó tương thích với quá trình<br/>
  **Serialization**, nghĩa là class của đối tượng được serialized, cũng chính<br/>
  là class của đối tượng được deserilized.
  
* nếu **readObject()** 1 đối tượng của class có **serialVersionUID** khác với<br/>
**serialVersionUID** của class có đối tượng được **writeObject()**, thì trong<br/>
  quá trình **Deserialization** sẽ ném ra **InvalidClassException**.
  
* 1 class **implements Serializable** có thể khai báo explicitly 1 UID của<br/>
chính nó, với cú pháp của trường dữ liệu ví dụ như sau:<br/>
  ``ANY-MODIFIER static final long serialVersionUID = 123L;``
  
* nếu không khai báo explicitly 1 serialVersionUID thì trong **Serialization<br/>
Runtime** sẽ tính và gán 1 giá trị serialVersionUID cho class đã<br/>
  **implements Serializable**. tuy nhiên KHUYẾN KHÍCH KHAI BÁO <br/>
  EXPLICITLY
  
___
THE END