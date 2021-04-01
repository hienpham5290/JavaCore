# Vector class
___
## 1. Giới thiệu
+ Những điểm cần ghi nhớ về Vector class
    - có thể chứa các phần tử trùng lặp 
    - duy trì thứ tự các phần tử theo trình tự được thêm vào
    - Vector được `synchronized` (đồng bộ hóa)    
+ lớp `java.util.Vector` được định nghĩa như sau:
```java
public class Vector<E>
    extends AbstractList<E>
    implements List<E>, RandomAccess, Cloneable, java.io.Serializable {
    // ...
}
```
___
## 2. Các `Constructor` của `Vector` class
Constructor|Description
-----------|-----------
`Vector()`|khởi tạo 1 danh sách mảng trống
`Vector(Collection c)`|khởi tạo 1 danh sách mảng chứa các đối tượng của 1 Collection `c` chỉ định
`Vector(int capacity)`|khởi tạo 1 danh sách mảng với sức chứa ban đầu được chỉ định, <br/>nếu không chỉ định, capacity mặc định là 10, <br/>mỗi lần thêm phần tử vào danh sách, nếu vượt quá sức chứa cho phép <br/>thì danh sách sẽ tự động tăng thêm 100% kích thước hiện có
___
## 3. Các `Method` của `Vector` class
Method|Description
-------|-------
`boolean add(Object obj)`|Thêm 1 đối tượng chỉ định vào cuối danh sách
`void add(int index, Object obj)`|Chèn một `object` tại vị trí (`index`) được chỉ định vào danh sách. <br/>Ném `IndexOutOfBoundsException` nếu index này ở bên ngoài dãy (`index < 0 hoặc index > size()`).
`boolean addAll(Collection c)`|Thêm tất cả các phần tử trong collection được chỉ định vào cuối của danh sách gọi phương thức, <br/>theo thứ tự chúng được trả về bởi bộ lặp `iterator`.
`boolean addAll(int index, Collection c)`|Thêm tất cả các `object` trong collection được chỉ định vào danh sách gọi phương thức, bắt đầu từ vị trí đã chỉ định. <br/>Ném `NullPointerException` nếu collection đã cho là null.
`Object get(int index)`|Trả về phần tử tại `index` đã cho. <br/>Ném `IndexOutOfBoundsException` nếu index đã cho nằm bên ngoài dãy (`index < 0 hoặc index >= size()`).
`int indexOf(Object obj)`|Trả về vị trí (`index`) đầu tiên lấy được của đối tượng chỉ định trong danh sách <br/>`return -1` nếu trong danh sách không chứa đối tượng này.
`int lastIndexOf(Object obj)`|Trả về vị trí (`index`) cuối cùng lấy được của đối tượng chỉ định trong danh sách <br/>`return -1` nếu trong danh sách không chứa đối tượng này.
`Object remove(int index)`|Gỡ bỏ đối tượng tại `index` chỉ định trong danh sách. <br/>Ném `IndexOutOfBoundsException` nếu `index` đã cho nằm ngoài dãy `index < 0` hoặc `index >= size()`.
`void retainAll(Collection c)`|Chỉ giữ lại những đối tượng trong `list` hiện tại khớp với những đối tượng trong `Collection c` chỉ định <br/>`Throw NullPointerExeption` nếu `Collection c` chỉ định là `null`.
`void removeAll(Collection c)`|Gỡ bỏ những đối tượng trong `list` hiện tại khớp với những đối tượng trong `Collection c` chỉ định, <br/>`Throw NullPointerExeption` nếu `Collection c` chỉ định là `null`.
`Object set(int index, Object obj)`|Thay thế đối tượng tại `index` đã cho trong `list` này với đối tượng chỉ định, <br/>`Throw IndexOutOfBoundsException` nếu `index` ở ngoài dãy (`index < 0` hoặc `index >= size()`).
`Object[] toArray()`|Chuyển `list` này sang mảng và trả về một mảng chứa tất cả các đối tượng trong `list` này theo đúng thứ tự. <br/>`Throw IndexOutOfBoundsException` nếu mảng này là `null`.
`Object[] toArray(Object[] a)`|Chuyển một `list` sang mảng và trả về một mảng chứa tất cả các đối tượng trong `list` này theo đúng thứ tự. <br/>Kiểu runtime là của mảng trả về giống như mảng đã xác định.
`Object clone()`|Tạo một bản sao của `Vector`.
`void clear()`|Xóa tất cả các đối tượng trong `list`.
`void trimToSize()`|Xén bỏ `capacity` thừa về bằng với `size()` hiện tại của `Vector`.
___
## 4. Ví dụ minh họa
### 4.1. Ví dụ với kiểu Wrapper
```java
import java.util.List;
import java.util.Vector;

public class Vector_with_Wrapper {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        // Init list with no parameter by Vector's instance
        List<String> list1 = new Vector<>();

        // Add element into list1 by for-loop
        for (int i = 0; i <= NUM_OF_ELEMENT; i++) {
            list1.add("0" + i);
        }
        System.out.print("Init list1= ");
        PrintData(list1);

        // use addAll(Collection c) to create a duplicate list
        List<String> list2 = new Vector<>();
        list2.addAll(list1);
        System.out.print("list2.addAll(list1), list2 = ");
        PrintData(list2);

        // indexOf()
        System.out.println("list2.indexOf(\"03\") = " + list2.indexOf("03"));
        System.out.println("list2.indexOf(\"06\") = " + list2.indexOf("06"));

        // lastIndexOf()
        System.out.println("list2.lastIndexOf(\"03\") = " + list2.lastIndexOf("03"));

        // remove()
        list2.remove("01");
        System.out.print("list2.remove(\"01\"), list2 = ");
        PrintData(list2);

        // retainAll()
        List<String> list4 = new Vector<>(list1);
        Vector<String> list3 = new Vector<>();
        list3.add("03");
        list3.add("02");
        list4.retainAll(list3);
        System.out.print("list4.retainAll(list3), list4 = ");
        PrintData(list4);

        // removeAll()
        List<String> list5 = new Vector<>(list1);
        list5.removeAll(list3);
        System.out.print("list5.removeAll(list3), list5 = ");
        PrintData(list5);
    }

    public static void PrintData(List<String> list) {
        for (String e : list) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }
}
```
OUTPUT: in console
```
Init list1= 00, 01, 02, 03, 04, 05, 
list2.addAll(list1), list2 = 00, 01, 02, 03, 04, 05, 
list2.indexOf("03") = 3
list2.indexOf("06") = -1
list2.lastIndexOf("03") = 3
list2.remove("01"), list2 = 00, 02, 03, 04, 05, 
list4.retainAll(list3), list4 = 02, 03, 
list5.removeAll(list3), list5 = 00, 01, 04, 05, 
```
### 4.2. Ví dụ với kiểu UserDataType
```java
import java.util.List;
import java.util.Vector;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student[id=" + id + ", name=" + name + "]";
    }
}

public class Vector_with_UserDataType {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        // init list
        List<Student> studentList = new Vector<>(NUM_OF_ELEMENT);
        
        // use for-loop init object & add object into list
        for (int i = 0; i <= NUM_OF_ELEMENT; i++) {
            Student student = new Student(i, "student" + 1);
            studentList.add(student);
        }

        // show list
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
```
OUTPUT: in console
```
Student[id=0, name=student1]
Student[id=1, name=student1]
Student[id=2, name=student1]
Student[id=3, name=student1]
Student[id=4, name=student1]
Student[id=5, name=student1]
```
___
THE END
  