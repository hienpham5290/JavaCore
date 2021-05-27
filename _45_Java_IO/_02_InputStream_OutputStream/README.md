# I/O Stream<br/>InputStream - OutputStream

## Nội dung
1. [Input Stream và Output Stream là gì](#1)
2. [Byte Streams - Các luồng Byte](#2)
   
    2.1. [OutputStream class](#2.1)
   
    2.2. [InputStream class](#2.2)
   
3. [Character Streams - Các luồng ký tự](#3)
4. [Standard Streams - Các luồng tiêu chuẩn](#4)

## 1. Input Stream và Output Stream là gì <a id="1"></a>
* **Đầu vào / Đầu ra** hay **Input / Output (I/O)** được dùng để xử lý đầu vào<br/>
 và đầu ra trong Java.
* Java sử dụng khái niệm **Stream** để làm cho hoạt động **I/O** nhanh hơn.
* **Stream** là
   * 1 dòng chảy liên tục có thứ tự
   * các **byte** dữ liệu chảy giữa chương trình và thiết bị ngoại vi
   * nó là khái niệm trừu tượng, giúp giảm bớt các thao tác vào ra phức<br/>
     tạp đối với người lập trình
   * nó cho phép kết nối nhiều thiết bị ngoại vi khác nhau với chương<br/>
   trình
* nếu dòng dữ liệu trong **Stream** có hướng chảy từ thiết bị ngoại vi vào<br/>
chương trình, nó được gọi là **Stream nhập (Input Stream)**.
  
* nếu dòng dữ liệu trong **Stream** có hướng chảy từ chương trình ra thiết<br/>
bị ngoại vi, nó được gọi là **Stream xuất (Output Stream)**.<br/>
<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_02_InputStream_OutputStream/input_stream.png">
<br/>
<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_02_InputStream_OutputStream/output_stream.png">
<br/>
* đối với Java
    * các thiết bị chỉ nhập (Bàn phím...) sẽ có Input Stream nối với nó
    * các thiết bị chỉ xuất (màn hình...) sẽ có Output Stream nối với nó
    * thiết bị vừa xuất và nhập (đĩa từ) sẽ có cả Input Stream và Output<br/>
    Stream nối với nó
* để giao tiếp với thiết bị ngoại vi:
    * trước tiên, chương trình phải lấy được Input Stream / Output Stream<br/>
    gắn với thiết bị ngoại vi này
    * sau đó chương trình sẽ **Xuất** hoặc **Nhập**:
        * Output dữ liệu ra thiết bị ngoại vi, bằng cách **write** dữ liệu vào<br/>
        Stream xuất đến thiết bị ngoại vi
        * Input dữ liệu từ thiết bị ngoại vi, bằng cách **read** dữ liệu từ<br/>
        Stream nhập vào bởi thiết bị ngoại vi
        >Nói cách khác, chương trình chỉ làm việc trên các Output<br/>
        Stream hoặc Input Stream, mà không quan tâm đến đặc điểm<br/>
        riêng biệt của từng thiết bị.
        
    * gói **java.io** chứa tất cả các class cần thiết cho hoạt động **I/O** của<br/>
    Stream.
## 2. Byte Streams - Các luồng Byte <a id="2"></a>

### 2.1. OutputStream class <a id="2.1"></a>

### 2.2. InputStream class <a id="2.2"></a>

## 3. Character Streams - Các luồng ký tự <a id="3"></a>

## 4. Standard Streams - Các luồng tiêu <br/>chuẩn <a id="4"></a>
