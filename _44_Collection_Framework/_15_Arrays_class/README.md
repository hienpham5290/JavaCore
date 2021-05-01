# Arrays class in Java
* Arrays class trong Java được cài đặt trong package **java.util.Arrays**.
* Arrays class là 1 class tiện ích, được sử dụng để thực hiện một số thao<br/>
  tác như sao chép, sắp xếp và tìm kiếm các phần tử trên mảng.
* Arrays class là 1 class tiện ích, nên các phương thức của nó có thể sử<br/>
  dụng thoải mái mà không cần khởi tạo đối tượng, vì nó chủ yếu là các<br>
  phương thức static
  
## Nội dung

* một số method trong Arrays class

1. [toString()](#1)
2. [deepToString()](#2)
3. [sort()](#3)
4. [binarySearch()](#4)
5. [fill()](#5)
6. [copyOf()](#6)
7. [copyOfRange()](#7)
8. [asList()](#8)
9. [equals()](#9)
10. [deepEquals()](#10)

## 1. toString() method <a id="1"><a/>
* method **Arrays.toString(array)** được sử dụng để return 1 String tất cả<br/> các
phần tử của mảng **array**.
  
* chuỗi String này bao gồm các phần tử của mảng **array** và được bao bởi<br/>
cặp ngoặc vuông **[ ]**, bên trong cặp ngoặc vuông, các phần tử phân<br/>
  cách nhau bởi dấu phẩy và 1 khoảng trắng ", "
  
```java
import java.util.Arrays;

public class _01_toString_method {
    public static void main(String[] args) {
        byte[] byteArray = {10, 20, 30};
        System.out.println(Arrays.toString(byteArray));

        short[] shortArray = {40, 50, 60};
        System.out.println(Arrays.toString(shortArray));

        int[] intArray = {70, 80, 90};
        System.out.println(Arrays.toString(intArray));

        long[] longArray = {100, 200, 300};
        System.out.println(Arrays.toString(longArray));

        double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println(Arrays.toString(doubleArray));

        char[] charArray = {'A', 'B', 'C'};
        System.out.println(Arrays.toString(charArray));

        boolean[] booleanArray = {true, false, true};
        System.out.println(Arrays.toString(booleanArray));

        String[] stringArray = {"Hi", "There", "Yummy"};
        System.out.println(Arrays.toString(stringArray));
    }
}
```
```
OUTPUT
[10, 20, 30]
[40, 50, 60]
[70, 80, 90]
[100, 200, 300]
[1.1, 2.2, 3.3]
[A, B, C]
[true, false, true]
[Hi, There, Yummy]
```
## 2. deepToString() method<a id="2"><a/>
* method **Arrays.deepToString(array)** dùng để return 1 String các phần<br/> 
  tử của mảng tương tự như **Arrays.toString(array)** method.
  
* **Arrays.deepToString(array)** nâng cao hơn ở đặc điểm, nếu mảng<br/>
**array** là 1 mảng đa chiều (2 chiều trở lên), nó vẫn sẽ return được tất<br/>
  cả các phần tử trong mảng, khi đó, phần tử trong mảng chính là 1 mảng<br/>
  khác.
  
```java
import java.util.Arrays;

public class _02_deepToString_method {
    public static void main(String[] args) {
        String[] oneDimArray = new String[]
                {"one", "two", "three"};

        System.out.println("One Dimensional Array:");
        System.out.println(Arrays.deepToString(oneDimArray) + "\n");

        String[][] twoDimArray = new String[][]
                {
                        {"one", "two", "three"},
                        {"four", "five", "six"},
                        {"seven", "eight", "nine"}
                };

        System.out.println("Two Dimensional Array:");
        System.out.println(Arrays.deepToString(twoDimArray) + "\n");

        String[][][] threeDimArray = new String[][][]
                {
                        {
                                {"a", "b", "c"},
                                {"e", "f", "g"},
                                {"h", "i", "j"}
                        },
                        {
                                {"k", "l", "m"},
                                {"n", "o", "p"},
                                {"q", "r", "t"}
                        },
                        {
                                {"t", "v", "u"},
                                {"w", "y", "x"},
                                {"z", "s", "zs"}
                        }
                };

        System.out.println("Three Dimensional Array:");
        System.out.println(Arrays.deepToString(threeDimArray));
    }
}
```
```
OUTPUT
One Dimensional Array:
[one, two, three]

Two Dimensional Array:
[[one, two, three], [four, five, six], [seven, eight, nine]]

Three Dimensional Array:
[[[a, b, c], [e, f, g], [h, i, j]], [[k, l, m], [n, o, p], [q, r, t]], [[t, v, u], [w, y, x], [z, s, zs]]]
```
## 3. sort() method <a id="3"><a/>
* method **Arrays.sort(array)** được dùng để sắp xếp các phần tử của <br/>
  mảng **array** theo thứ tự tăng dần
  
* method này sử dụng thuật toán:
  * **Quicksort** để sắp xếp các phần tử có kiểu nguyên thủy **(primitive)**
  * **MergeSort** để sắp xếp các phần tử có kiểu đối tượng **(Object)**
  
>**Collections.sort()** hoặc **Arrays.sort()** sử dụng giải thuật **MergeSort**.<br/>
>bởi vì, **MergeSort** sắp xếp tương đối nhanh và ổn định với độ phức tạp<br/>
> là **O(nlog(n))** cho kiểu dữ liệu là đối tượng.<br/>
> trong khi **Quicksort** không đảm bảo sắp xếp các đối tượng luôn ổn định<br/>
> với độ phức tạp O(nlog(n)), với **Quicksort**, trường hợp tốt nhất là 
> <br/>O(nlog<sub>2</sub>n), trường hợp xấu nhất là O(n<sup>2</sup>).<br/>
> **Arrays.sort()** dùng giải thuật Quicksort cho kiểu nguyên thủy.

```java
import java.util.Arrays;

public class _03_sort_method {
    public static void main(String[] args) {
        byte[] bytesArray = {99, 88, 77, 66};
        Arrays.sort(bytesArray);
        System.out.println("bytesArray: " + Arrays.toString(bytesArray));

        short[] shortsArray = {99, 88, 77, 66};
        Arrays.sort(shortsArray);
        System.out.println("shortsArray: " + Arrays.toString(shortsArray));

        int[] intsArray = {99, 88, 77, 66};
        Arrays.sort(intsArray);
        System.out.println("intsArray: " + Arrays.toString(intsArray));

        long[] longsArray = {99, 88, 77, 66};
        Arrays.sort(longsArray);
        System.out.println("longsArray: " + Arrays.toString(longsArray));

        double[] doublesArray = {99.9, 88.8, 77.7, 66.6};
        Arrays.sort(doublesArray);
        System.out.println("doublesArray: " + Arrays.toString(doublesArray));

        char[] charsArray = {'z', 'y', 'x', 'v'};
        Arrays.sort(charsArray);
        System.out.println("charsArray: " + Arrays.toString(charsArray));

        String[] stringsArray = {"zzz", "xxx", "vvv", "uuu"};
        Arrays.sort(stringsArray);
        System.out.println("stringsArray: " + Arrays.toString(stringsArray));

        boolean[] booleansArray = {true, false, true, false, false};
//        Arrays.sort(booleansArray); // compile time error
        // không có method nào dùng để sort kiểu boolean
        System.out.println("booleansArray: " + Arrays.toString(booleansArray));
    }
}
```
```
OUTPUT
bytesArray: [66, 77, 88, 99]
shortsArray: [66, 77, 88, 99]
intsArray: [66, 77, 88, 99]
longsArray: [66, 77, 88, 99]
doublesArray: [66.6, 77.7, 88.8, 99.9]
charsArray: [v, x, y, z]
stringsArray: [uuu, vvv, xxx, zzz]
booleansArray: [true, false, true, false, false]
```
## 4. binarySearch() method <a id="4"><a/>
* method **Arrays.binarySearch(array, element)** dùng để tìm vị trí **index**<br/>
  của phần tử trong mảng bằng giải thuật tìm kiếm nhị phân **binary <br/>
  Search**.

* **các phần tử trong mảng phải được sắp xếp trước khi gọi method<br/>
   này**. nếu không kết quả sẽ không chính xác.
 
* nếu trong array tồn tại số lượng phần tử đang tìm kiếm nhiều hơn một<br/>
  thì không có đảm bảo chính xác phần tử ở index nào sẽ được tìm thấy.
  
* nếu phần tử được tìm thấy trong array, nó return giá trị index của phần<br/>
tử trong mảng.
  
* nếu không tìm thấy, nó sẽ return (-insertionPoint-1).
  * insertionPoint được định nghĩa là điểm chèn mà tại đó, phần tử<br/>
  được chỉ định tìm kiếm sẽ được chèn vào trong array.
  * insertionPoint = index của phần tử đầu tiên -> nếu phần tử đầu tiên<br/>
  có giá trị lớn hơn phần tử chỉ định tìm kiếm.
  * insertionPoint = array.length -> nếu phần tử chỉ định tìm kiếm có giá<br/>
  trị lớn hơn tất cả các phần tử có trong array.
  
* **không có method tìm kiếm cho kiểu dữ liệu boolean**.

```java
import java.util.Arrays;

public class _04_binarySearch_method {
    public static void main(String[] args) {
        byte[] bytesArray = {9, 8, 7, 6};
        Arrays.sort(bytesArray);
        System.out.println("bytesArray: " + Arrays.toString(bytesArray));
        System.out.println("7 index=" + Arrays.binarySearch(bytesArray, (byte) 7));
        System.out.println("10 index=" + Arrays.binarySearch(bytesArray, (byte) 10));
        System.out.println("3 index=" + Arrays.binarySearch(bytesArray, (byte) 3));

        short[] shortsArray = {99, 88, 77, 66};
        Arrays.sort(shortsArray);
        System.out.println("shortsArray: " + Arrays.toString(shortsArray));
        System.out.println("77 index=" + Arrays.binarySearch(shortsArray, (short) 77));
        System.out.println("100 index=" + Arrays.binarySearch(shortsArray, (short) 100));
        System.out.println("55 index=" + Arrays.binarySearch(shortsArray, (short) 55));

        int[] intsArray = {99, 88, 77, 66};
        Arrays.sort(intsArray);
        System.out.println("intsArray: " + Arrays.toString(intsArray));
        System.out.println("77 index=" + Arrays.binarySearch(intsArray, 77));
        System.out.println("100 index=" + Arrays.binarySearch(intsArray, 100));
        System.out.println("55 index=" + Arrays.binarySearch(intsArray, 55));

        long[] longsArray = {99, 88, 77, 66};
        Arrays.sort(longsArray);
        System.out.println("longsArray: " + Arrays.toString(longsArray));
        System.out.println("66 index=" + Arrays.binarySearch(longsArray, 66));
        System.out.println("120 index=" + Arrays.binarySearch(longsArray, 120));
        System.out.println("23 index=" + Arrays.binarySearch(longsArray, 23));

        double[] doublesArray = {99.9, 88.8, 77.7, 66.6};
        Arrays.sort(doublesArray);
        System.out.println("doublesArray: " + Arrays.toString(doublesArray));
        System.out.println("88.8 index=" + Arrays.binarySearch(doublesArray, 88.8));
        System.out.println("199.99 index=" + Arrays.binarySearch(doublesArray, 199.99));
        System.out.println("25.52 index=" + Arrays.binarySearch(doublesArray, 25.52));

        char[] charsArray = {'z', 'y', 'x', 'v'};
        Arrays.sort(charsArray);
        System.out.println("charsArray: " + Arrays.toString(charsArray));
        System.out.println("x index=" + Arrays.binarySearch(charsArray, 'x'));
        System.out.println("a index=" + Arrays.binarySearch(charsArray, 'a'));

        String[] stringsArray = {"zzz", "xxx", "vvv", "uuu"};
        Arrays.sort(stringsArray);
        System.out.println("stringsArray: " + Arrays.toString(stringsArray));
        System.out.println("vvv index=" + Arrays.binarySearch(stringsArray, "vvv"));
        System.out.println("zzzzz index=" + Arrays.binarySearch(stringsArray, "zzzzz"));
        System.out.println("aaa index=" + Arrays.binarySearch(stringsArray, "aaa"));

        boolean[] booleansArray = {true, false, true, false, false};
//        Arrays.sort(booleansArray); // compile time error
        // không có method nào dùng để sort kiểu boolean
        // dẫn đến không thể tìm kiếm trong mảng boolean
        System.out.println("booleansArray: " + Arrays.toString(booleansArray));
    }
}
```
```
OUTPUT
bytesArray: [6, 7, 8, 9]
7 index=1
10 index=-5
3 index=-1
shortsArray: [66, 77, 88, 99]
77 index=1
100 index=-5
55 index=-1
intsArray: [66, 77, 88, 99]
77 index=1
100 index=-5
55 index=-1
longsArray: [66, 77, 88, 99]
66 index=0
120 index=-5
23 index=-1
doublesArray: [66.6, 77.7, 88.8, 99.9]
88.8 index=2
199.99 index=-5
25.52 index=-1
charsArray: [v, x, y, z]
x index=1
a index=-1
stringsArray: [uuu, vvv, xxx, zzz]
vvv index=1
zzzzz index=-5
aaa index=-1
booleansArray: [true, false, true, false, false]
```
## 5. fill() method <a id="5"><a/>
* method **Arrays.fill(array, value)** dùng để gán 1 giá trị xác định, cho tất cả<br/>
các phần tử có trong array.
  
* method này hữu ích trong việc khởi tạo tất cả các phần tử có trong array<br/>
với cùng 1 giá trị xác định.
  
```java
import java.util.Arrays;

public class _05_fill_method {
    public static void main(String[] args) {
        int[] ints = new int[5];
        Arrays.fill(ints, 10);
        System.out.println("intsArray: " + Arrays.toString(ints));

        double[] doubles = new double[] {12.5, 22.9, 32.1, 44.22};
        System.out.println("doubles before fill: " + Arrays.toString(doubles));
        Arrays.fill(doubles, 0.1);
        System.out.println("doubles after fill: " + Arrays.toString(doubles));

        boolean[] booleans = new boolean[5];
        Arrays.fill(booleans, true);
        System.out.println("booleans: " + Arrays.toString(booleans));

        char[] chars = new char[10];
        Arrays.fill(chars, 'x');
        System.out.println("chars: " + Arrays.toString(chars));

        String[] strings = {"one", "two", "three", "four"};
        System.out.println("strings before fill: " + Arrays.toString(strings));
        Arrays.fill(strings, "hi");
        System.out.println("strings after fill: " + Arrays.toString(strings));
    }
}
```
```
OUTPUT
intsArray: [10, 10, 10, 10, 10]
doubles before fill: [12.5, 22.9, 32.1, 44.22]
doubles after fill: [0.1, 0.1, 0.1, 0.1]
booleans: [true, true, true, true, true]
chars: [x, x, x, x, x, x, x, x, x, x]
strings before fill: [one, two, three, four]
strings after fill: [hi, hi, hi, hi]
```
## 6. copyOf() method <a id="5"><a/>
* method **Arrays.copyOf(srcArr, desArrLen)** được sử dụng để sao chép<br/>
mảng chỉ định vào mảng mới.
  * srcArr : mảng nguồn
  * desArrLen : độ dài của mảng đích
  
* nếu độ dài của mảng đích lớn hơn độ dài của mảng nguồn, thì ở mảng<br/>
đích, những phần tử vượt quá độ dài của mảng nguồn sẽ có giá trị mặc<br/>
  định.
  
* nếu độ dài của mảng đích nhỏ hơn độ dài của mảng nguồn, thì ở mảng<br/>
đích, chỉ chứa những phần tử nào của mảng nguồn mà không vượt quá<br/>
  độ dài của mảng đích.
  
```java
import java.util.Arrays;

public class _06_copyOf_method {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println("ints: " + Arrays.toString(ints));
        int[] ints1 = Arrays.copyOf(ints, 10);
        System.out.println("ints1: " + Arrays.toString(ints1));

        double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        System.out.println("doubles: " + Arrays.toString(doubles));
        double[] doubles1 = Arrays.copyOf(doubles, 5);
        System.out.println("doubles1: " + Arrays.toString(doubles1));

        boolean[] booleans = {true, true, true};
        System.out.println("booleans: " + Arrays.toString(booleans));
        boolean[] booleans1 = Arrays.copyOf(booleans, 6);
        System.out.println("booleans1: " + Arrays.toString(booleans1));

        char[] chars = {'a', 'b', 'c'};
        System.out.println("chars: " + Arrays.toString(chars));
        char[] chars1 = Arrays.copyOf(chars, 6);
        System.out.println("chars1: " + Arrays.toString(chars1));

        String[] strings = {"aa", "bb", "cc"};
        System.out.println("strings: " + Arrays.toString(strings));
        String[] strings1 = Arrays.copyOf(strings, 6);
        System.out.println("strings1: " + Arrays.toString(strings1));
    }
}
```
```
OUTPUT
ints: [1, 2, 3, 4, 5]
ints1: [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
doubles: [1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9]
doubles1: [1.1, 2.2, 3.3, 4.4, 5.5]
booleans: [true, true, true]
booleans1: [true, true, true, false, false, false]
chars: [a, b, c]
chars1: [a, b, c,  ,  ,  ]
strings: [aa, bb, cc]
strings1: [aa, bb, cc, null, null, null]
```
## 7. copyOfRange() method <a id="7"><a/>
* method **Arrays.copyOfRange(srcArr, startIndex, endIndex)** được sử<br/>
dụng để sao chép 1 phần của mảng nguồn chỉ định vào mảng đích.
  * srcArr : mảng nguồn
  * startIndex : vị trí bắt đầu sao chép (startIndex >= 0), nếu<br/>
    startIndex < 0, **throw ArrayIndexOutOfBoundsException**
  * endIndex : vị trí kết thúc sao chép (không sao chép ở vị trí này)<br/>
  nếu endIndex > srcArr.length giá trị mặc định sẽ được đệm vào.
  
* trong khi sao chép, mảng đích có thể bị cắt ngắn hoặc được đệm với<br/>
các giá trị mặc định để đạt được độ dài yêu cầu.
  
```java
import java.util.Arrays;

public class _07_copyOfRange_method {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("ints: " + Arrays.toString(ints));
        int[] ints1 = Arrays.copyOfRange(ints, 2, 5);
        System.out.println("ints1: " + Arrays.toString(ints1));

        double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("doubles: " + Arrays.toString(doubles));
        double[] doubles1 = Arrays.copyOfRange(doubles, 2, 7);
        System.out.println("doubles1: " + Arrays.toString(doubles1));

        boolean[] booleans = {true, true, true};
        System.out.println("booleans: " + Arrays.toString(booleans));
        boolean[] booleans1 = Arrays.copyOfRange(booleans, 1, booleans.length + 1);
        System.out.println("booleans1: " + Arrays.toString(booleans1));

        char[] chars = {'a', 'b', 'c'};
        System.out.println("chars: " + Arrays.toString(chars));
        char[] chars1 = Arrays.copyOfRange(chars, 1, 5);
        System.out.println("chars1: " + Arrays.toString(chars1));

        String[] strings = {"aaa", "bbb", "ccc"};
        System.out.println("strings: " + Arrays.toString(strings));
        String[] strings1 = Arrays.copyOfRange(strings, 2, strings.length + 4);
        System.out.println("strings1: " + Arrays.toString(strings1));
    }
}
```
```
OUTPUT
ints: [1, 2, 3, 4, 5, 6, 7, 8, 9]
ints1: [3, 4, 5]
doubles: [1.1, 2.2, 3.3, 4.4, 5.5]
doubles1: [3.3, 4.4, 5.5, 0.0, 0.0]
booleans: [true, true, true]
booleans1: [true, true, false]
chars: [a, b, c]
chars1: [b, c,  ,  ]
strings: [aaa, bbb, ccc]
strings1: [ccc, null, null, null, null]
```
## 8. asList() method <a id="8"><a/>
* method **Arrays.asList(arrayWrapper)** dùng để trả về 1 List từ 1 array <br/>
  chỉ định.
* các hoạt động như trộn, thay đổi phần tử trên List được trả về từ<br/>
method **Arrays.asList(array)** cũng sẽ ảnh hưởng đến array nguồn.
  
* một số hoạt động không thể thực hiện được trên Wrapper như thêm<br/>
hoặc loại bỏ phần tử, List được trả về chỉ có thể đọc và ghi.
  
```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _08_asList_method {
    public static void main(String[] args) {
        Integer[] integers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("integers: " + Arrays.toString(integers));
        List<Integer> list = Arrays.asList(integers);
        System.out.println("list: " + list);

        Collections.sort(list);
        System.out.println("list after sort: " + list);
        System.out.println("integer after sorting list: " + Arrays.toString(integers));

        Collections.fill(list, 90);
        System.out.println("list after fill: " + list);
        System.out.println("integers after filling list: " + Arrays.toString(integers));
        
        list.set(0, 1);
        System.out.println("list after set: " + list);
        System.out.println("integers after set list: " + Arrays.toString(integers));

//        list.add(77); // throw UnsupportedOperationException
//        list.remove(5); // throw UnsupportedOperationException
    }
}
```
```
OUTPUT
integers: [9, 8, 7, 6, 5, 4, 3, 2, 1]
list: [9, 8, 7, 6, 5, 4, 3, 2, 1]
list after sort: [1, 2, 3, 4, 5, 6, 7, 8, 9]
integer after sorting list: [1, 2, 3, 4, 5, 6, 7, 8, 9]
list after fill: [90, 90, 90, 90, 90, 90, 90, 90, 90]
integers after filling list: [90, 90, 90, 90, 90, 90, 90, 90, 90]
list after set: [1, 90, 90, 90, 90, 90, 90, 90, 90]
integers after set list: [1, 90, 90, 90, 90, 90, 90, 90, 90]
```
## 9. equals() method <a id="9"><a/>
* method **Arrays.equals(array1, array2)** được sử dụng để so sánh 2<br/>
có bằng nhau hay không.
  
* method này lấy 2 mảng làm tham số và return true nếu 2 mảng có:
  * cùng số lượng phần tử
  * giá trị của phần tử ở vị trí tương ứng của cả 2 mảng bằng nhau
  
```java
import java.util.Arrays;

public class _09_equals_method {
  public static void main(String[] args) {
    String[] s1 = { "java", "j2ee", "struts", "hibernate" };
    String[] s2 = { "jsp", "spring", "jdbc", "hibernate" };
    String[] s3 = { "java", "j2ee", "struts", "hibernate" };
    String[] s4 = { "java", "struts", "j2ee", "hibernate" };

    // equals()
    System.out.println("s1==s2: " + Arrays.equals(s1, s2));
    System.out.println("s1==s3: " + Arrays.equals(s1, s3));
    System.out.println("s1==s4: " + Arrays.equals(s1, s4));

    // nếu muốn so sánh 2 mảng có cùng số lượng phần tử và
    // các phần tử thì giống nhau, nhưng ở vị trí khác nhau
    // trước tiên cần sort lại mảng theo thứ tự tăng dần
    // sau đó tiến hành so sánh bằng Arrays.equals() method
    String[] s5 = { "java", "j2ee", "struts", "hibernate" };
    String[] s6 = {"hibernate", "struts", "j2ee", "java"};

    System.out.println("s5==s6: " + Arrays.equals(s5, s6));

    // sort()
    Arrays.sort(s5);
    Arrays.sort(s6);

    // equals()
    System.out.println("s5==s6: " + Arrays.equals(s5, s6));
  }
}
```
```
OUTPUT
s1==s2: false
s1==s3: true
s1==s4: false
s5==s6: false
s5==s6: true
```
## 10. deepEquals() method <a id="10"><a/>
* method **Arrays.deepEquals(arrays1, arrays2)** dùng để so sánh giữa<br/>
2 mảng 2 chiều trở lên có bằng nhau hay không.
  
```java
import java.util.Arrays;

public class _10_deepEquals_method {
    public static void main(String[] args) {
        String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
        String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };

        System.out.println("s1==s2: " + Arrays.equals(s1, s2));
        System.out.println("s1==s2: " + Arrays.deepEquals(s1, s2));

        String[][][] s3 = {
                {
                        {
                            "one", "two", "three"
                        },
                        {
                            "four", "five", "six"
                        }
                },
                {
                        {
                            "seven", "eight", "nine"
                        },
                        {
                            "eleven", "twelve", "thirteen"
                        }
                }
        };
        String[][][] s4 = {
                {
                        {
                                "one", "two", "three"
                        },
                        {
                                "four", "five", "six"
                        }
                },
                {
                        {
                                "seven", "eight", "nine"
                        },
                        {
                                "eleven", "twelve", "thirteen"
                        }
                }
        };

        System.out.println("s3==s4: " + Arrays.deepEquals(s3, s4));
    }
}
```
```
OUTPUT
s1==s2: false
s1==s2: true
s3==s4: true
```
___
THE END
