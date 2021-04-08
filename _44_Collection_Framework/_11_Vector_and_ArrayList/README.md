# SO SÁNH ArrayList class và Vector class
___
## Table Content <a id="0"></a>

[1. Giống nhau giữa ArrayList class và Vector class](#1)<br/>
[2. Khác nhau giữa ArrayList class và Vector class](#2)<br/>
[3. Ví dụ duyệt ArrayList sử dụng Iterator](#3)<br/>
[4. Ví dụ duyệt Vector sử dụng Enumeration](#4)
___

## 1. Giống nhau giữa ArrayList class và Vector class <a id="1"></a>
[Về đầu trang](#0)
* ArrayList và Vector đều implements List interface.
* ArrayList và Vector đều duy trì thứ tự của phần tử theo trình tự được thêm vào.
## 2. Khác nhau giữa ArrayList class và Vector class <a id="2"></a>
[Về đầu trang](#0)<br/>
<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_11_Vector_and_ArrayList/Multi-Threading-Vector-and-ArrayList.png">

ArrayList class|Vector class
----------|----------
ArrayList thì **non-synchronized** (không đồng bộ)|Vector thì **synchronized** (được đồng bộ)
vì không đồng bộ nên ArrayList nhanh hơn Vector|vì phải đồng bộ nên Vector chậm hơn ArrayList.<br/>Trong những ứng dụng đa luồng, các **thread** sẽ<br/>giữ Vector ở trạng thái **runable** hoặc **non-runable**,<br/>đến khi **thread** hiện tại giải phóng đối tượng đó.
ArrayList được duyệt bởi **Iterator**|Vector được duyệt bởi **Iterator** và **Enumeration**
**Không** thể chủ động thay đổi kích thước hiện tại<br/>của ArrayList, kích thước của ArrayList chỉ được<br/>thay đổi khi thêm hoặc xóa phần tử.|**Có thể** chủ động thay đổi kích thước của Vector bằng<br/>**setSize()** method.
ArrayList tăng **50%** **size()** hiện tại nếu số phần tử<br/>vượt quá **Capacity** của nó.|Vector tăng **100% size()** hiệ tại nếu số phần tử vượt<br/>**Capacity** của nó.
Chúng ta có thể làm cho ArrayList được **synchronized**<br/>bằng cách gọi method:<br/>`Collections.synchronizedList()`|Vector **đã được synchronized** sẵn bên trong, và<br/>**KHÔNG THỂ HỦY** trạng thái **synchronized** này.
ArrayList được ưa thích trong các ứng dụng đơn luồng <br/>(single-thread). <br/>Nếu bạn muốn sử dụng HashMap trong ứng dụng đa <br/>luồng (mulit-thread), có thể thực hiện bằng cách sử dụng <br/>phương thức `Collections. synchronizedList()`.|Mặc dù Vector có để sử dụng trong các ứng dụng <br/>đa luồng (multi-thread), nhưng ngày nay nó ít <br/>được sử dụng. Bởi vì, <br/>`Collections.synchronizedList()` là lựa chọn <br/>tốt hơn Vector.
___

## 3. Ví dụ duyệt ArrayList sử dụng Iterator <a id="3"></a>
[Về đầu trang](#0)
```java
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_with_Iterator {
    public static void main(String[] args) {
        ArrayList<String> languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("XML");
        languageList.add("Mardown");
        languageList.add("SQL");

        Iterator<String> iterator = languageList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```
OUTPUT:
```
Java
XML
Mardown
SQL
```
___
## 4. Ví dụ duyệt Vector sử dụng Enumeration <a id="4"></a>
[Về đầu trang](#0)
```java
import java.util.Enumeration;
import java.util.Vector;

public class Vector_with_Enumeration {
    public static void main(String[] args) {
        Vector<String> languageList = new Vector<>();
        languageList.add("Java");
        languageList.add("XML");
        languageList.add("SQL");
        languageList.add("Markdown");

        Enumeration<String> enumeration = languageList.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
```
OUTPUT:
```
Java
XML
SQL
Markdown
```
___
THE END