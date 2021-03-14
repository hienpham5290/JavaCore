# Vector class
___
## 1. Giới thiệu
+ Những điểm cần ghi nhớ về Vector clas 
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
`boolean add(Object obj)`|thêm 1 đối tượng chỉ định vào cuối danh sách
`void add(int index, Object obj)`|Chèn một `object` tại vị trí (`index`) được chỉ định vào danh sách. <br/>Ném `IndexOutOfBoundsException` nếu index này ở bên ngoài dãy (`index < 0 hoặc index > size()`).
`boolean addAll(Collection c)`|Thêm tất cả các phần tử trong collection được chỉ định vào cuối của danh sách gọi phương thức, <br/>theo thứ tự chúng được trả về bởi bộ lặp `iterator`.
`boolean addAll(int index, Collection c)`|Thêm tất cả các `object` trong collection được chỉ định vào danh sách gọi phương thức, bắt đầu từ vị trí đã chỉ định. <br/>Ném `NullPointerException` nếu collection đã cho là null.
`Object get(int index)`|Trả về phần tử tại `index` đã cho. <br/>Ném `IndexOutOfBoundsException` nếu index đã cho nằm bên ngoài dãy (`index < 0 hoặc index >= size()`).
`int indexOf(Object obj)`|


  