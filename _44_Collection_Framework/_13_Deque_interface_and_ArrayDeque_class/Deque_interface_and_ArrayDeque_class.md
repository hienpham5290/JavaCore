# Deque interface & ArrayDeque class
___
## Content
1. [Deque Interface](#1)
   
   1.1. [Giới thiệu](#1.1)
   
   1.2. [Các phương thức của Deque Interface](#1.2)
   
   1.3. [Sử dụng Deque như Queue](#1.3)
   
   1.4. [Sử dụng Deque như Stack](#1.4)
   
   1.5. [Các đặc điểm của Deque](#1.5)
   
2. [Lớp ArrayDeque](#2) 
   2.1. [Đặc điểm](#2.1)
   2.2. [Phân cấp ArrayDeque](#2.2)
   
3. [Ví dụ minh họa sử dụng ArrayDeque](#3)
   
   3.1. [Ví dụ sử dụng ArrayDeque như Collection](#3.1)
   
   3.2. [Ví dụ sử dụng ArrayDeque như Queue](#3.2)
   
   3.3. [Ví dụ sử dụng ArrayDeque như Stack](#3.3)
___
## 1. Deque interface <a id="1"></a>
### 1.1. Giới thiệu <a id="1.1"></a>
* **Deque** _interface_ hỗ trợ truy xuất, thêm và loại bỏ phần tử ở cả 2 đầu hàng đợi.
* **Deque** là viết tắt của **D**ouble **e**nded **que**ue.
* _interface_ **java.util.Deque** được định nghĩa như sau:
```java
public interface Deque<E> extends Queue<E> {
    //
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_13_Deque_interface_and_ArrayDeque_class/hierarchy_of_Deque_interface.png">
<br/>Hierarchy Of Deque interface

### 1.2. Các phương thức của Deque interface <a id="1.2"></a>
* ta có **Queue** là 1 cấu trúc hàng đợi, hoạt động theo kiểu **FIFO** - first in first out,<br/>
  hay còn gọi là VÀO TRƯỚC RA TRƯỚC.
  
* ta có **Stack** là 1 cấu trúc ngăn xếp, hoạt động theo kiểu **LIFO** - last in first out,<br/>
  hay còn gọi là VÀO SAU RA TRƯỚC.
  
* với **Deque** ta có thể đồng thời sử dụng nó như là 1 **Queue** **(FIFO)** hay 1 **Stack** 
  <br/>**(LIFO)**.
  
* **Deque** có tất cả các **method** cần thiết cho hoạt động **FIFO** và **LIFO**.
  
* một số phương thức **Throw Exception**, một số **return null** hoặc **false** nếu thao<br/>
  thất bại.
  
* Bảng danh sách các phương thức của **Deque** _interface_

Thao tác|Vị trí|Ném Exception|return null hoặc false
-------|-------|:-------:|:-------:
Thêm|**Đầu** danh sách|**addFirst()**|**offerFirst()**
Thêm|**Cuối** danh sách|**addLast()**|**offerLast()**
Truy xuất|**Đầu** danh sách|**getFirst()**|**peekFirst()**
Truy xuất|**Cuối** danh sách|**getLast()**|**peekLast()**
Truy xuất và<br/>loại bỏ|**Đầu** danh sách|**removeFirst()**|**pollFirst()**
Truy xuất và<br/>loại bỏ|**Cuối** danh sách|**removeLast()**|**pollLast()**

>bảng trên đây cho ta thấy, trong **Deque** interface, ta không thể thao tác với các phần
> tử ở giữa của danh sách **Deque**

### 1.3. Sử dụng Deque như Queue <a id="1.3"></a>
* vì **Deque** _interface_ **extends** **Queue** _interface_, nên **Deque** có thể sử dụng tất cả các<br/>
phương thức của **Queue** _interface_ để có thể hoạt động như là 1 queue.
  
* ngoài ra, **Deque** là danh sách 2 đầu, nó cũng có những phương thức của riêng nó,<br/>
tương ứng với những phương thức của **Queue** để có thể hoạt động như là 1 queue.
  
* những phương thức của **Deque** tương đồng với các sử dụng của **Queue**
>lưu ý: những thao tác của **Queue**
> >truy xuất phần tử đầu<br/>
> >truy xuất và loại bỏ phần tử đầu<br/>
> >thêm phần tử vào cuối (còn tùy thuộc vào việc cài đặt Comparable hay <br/>
> Comparator như thế nào mà phần tử sẽ được thêm vào cuối hay giữa queue)

Thao tác|phương thức của Queue|phương thức tương ứng<br/>của Deque
------|----|----
Thêm|add()<br/>offer()|addLast()<br/>offerLast()
Truy xuất|element()<br/>peek()|getFirst()<br/>peekFirst()
Truy xuất và loại bỏ|remove()<br/>poll()|removeFirst()<br/>pollFirst()

### 1.4. Sử dụng Deque như Stack <a id="1.4"></a>
* **Stack** class có 2 phương thức **pop()** và **push()**.

* 2 phương thức này làm cho **Stack** hoạt động như 1 ngăn xếp chồng các cuốn sách.

* với 1 chồng sách, ta chỉ có thể lấy ra cuốn sách cuối được thêm vào, và đó là cách<br/>
hoạt động của **Stack** **(LIFO)** - vào cuối ra trước.
  
>Tóm lại:
> >**Stack** thêm phần tử vào cuối<br/>
> >**Stack** lấy phần tử cuối ra<br/>
> >**Stack** lây phần tử cuối ra, đồng thời loại bỏ nó

* Những phương thức của **Stack** và phương thức tương đồng của **Deque**

Thao tác|phương thức của Stack|phương thức tương đồng <br/>của Deque
----|----|----
Thêm|push()|addFirst()
Truy xuất|peek()|peekFirst()
Truy xuất và loại bỏ|pop()|removeFirst()

### 1.5. Các đặc điểm của Deque <a id="1.5"></a>
* **Deque** có thể chứa các phần tử **null**, tuy nhiên không nên chèn các phần tử **null**,<br/>
vì nhiều phương thức trả về **return null** để cho biết **Deque** là rỗng.
  
* **Deque** có thể chứa các phần tử trùng lặp.

* không thể thiết lập, truy xuất, hoặc chèn phần tử ở vị trí bất kỳ trong **Deque**, tức là<br/>
không thể truy cập ngẫu nhiên **(random access)** với **Deque**.
  
* có thể sử dụng các phương thức sau để xóa phần tử chỉ định khỏi **Deque**:
    * removeFirstOccurence(E e)
    * removeLastOccurence(E e)
    * remove(E e)
    
* có 2 class **implement Deque** là:
    * **LinkedList**
    * **ArrayDeque**
    
___
## 2. ArrayDeque class <a id="2"></a>
### 2.1. Đặc điểm <a id="2.1"></a>
* **ArrayDeque** class cung cấp 1 cách để áp dụng 1 mảng có thể thay đổi kích thước<br/>
  bằng cách thêm vào quá trình triển khai **implements Deque** interface.
  
* **ArrayDeque** còn được gọi là **Array Double Ended Queue** hay **Array Deck**.
  
* đây là 1 loại array đặc biệt, nó tự phát triển, cho phép người dùng thêm, xóa phần tử<br/>
  ở cả 2 đầu của hàng đợi.
  
* Những đặc điểm quan trọng về **ArrayDeque** class:
    * **ArrayDeque** extends từ **AbstractCollection** class.
      
    * **ArrayDeque** implements triển khai **Deque** interface.
      
    * **ArrayDeque** không có sự giới hạn capacity, capacity của nó tự tăng khi ta thêm<br/>
    phần tử.
      
    * **ArrayDeque** dùng để cài đặt 1 array có thể thay đổi kích thước.
        * **ArrayDeque** tương tự như **ArrayList** là array có thể thay đổi kích thước.
        * tuy nhiên **ArrayList** implements **List**, nên ArrayList là 1 List
        * **ArrayDeque** implements **Deque**, nên không phải là 1 list.
    
    * capacity mặc định ban đầu là 16, nó tự tăng capacity khi size vượt quá capacity.
    
    * **ArrayDeque** không phải là thread an toàn.
    
    * **ArrayDeque** có thể sử dụng như 1 ngăn xếp **Stack (LIFO)** hoặc như 1 hàng đợi<br/>
    **Queue (FIFO)**.
        * **ArrayDeque** nhanh hơn **Stack** khi sử dụng như ngăn xếp.
        * **ArrayDeque** nhanh hơn **LinkedList** khi sử dụng như hàng đợi.
    
    * **ArrayDeque** đôi khi được coi là có hiệu suất tốt nhất trong **Collection<br/>
      Framework, độ phức tạp khi thực hiện chèn, loại bỏ và truy xuất của nó là O(1).
      
    * **ArrayDeque** được khuyến khích thay thế **Stack** khi muốn sử dụng cấu trúc dữ<br/>
    ngăn xếp, và thay thế **LinkedList** khi muốn sử dụng cấu trúc hàng đợi.
      
    * không thể thực hiện các thao tác liên quan đến index - chỉ số trên **ArrayDeque**<br/>
    vì nó không hỗ trợ truy xuất ngẫu nhiên (Random Access), nó không có các<br/>
      phương thức để hỗ trợ các thao tác đó.
      
    * các phần tử **null** không được phép trong **ArrayDeque**.
### 2.2. Phân cấp ArrayDeque <a id="2.1"></a>
___
## 3. Ví dụ minh họa sử dụng ArrayDeque <a id="3"></a>
### 3.1. Ví dụ sử dụng ArrayDeque như Collection <a id="3.1"></a>
### 3.2. Ví dụ sử dụng ArrayDeque như Queue <a id="3.2"></a>
### 3.3. Ví dụ sử dụng ArrayDeque như Stack <a id="3.3"></a>
___
THE END