# `Queue` interface - `PriorityQueue` class
## Content
1. [Giới thiệu](#1)
2. [LinkedList](#2)
3. [PriorityQueue](#3)
4. [Các phương thức đặc trưng của Queue](#4)
   * [boolean add(E)](#4.1)
   * [boolean offer(E)](#4.2)
   * [E remove()](#4.3)
   * [E poll()](#4.4)
   * [E element()](#4.5)
   * [E peek()](#4.6)
   * [Nhận xét](#4.7)
5. [Ví dụ minh họa](#5)
   * [Ví dụ sử dụng Queue với LinkedList](#5.1)
   * [Ví dụ sử dụng hàng đợi có ưu tiên PriorityQueue với kiểu dữ liệu cơ bản (Wrapper)](#5.2)
   * [Ví dụ sử dụng hàng đợi có ưu tiên PriorityQueue với kiểu do người dùng tự định nghĩa (Object)](#5.3)
___
## 1. Giới thiệu <a id="1"></a>
* **Queue** là 1 *interface*.
* **Queue** thì extends từ **Collection**.
* **Queue** interface có đầy đủ tính năng của 1 Collection.
* **Queue** và **List** khá giống nhau, tuy nhiên mục đích sử dụng có khác nhau.
*  **Queue** *interface* hoạt động theo kiểu FIFO (**F**_irst_ **I**_n_ **F**_irst_ **O**_ut_ - vào trước ra trước).
* trong **FIFO**, chỉ có thể **truy cập**, hoặc **xóa** phần tử ở đầu hàng đợi.
* còn đối với thao tác **chèn**, chỉ có thể chèn vào giữa hoặc cuối hàng đợi, tùy thuộc vào:
   * loại hàng đợi.
   * độ ưu tiên của phần tử.
* **Queue** có thể chứa các phần tử trùng lặp.
* **Queue** KHÔNG cho phép chứa phần tử **null**.
>có thể coi **Queue** giống như 1 hàng đợi xếp hàng ở siêu thị.
>>chỉ có người đứng đầu hàng được phục vụ (truy xuất), hoặc mời đi (loại bỏ).<br/>
>>người đến sau có thể chen vào giữa nếu cao to, hoặc đứng cuối nếu lép vế.<br/>
>>>nếu chen ngay đầu hàng có thể sẽ bị bảo vệ hỏi thăm.

<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_12_Queue_interface_and_PriorityQueue_class/Queue_interface.png"> <br/>
Hình ảnh miêu tả hoạt động của Queue interface

* có **2 class implements Queue interface**:
   * **java.util.LinkedList;**
   * **java.util.PiorityQueue;**
___
## 2. LinkedList <a id="2"></a>
* LinkedList là 1 hàng đợi khá chuẩn.
* LinkedList thì **implements** 2 interface, đó là **_List_** và **_Queue_**.
* do LinkedList implements cả 2 interface List và Queue, nó có đầy đủ tính năng cần thiết<br/>của hàng đợi, nên ta không cần quan tâm cách sắp xếp các phần tử trong nội bộ của LinkedList<br/>nhiều, nếu cần sử dụng LinkedList làm hàng đợi, thì cứ sử dụng nó như 1 hàng đợi.
___
## 3. PriorityQueue <a id = "3"></a>
* **PriorityQueue** lưu trữ các phần tử trong nội bộ theo 
   * trật tự tự nhiên của phần tử (nếu các phần tử này là kiểu **Comparable**).
   * hoặc theo 1 bộ **Comparator** (bộ so sánh) được cung cấp cho **PriorityQueue**
___
## 4. Các phương thức đặc trưng của Queue <a id="4"></a>
Thao tác|Ném ra ngoại lệ|Trả về giá trị cụ thể
----|:----:|:----:
thêm 1 phần tử vào hàng đợi|add(e)|offer(e)
truy xuất và loại bỏ <br/>1 phần tử khỏi đầu hàng đợi|remove()|poll()
chỉ truy xuất nội dung <br/>của 1 phần tử ở đầu hàng đợi|element()|peek()

### `boolean add(E)` <a id="4.1"></a>

<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_12_Queue_interface_and_PriorityQueue_class/methodOfQueue_add(E).png">
<br/>boolean add(E) method

* thêm 1 phần tử vào hàng đợi nếu có thể, làm điều này ngay lập tức nếu không bị <br/>giới hạn **bởi** kích thước của hàng đợi.
* `return true` nếu thành công.
* `Throw IllegalStateException` khi hàng đợi không còn vị trí trống.

### `boolean offer(E)` <a id="4.2"></a>

<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_12_Queue_interface_and_PriorityQueue_class/methodOfQueue_offer(E).png"> <br/>
boolean offer(E)

* thêm 1 phần tử vào hàng đợi nếu có thể, làm điều này ngay lập tức nếu không bị <br/>giới hạn **bởi** kích thước của hàng đợi.
* khi hàng đợi bị giới hạn kích thước, phương thức này khá giống phương thức `add(E)`, <br/>tuy nhiên phương thức này không Throw bất kỳ Exception nào, nó chỉ `return false`<br/> khi hàng đợi không còn chỗ trống.

### `E remove()` <a id="4.3"></a>

<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_12_Queue_interface_and_PriorityQueue_class/methodOfQueue_E%20remove().png"> <br/>
E remove() method

* **truy xuất** đồng thời **loại bỏ** luôn phần tử đầu tiên của hàng đợi, `return` phần tử đầu<br/> tiên có kiểu E.
* nếu không có phần tử nào trong hàng đợi, Exception sẽ bị ném ra.

### `E poll()` <a id="4.4"></a>

<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_12_Queue_interface_and_PriorityQueue_class/methodOfQueue_E%20poll().png"> <br/>E poll() method

* **truy xuất** đồng thời **loại bỏ** luôn phần tử đầu tiên của hàng đợi, `return` phần tử đầu<br/> tiên có kiểu E.
* nếu không có phần tử nào trong hàng đợi thì `return null`

### `E element()` <a id="4.5"></a>

<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_12_Queue_interface_and_PriorityQueue_class/methodOfQueue_E%20element().png"> <br/>E element() method

* **chỉ truy xuất** phần tử đầu tiên của hàng đợi **nhưng không loại bỏ** phần tử đó.
* `Throw Exception` nếu hàng đợi không tồn tại bất kỳ phần tử nào.

### `E peek()` <a id="4.6"></a>

<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_12_Queue_interface_and_PriorityQueue_class/methodOfQueue_E%20peek().png"> <br/>E peek() method

* **chỉ truy xuất** phần tử đầu tiên của hàng đợi **nhưng không loại bỏ** phần tử đó.
* `return null` nếu hàng đợi không tồn tại bất kỳ phần tử nào.

### Nhận Xét <a id="4.7"></a>
* các method trên, không có method nào có thể dùng để truy xuất bất kỳ phần tử<br/> nào khác **ngoại trừ phần tử đầu tiên**.
* và không có method nào có thể dùng để chỉ định vị trí chèn phần tử vào hàng đợi.
___
## 5. Ví dụ minh họa <a id="5"></a>

### Ví dụ sử dụng Queue với LinkedList <a id="5.1"></a>
```java
import java.util.LinkedList;
import java.util.Queue;

public class Queue_with_LinkedList {
    public static void main(String[] args) {
        // khởi tạo 1 queue với instance của LinkedList (dùng LinkedList làm queue)
        Queue<String> stringQueue = new LinkedList<>();

        // offer(E) method để thêm phần tử
        // với LinkedList làm hàng đợi queue, phần tử sẽ được thêm vào cuối (tail)
        // return true : nếu thành công
        // return false : nếu hàng đợi không còn chỗ
        stringQueue.offer("A");
        stringQueue.offer("B");
        stringQueue.offer("C");

        // add(E) method để thêm phần tử
        // với LinkedList làm hàng đợi queue, phần tử sẽ được thêm vào cuối (tail)
        // return true : nếu thành công
        // Throw IllegalStateException nếu hàng đợi không còn chỗ
        stringQueue.add("D");
        stringQueue.add("E");

        while (true) {
            // E remove() hoặc E poll() method để lấy ra phần tử đầu tiên, đồng thời
            // xóa bỏ phần tử đó
            // E remove() ném ra ngoại lệ nếu hàng đợi rỗng
            // E poll()  return null nếu hàng đợi rỗng
            String stringQ = stringQueue.poll();
            if (stringQ == null) {
                break;
            }
            System.out.println("name= " + stringQ);
        }
        System.out.println();
        
        // kiểm tra hàng đợi LinkedList đã bị poll hết phần tử chưa
        System.out.println("Is queue empty? : " + stringQueue.isEmpty());
    }
}
```
OUTPUT:
```
name= A
name= B
name= C
name= D
name= E

Is queue empty? : true
```

### Ví dụ sử dụng hàng đợi có ưu tiên PriorityQueue với kiểu dữ liệu cơ bản (Wrapper) <a id="5.2"></a>
```java
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_with_PriorityQueue_by_Wrapper {
    public static void main(String[] args) {
        // với hàng đợi (queue) với instance của PriorityQueue, các phần
        // tử kiểu Wrapper sẽ được sắp xếp theo trật tự tự nhiên của chúng
        // không phụ thuộc vào trình tự được thêm vào, mà phụ thuộc vào tính
        // chất của mỗi kiểu Wrapper
        Queue<String> namelist = new PriorityQueue<>();

        // offer(E) : thêm phần tử vào hàng đợi (queue)
        // return true : nếu thành công
        // return false : nếu hàng đợi không còn vị trí trống
        namelist.offer("E");
        namelist.offer("D");
        namelist.offer("C");

        // add(E) : thêm phần tử vào hàng đợi
        // return true : nếu thành công
        // Throw Exception : nếu hàng đợi không còn vị trí trống
        namelist.add("B");
        namelist.add("A");

        while (true) {
            // E poll() : truy xuất nội dung, đồng thời loại bỏ phần tử đầu tiên của queue
            // return phần tử kiểu E nếu thành công
            // return null : nếu không tìm thấy phần tử nào trong queue
            String name = namelist.poll();
            if (name == null) {
                break;
            }
            System.out.println("Name= " + name);
        }
    }
}
```
OUTPUT:
```
Name= A
Name= B
Name= C
Name= D
Name= E
```
>Ở trên, thứ tự được thêm vào lần lượt là: E D C B A<br/>
>Tuy nhiên, kiểu String đã implements Comparable\<String> của nó,<br/>
>nên thứ tự sắp xếp trong hàng đợi đã thay đổi theo trật tự tự nhiên của kiểu String,<br/>
>nên Output: A B C D E
### Ví dụ sử dụng hàng đợi có ưu tiên PriorityQueue với kiểu do người dùng tự định nghĩa (Object) <a id="5.3"></a>
* Để sử dụng hàng đợi PriorityQueue cho kiểu người dùng tự định nghĩa, thì class của đối tượng<br/>
cần đưa vào hàng đợi phải implement Comparable hoặc cài đặt bộ so sánh cài đặt Comparator.

```java
// cài đặt class implements Comparable, làm tiêu chí so sánh sắp xếp phần
// tử cho hàng đợi ProrityQueue

import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book> {
    private int id;
    private String
            name, author, publisher;
    private int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + 
                ", publisher=" + publisher + ", quantity=" + quantity +"]";
    }
    @Override
    public int compareTo(Book o) {
        if (id < o.id) {
            return -1;
        } else if (id == o.id) {
            return 0;
        } else return 1;
    }
}
public class Queue_with_PriorityQueue_by_UserDataType {
    public static void main(String[] args) {
        // khởi tạo PriorityQueue
        Queue<Book> bookQueue = new PriorityQueue<>();

        // tạo các đối tượng Book
        Book b1 = new Book(333, "Let us C", "Yashwant Kanetkar", 
                "BPB", 8);
        Book b2 = new Book(222, "Operating System", "Galvin", 
                "Wiley", 6);
        Book b3 = new Book(111, "Data Communications & Networking", 
                "Forouzan", "Mc Graw Hill", 4);

        // thêm đối tượng Book vào hàng đợi
        bookQueue.add(b1);
        bookQueue.add(b2);
        bookQueue.add(b3);

        // duyệt qua hàng đợi (queue) bằng for-each
        System.out.println("Use for-each to retrieve queue");
        for (Book b : bookQueue) {
            System.out.println(b);
        }
        System.out.println("queue - empty: " + bookQueue.isEmpty());
        System.out.println("Use E poll() method to get & remove first element in queue");
        System.out.println(bookQueue.poll());
        System.out.println(bookQueue.poll());
        System.out.println(bookQueue.poll());
        System.out.println("queue - empty: " + bookQueue.isEmpty());
    }
}
```
OUTPUT:
```
Use for-each to retrieve queue
Book [id=111, name=Data Communications & Networking, author=Forouzan, publisher=Mc Graw Hill, quantity=4]
Book [id=333, name=Let us C, author=Yashwant Kanetkar, publisher=BPB, quantity=8]
Book [id=222, name=Operating System, author=Galvin, publisher=Wiley, quantity=6]
queue - empty: false
Use E poll() method to get & remove first element in queue
Book [id=111, name=Data Communications & Networking, author=Forouzan, publisher=Mc Graw Hill, quantity=4]
Book [id=222, name=Operating System, author=Galvin, publisher=Wiley, quantity=6]
Book [id=333, name=Let us C, author=Yashwant Kanetkar, publisher=BPB, quantity=8]
queue - empty: true
```
>theo trình tự thêm vào hàng đợi, id của phần tử lần lượt là: 333, 222, 111.<br/>
>nhưng class Book có implements interface Comparable, cài đặt tiêu chí so sánh theo id,<br/.>
>nên các phần tử khi thêm vào queue được sắp xếp lại theo id, nhỏ trước, lớn sau.
___
THE END