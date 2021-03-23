# `Queue` interface - `PiorityQueue` class
## Content
1. [Giới thiệu](#1)
2. [LinkedList](#2)
3. [PriorityQueue](#3)
   1. [Các phương thức đặc trưng của Queue](#3.1)
   2. [boolean add(E)](#3.2)
   3. [boolean offer(E)](#3.3)
   4. [E remove()](#3.4)
   5. [E poll()](#3.5)
   6. [E element()](#3.6)
   7. [E peek()](#3.7)
   8. [Nhận xét](#3.8)
4. [Ví dụ minh họa](#4)
   1. [Ví dụ sử dụng Queue với LinkedList](#4.1)
   2. [Ví dụ sử dụng hàng đợi có ưu tiên PriorityQueue với kiểu dữ liệu cơ bản (Wrapper)](#4.2)
   3. [Ví dụ sử dụng hàng đợi có ưu tiên PriorityQueue với kiểu do người dùng tự định nghĩa (Object)](#4.3)
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

