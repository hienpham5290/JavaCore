# Generic Type
* Generic là 1 tính năng trong Java, giúp lập trình viên có thể chỉ định rõ<br/>
kiểu dữ liệu ngay tại thời điểm biên dịch (compile time).
  
## Nội Dung
1. [Tại Sao Lại Cần Có Generic](#1)
2. [Một Số Qui Ước Đặt Tên Cho Kiểu Generic](#2)
3. [Ký Tự Diamond <>](#3)
4. [Kiểu Generic Cho Class Và Interface](#4)

    4.1. [Kiểu Generic Cho Class](#4.1)

    4.2. [Thừa Kế Generic](#4.2)
   
    4.3. [Kiểu Generic Cho Interface](#4.3)
   
5. [Phương Thức Generic](#5)
6. [Khởi Tạo Đối Tượng Generic](#6)
7. [Mảng Generic](#7)
8. [Generic Với Ký Tự Đại Diện](#8)

    8.1. [Ví Dụ Với Kiểu Đại Diện](#8.1)
   
    8.2. [Đối Tượng Đại Diện Không Thể Sử Dụng Phương Thức Generic](#8.2)
   
    8.3. [Wildcard Không Thể Tham Gia Trong Toán Tử New](#8.3)
   
9. [Ưu Điểm Của Generic](#9)
10. [Một Số Hạn Chế Khi Sử Dụng Generic](#10)

## 1. Tại Sao Lại Cần Có Generic <a id="1"></a>
* Generic là khái niệm được đưa vào Java từ phiên bản 5, trước khi đưa<br/>
ra khái niệm Generic là gì, chúng ta hãy xét đoạn code của Java trước<br/>
  phiên bản 5.
  
```java
List list = new ArrayList();
```
* với khai báo trên, giả sử chúng ta chỉ muốn làm việc với kiểu đối tượng<br/>
Integer, nhưng bởi vì List là 1 collection của đối tượng Object, nên chúng<br/>
  ta có thể sử dụng nó với bất kỳ kiểu dữ liệu nào.
  
* tại nơi nào đó trong chương trình, bạn thêm vào danh sách trên 1 phần<br/>
tử không phải kiểu Integer, thì nó vẫn hợp lệ, Compile Time sẽ không báo<br/>
  lỗi, khai báo sau sẽ vẫn hợp lệ:
  
```java
list.add(10);
list.add("Java");
list.add(true);
```
* như đoạn code trên, trước khi có Generic Type, ta có thể thêm các phần<br/>
tử kiểu Integer, String, Boolean, tuy nhiên, khi lấy ra các phần tử và ép<br/>
  kiểu về Integer, 1 Exception sẽ bị ném ra.
  
* đó là nguyên nhân của sự cần thiết phải có của Generic trong Java, với<br/>
Generic chúng ta có thể chỉ định kiểu dữ liệu mà chúng ta sẽ làm việc<br/>
  ngay tại thời điểm biên dịch (Compile Time).
  
* với Generic ta có thể khai báo lại như sau:
```java
List<Integer> list = new ArrayList<Integer>();
```
* với kiểu khai báo trên, khi lập trình viên thêm 1 phần tử không phải<br/>
Integer, trình biên dịch (Compiler) sẽ báo lỗi ngay.
  
## 2. Một Số Qui Ước Đặt Tên Cho Kiểu Generic <a id="2"></a>
* đặt tên kiểu tham số rất quan trọng để học Generic, nó không bắt buộc,<br/>
tuy nhiên chúng ta nên đặt theo quy ước chung để dễ đọc, dễ bảo trì, các <br/>
  kiểu tham số thông thường như sau:
  
    * E - element (phần tử) - sử dụng phổ biến trong Collection Framework
    * K - key (khóa)
    * V - value (giá trị)
    * N - number (số) - dùng cho kiểu số: Integer, Double, Float...
    * T - type (kiểu) - kiểu dữ liệu bất kỳ thuộc Wrapper class: String,<br/>
    Long, Float, ...
    * S, U, V, ... - được sử dụng để đại diện cho các kiểu do lập trình viên<br/>
    định nghĩa
## 3. Ký Tự Diamond <> <a id="3"></a>
* từ Java 7, có thể thay thế các đối số kiểu dữ liệu cần thiết, để gọi hàm<br/>
khởi tạo (constructor) của 1 lớp được tham số hóa Generic bằng cặp<br/>
  dấu mở đóng ngoặc nhọn **< >**, trình biên dịch (compiler) sẽ xác định hoặc<br/>
  suy ra các kiểu dữ liệu từ ngữ cảnh sử dụng.
  
* ví dụ có thể khởi tạo 1 List Integer bằng câu lệnh sau:
```java
// trước Java 7
List<Integer> list7 = new ArrayList<Integer>();

// từ Java 7+
List<Integer> list7s = new ArrayList<>();
```
* để tìm hiểu thêm về ký hiệu **< >**, xem thêm thông tin tại 
  [Oracle Document](https://docs.oracle.com/javase/tutorial/java/Generic/genTypeInference.html)

## 4. Kiểu Generic Cho Class Và Interface <a id="4"></a>

   ### 4.1. Kiểu Generic Cho Class <a id="4.1"></a>
   * ví dụ dưới đây định nghĩa 1 class Generic, KeyValuePair là 1 class<br/>
Generic, nó chứa 1 cặp key-value (khóa - giá trị).
     
```java
/*
    định nghĩa 1 class KeyValuePair
    đây là class Generic với 2 kiểu tham số 
    là K và V
    K và V sẽ được chỉ định rõ trong khi sử dụng
    đến class KeyValuePair
 */

public class KeyValuePair<K, V> {
    // fields - các trường thuộc tính
    private K key;
    private V value;

    // constructor - hàm khởi tạo
    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // getter
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    // setter
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
```
   * K và V trong class KeyValuePair<K, V> được gọi là tham số Generic,<br/>
nó là kiểu tham chiếu nào đó, khi sử dụng class này phải xác định cụ<br/>
     thể kiểu tham số
     
```java
public class KeyValuePairExample {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("Java", 8);
        String name = keyValuePair.getKey();
        Integer version = keyValuePair.getValue();
        System.out.println("name=" + name + ", version=" + version);
    }
}
```
```
OUTPUT
name=Java, version=8
```
   ### 4.2. Thừa Kế Generic <a id="4.2"></a>
   * 1 class extends từ 1 class Generic có thể:
        * giữ nguyên các tham số Generic
        * thêm các tham số Generic
        * chỉ định rõ kiểu dữ liệu mà không dùng ký hiệu
    
   * giữ nguyên các tham số Generic
```java
/*
    Teacher<K, V> extends Person<K, V>
    và giữ nguyên các tham số Generic
 */
public class Teacher<K, V> extends Person<K, V> {
    public Teacher(K key, V value) {
        super(key, value);
    }
}
```
   * thêm các tham số Generic
```java
/*
    Police<P> extends Person<String, Integer>
    thêm kiểu Generic P cho riêng lớp Police
    đồng thời chỉ định rõ kiểu dữ liệu cho tham số Generic
    ở lớp cha Person
 */

public class Police<P> extends Person<String, Integer>{
    private P position;

    public Police(String key, Integer value, P position) {
        super(key, value);
        this.position = position;
    }

    public P getPosition() {
        return position;
    }

    public void setPosition(P position) {
        this.position = position;
    }
}
```
   * chỉ định rõ kiểu dữ liệu mà không dùng ký hiệu
```java
/*
    Student extends Person<String, Integer>
    và chỉ định rõ kiểu dữ liệu thay vì dùng Generic
 */

public class Student extends Person<String, Integer>{
    public Student(String name, Integer id) {
        super(name, id);
    }
}
```
   ### 4.3. Kiểu Generic Cho Interface <a id="4.3"></a>
   * ta có class Teacher
```java
public class Teacher {
    private String name;
    private int id;

    public Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
```
   * và class Student
```java
public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
```
   * cài đặt interface GenericDAO
```java
/*
    cài đặt 1 interface với kiểu Generic T
 */
public interface GenericDAO<T> {
    void insert(T obj);
    void update(T obj);
}
```
   * cài đặt class GenericDAOImpl implements interface GenericDAO
```java
public class GenericDAOImpl<T> implements GenericDAO<T> {
    @Override
    public void insert(T obj) {
        // do something
    }

    @Override
    public void update(T obj) {
        // do something
    }
}
```
   * cài đặt class TeacherDAO extends class GenericDAOImpl, đồng thời chỉ<br/>
định rõ kiểu dữ liệu sử dụng là Teacher
     
```java
public class TeacherDAO extends GenericDAOImpl<Teacher>{
    // 
}
```
   * cài đặt class StudentDAO extends class GenericDAOImpl, đồng thời chỉ<br/>
định rõ kiểu dữ liệu sử dụng là Student
     
```java
public class StudentDAO extends GenericDAOImpl<Student>{
    //
}
```
   * class Main thực thi chương trình
```java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Student", 99);
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.insert(student);

        Teacher teacher = new Teacher("Teacher", 100);
        TeacherDAO teacherDAO = new TeacherDAO();
        teacherDAO.update(teacher);
    }
}
```
## 5. Phương Thức Generic <a id="5"></a>
* ta có thể viết 1 method với kiểu Generic sẽ được gọi với các đối số <br/>
có kiểu khác nhau, dựa trên đối số (String, Float, Student...) được<br/>
  truyền vào cho method, compiler sẽ xử lý từng lệnh mọi method 1 cách<br/>
  thích hợp.
  
* qui tắc định nghĩa 1 method Generic
    * tham số kiểu trong cặp ngoặc nhọn, nằm trước return type của<br/>
    method, ví dụ: \<E>
      
    * có thể có 1 hoặc nhiều tham số kiểu trong cặp ngoặc nhọn, và<br/>
    các tham số kiểu sẽ phân cách với nhau bởi dấu phẩy nếu có nhiều<br/>
      hơn 1 tham số kiểu.
      
    * tham số kiểu có thể được dùng như return type của method, và hoạt<br/>
    động như 1 trình giữ vị trí cho kiểu của đối số được truyền vào cho<br/>
      method Generic, chúng được biết như là đối số kiểu thực.
      
    * phần thân của method Generic cũng khai báo như bất kỳ method<br/>
    thông thường.
      
    * lưu ý: các tham số kiểu chỉ đại diện cho các kiểu dữ liệu tham chiếu,<br/>
    không phải kiểu primitive (int, long, double, float, ....).
      
    * Ví dụ:
    
```java
public class _01_Method_Generic {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("intArray:");
        PrintArray(intArray);

        System.out.println("doubleArray:");
        PrintArray(doubleArray);

        System.out.println("charArray:");
        PrintArray(charArray);
    }

    // khai báo 1 method in 1 mảng với bất kỳ kiểu dữ liệu
    // bằng cách sử dụng Generic
    public static <T> void PrintArray(T[] array) {
        for (T e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
```
```
OUTPUT
intArray:
1 2 3 4 5 
doubleArray:
1.1 2.2 3.3 4.4 
charArray:
H E L L O 
```

* tham số kiểu được giới hạn
    * đôi khi ta cần hạn chế loại kiểu được phép để truyền vào tham số<br/>
    kiểu.
      
    * ví dụ, ta cần 1 method hoạt động trên những con số, và method đó<br/>
    chỉ nhận instance của kiểu số hoặc kiểu con của kiểu số, đây được<br/>
      gọi là tham số kiểu được giới hạn.
      
    * nghĩa là lúc này method chỉ chấp nhận những kiểu được chỉ định,<br/>
     hoặc những kiểu là con của kiểu được chỉ định.
      
    * để khai báo tham số kiểu được giới hạn: vị trí đặt thành phần tham <br/>
      số kiểu vẫn nằm trước kiểu trả về của method, và nằm trong cặp <br/>
      ngoặc nhọn **< >**, chỉ khác là bên trong có 3 thành phần khác:
        * danh sách các tham số kiểu nếu có nhiều hơn 1, và cách nhau<br/>
        bởi dấu phẩy.
        * từ khóa **extends**.
        * kiểu của giới hạn trên (kiểu tối đa được sử dụng).
    
    * ví dụ sau minh họa cách **extends** được sử dụng trong method<br/>
    Generic (đối với class), hoặc **implements** được sử dụng trong <br/>
      method Generic (đối với interface), ví dụ này là method Generic<br/>
      return giá trị lớn nhất của 3 object Comparable
      
```java
public class _02_Method_Bounded_Generic {
    public static void main(String[] args) {
        System.out.println("max of: 4, 5, 6 - is: " + 
                maximum(4, 5, 6));
        System.out.println("max of: 7.7, 8.8, 9.9 - is: " + 
                maximum(7.7, 8.8, 9.9));
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            return max = y;
        }
        if (z.compareTo(max) > 0) {
            return max = z;
        }
        return max;
    }
}
```
```
OUTPUT
max of: 4, 5, 6 - is: 5
max of: 7.7, 8.8, 9.9 - is: 8.8
```
## 6. Khởi Tạo Đối Tượng Generic <a id="6"></a>
* đôi khi trong 1 class Generic, ta cần lệnh khởi tạo đối tượng, nhưng<br/>
lại muốn sử dụng kiểu Generic, giống như sau:
  
```java
T obj = new T(); // Error
```
* nhưng dòng lệnh trên sẽ báo lỗi, vì:
    * \<T> không hề tồn tại ở Runtime, ở Runtime JVM cần xác định 1 kiểu<br/>
    cụ thể.
      
    * mọi kiểu \<T> đều như nhau, nó được hiểu là kiểu Object tại<br/> Runtime.
    * kiểu Generic \<T> chỉ có ý nghĩa với Compiler tại Compile Time nhằm<br/>
    để kiểm soát code của người lập trình.
      
* muốn khởi tạo đối tượng Generic \<T> cần cung cấp cho JVM đối tượng<br/>
Class\<T>, JVM sẽ khởi tạo đối tượng \<T> tại Runtime bằng Java <br/>Reflection.
  
* nhưng ta vẫn có thể khai báo biến đối tượng \<T> trực tiếp như sau:
```java
T obj;
```
```java
public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
```
* cài đặt class có chứa method hay constructor khởi tạo 1 đối tượng <br/>Generic.
```java
import java.lang.reflect.InvocationTargetException;

public class GenericInstance<T> {
    // khai báo đối tượng kiểu Generic <T>
    private T obj;

    // constructor khởi tạo đối tượng kiểu Generic <T> sử dụng Reflection
    public GenericInstance(Class<T> clazz)
            throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        this.obj = (T) clazz.getDeclaredConstructor().newInstance();
    }

    // getter
    public T getObj() {
        return obj;
    }
}
```
* class Main
```java
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException,
            InvocationTargetException, NoSuchMethodException {

        GenericInstance<Student>  genericInstance = new GenericInstance<>(Student.class);

        Student student = genericInstance.getObj();

        System.out.println(student);
    }
}
```
## 7. Mảng Generic <a id="7"></a>
* có thể khai báo 1 mảng Generic
```java
T[] array;
```
* nhưng không thể khởi tạo trực tiếp mảng Generic
```java
T[] array = new T[10]; // Error
```
* vì kiểu Generic KHÔNG HỀ tồn tại ở Runtime.
* kiểu Generic chỉ có tác dụng vởi Compiler, dùng để kiểm soát code của<br/>
người lập trình ở Compile Time.
  
* điều có có nghĩa là để khởi tạo mảng, Compiler cần biết rõ \<T> là cái gì<br/>
mới có thể (compile) new T[10], nếu nó không biết rõ, nó mặc định coi<br/>
  \<T> là Object
  
* nếu muốn khởi tạo mảng Generic, cần phải truyền cho Java đối tượng<br/>
Class\<T>, giúp JVM có thể khởi tạo mảng Generic tại Runtime, bằng<br/>
  cách sử dụng Java Reflection.
  
* ví dụ về khởi tạo mảng Generic:
```java
import java.lang.reflect.Array;

public class GenericArrayConstructor<T> {
    private Class<T> clazz;
    private final int size = 10;

    private T[] array;

    public GenericArrayConstructor(Class<T> clazz) {
        this.clazz = clazz;
        array = (T[]) Array.newInstance(clazz, size);
    }

    public T[] getArray() {
        return array;
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        GenericArrayConstructor<Integer> generic = 
                new GenericArrayConstructor<>(Integer.class);
        Integer[] array = generic.getArray();
        array[0] = 10;
        array[9] = 90;
    }
}
```
* ví dụ về kiểu mảng Generic giống như method Generic thông thường
```java
public class GenericArrayType<T> {
    private T[] array;

    public GenericArrayType(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getFirstElementInArray() {
        if (this.array == null || this.array.length == 0) {
            return null;
        }

        return this.array[0];
    }

    public T getLastElementInArray() {
        if (this.array == null || this.array.length == 0) {
            return null;
        }
        return this.array[this.array.length - 1];
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {10, 20, 30};
        GenericArrayType<Integer> generic = new GenericArrayType<>(array);
        Integer first = generic.getFirstElementInArray();
        Integer last = generic.getLastElementInArray();
        System.out.println("first: " + first); // first: 10
        System.out.println("last: " + last); // last: 30
    }
}
```
## 8. Generic Với Ký Tự Đại Diện <a id="8"></a>
* trong việc sử dụng kiểu Generic, ký hiệu dấu chấm hỏi **?**, được gọi là<br/>
  ký tự đại diện (wildcard), nó khác với những ký hiệu chữ cái, nó đại<br/>
  cho 1 loại không rõ ràng.
  
* 1 kiểu tham số hóa đại diện (wildcard parameterized type) là 1 trường<br/>
hợp của kiểu Generic.
  
* 1 số ví dụ cách sử dụng ký tự wildcard
    * Collection<?>
    * List<? extends Number>
    * Comparator<? super String>
    * Pair<String, ?>
    
* ký tự đại diện có thể được sử dụng trong các tình huống:
    * parameter
    * field
    * local variable
    * return type
    
* ký tự đại diện không được dùng trong:
    * đối số (agrument) trong việc gọi method Generic
    * khởi tạo đối tượng class Generic
    * kiểu cha (supertype)
    
* các ký tự đại diện nằm ở vị trí khác nhau có ý nghĩa khác nhau:

Tên gọi|Cách viết|Ý nghĩa|Ví dụ
----|----|----|----
Unbounded <br/>Wildcard|\<?>|chấp nhận tất cả <br/>các đối số (chứa <br/>mọi kiểu đối <br/>tượng)|Collection<?><br/>mô tả 1 collection chấp nhận<br/>mọi kiểu đối tượng làm đối số
Upper <br/>Bounded<br/>Wildcard|<? extends type>|chấp nhận các<br/> đối số là kiểu<br/>đối tượng mà kế<br/>thừa từ **type** <br/>hoặc là **type**|List<? extends Number><br/>mô tả danh sách chấp nhận<br/>các đối số kế thừa Number<br/>hoặc là Number làm đối số
Lower<br/>Bounded<br/>Wildcard|<? super type>|chấp nhận các<br/>đối số là **type**<br/>hoặc các kiểu là<br/>cha của **type**|Comparator<? super String><br/>mô tả 1 bộ so sánh mà đối số<br/>được chấp nhận là String<br/>hoặc các kiểu đối tượng là<br/> cha của String

   ### 8.1. Ví Dụ Với Kiểu Đại Diện <a id="8.1"></a>
* ví dụ sử dụng upper bounded wildcard **<? extend type>**
```java
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCard {
    public static void main(String[] args) {
        // Upper Bounded Integer List
        List<Integer> list1= Arrays.asList(4,5,6,7);

        // show tổng các phần tử trong list, sử dụng method
        // sum có sử dụng wildcard
        System.out.println("sum of list1 = " + sum(list1));

        //Double list
        List<Double> list2=Arrays.asList(4.1,5.1,6.1);

        //printing the sum of elements in list
        System.out.print("Total sum is:"+sum(list2));
    }

    // Generic Method sử dụng WildCard (ký tự đại diện)
    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
```
```
OUTPUT
sum of list1 = 22.0
Total sum is:15.299999999999999
```

* ví dụ sử dụng lower bounded wildcard <? super type>
```java
import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // Integer list1 object is being passed
        printOnlyIntegerOrSuperClass(list1);

        // Number List
        List<Number> list2 = Arrays.asList(1, 3, 4, 5, 6);
        printOnlyIntegerOrSuperClass(list2);
    }

    // wildcard chỉ nhận Integer hoặc các superclass của Integer
    // ví dụ: Double là không thể, vì Integer và Double không liên quan kế thừa
    public static void printOnlyIntegerOrSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }
}
```
```
OUTPUT
[4, 5, 6, 7]
[1, 3, 4, 5, 6]
```

* ví dụ sử dụng unbounded wildcard
```java
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList1 = Arrays.asList(1.2, 4.4, 2.4, 5.66, 2.333);
        List<String> stringList1 = Arrays.asList("android", "java", "sql");

        printList(integerList1);
        printList(doubleList1);
        printList(stringList1);
    }

    // phương thức sử dụng unbounded wildcard, không giới hạn kiểu dữ liệu của
    // đối số truyền vào
    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
```
```
OUTPUT
[1, 2, 3, 4, 5]
[1.2, 4.4, 2.4, 5.66, 2.333]
[android, java, sql]
```

   ### 8.2. Đối Tượng Đại Diện Không Thể Sử Dụng Phương<br/> Thức Generic <a id="8.2"></a>
```java
import java.util.ArrayList;
import java.util.List;

public class WildcardObjectExample {
    public static void main(String[] args) {
        // khởi tạo 1 List chứa các phần tử kiểu String
        List<String> stringList = new ArrayList<>();

        // sử dụng phương thức Generic: add(E)
        // thêm phần tử khác null vào List
        stringList.add("Tom");
        stringList.add("Jerry");

        // thêm phần tử null vào List
        stringList.add(null);
        System.out.println("stringList: " + stringList);

        // khai báo 1 đối tượng chứa các phần tử là Wildcard
        List<? extends Object> wildcardList = stringList;

        // sử dụng phương thức Generic: add(E)
        // đối tượng kiểu Wildcard không thể sử dụng phương
        // thức Generic add(E) để
        // thêm phần tử khác null vào đối tượng kiểu Wildcard
//        wildcardList.add("Cat"); // Error

        // đối tượng kiểu Wildcard vẫn có thể sử dụng phương
        // thức Generic add(E) để thêm phần tử null
        wildcardList.add(null);
        wildcardList.add(null);
        System.out.println("wildcardList: " + wildcardList);
    }
}
```
```
OUTPUT
stringList: [Tom, Jerry, null]
wildcardList: [Tom, Jerry, null, null, null]
```
   ### 8.3. Wildcard Không Thể Tham Gia Trong Toán Tử New <a id="8.3"></a>
* wildcard parameterized type không phải là 1 kiểu cụ thể, cho nên nó<br/>
không thể xuất hiện trong toán tử new (toán tử new dùng để cấp phát bộ<br/>
  nhớ cho 1 đối tượng, và phải xác định đúng kiểu của đối tượng tại ô nhớ<br/>
  đó).
  
```java
// Tham số Wildcard không thể tham gia trong toán tử new.
List<? extends Object> list= new ArrayList<? extends Object>(); // Error
```
## 9. Ưu Điểm Của Generic <a id="9"></a>
* safe-type: kiểu dữ liệu an toàn, chúng ta chỉ có thể giữ được 1 loại dữ<br/>
liệu trong đối tượng được tạo ra từ class Generic, nó không cho phép<br/>
  lưu trữ thêm 1 loại kiểu dữ liệu thứ 2 vào.
  
* kiểm soát lỗi tại Compile Time: trước khi vào Runtime, việc thêm dữ liệu<br/>
vào được kiểm soát chặt chẽ, nếu cố tình JVM sẽ thông báo lỗi ngay tại<br/>
  Compile Time, chứ không đợi đến khi Runtime mới phát hiện Runtime <br/>Error.
  
* hạn chế ép kiểu thủ công (cast type) có khả năng sai sót và gây ra lỗi.
* reusable: tái sử dụng đơn giản hơn với Generic, không cần phải cài đặt<br/>
chương trình quá nhiều, chỉ cần 1 Class, hay Method tổng quát (Generic) <br/>
  là đủ, từ đó Generic hữu ích cho công việc tạo ra những Software Library<br/>
  (thư viện phần mềm) giúp người dùng có thể sử dụng đa dạng tình<br/>
  huống cần thiết, vì khi sử dụng Generic nó mang đến Generic<br/>
  Programming (lập trình tổng quát).
## 10. Một Số Hạn Chế Khi Sử Dụng Generic <a id="10"></a>
* không thể truyền đối số có kiểu nguyên thủy (primitive type) vào trong <br/>
đối tượng hoặc phương thức Generic, mà phải truyền đối số có kiểu<br/>
  class hoặc Wrapper Class cho các kiểu số.
  
* không thể khởi tạo instance trực tiếp từ kiểu Generic, vì lúc này JVM<br/>
chưa thể xác định được kiểu dữ liệu là gì, nó chỉ mới là Generic (tổng<br/>
  quát) và không cụ thể, nếu muốn khởi tạo instance trực tiếp từ kiểu <br/>
  Generic phải sử dụng Reflection.
  
* **không thể sử dụng static cho kiểu Generic**
```java
private static T obj; // Compile Time Error
```
* không thể ép kiểu hoặc sử dụng instanceof
```java
// trong phương thức này, list có kiểu E là kiểu tổng quát
// nên không thể kiểm tra được instanceof
public static <E> void cannotUseInstanceOf(List<E> list) {
    if (list instanceof ArrayList<Integer>) { // compile-time Error
        // 
    }
        }
        
// không thể ép kiểu        
List<Integer> li = new ArrayList<Integer>();
List<Number> ln = (List<Number> li); // compile-time Error
```
* không thể khởi tạo trực tiếp mảng với kiểu Generic mà phải sử dụng<br/>
Reflection (giống trường hợp khởi tạo đối tượng trực tiếp từ kiểu<br/>
  Generic)
  
* không thể tạo class dùng để **catch, throw** đối tượng của parameterized<br/>
type (Generic Throwable), vì thông tin Generic chỉ sử dụng cho trình biên<br/>
  dịch kiểm soát code của người lập trình, trong thời điểm chạy Java, thông<br/>
  tin Generic không hề tồn tại.
  
```java
// Extends Throwable indirectly
class MathException<T> extends Exception { // compile-time error
  //
}

// Extends Throwable directly
class QueueFullException<T> extends Throwable { // compile-time error
    //
}
```
* không thể overload các phương thức trong cùng 1 lớp

```java
public class Example {
  public void print(Set<String> stringSet) {  }
  public void print(Set<Integer> integerSet) {  }
}
```