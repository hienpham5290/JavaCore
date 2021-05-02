# Loại Bỏ Các Phần Tử Trùng Lặp <br/>Trong ArrayList

* ArrayList là 1 trong những Collection sử dụng nhiều nhất trong Java.
* ArrayList có nhiều đặc điểm linh hoạt như:
    * cho phép thêm nhiều phần tử **null**.
    * có thể chứa các phần tử trùng lặp.
    * duy trì thứ tự của phần tử theo trình tự được chèn vào.
    
* nhưng đôi khi, trong quá trình phát triển, có thể gặp yêu cầu phải loại bỏ<br/>
các phần tử trùng lặp trong ArrayList vừa xây dựng.
  
* để loại bỏ các phần tử trùng lặp trong ArrayList ta có 1 số phương pháp<br/>
sau.
    * sử dụng vòng lặp **for-each** duyệt **ArrayList** nguồn, sử dụng method<br/>
    **contains()** kiểm tra **ArrayList** đích đã tồn tại phần tử đang duyệt hay<br/>
      chưa, nếu chưa tiến hành **add()** phần tử vào.
      
    * sử dụng **constructor** khởi tạo **HashSet**, vì **HashSet** không chấp<br/>
      nhận phần tử trùng lặp, tuy nhiên **HashSet** không duy trì thứ tự<br/>
      của các phần tử được thêm vào, ta thực hiện các bước sau:
        * khởi tạo **HashSet** từ **ArrayList** nguồn.
        * khởi tạo **ArrayList** đích từ **HashSet** vừa mới khởi tạo.
    * sử dụng **constructor** khởi tạo **LinkedHashSet**, vì **LinkedHashSet**<br/>
    không chấp nhận phần tử trùng lặp, đồng thời cũng duy trì thứ tự<br/>
      của phần tử được thêm vào, ta thực hiện các bước sau:
        * khởi tạo **LinkedHashSet** từ **ArrayList** nguồn.
        * khởi tạo **ArrayList** đích từ **LinkedHashSet** vừa mới khởi tạo.
# Nội Dung
1. [Sử dụng vòng lặp for-each và contains() method](#1)
2. [Sử dụng HashSet làm cấu trúc trung gian](#2)
3. [Sử dụng LinkedHashSet làm cấu trúc trung gian](#3)

# 1. Sử dụng vòng lặp for-each và contains() method <a id="1"></a>
* các bước thực hiện:
    * khởi tạo 1 ArrayList đích dùng để chứa các phần tử không trùng lặp.
    * sử dụng vòng lặp for-each duyệt qua từng phần tử trong ArrayList<br/>
    nguồn.
    * bên trong vòng lặp, dùng **contains()** method kiểm tra, nếu phần tử<br/>
    đang duyệt chưa có trong ArrayList đích thì tiến hành thêm vào.
      
```java
import java.util.ArrayList;
import java.util.List;

public class _01_for_each_and_contains_method {
    public static void main(String[] args) {
        List<String> duplicateList = new ArrayList<>();
        duplicateList.add("one");
        duplicateList.add("two");
        duplicateList.add("one");
        duplicateList.add("five");
        duplicateList.add("two");
        duplicateList.add("two");
        duplicateList.add("three");
        duplicateList.add("three");
        duplicateList.add("four");
        duplicateList.add("five");
        duplicateList.add("one");
        duplicateList.add("five");
        duplicateList.add("four");
        System.out.println("duplicateList: " + duplicateList);

        // khởi tạo ArrayList đích dùng để chứa các phần tử không
        // trùng lặp
        List<String> nonDuplicateList = new ArrayList<>();

        // sử dụng for-each loop
        for (String e : duplicateList) {
            // kiểm tra nonDuplicateList đã có phần tử đang duyệt
            // hay chưa
            if (!nonDuplicateList.contains(e)) {
                nonDuplicateList.add(e);
            }
        }

        // show nonDuplicateList
        System.out.println("nonDuplicateList: " + nonDuplicateList);
    }
}
```
```
OUTPUT
duplicateList: [one, two, one, five, two, two, three, three, four, five, one, five, four]
nonDuplicateList: [one, two, five, three, four]
```
# 2. Sử dụng HashSet làm cấu trúc trung gian <a id="2"></a>
* phương pháp này ta sử dụng cấu trúc dữ liệu **HashSet** làm trung gian,<br/>
đặc điểm của **HashSet** là không chứa các giá trị trùng lặp, khi nó nhận<br/>
  dữ liệu từ **ArrayList** nguồn, nó sẽ tự động loại bỏ các giá trị trùng lặp,<br/>
  tuy nhiên khi nó nhận giá trị nó sẽ tự sắp xếp lại thứ tự dữ liệu, do đó<br/>
  làm mất đi tính tuần tự của **ArrayList**.
  
* sau khi đã có 1 **HashSet** không chứa giá trị trùng lặp, ta tiến hành<br/>
chuyển các phần tử đó sang **ArrayList** đích.
  
* các bước thực hiện:
  * khởi tạo **HashSet** làm cấu trúc lưu trữ trung gian, đầu vào là<br/>
    **ArrayList** nguồn.
  * khởi tạo **ArrayList** đích, chứa các phần tử không trùng lặp, đầu<br/>
  vào là **HashSet** đã khởi tạo ở trên.
    
```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _02_using_HashSet {
    public static void main(String[] args) {
        List<Integer> duplicateList = new ArrayList<>();
        duplicateList.add(5);
        duplicateList.add(5);
        duplicateList.add(4);
        duplicateList.add(4);
        duplicateList.add(3);
        duplicateList.add(3);
        duplicateList.add(2);
        duplicateList.add(2);
        duplicateList.add(1);
        duplicateList.add(1);
        System.out.println("duplicateList: " + duplicateList);

        // khởi tạo HashSet, tham số đầu vào là duplicateList
        Set<Integer> set = new HashSet<>(duplicateList);
        System.out.println("HashSet: " + set);

        // khởi tạo ArrayList chứa các phần tử không trùng lặp
        // tham số đầu vào là HashSet
        List<Integer> nonDuplicateList = new ArrayList<>(set);
        System.out.println("nonDuplicateList: " + nonDuplicateList);
    }
}
```
```
OUTPUT
duplicateList: [5, 5, 4, 4, 3, 3, 2, 2, 1, 1]
HashSet: [1, 2, 3, 4, 5]
nonDuplicateList: [1, 2, 3, 4, 5]
```
> với OUTPUT ở trên, ta thấy:<br/>
> ArrayList ban đầu tuần tự thêm vào là giảm dần.<br/>
> nhưng khi truyền vào HashSet, tuần tự đã được sắp xếp theo<br/>
> Comparable mà kiểu dữ liệu Integer đã cài đặt.
# 3. Sử dụng LinkedHashSet làm cấu trúc trung gian <a id="3"></a>
* phương pháp này ta sử dụng **LinkedHashSet** làm cấu trúc dữ liệu<br/>
trung gian.
  
* đặc điểm của **LinkedHashSet** là không chứa các phần tử trùng lặp,<br/>
đồng thời nó cũng duy trì thứ tự phần tử được chèn vào.
  
* các bước thực hiện như sau:
  * khởi tạo **LinkedHashSet**, tham số đầu vào là **ArrayList** nguồn.
  * khởi tạo **ArrayList** đích, tham số đầu vào là **LinkedHashSet**.
  
```java
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _03_using_LinkedHashSet {
    public static void main(String[] args) {
        List<Integer> duplicateList = new ArrayList<>();
        duplicateList.add(5);
        duplicateList.add(5);
        duplicateList.add(4);
        duplicateList.add(4);
        duplicateList.add(3);
        duplicateList.add(3);
        duplicateList.add(2);
        duplicateList.add(2);
        duplicateList.add(1);
        duplicateList.add(1);
        System.out.println("duplicateList: " + duplicateList);

        // khởi tạo LinkedHashSet làm cấu trúc trung gian
        // tham số đầu vào là duplicateList
        Set<Integer> linkedHashSet = new LinkedHashSet<>(duplicateList);
        System.out.println("linkedHashSet: " + linkedHashSet);

        // khởi tạo ArrayList đích chứa các phần tử không trùng lặp
        // tham số đầu vào là linkedHashSet
        List<Integer> nonDuplicateList = new ArrayList<>(linkedHashSet);
        System.out.println("nonDuplicateList: " + nonDuplicateList);
    }
}
```
```
OUTPUT
duplicateList: [5, 5, 4, 4, 3, 3, 2, 2, 1, 1]
linkedHashSet: [5, 4, 3, 2, 1]
nonDuplicateList: [5, 4, 3, 2, 1]
```
___
THE END