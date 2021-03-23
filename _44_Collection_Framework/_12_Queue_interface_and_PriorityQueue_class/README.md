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

![](https://github.com/hienqp/JavaCore/blob/main/_44_Collection_Framework/_12_Queue_interface_and_PiorityQueue_class/Queue_interface.png)<br/>
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
truy xuất và loại bỏ 1 phần tử khỏi đầu hàng đợi|remove()|poll()
chỉ truy xuất nội dung của 1 phần tử ở đầu hàng đợi|element()|peek()

### `boolean add(e)`

### `boolean offer(e)`
### `E remove()`
### `E poll()`
### `E element()`
### `E peek()`