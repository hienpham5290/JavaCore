# Chuyển HashMap Sang ArrayList
* **HashMap** và **ArrayList** là 2 cấu trúc dữ liệu được sử dụng nhiều nhất<br/>
trong Java.
  
* cả 2 lớp kế thừa từ 2 hệ phân cấp khác nhau:
    * **HashMap** kế thừa từ **interface Map** đại diện cho dữ liệu dạng <br/>
      key-value.
    * **ArrayList** kế thừa từ **interface List** đại diện cho dữ liệu được lưu<br/>
      trữ tuần tự.
      
* đôi khi yêu cầu bài toán đặt ra, là phải làm sao chuyển đổi **HashMap** sang<br/>
**ArrayList**.
  
# Nội Dung
1. [Phương Pháp Chuyển Đổi HashMap sang ArrayList](#1)

    1.1. [Chuyển Đổi Các Key Của HashMap Thành ArrayList](#1.1)

    1.2. [Chuyển Đổi Các Value Của HashMap Thành ArrayList](#1.2)
   
    1.3. [Chuyển Đổi Các Cặp Key-Value Của HashMap Thành ArrayList](#1.3)
   
2. [Ví Dụ Chuyển Đổi HashMap Thành ArrayList](#2)

# 1. Phương Pháp Chuyển Đổi HashMap sang ArrayList<a id="1"></a>
* **HashMap** chứa cặp **key-value**, có 3 cách có thể chuyển đổi **HashMap**<br/>
sang **ArrayList**.
    * lấy **keySet** của **HashMap** truyền vào 1 **ArrayList**, ta sẽ có **ArrayList**<br/>
    của các **key** trong **HashMap**.
      
    * lấy **Collection** chứa **value** của **HashMap** truyền vào 1 **ArrayList**, ta<br/>
    sẽ có **ArrayList** của các **value** trong **HashMap**.
      
    * lấy **entrySet** chứa **key-value** của **HashMap**, truyền vào 1 **ArrayList**,<br/>
    ta sẽ có **ArrayList** của các cặp **key-value** trong **HashMap**.
      
## 1.1. Chuyển Đổi Các Key Của HashMap Thành ArrayList<a id="1.1"></a>
```java
import java.util.*;

public class using_keySet_method {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng HashMap
        Map<String, String> hashMap = new HashMap<>();

        // lấy Set của các key từ HashMap
        Set<String> keySet = hashMap.keySet();

        // khởi tạo 1 đối tượng ArrayList, tham số truyền vào
        // là keySet của HashMap
        List<String> keyList = new ArrayList<>(keySet);
    }
}
```
## 1.2. Chuyển Đổi Các Value Của HashMap Thành ArrayList<a id="1.2"></a>
```java
import java.util.*;

public class using_values_method {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng HashMap
        Map<String, String> hashMap = new HashMap<>();

        // lấy Collection chứa các value của HashMap
        Collection<String> valueCollection = hashMap.values();

        // khởi tạo 1 đối tượng ArrayList, tham số truyền vào
        // là Collection chứa các value của HashMap
        List<String> valueList = new ArrayList<>(valueCollection);
    }
}
```
## 1.3. Chuyển Đổi Các Cặp Key-Value Của HashMap Thành ArrayList<a id="1.3"></a>
```java
import java.util.*;

public class using_entrySet_method {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng HashMap
        Map<String, String> hashMap = new HashMap<>();

        // lấy Set của các Entry<key, value> của HashMap
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();

        // khởi tạo 1 đối tượng ArrayList, tham số truyền vào
        // là Set chứa các Entry<key, value> của HashMap
        List<Map.Entry<String, String>> entryList = new ArrayList<>(entrySet);
    }
}
```
# 2. Ví Dụ Chuyển Đổi HashMap Thành ArrayList<a id="2"></a>
```java
import java.util.*;

public class HashMap_to_ArrayList_Example {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");

        // lấy Set các key của HashMap truyền vào ArrayList
        // sử dụng keySet() method
        Set<Integer> keySet = hashMap.keySet();

        // truyền Set các key của HashMap vào ArrayList
        List<Integer> keyList = new ArrayList<>(keySet);
        System.out.println("keyList: " + keyList);
        System.out.println("-------------------------------------------");

        // lấy Collection các value của HashMap truyền vào ArrayList
        // sử dụng values() method
        Collection<String> valueCollection = hashMap.values();

        // truyền Collection các value của HashMap vào ArrayList
        List<String> valueList = new ArrayList<>(valueCollection);
        System.out.println("valueList: " + valueList);
        System.out.println("-------------------------------------------");

        // lấy Set các entry của HashMap truyền vào ArrayList
        // sử dụng entrySet() method
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

        // truyền Set các entry của HashMap vào ArrayList
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(entrySet);
        System.out.println("entryList: " + entryList);
    }
}
```
```
OUTPUT
keyList: [1, 2, 3, 4, 5]
-------------------------------------------
valueList: [one, two, three, four, five]
-------------------------------------------
entryList: [1=one, 2=two, 3=three, 4=four, 5=five]
```
___
THE END