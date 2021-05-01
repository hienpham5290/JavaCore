# Collection class trong Java

## Nội dung
1. [Sự khác nhau giữa Collection và Collections](#1)

2. [Các thuộc tính của Collections class](#2)

3. [Các phương thức của Collections class](#3)

4. [Ví dụ sử dụng các phương thức của Collections class](#4)
   
   4.1. [Sử dụng thuộc tính EMPTY và phương thức empty() để khởi tạo Collection rỗng](#4.1)
   
   4.2. [Sử dụng phương thức addAll() để thêm tất cả các phần tử của list chỉ định vào<br/>list khác](#4.2)
   
   4.3. [Sử dụng phương thức min(), max(), search(), sort(), reverse(), reverseOrder(),<br/>reverseOrder(Comparator) với kiểu dữ liệu String, Wrapper](#4.3)

   4.4. [Sử dụng phương thức min(), max(), search(), sort(), reverse(), reverseOrder(),<br/>reverseOrder(Comparator) với kiểu dữ liệu do người dùng định nghĩa (kiểu class)](#4.4)
      * [Cung cấp bộ so sánh Comparator](#4.4.1)
      * [Cung cấp bộ so sánh Comparable](#4.4.2)
   
   4.5. [Sử dụng phương thức frequency() để đếm số lần xuất hiện của phần tử trong<br/>Collection](#4.5)
   
   4.6. [Sử dụng phương thức copy() để sao chép 1 list này sang 1 list khác](#4.6)

   4.7. [Sử dụng phương thức swap() để hoán đổi vị trí của 2 phần tử](#4.7)
   
   4.8. [Sử dụng phương thức shuffle() để truy cập ngẫu nhiên các phần tử trong <br/>Collection](#4.8)
   
   4.9. [Sử dụng phương thức rotate() để xoay các phần tử trong danh sách](#4.9)
   
   4.10. [Sử dụng phương thức replaceAll() để tìm kiếm và thay thế các phần tử bằng <br/>một phần tử khác](#4.10)
   
   4.11. [Sử dụng phương thức fill() để thay thế tất cả các phần tử trong danh sách bằng <br/>một phần tử bất kỳ](#4.11)
   
   4.12. [Sử dụng phương thức disjoint() để kiểm tra hai danh sách KHÔNG chứa bất kỳ phần <br/>tử nào giống nhau ĐÚNG hay SAI](#4.12)
   
   4.13. [Sử dụng phương thức indexOfSubList() và lastIndexOfSubList() để tìm vị trí <br/>xuất hiện đầu tiên và cuối cùng của một danh sách này trong một danh sách khác](#4.13)
   
   4.14. [Sử dụng các phương thức unmodifiableCollection()](#4.14)
   
   4.15. [Ví dụ sử dụng synchronizedCollection() để sử dụng các phương thức của <br/>Collection trong môi trường đa luồng (multi-thread)](#4.15)
   
   4.16. [Sử dụng phương thức checkedCollection() để sử dụng Type-safe Collection <br/>(tương tự Generic)](#4.16)
   
   4.17. [Sử dụng phương thức singletonList() để đảm bảo một đối tượng chỉ có một <br/>phần tử](#4.17)
   
   4.18. [Sử dụng phương thức list(Enumeration) để chuyển Enumeration sang ArrayList](#4.18)
   
   4.19. [Sử dụng phương thức enumeration() để có thể duyệt các phần tử của <br/>Collection thông qua đối tượng Enumeration](#4.19)
___
## 1. Sự khác nhau giữa Collection & Collections <a id="1"></a>

* **Collection** là 1 _interface_ cao nhất trong **Collection Framework**.
* **Collections** là 1 **class** tiện ích.
* **Collections** chứa các **static method** để thao tác trên các đối tượng của **Collection**.
* _interface_ **Collection** được định nghĩa trong _package_ **java.util.Collection** như sau:
```java
public interface Collection<E> extends Iterable<E>{
 
}
```

* _class_ **Collections** được định nghĩa trong _package_ **java.util.Collections** như sau:
```java
public class Collections {
 
}
```

* Đặc điểm quan trong của **Collections** _class_:
   * hỗ trợ các **Thuật toán Đa hình (Polymorphic Algorithms)** hoạt động trên các **collection**.
   * **Throw NullPointerExceptioon** nếu các **collection** hoặc các **object** mà _class_ cung cấp cho chúng là **null**.
   
___
## 2. Các thuộc tính của Collections class <a id="2"></a>

* **static List EMPTY_LIST** : khởi tạo 1 list trống (empty) và không thể thay đổi (immutable).
* **static Map EMPTY_MAP** : khởi tạo 1 map trống (empty) và không thể thay đổi (immutable).
* **static Set EMPTY_SET** : khởi tạo 1 set trống (empty) và không thể thay đổi (immutable).
___

## 3. Các phương thức của Collections class <a id="3"></a>

Access Modifier|Return Type|Method|Description
----|----|----|----
static |\<T> boolean |addAll(Collection<? super T> c, T… elements)|Thêm tất cả các phần tử được chỉ định <br/>vào bộ sưu tập được chỉ định.
static |\<T> Queue\<T> |asLifoQueue(Deque\<T> deque)|Trả về chế độ Deque như một hàng đợi <br/>Last-in-first-out (LIFO).
static |\<T> int |binarySearch(List<? extends Comparable<? super T>> list, T key)|Tìm kiếm danh sách được chỉ định <br/>cho đối tượng được chỉ định <br/>sử dụng thuật toán tìm kiếm nhị phân (binary search).
static |\<T> int |binarySearch(List<? extends T> list, T key, Comparator<? super T> c)|Tìm kiếm danh sách được chỉ định <br/>cho đối tượng được chỉ định <br/>sử dụng thuật toán tìm kiếm nhị <br/>phân (binary search). Các phần tử <br/>so sánh dựa vào bộ so sánh <br/>(comparator) đã cung cấp.
static |\<T> void |copy(List<? super T> dest, List<? extends T> src)|Sao chép tất cả các phần tử từ một <br/>danh sách này sang một danh sách <br/>khác.
static |boolean |disjoint(Collection\<?> c1, Collection<?> c2)|Trả về true nếu hai bộ sưu tập được <br/>chỉ định không có các phần tử chung.
static |\<T> Enumeration\<T> |emptyEnumeration()|Trả về một Enumeration không có phần tử.
static |\<T> Iterator\<T> |emptyIterator()|Trả về một trình lặp (Iterator) không có<br/> phần tử.
static |\<T> List\<T> |emptyList()|Trả lại danh sách (list) trống, không <br/>thay đổi (immutable).
static |\<T> ListIterator\<T> |emptyListIterator()|Trả về một ListIterator không có <br/>phần tử.
static |<K,V> Map<K,V> |emptyMap()|Trả về map trống, không thay đổi <br/>(immutable).
static |\<T> Set\<T> |emptySet()|Trả về tập hợp (set) rỗng, không <br/>thay đổi (immutable).
static |\<T> void |fill(List<? super T> list, T obj)|Thay thế tất cả các phần tử <br/>của danh sách được chỉ định <br/>với phần tử được chỉ định.
static |int |frequency(Collection<?> c, Object o)|Trả về số lượng các phần tử <br/>có trong bộ sưu tập được chỉ <br/>định bằng đối tượng được chỉ định.
static |int |indexOfSubList(List\<?> source, List<?> target)|Trả về vị trí bắt đầu của lần xuất hiện <br/>đầu tiên của danh sách mục tiêu <br/>được chỉ định trong danh sách nguồn <br/>quy định, hoặc -1 nếu không tìm thấy <br/>đối tượng chỉ định.
static |int |lastIndexOfSubList(List\<?> source, List<?> target)|Trả về vị trí bắt đầu của sự xuất hiện <br/>cuối cùng của danh sách mục tiêu <br/>được chỉ định trong danh sách nguồn <br/>quy định, hoặc -1 nếu  không tìm thấy <br/>đối tượng chỉ định.
static |\<T> ArrayList\<T> |list(Enumeration\<T> e)|Trả lại một danh sách mảng có chứa <br/>các phần tử được trả về bởi Enumeration <br/>xác định theo thứ tự chúng được trả <br/>về bởi Enumeration.
static |\<T extends Object & Comparable<? super T>>  |max(Collection<? extends T> coll)|Trả về phần tử lớn nhất của bộ sưu tập <br/>đã cho, theo trật tự tự nhiên của các <br/>phần tử.
static |\<T> T |max(Collection<? extends T> coll, Comparator<? super T> comp)|Trả về phần tử lớn nhất của bộ sưu tập <br/>đã cho, theo thứ tự bởi bộ so sánh <br/>được chỉ định.
static |\<T extends Object & Comparable<? super T>>  |min(Collection<? extends T> coll)|Trả về phần tử nhỏ nhất của bộ sưu tập <br/>đã cho, theo trật tự tự nhiên của các <br/>phần tử.
static |\<T> T |min(Collection<? extends T> coll, Comparator<? super T> comp)|Trả về phần tử nhỏ nhất của bộ sưu tập <br/>đã cho, theo thứ tự bởi bộ so sánh <br/>được chỉ định.
static |\<T> List\<T> |nCopies(int n, T o)|Trả lại một danh sách không thay đổi <br/>bao gồm n bản sao của đối tượng <br/>được chỉ định.
static |\<E> Set\<E> |newSetFromMap(Map<E,Boolean> map)|Trả về một tập hợp (set) được xác định <br/>bởi map được chỉ định.
static |\<T> boolean |replaceAll(List\<T> list, T oldVal, T newVal)|Thay thế tất cả các lần xuất hiện của <br/>một giá trị được chỉ định trong danh <br/>sách với một giá trị mới
static |void |reverse(List<?> list)|Đảo ngược thứ tự của các phần tử <br/>trong danh sách được chỉ định.
static |\<T> Comparator\<T> |reverseOrder()|Trả về một trình so sánh là bộ so sánh <br/>có thứ tự đảo ngược của trật tự <br/>tự nhiên trên một tập hợp các đối <br/>tượng thực hiện giao diện Comparable.
static |\<T> Comparator\<T> |reverseOrder(Comparator\<T> cmp)|Trả về một trình so sánh là bộ so sánh <br/>có thứ tự ngược lại của bộ so sánh <br/>được chỉ định.
static |void |rotate(List<?> list, int distance)|Xoay các phần tử trong danh sách <br/>được chỉ định theo khoảng cách xác <br/>định.
static |void |shuffle(List<?> list)|Xử lý ngẫu nhiên danh sách được <br/>chỉ định, sử dụng nguồn xác định <br/>ngẫu nhiên mặc định.
static |void |shuffle(List<?> list, Random rnd)|Xử lý ngẫu nhiên danh sách được <br/>chỉ định, sử dụng nguồn xác định <br/>ngẫu nhiên cung cấp.
static |\<T> Set\<T> |singleton(T o)|Trả lại một tập hợp (set) không thay <br/>đổi chỉ chứa đối tượng được chỉ định.
static |\<T> List\<T> |singletonList(T o)|Trả lại một danh sách (list) không <br/>thay đổi chỉ chứa đối tượng được <br/>chỉ định.
static |<K,V> Map<K,V> |singletonMap(K key, V value)|Trả về một map không thay đổi, ánh <br/>xạ chỉ một khoá được chỉ định đến <br/>giá trị được chỉ định.
static |\<T extends Comparable<? super T>>  |sort(List\<T> list)|Sắp xếp danh sách tăng dần theo <br/>thứ tự tự nhiên của các phần tử.
static |\<T> void |sort(List\<T> list, Comparator<? super T> c)|Sắp xếp danh sách được chỉ định <br/>theo thứ tự của bộ so sánh được <br/>chỉ định.
static |void |swap(List<?> list, int i, int j)|Hoán đổi các phần tử tại các vị trí <br/>được chỉ định trong danh sách được <br/>chỉ định.
static |\<T> Collection\<T> |synchronizedCollection(Collection\<T> c)|Trả về một bộ sưu tập đồng bộ hóa <br/>(synchronized) được hỗ trợ bởi bộ <br/>sưu tập được chỉ định.
static |\<T> List\<T> |synchronizedList(List\<T> list)|Trả về một danh sách được đồng bộ <br/>hóa (synchronized) được hỗ trợ bởi <br/>danh sách được chỉ định.
static |<K,V> Map<K,V> |synchronizedMap(Map<K,V> m)|Trả về một map được đồng bộ hóa <br/>(synchronized) được hỗ trợ bởi map <br/>được chỉ định.
static |\<T> Set\<T> |synchronizedSet(Set\<T> s)|Trả về một tập hợp (set) được đồng <br/>bộ (synchronized) được hỗ trợ bởi tập <br/>hợp được chỉ định.
static |<K,V> SortedMap<K,V> |synchronizedSortedMap(SortedMap<K,V> m)|Trả về map được sắp xếp theo map <br/>đã được đồng bộ hoá (chủ đề) an toàn <br/>theo bản đồ được chỉ định.
static |\<T> Collection\<T> |unmodifiableCollection(Collection<? extends T> c)|Trả về chế độ không thể sửa đổi <br/>(unmodifiable) của bộ sưu tập được <br/>chỉ định.
static |\<T> List\<T> |unmodifiableList(List<? extends T> list)|Trả lại chế độ xem không thể sửa đổi <br/>(unmodifiable) của danh sách (list) <br/>được chỉ định.
static |<K,V> Map<K,V> |unmodifiableMap(Map<? extends K,? extends V> m)|Trả về chế độ không thể sửa đổi <br/>(unmodifiable) của map được chỉ định.
static |\<T> Set\<T> |unmodifiableSet(Set<? extends T> s)|Trả về chế độ không thể sửa đổi <br/>(unmodifiable) của tập hợp (set) <br/>được chỉ định.

## 4. Ví dụ sử dụng các phương thức của Collections class <a id="4"></a>

   ### 4.1. Sử dụng thuộc tính EMPTY và phương thức empty() để khởi tạo Collection rỗng <a id="4.1"></a>
   * các thuộc tính **EMPTY_LIST, EMPTY_SET, EMPTY_MAP**.
   * và các phương thức **emptyList(), emptySet(), emptyMap()**
   * được sử dụng để khởi tạo 1 **Collection** trống, không thể thay đổi (immutable).
   * nếu cố tính thay đổi các phần tử này, **JVM** sẽ ném ra ngoại lệ **UnsupportedOperationException**.

>mục đích của việc khởi tạo 1 empty collection thông qua static attribute hoặc empty method trong Collections là:
> * các thuộc tính và phương thức **empty** này thường được sử dụng để tránh lỗi **NullPointerException**<br/>
> khi khởi tạo 1 **Collection null** hoặc kết quả trả về của 1 phương thức là **null**.
> * vì là **immutable** nên các **empty collection** có thể tái sử dụng lại cùng **instance** ở bất kỳ đâu mà không cần<br/>
> sự đồng bộ hóa để đảm bảo tính toàn vẹn của đối tượng
> * vì có thể tái sử dụng lại, nên không cần khởi tạo 1 đối tượng mới trên **heap** memory, giúp tiết kiệm memory<br/>
> và cải thiện tốc độ chương trình.

   * Ví dụ minh họa:
```java
/*
    Sử dụng các thuộc tính EMPTY và các phương thức empty() của Collections Class
    để khởi tạo các Collection empty (rỗng) và immutable (không thể thay đổi)
    - Collections.EMPTY_LIST
    - Collections.EMPTY_SET
    - Collections.EMPTY_MAP
    - Collections.emptyList()
    - Collections.emptySet()
    - Collections.emptyMap()
 */

import java.util.*;

public class _01_empty_Collection {
   public static void main(String[] args) {
        /*
        khởi tạo List, Set, Map thông qua các
        thuộc tính EMPTY của Collections class
         */
      List<Integer> list1 = Collections.EMPTY_LIST;
      Set<Integer> set1 = Collections.EMPTY_SET;
      Map<Integer, String> map1 = Collections.EMPTY_MAP;

        /*
        không thể thêm (add/put) element vào các empty collection
        UnsupportedOperationException sẽ bị ném ra
         */
//        list1.add(10);
//        set1.add(20);
//        map1.put(1, "One");

        /*
         khởi tạo List, Set, Map thông qua các phương
         thức empty() của Collections class
         */
      List<Integer> list2 = Collections.emptyList();
      Set<Integer> set2 = Collections.emptySet();
      Map<Integer, String> map2 = Collections.emptyMap();

        /*
        không thể thêm (add/put) element vào các empty collection
        UnsupportedOperationException sẽ bị ném ra
         */
//        list2.add(10);
//        set2.add(20);
//        map2.put(1, "One");

        /*
        sau khi tham chiếu đến instance với toán tử new
        mọi hoạt động sẽ bình thường với collection tương ứng
         */
      list1 = new ArrayList<>();
      list1.add(1);
      list1.add(2);

      map2 = new HashMap<>();
      map2.put(1, "one");
      map2.put(2, "two");
   }
}
```

   ### 4.2. Sử dụng phương thức addAll() để thêm tất cả các phần tử của list chỉ định vào<br/>list khác <a id="4.2"></a>
```java
/*
    sử dụng
    - Collections.addAll(Collection<? super T> c, T… elements)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _02_addAll_method {
   public static void main(String[] args) {
        /*
        khởi tạo ArrayList, add element với cách thông thường
        show value của ArrayList
         */
      List<String> list = new ArrayList<>();
      list.add("C");
      list.add("Java Core");
      list.add("Java Advance");
      System.out.println("list: " + list); // list: [C, Java Core, Java Advance]

        /*
        sử dụng Collections.addAll(Collection<? super T> collection, T... elements)
        thêm các phần tử vào list
        show value của ArrayList sau khi dùng phương thức của Collections class
         */
      Collections.addAll(list, "Servlet", "JSP");
      System.out.println("list: " + list); // list: [C, Java Core, Java Advance, Servlet, JSP]

        /*
        khởi tạo 1 mảng String
        sử dụng Collections.add(Collection<? super T> collection, T... elements)
        thêm mảng String vào list
        show value của ArrayList sau khi dùng phương thức của Collections class
         */
      String[] strArr = {"C#", ".Net"};
      Collections.addAll(list, strArr);
      System.out.println("list: " + list); // list: [C, Java Core, Java Advance, Servlet, JSP, C#, .Net]
   }
}
```

```
OUTPUT
list: [C, Java Core, Java Advance]
list: [C, Java Core, Java Advance, Servlet, JSP]
list: [C, Java Core, Java Advance, Servlet, JSP, C#, .Net]
```

   ### 4.3. Sử dụng phương thức min(), max(), search(), sort(), reverse(), reverseOrder(),<br/>reverseOrder(Comparator) với kiểu dữ liệu String, Wrapper <a id="4.3"></a>
```java
/*
    sử dụng các phương thức thống kê tìm kiếm sắp xếp cho
    kiểu dữ liệu String, Wrapper (những kiểu đã implements Comparable)
    - Collections.min(),
    - Collections.max(),
    - Collections.binarySearch(),
    - Collections.sort(),
    - Collections.reverse(),
    - Collections.reverseOrder().
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _03_min_max_binarySearch_sort_reverse_reverseOder {
   public static void main(String[] args) {
      // khởi tạo ArrayList
      List<Integer> list = new ArrayList<>();

      // thêm phần tử vào ArrayList
      list.add(46);
      list.add(67);
      list.add(24);
      list.add(16);
      list.add(8);
      list.add(12);

      // show collection
      System.out.println("list: " + list);

      // get max value của collection với Collection class
      System.out.println("Maximum value: " + Collections.max(list));

      // lấy min value của collection với Collections class
      System.out.println("Minimum value: " + Collections.min(list));

      // get index của value chỉ định trong collection với Collections class
      // với value là kiểu Wrapper đã implements Comparable
      System.out.println("Index of 24: " + Collections.binarySearch(list, 24));
      System.out.println("Index of 10: " + Collections.binarySearch(list, 10));

      // sort collection chỉ định với phương thức của Collections class
      // với element của collection thuộc kiểu Wrapper đã implements Comparable
      Collections.sort(list);
      System.out.println("list after sort: " + list);

      // reverse (đảo ngược) collection với phương thức của Collections class
      // với element của collection thuộc kiểu Wrapper đã implements Comparable
      Collections.reverse(list);
      System.out.println("list after reverse: " + list);

      // lấy bộ Comparator, có thứ tự đảo ngược với trật tự tự nhiên của kiểu Wrapper
      // kiểu Wrapper này chính là kiểu của element trong collection
      Comparator<Integer> compareDesc = Collections.reverseOrder();

      // sort lại collection theo Comparator mới
      // ở trên, collection sau khi sort tăng dần, đã bị reverse thành giảm dần
      // Comparator mới là đảo ngược với trật tự tự nhiên là giảm dần
      // việc sort lại collection đang giảm dần theo bộ Comparator giảm dần sẽ
      // không thay đổi gì, collection vẫn sẽ được sort theo giảm dần
      Collections.sort(list, compareDesc);
      System.out.println("list after sort with compareDesc: " + list);

      // lấy bộ Comparator, có thứ tự ngược lại với trật tự của Comparator chỉ định
      // CompareDesc có thứ tự ngược với trật tự tự nhiên là giảm dần
      // việc lấy Comparator ngược với compareDesc sẽ có trật tự là tăng dần
      Comparator<Integer> compareAsc = Collections.reverseOrder(compareDesc);

      // sort lại  collection theo Comparator mới là compareAsc, có trật tự tăng dần
      // collection phía trên hiện đang có trật tự giảm dần, việc sort lại sẽ đảo
      // trật tự của collection
      Collections.sort(list, compareAsc);
      System.out.println("list after sort with compareAsc: " + list);
   }
}
```

```
OUTPUT
list: [46, 67, 24, 16, 8, 12]
Maximum value: 67
Minimum value: 8
Index of 24: 2
Index of 10: -1
list after sort: [8, 12, 16, 24, 46, 67]
list after reverse: [67, 46, 24, 16, 12, 8]
list after sort with compareDesc: [67, 46, 24, 16, 12, 8]
list after sort with compareAsc: [8, 12, 16, 24, 46, 67]
```

   ### 4.4. Sử dụng phương thức min(), max(), search(), sort(), reverse(), reverseOrder(),<br/>reverseOrder(Comparator) với kiểu dữ liệu do người dùng định nghĩa (kiểu class) <a id="4.4"></a>

   #### * Cung cấp bộ so sánh Comparator <a id="4.4.1"></a>
   * cài đặt 1 class Student
```java
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + " ,name=" + name + " ,age=" + age + " ]";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```
   * cài đặt 1 bộ so sánh sắp xếp Comparator theo Age Value của Student class
```java
import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else return 1;
    }
}
```
   * cài đặt class thực thi chương trình
```java
/*
    sử dụng phương thức min, max, binarySearch, sort, reverse, reverseOrder của Collections class
    cài đặt kiểu của người dùng tự định nghĩa - kiểu Student (cài đặt 1 class Student)
    cài đặt 1 Comparator dựa trên kiểu của người dùng tự định nghĩa
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _4_min_max_binarySearch_sort_reverse_reverseOder {
   public static void main(String[] args) {
      // khởi tạo ArrayList
      List<Student> studentList = new ArrayList<>();
      Student std1 = new Student(1, "std1", 15);
      Student std2 = new Student(2, "std2", 20);
      Student std3 = new Student(3, "std3", 17);
      Student std4 = new Student(4, "std4", 10);
      Student std5 = new Student(5, "std5", 19);
      Student std6 = new Student(6, "std6", 19);

      // thêm phần tử vào list
      studentList.add(std3);
      studentList.add(std1);
      studentList.add(std2);
      studentList.add(std5);
      studentList.add(std4);

      // khởi tạo Comparator
      StudentAgeComparator ageComparator = new StudentAgeComparator();

      // sử dụng method của Collections class, kèm với bộ Comparator
      // tìm max
      System.out.println("max value: " + Collections.max(studentList, ageComparator));

      // tìm min
      System.out.println("min value: " + Collections.min(studentList, ageComparator));

//        // sort studentList, nếu không sort list, index trả về của phương thức binarySearch sẽ là âm
//        Collections.sort(studentList, ageComparator);

      // tìm std1
      System.out.println("index of std1: " + Collections.binarySearch(studentList, std1, ageComparator));

      // tìm std2
      System.out.println("index of std6: " + Collections.binarySearch(studentList, std6, ageComparator));
      System.out.println("---------------------------------------------");

      // sort lại list bằng Collections.sort(list, comparator) - ascending (tăng dần)
      Collections.sort(studentList, ageComparator);
      System.out.println("Sorted Ascending:");
      printData(studentList);
      System.out.println("---------------------------------------------");

      // reverse các phần tử của list bằng Collections.reverse() - descending (giảm dần)
      System.out.println("reversed list:");
      Collections.reverse(studentList);
      printData(studentList);
      System.out.println("---------------------------------------------");

      // khởi tạo 1 comparator mới bằng các reverseOrder lại comparator cũ - descending (giảm dần)
      Comparator<Student> compareDesc = Collections.reverseOrder(ageComparator);
      // sort lại list the bộ comparator mới, sẽ không thay đổi vì list đã reverse
      // hoạt động sort lại cũng chỉ thuận theo quá trình ngược của comparator
      Collections.sort(studentList, compareDesc);
      System.out.println("Sorted Descending by compareDesc:");
      printData(studentList);
      System.out.println("---------------------------------------------");

      // khởi tạo 1 comparator mới bằng cách reverseOrder lại compareDesc - ascending (tăng dần)
      Comparator<Student> compareAsc = Collections.reverseOrder(compareDesc);
      Collections.sort(studentList, compareAsc);
      System.out.println("Sorted Ascending by compareAsc");
      printData(studentList);
      System.out.println("---------------------------------------------");

   }

   public static void printData(List<Student> studentList) {
      for (Student std : studentList) {
         System.out.println(std);
      }
   }
}
```

```
OUTPUT
max value: Student [id=2 ,name=std2 ,age=20 ]
min value: Student [id=4 ,name=std4 ,age=10 ]
index of std1: -1
index of std6: -3
---------------------------------------------
Sorted ASC:
Student [id=4 ,name=std4 ,age=10 ]
Student [id=1 ,name=std1 ,age=15 ]
Student [id=3 ,name=std3 ,age=17 ]
Student [id=5 ,name=std5 ,age=19 ]
Student [id=2 ,name=std2 ,age=20 ]
---------------------------------------------
reversed list:
Student [id=2 ,name=std2 ,age=20 ]
Student [id=5 ,name=std5 ,age=19 ]
Student [id=3 ,name=std3 ,age=17 ]
Student [id=1 ,name=std1 ,age=15 ]
Student [id=4 ,name=std4 ,age=10 ]
---------------------------------------------
Sorted DESC by compareDesc:
Student [id=2 ,name=std2 ,age=20 ]
Student [id=5 ,name=std5 ,age=19 ]
Student [id=3 ,name=std3 ,age=17 ]
Student [id=1 ,name=std1 ,age=15 ]
Student [id=4 ,name=std4 ,age=10 ]
---------------------------------------------
Sorted ASC by compareAsc
Student [id=4 ,name=std4 ,age=10 ]
Student [id=1 ,name=std1 ,age=15 ]
Student [id=3 ,name=std3 ,age=17 ]
Student [id=5 ,name=std5 ,age=19 ]
Student [id=2 ,name=std2 ,age=20 ]
---------------------------------------------
```
   #### * Cung cấp bộ so sánh Comparable <a id="4.4.2"></a>
   * bộ so sánh sắp xếp Comparable có ưu điểm là không phải cài đặt 1 class riêng biệt, nhưng hạn chế là chỉ dùng<br/>
được 1 thuộc tính để so sánh sắp xếp, vì chỉ có thể Override compareTo() method chỉ 1 lần.
     
   * cài đặt class Student implements Comparable<Student>
```java
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age < o.getAge()) {
            return -1;
        } else if (this.age == o.getAge()) {
            return 0;
        } else return 1;
    }
}
```
   * cài class thực thi chương trình
```java
/*
    sử dụng phương thức min, max, binarySearch, sort, reverse, reverseOrder của Collections class
    cài đặt kiểu của người dùng tự định nghĩa - kiểu Student (cài đặt 1 class Student) và implements Comparable
    override compareTo() của Comparable interface
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _5_min_max_binarySearch_sort_reverse_reverseOder {
   public static void main(String[] args) {
      // khởi tạo ArrayList
      List<Student> studentList = new ArrayList<>();

      // khởi tạo các object của Student
      Student std1 = new Student(1, "std1", 15);
      Student std2 = new Student(2, "std1", 20);
      Student std3 = new Student(3, "std1", 17);
      Student std4 = new Student(4, "std1", 10);
      Student std5 = new Student(5, "std1", 19);
      Student std6 = new Student(6, "std1", 19);

      // thêm phần tử vào list
      studentList.add(std3);
      studentList.add(std1);
      studentList.add(std2);
      studentList.add(std5);
      studentList.add(std4);

      // không cần khởi tạo bộ comparator vì nó đã được cài đặt sẵn trong class Student
      // tìm max
      System.out.println("Max value: " + Collections.max(studentList));

      // tìm min
      System.out.println("Min value: " + Collections.min(studentList));

//        // nếu không sort lại list, việc sử dụng Collections.binarySearch(list, key) sẽ return giá trị âm
//        Collections.sort(studentList);

      // tìm std1
      System.out.println("Index of std1: " + Collections.binarySearch(studentList, std1));

      // tìm std6
      System.out.println("Index of std6: " + Collections.binarySearch(studentList, std6));

      // sort list với Collections.sort(list đã implements Comparable) - tăng dần
      Collections.sort(studentList);
      System.out.println("Sorted List:");
      printData(studentList);
      System.out.println("--------------------------------------------");

      // reverse list với Collections.reverse(list đã implements Comparable) - giảm dần
      Collections.reverse(studentList);
      System.out.println("Reversed List");
      printData(studentList);
      System.out.println("--------------------------------------------");

      // khởi tạo bộ Comparator<Student> descending (giảm dần) dựa trên kiểu dữ liệu đã implements Comparable
      Comparator<Student> compareDesc = Collections.reverseOrder();
      // sort lại list với bộ comparator descending (giảm dần), hiện tại list đang giảm dần
      Collections.sort(studentList, compareDesc);
      System.out.println("Descending List:");
      printData(studentList);
      System.out.println("--------------------------------------------");

      // khởi tạo bộ Comparator<Student> ascending (tăng dần) dựa trên bộ Comparator Descending vừa khởi tạo
      Comparator<Student> compareAsc = Collections.reverseOrder(compareDesc);
      // sort lại list với bộ comparator ascending (tăng dần), hiện tại list đang giảm dần
      Collections.sort(studentList, compareAsc);
      System.out.println("Ascending List:");
      printData(studentList);
      System.out.println("--------------------------------------------");
   }

   public static void printData(List<Student> studentList) {
      for (Student std : studentList) {
         System.out.println(std);
      }
   }
}
```
```
OUTPUT
Max value: Student [id=2 ,name=std1 ,age=20 ]
Min value: Student [id=4 ,name=std1 ,age=10 ]
Index of std1: -1
Index of std6: -3
Sorted List:
Student [id=4 ,name=std1 ,age=10 ]
Student [id=1 ,name=std1 ,age=15 ]
Student [id=3 ,name=std1 ,age=17 ]
Student [id=5 ,name=std1 ,age=19 ]
Student [id=2 ,name=std1 ,age=20 ]
--------------------------------------------
Reversed List
Student [id=2 ,name=std1 ,age=20 ]
Student [id=5 ,name=std1 ,age=19 ]
Student [id=3 ,name=std1 ,age=17 ]
Student [id=1 ,name=std1 ,age=15 ]
Student [id=4 ,name=std1 ,age=10 ]
--------------------------------------------
Descending List:
Student [id=2 ,name=std1 ,age=20 ]
Student [id=5 ,name=std1 ,age=19 ]
Student [id=3 ,name=std1 ,age=17 ]
Student [id=1 ,name=std1 ,age=15 ]
Student [id=4 ,name=std1 ,age=10 ]
--------------------------------------------
Ascending List:
Student [id=4 ,name=std1 ,age=10 ]
Student [id=1 ,name=std1 ,age=15 ]
Student [id=3 ,name=std1 ,age=17 ]
Student [id=5 ,name=std1 ,age=19 ]
Student [id=2 ,name=std1 ,age=20 ]
--------------------------------------------
```

   ### 4.5. Sử dụng phương thức frequency() để đếm số lần xuất hiện của phần tử trong<br/>Collection <a id="4.5"></a>
```java
/*
    Sử dụng Collections.frequency(list, key) để đếm tần suất của key
    trong list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _06_frequency_method {
   public static void main(String[] args) {
      // khởi tạo ArrayList
      List<Integer> list = new ArrayList<>();

      // thêm phần tử vào ArrayList
      list.add(10);
      list.add(20);
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(10);

      // show ArrayList
      System.out.println("list: " + list);

      // sử dụng Collections.frequency(list, key)
      System.out.println("frequency of 10: " + Collections.frequency(list, 10));
      System.out.println("frequency of 20: " + Collections.frequency(list, 20));
      System.out.println("frequency of 30: " + Collections.frequency(list, 30));
   }
}
```
```
OUTPUT
list: [10, 20, 10, 20, 30, 10]
frequency of 10: 3
frequency of 20: 2
frequency of 30: 1
```
   ### 4.6. Sử dụng phương thức copy() để sao chép 1 list này sang 1 list khác <a id="4.6"></a>
```java
/*
    sử dụng Collections.copy(destList, srcList) để copy (sao chép) srcList vào destList
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _07_copy_method {
   public static void main(String[] args) {
      // khởi tạo list thứ nhất
      List<String> firstList = new ArrayList<>();
      firstList.add("10");
      firstList.add("20");
      firstList.add("30");
      System.out.println("Elements of firstList: " + firstList);

      // khởi tạo list thứ hai
      List<String> secondList = new ArrayList<>();
      secondList.add("one");
      secondList.add("two");
      secondList.add("three");
      System.out.println("Elements of secondList: " + secondList);

      // copy list thứ nhất vào list thứ hai
      Collections.copy(secondList, firstList);

      // show các phần tử của list thứ hai
      System.out.println("secondList's elements after copy firstList: " + secondList);

      // khởi tạo list thứ ba
      List<String> thirdList = new ArrayList<>();
      thirdList.add("one");
      thirdList.add("two");
      thirdList.add("three");
      thirdList.add("four");
      thirdList.add("five");

      // show các phần tử của list thứ ba
      System.out.println("Elements of thirdList: " + thirdList);

      // copy list thứ nhất vào list thứ ba
      Collections.copy(thirdList, firstList);

      // show các phần tử của list thứ ba
      System.out.println("thirdList's elements after copy firstList: " + thirdList);

      // khởi tạo list thứ tư
      List<String> fourthList = new ArrayList<>();
      fourthList.add("1st");
      fourthList.add("2nd");

      // show các phần tử của list thứ tư
      System.out.println("Elements of fourthList: " + fourthList);

//        // copy list thứ nhất vào list thứ tư, do size() của list thứ tư nhỏ hơn list thứ nhất
//        // IndexOutOfBoundsException sẽ bị ném ra nếu copy list có size() lớn và
//        // paste vào list có size() nhỏ
//        Collections.copy(fourthList, firstList);
   }
}
```
```
OUTPUT
Elements of firstList: [10, 20, 30]
Elements of secondList: [one, two, three]
secondList's elements after copy firstList: [10, 20, 30]
Elements of thirdList: [one, two, three, four, five]
thirdList's elements after copy firstList: [10, 20, 30, four, five]
Elements of fourthList: [1st, 2nd]
```

   ### 4.7. Sử dụng phương thức swap() để hoán đổi vị trí của 2 phần tử <a id="4.7"></a>
```java
/*
    sử dụng Collections.swap(list, index1, index2) để hoán
    đổi 2 phần tử trong list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_swap_method {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(50);
      list.add(10);
      list.add(20);
      list.add(40);
      System.out.println("list before swap: " + list);

      // swap phần tử thứ 0 và thứ 1
      Collections.swap(list, 0, 1);
      System.out.println("list after swap 0 & 1: " + list);

      // swap phần tử thứ 2 và thứ 3
      Collections.swap(list, 2, 3);
      System.out.println("list after swap 2 & 3: " + list);
   }
}
```
```
OUTPUT
list before swap: [50, 10, 20, 40]
list after swap 0 & 1: [10, 50, 20, 40]
list after swap 2 & 3: [10, 50, 40, 20]
```
   ### 4.8. Sử dụng phương thức shuffle() để truy cập ngẫu nhiên các phần tử trong <br/>Collection <a id="4.8"></a>
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
    Sử dụng phương thức xáo trộn các phần tử trong 1 collection
    - Collections.shuffle(List<?> list) -> trộn ngẫu nhiên theo nguồn mặc định
        - throw UnsupportedOperationException nếu list hoặc list-iterator không hỗ trợ hoạt động set
    - Collections.shuffle(List<?> list, Random random) -> trộn ngẫu nhiên theo nguồn chỉ định
        - throw UnsupportedOperationException nếu list hoặc list-iterator không hỗ trợ hoạt động set

    - 
 */
public class _09_shuffle_method {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      System.out.println("before shuffle, list: " + list);

      // shuffle list
      Collections.shuffle(list);
      System.out.println("after shuffle, list: " + list);

      // shuffle list with Random
      Collections.shuffle(list, new Random());
      System.out.println("after shuffle with Random object, list: " + list);

      Collections.shuffle(list, new Random(2));
      System.out.println("after shuffle with Random object, list: " + list);
   }
}

```
```
OUTPUT
before shuffle, list: [10, 20, 30, 40, 50]
after shuffle, list: [30, 20, 50, 40, 10]
after shuffle with Random object, list: [30, 20, 40, 10, 50]
after shuffle with Random object, list: [50, 30, 40, 20, 10]
```
   ### 4.9. Sử dụng phương thức rotate() để xoay các phần tử trong danh sách <a id="4.9"></a>
```java
/*
    Xoay các phần tử trong list, sử dụng phương thức
    - Collections.rotate(List<?> list, int distance)
        - list: danh sách chỉ định
        - distance: khoảng cách hay số lượng phần tử dùng để xoay
    - nếu xem các phần tử trong list, được sắp xếp theo 1 vòng tròn, trong
    đó, bắt đầu là phần tử index=0, ..., đến index cuối, thì tham số distance
    là khoảng cách hay số phần tử sẽ được lấy thay vào vị trí index=0
    ví dụ: size() = 10, index[0 - 9], distance=3, => phần tử từ index=size(10)-distance(3)=7
    đến phần tử index=9 sẽ được đưa về đầu list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _10_rotate_method {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      list.add(7);
      list.add(8);
      list.add(9);
      list.add(10);

      // show list
      System.out.println("before rotate: " + list);

      // rotate list
      Collections.rotate(list, 3);
      System.out.println("distance=3: " + list);
   }
}
```
```
OUTPUT
before rotate: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
distance=3: [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
```
   ### 4.10. Sử dụng phương thức replaceAll() để tìm kiếm và thay thế các phần tử bằng <br/>một phần tử khác <a id="4.10"></a>
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Tìm kiếm và thay thế phần tử trong list, với phương thức
    - Collections.replaceAll(List<T> list, T oldVal, T newVal);
 */
public class _11_replaceAll_method {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(20);

      // show list
      System.out.println("before replaceAll: " + list);

      // replaceAll
      boolean booVarReplaceSuccess = Collections.replaceAll(list, 20, 999);
      System.out.println("replace success: " + booVarReplaceSuccess);
      System.out.println("after replace: " + list);

      booVarReplaceSuccess = Collections.replaceAll(list, 40, 200);
      System.out.println("replace success: " + booVarReplaceSuccess);
      System.out.println("after replace: " + list);
   }
}
```
```
OUTPUT
before replaceAll: [10, 20, 30, 20]
replace success: true
after replace: [10, 999, 30, 999]
replace success: false
after replace: [10, 999, 30, 999]
```
   ### 4.11. Sử dụng phương thức fill() để thay thế tất cả các phần tử trong danh sách bằng <br/>một phần tử bất kỳ <a id="4.11"></a>
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Sử dụng phương thức
    - Collections.fill(List<? super T> list, T obj)
    để thay thế tất cả các phần tử trong list bởi phần tử chỉ định
 */
public class _12_fill_method {
   public static void main(String[] args) {
      List<Integer> integerList = new ArrayList<>();
      integerList.add(10);
      integerList.add(20);
      integerList.add(30);
      integerList.add(40);
      System.out.println("integerList before fill: " + integerList);

      // fill
      Collections.fill(integerList, 0);
      System.out.println("integerList after fill: " + integerList);

      List<String> stringList = new ArrayList<>();
      stringList.add("BasicJava");
      stringList.add("OOP");
      stringList.add("JavaCore");
      stringList.add("Android");
      System.out.println("stringList before fill: " + stringList);

      // fill
      Collections.fill(stringList, null);
      System.out.println("stringList after fill: " + stringList);
   }
}
```
```
OUTPUT
integerList before fill: [10, 20, 30, 40]
integerList after fill: [0, 0, 0, 0]
stringList before fill: [BasicJava, OOP, JavaCore, Android]
stringList after fill: [null, null, null, null]
```
   ### 4.12. Sử dụng phương thức disjoint() để kiểm tra hai danh sách KHÔNG chứa bất kỳ phần <br/>tử nào giống nhau ĐÚNG hay SAI <a id="4.12"></a>
```java
/*
    Sử dụng phương thức:
    - Collections.disjoint(list1, list2)
    để kiểm tra 2 list không chứa phần tử giống nhau đúng hay sai
    disjoint <=> không có giao nhau, ở đây là không chứa phần tử giống nhau
    
    kết quả trả về là giá trị boolean:
    - true: nếu 2 list không chứa phần tử giống nhau
    - false: nếu 2 list có chứa phần tử giống nhau
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _13_disjoint_method {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(40);
        list2.add(20);

        List<Integer> list3 = new ArrayList<>();
        list3.add(60);
        list3.add(40);
        list3.add(50);

        System.out.println("Elements of list1: " + list1);
        System.out.println("Elements of list2: " + list2);
        System.out.println("Elements of list3: " + list3);

       boolean exist;
       exist = Collections.disjoint(list1, list2);
       System.out.println("list1 & list2, disjoint ? : " + exist);

       exist = Collections.disjoint(list1, list3);
       System.out.println("list1 & list3, disjoint ? : " + exist);
    }
}
```
```
OUTPUT
Elements of list1: [10, 20, 30]
Elements of list2: [60, 40, 20]
Elements of list3: [60, 40, 50]
list1 & list2, disjoint ? : false
list1 & list3, disjoint ? : true
```
   ### 4.13. Sử dụng phương thức indexOfSubList() và lastIndexOfSubList() để tìm vị trí <br/>xuất hiện đầu tiên và cuối cùng của một danh sách này trong một danh sách khác <a id="4.13"></a>
```java
/*
    Tìm vị trí bắt đầu của 1 list con trong list chỉ định.
    dùng phương thức:
        - Collections.indexOfSubList(specifiedList, findList)
            -> trả về index tìm thấy đầu tiên của list cần tìm trong list chỉ định
            -> trả về -1 nếu list cần tìm không có trong list chỉ định 
        - Collections.lastIndexOfSubList(specifiedList, findList)
            -> trả về index tìm thấy cuối cùng của list cần tìm trong list chỉ định
            -> trả về -1 nếu list cần tìm không có trong list chỉ định
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _14_indexOfSublist_and_lastIndexOfSubList_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(400);

        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(40);

        System.out.println("list's elements: " + list);
        System.out.println("list1's elements: " + list1);
        System.out.println("list2's elements: " + list2);

        int num1 = Collections.indexOfSubList(list, list1);
        System.out.println("first index of list1 in list: " + num1);

        int num2 = Collections.lastIndexOfSubList(list, list1);
        System.out.println("last index of list1 in list: " + num2);

        int num3 = Collections.indexOfSubList(list, list2);
        System.out.println("first index of list2 in list: " + num3);

        int num4 = Collections.lastIndexOfSubList(list, list2);
        System.out.println("last index of list2 in list: " + num4);
    }
}
```
```
OUTPUT
list's elements: [10, 20, 30, 40, 100, 20, 30, 400]
list1's elements: [20, 30]
list2's elements: [20, 40]
first index of list1 in list: 1
last index of list1 in list: 5
first index of list2 in list: -1
last index of list2 in list: -1
```
   ### 4.14. Sử dụng các phương thức unmodifiableCollection() <a id="4.14"></a>
   * các class trong Collection Framework, thông thường khi khởi tạo thì có thể sửa đổi được (modifiable), tức<br/>
là, các phần tử có thể được thêm, xóa hoặc thay thế bất cứ lúc nào.
     
   * nhưng đôi khi, ta có thể được yêu cầu để có các List, Set, Map chỉ có thể đọc (unmodifiable), bất kỳ sửa đổi phần<br/>
đều không thể được thực hiện.
     
   * để thực hiện unmodifiable 1 List, Set hoặc Map, ta có thể sử dụng phương thức:<br/>
     **Collections.unmodifiableCollection()**

   * **throw UnsupportedOperationException** nếu có bất kỳ thao tác nào cố gắng thay đổi phần tử của đối tượng<br/>
được trả về từ phương thức **Collections.unmodifiableCollection()**
     
   * **nhưng mọi sự thay đổi ở collection gốc sẽ làm thay đổi ở unmodifiableCollection tương tự như vậy.**
```java
/*
    thực hiện khởi tạo 1 collection không thể thay đổi bởi người dùng, sử dụng method
        - Collections.unmodifiableCollection(collection gốc);
    unmodifiableCollection chỉ bị thay đổi khi collection gốc của nó thay đổi
    (do hiện tại nó đang tham chiếu đến collection gốc)
 */

import java.util.*;

public class _15_unmodifiableCollection_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("elements of unmodifiableList: " + unmodifiableList);

        // change unmodifiableList
//        unmodifiableList.add(50); // throw UnsupportedOperationException

        System.out.println("elements of list: " + list);
        list.add(50);
        System.out.println("elements of list after adding number 50: " + list);
        System.out.println("elements of unmodifiableList: " + unmodifiableList);

        System.out.println("-------------------------------------------------");
        Set<String> set = new HashSet<>();
        set.add("JavaBasic");
        set.add("JavaCore");
        set.add("SQLite");
        set.add("Android");

        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
        System.out.println("elements of unmodifiableSet: " + unmodifiableSet);

        // change unmodifiableSet
//        unmodifiableSet.add("HelloWorld"); // throw UnsupportedOperationException

        System.out.println("elements of set: " + set);
        set.add("SeniorAndroid");
        System.out.println("elements of set after adding \"SeniorAndroid\": " + set);
        System.out.println("elements of unmodifiableSet: " + unmodifiableSet);

        System.out.println("-------------------------------------------------");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println("elements of unmodifiableMap: " + unmodifiableMap);

        // change unmodifiableMap
//        unmodifiableMap.put(4, "four"); // throw UnsupportedOperationException

        System.out.println("elements of map: " + map);
        map.put(5, "five");
        System.out.println("elements of map after adding 5-five: " + map);
        System.out.println("elements of unmodifiableMap: " + unmodifiableMap);
    }
}
```
```
OUTPUT
elements of unmodifiableList: [10, 20, 30, 40]
elements of list: [10, 20, 30, 40]
elements of list after adding number 50: [10, 20, 30, 40, 50]
elements of unmodifiableList: [10, 20, 30, 40, 50]
-------------------------------------------------
elements of unmodifiableSet: [JavaBasic, JavaCore, SQLite, Android]
elements of set: [JavaBasic, JavaCore, SQLite, Android]
elements of set after adding "SeniorAndroid": [JavaBasic, JavaCore, SQLite, SeniorAndroid, Android]
elements of unmodifiableSet: [JavaBasic, JavaCore, SQLite, SeniorAndroid, Android]
-------------------------------------------------
elements of unmodifiableMap: {1=one, 2=two, 3=three}
elements of map: {1=one, 2=two, 3=three}
elements of map after adding 5-five: {1=one, 2=two, 3=three, 5=five}
elements of unmodifiableMap: {1=one, 2=two, 3=three, 5=five}
```
   ### 4.15. Ví dụ sử dụng synchronizedCollection() để sử dụng các phương thức của <br/>Collection trong môi trường đa luồng (multi-thread) <a id="4.15"></a>
   * các method của các class kế thừa từ Collection như Vector và Hashtable được đồng bộ hóa ngầm <br/>
     (**synchronized**).
   * nó hợp nhất cho thao tác với luồng an toàn (**thread-safe**).
   * 1 thao tác được gọi là an toàn, khi nhiều luồng truy cập dữ liệu, dữ liệu không bị hỏng hoặc không dẫn đến sự<br/>
      không nhất quán.
   * đó là biện pháp phòng ngừa được thực hiện trong môi trường đa luồng.
   * tuy nhiên các class còn lại không phải là **thread-safe**, vì các method của chúng không được **synchronized**.
   * nhưng nếu cần đồng bộ và không muốn sử dụng Vector hay Hashtable, ta sử dụng method của Collections.
   * ``Collections.synchronizedCollection()`` trả về 1 đối tượng được synchronized từ 1 đối tượng collection gốc.
   * như trình bày ở trên, ta có thể sử dụng **synchronized** hoặc **non-synchronized** với các class, trừ class Vector<br/>
      và class Hashtable, vì chúng đã được cài đặt mặc định là phải **synchronized**.
     
```java
/*
    ngoại trừ đối tượng của Vector hay Hashtable là synchronized ngầm định
    để có đối tượng synchronized từ các class khác trong Collection Framework
    ta sử dụng method
        - Collections.synchronizedCollection()
        -> trả về 1 đối tượng của collection tương ứng đã được synchronized
 */

import java.util.*;

public class _16_synchronizedCollection_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("elements of list: " + list);
        System.out.println("elements of synchronizedList: " + synchronizedList);
        list.add(30);
        System.out.println("list add more element: 30");
        System.out.println("elements of list: " + list);
        System.out.println("elements of synchronizedList: " + synchronizedList);
        System.out.println("-----------------------------------------------------------");

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        Set<String> synchronizedSet = Collections.synchronizedSet(set);
        System.out.println("elements of set: " + set);
        System.out.println("elements of synchronizedSet: " + synchronizedSet);
        set.add("three");
        System.out.println("set add \"three\"");
        System.out.println("elements of set: " + set);
        System.out.println("elements of synchronizedSet: " + synchronizedSet);
        System.out.println("-----------------------------------------------------------");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        System.out.println("elements of map: " + map);
        System.out.println("elements of synchronizedMap: " + synchronizedMap);
        map.put(3, "three");
        System.out.println("map add \"3-three\"");
        System.out.println("elements of map: " + map);
        System.out.println("elements of synchronizedMap: " + synchronizedMap);
    }
}
```
```
OUTPUT
elements of list: [10, 20]
elements of synchronizedList: [10, 20]
list add more element: 30
elements of list: [10, 20, 30]
elements of synchronizedList: [10, 20, 30]
-----------------------------------------------------------
elements of set: [one, two]
elements of synchronizedSet: [one, two]
set add "three"
elements of set: [one, two, three]
elements of synchronizedSet: [one, two, three]
-----------------------------------------------------------
elements of map: {1=one, 2=two}
elements of synchronizedMap: {1=one, 2=two}
map add "3-three"
elements of map: {1=one, 2=two, 3=three}
elements of synchronizedMap: {1=one, 2=two, 3=three}
```
   
   ### 4.16. Sử dụng phương thức checkedCollection() để sử dụng Type-safe Collection <br/>(tương tự Generic)<a id="4.16"></a>
   * JDK 1.5 bổ sung thêm 1 feature gọi là Generics cho các class trong Collection Framework (JDK 1.2).
   * với Generics chúng ta cố định 1 kiểu dữ liệu đầu vào trong 1 cấu trúc dữ liệu mà ta mong muốn.
   * nhưng với các lớp kế thừa (legacy class) như Vector hay Hashtable thì không sử dụng được Generics.
   * để khắc phục điều này, Collections class được cài đặt method **checkedCollection()**, và trả về 1 đối tượng<br/>
    Collection khác hoạt động như các Generics, chỉ có khả năng lưu trữ 1 kiểu dữ liệu đầu vào duy nhất.
   * khi thao tác với đối tượng trả về từ method **checkedCollection()**, nếu 1 phần tử với kiểu dữ liệu khác được<br/>
    được thêm vào, JVM sẽ **throw ClassCastException**
     
```java
import java.util.*;

public class _17_checkedCollection_method {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("list1's elements: " + list1);

        List list2 = Collections.checkedList(list1, Integer.class);
        System.out.println("list2's elements: " + list2);
        list1.add("list1");
        System.out.println("list1 add: " + list1);
//        list2.add("list2"); // throw ClassCastException
        System.out.println("list2's elements: " + list2);
        System.out.println("---------------------------------------------------------");

        Set set1 = new HashSet();
        set1.add("one");
        set1.add("two");
        set1.add("three");
        System.out.println("set1's elements: " + set1);

        Set set2 = Collections.checkedSet(set1, String.class);
        System.out.println("set2's elements: " + set2);
        set1.add(1);
        System.out.println("set1 add: " + set1);
//        set2.add(2); // throw ClassCastException
        System.out.println("set2's elements: " + set2);
        System.out.println("---------------------------------------------------------");

        Map map1 = new HashMap();
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        System.out.println("map1's elements: " + map1);
        Map map2 = Collections.checkedMap(map1, Integer.class, String.class);
        System.out.println("map2's elements: " + map2);
        map1.put("4", "four");
        System.out.println("map1 add: " + map1);
//        map2.put("5", "five"); // throw ClassCastException
        System.out.println("map2's elements: " + map2);
    }
}
```
```
OUTPUT
list1's elements: [10, 20, 30]
list2's elements: [10, 20, 30]
list1 add: [10, 20, 30, list1]
list2's elements: [10, 20, 30, list1]
---------------------------------------------------------
set1's elements: [one, two, three]
set2's elements: [one, two, three]
set1 add: [1, one, two, three]
set2's elements: [1, one, two, three]
---------------------------------------------------------
map1's elements: {1=one, 2=two, 3=three}
map2's elements: {1=one, 2=two, 3=three}
map1 add: {1=one, 2=two, 3=three, 4=four}
map2's elements: {1=one, 2=two, 3=three, 4=four}
```
    
   ### 4.17. Sử dụng phương thức singletonList() để đảm bảo một đối tượng chỉ có một <br/>phần tử <a id="4.17"></a>
   * việc cài đặt 1 class Singleton mục đích nhằm chỉ 
     * tạo 1 đối tượng duy nhất cho lớp Singleton.
     * tạo 1 phần tử duy nhất cho đối tượng tạo ra từ lớp Singleton.
   * JVM sẽ **throw UnsupportedOperationException** nếu
     * khởi tạo đối tượng thứ 2 từ lớp Singleton
     * thêm phần tử thứ 2 vào đối tượng được tạo ra từ lớp Singleton
   * lớp Singleton giới hạn các nhà phát triển khởi tạo nhiều hơn 1 đối tượng trong 1 lớp, ý tưởng này rất hữu ích<br/>
    khi chỉ có 1 đối tượng được tạo ra từ 1 lớp là đủ, để phối hợp tất cả các hành động của lớp.
   * **1 lớp Singleton không thể là 1 interface**
   * **1 List Singleton chỉ chứa 1 phần tử**
   * **1 HashMap Singleton chỉ chứa 1 khóa**
   * **1 đối tượng Singleton là bất biến (immutable), không thể sửa đổi để thêm phần tử, tránh sử dụng add()**
   * để có được 1 lớp Singleton từ 1 lớp Collection chung, chúng ta sử dụng
     * Collections.singletonList(element) -> dùng cho List
     * Collections.singleton(element) -> dùng cho Set
     * Collections.singletonMap(key, value) -> dùng cho Map
```java
/*
 * để có được 1 lớp Singleton từ 1 lớp Collection chung, chúng ta sử dụng
    * Collections.singletonList(element) -> dùng cho List
    * Collections.singleton(element) -> dùng cho Set
    * Collections.singletonMap(key, value) -> dùng cho Map
 */

import java.util.*;

public class _18_singleton_method {
    public static void main(String[] args) {
        List<Integer> singletonList = Collections.singletonList(10);
        System.out.println("singletonList's element: " + singletonList);
//        singletonList.add(20); // throw UnsupportedOperationException

        Set<String> singletonSet = Collections.singleton("one");
        System.out.println("singletonSet's element: " + singletonSet);
//        singletonSet.add("two"); // throw UnsupportedOperationException

        Map<Integer, String> singletonMap = Collections.singletonMap(1, "one");
        System.out.println("singletonMap's element: " + singletonMap);
//        singletonMap.put(2, "two"); // throw UnsupportedOperationException
    }
}
```
```
OUTPUT
singletonList's element: [10]
singletonSet's element: [one]
singletonMap's element: {1=one}
```
   ### 4.18. Sử dụng phương thức list(Enumeration) để chuyển Enumeration sang ArrayList <a id="4.18"></a>
```java
/*
    sử dụng list(enumeration) để chuyển các phần tử của cấu trúc Enumeration sang
    cấu trúc List hoặc ArrayList
 */

import java.util.*;

public class _19_list_method {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.addElement(3);
        vector.addElement(4);
        System.out.println("vector's elements: " + vector);

        // khởi tạo đối tượng của Enumeration
        Enumeration<Integer> enumerationList = vector.elements();
        List<Integer> list = Collections.list(enumerationList);
        System.out.println("list's elements: " + list);

        // khởi tạo đối tượng của Enumeration
        Enumeration<Integer> enumerationArrayList = vector.elements();
        ArrayList<Integer> arrayList = Collections.list(enumerationArrayList);
        System.out.println("arrayList's elements: " + arrayList);
    }
}
```
```
OUTPUT
vector's elements: [1, 2, 3, 4]
list's elements: [1, 2, 3, 4]
arrayList's elements: [1, 2, 3, 4]
```
   ### 4.19. Sử dụng phương thức enumeration() để có thể duyệt các phần tử của <br/>Collection thông qua đối tượng Enumeration <a id="4.19"></a>
```java

/*
    sử dụng Collections.enumeration(list) để duyệt các phần tử của list thông qua Enumeration
    sử dụng Collections.enumeration(set) để duyệt các phần tử của set thông qua Enumeration
 */
import java.util.*;

public class _20_enumeration_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list's elements: " + list);

        // khởi tạo đối tương của Enumeration từ List
        Enumeration<Integer> enumerationList = Collections.enumeration(list);
        // duyệt phần tử của đối tượng Enumeration
        System.out.print("enumerationList's elements: ");
        while (enumerationList.hasMoreElements()) {
            Object object = enumerationList.nextElement();
            System.out.print(object + " ");
        }
        System.out.println("\n-------------------------------------------------");

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        System.out.println("set's elements: " + set);

        // khởi tạo đối tượng của Enumeration từ Set
        Enumeration<String> enumerationSet = Collections.enumeration(set);
        // duyệt phần tử của đối tượng Enumeration
        System.out.print("enumerationSet's elements: ");
        while (enumerationSet.hasMoreElements()) {
            Object object = enumerationSet.nextElement();
            System.out.print(object + " ");
        }
    }
}
```
```
OUTPUT
list's elements: [1, 2, 3]
enumerationList's elements: 1 2 3 
-------------------------------------------------
set's elements: [one, two, three]
enumerationSet's elements: one two three 
```
___
THE END