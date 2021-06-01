# I/O Stream<br/>InputStream - OutputStream
___
## Nội dung
1. [Input Stream và Output Stream là gì](#1)
2. [Byte Streams - Các luồng Byte](#2)
   
    2.1. [OutputStream class](#2.1)
   
    2.2. [InputStream class](#2.2)
   
3. [Character Streams - Các luồng ký tự](#3)
4. [Standard Streams - Các luồng tiêu chuẩn](#4)
5. [UTF-8 encoding & UTF-16 encoding](#5)

    5.1. [UTF-8 encoding](#5.1)

    5.2. [UTF-16 encoding](#5.2)
___
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
___      
## 2. Byte Streams - Các luồng Byte <a id="2"></a>
* các Byte Stream được dùng để thực hiện hoạt động **I/O** của **byte 8-bit**.
* có nhiều class liên quan đến **Byte Stream**, nhưng các class này được<br/>
dẫn đầu bởi 2 class **InputStream** và **OutputStream**.
    * **InputStream** (Stream nhập): dùng để **READ** data từ 1 **SOURCE**.
    * **OutputStream** (Stream xuất): dùng để **WRITE** data đến <br/>**DESTINATION**.

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_02_InputStream_OutputStream/byte_streams.png">

* hoạt động của **InputStream** và **OutputStream** được mô tả như sau:

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_02_InputStream_OutputStream/input_stream_output_stream_operation.png">


### 2.1. OutputStream class <a id="2.1"></a>
* **OutputStream class** 
    * là 1 _**abstract class**_
    * là 1 **superclass** của các class đại diện 1 **output stream** của các<br/> 
      **byte**
    * 1 **output stream** chấp nhận các byte đầu ra và gửi chúng đến nơi<br/>
    cần chứa
    * tùy ứng dụng mà chọn 1 **subclass** của **OutputStream**, nhưng ít<br/>
    nhất **subclass** đó cần phải có 1 method dùng để **write** byte của<br/>
      đầu ra
___      
* **các method của _**abstract**_ class **OutputStream****
    * ```java
        public void write(int b) throws IOException
        // write 1 byte chỉ định đến output stream
      ```
    * ```java
        public void write(byte[] b) throws IOException
        // write 1 số lượng byte là b.length bytes từ 1 mảng byte đến
        // output stream
      ```  
    * ```java
        public void write(byte[] b, int offset, int length) throws IOException
        // write 1 số lượng byte là length bytes từ 1 mảng byte bắt đầu tại
        // vị trí offset
      ```
          
    * ```java
        public void flush() throws IOException
        // đẩy các byte được lưu trong vùng đệm của stream ra thiết bị
        // ngoại vi
      ```
    * ```java
        public void close() throws IOException
        // đóng stream hiện tại, đồng thời giải phóng mọi tài nguyên đang
        // liên kết đến stream
      ```
___      
### 2.2. InputStream class <a id="2.2"></a>
* **InputStream** class
    * là 1 _**abstract class**_
    * là 1 **superclass** của các class đại diện 1 **input stream** của các **byte**
    * tùy ứng dụng mà chọn 1 **subclass** của **InputStream**, nhưng ít nhất<br/>
    **subclass** đó phải cung cấp 1 method trả về byte tiếp theo trong <br/>
      **input**.
    * **reset()** method được gọi để định vị lại **stream** đến vị trí được đánh<br/>
    dấu mới đây
___      
* **các method của _**abstract**_ class **InputStream****
    * ```java
        public void mark(int arg)
        // đánh dấu vị trí hiện tại trên input stream, 
        // bạn có thể đọc tiếp các byte tiếp theo
        // và method reset() dùng để quay trở lại vị
        // trí đã mark() lần gần nhất
      
        // trong đó readAheadLimit là số bytes tối đa có thể đọc 
        // sau khi mark() mà không làm mất vị trí đã mark()
      
        // không phải tất cả các InputStream đều hỗ trợ hoạt động
        // mark(), để chắc chắn cần gọi method markSupported()
        // để kiểm tra xem đối tượng InputStream hiện tại có hỗ 
        // trợ hoạt động đó hay không
      ```
    * ```java
        public int read() throws IOException
        // read() method được sử dụng để đọc 1 byte
        // giá trị của byte được trả về là 1 số integer 
        // trong khoảng 0-255
        // hoặc trả về -1 nếu tiến tới cuối Stream
      ```
    * ```java
        public int read(byte[] b) throws IOException
        // method read(byte[] b) đọc các bytes từ InputStream
        // gán vào các phần tử của mảng và trả về số lượng 
        // bytes đọc được từ InputStream
        // trả về -1 nếu tiến tới cuối stream
      ```
    * ```java
        public int read(byte[] b, int offset, int len) throws IOException
        // đọc các bytes và gán vào các phần tử của mảng từ chỉ vị
        // trí (offset) -> đến (offset + len)
        // và trả về số lượng bytes vừa đọc được
        // return -1 nếu tiến tới cuối stream
      ```
    * ```java
        public void close() throws IOException
        // đóng stream này và giải phóng mọi tài nguyên hệ thống
        // được liên kết với nó.
        // khi stream đã bị đóng, các lệnh gọi tiếp read(), mark()
        // reset() hoặc skip() sẽ ném ra 1 IOException.
        // đóng stream đã đóng trước đó không có tác dụng
      ```  
      ```java
        public interface Closeable extends AutotCloseable
        // InputStream class implements Closeable interface
        // nếu coder viết code theo quy tắc của AutoCloseable
        // thì hệ thống sẽ auto close stream mà không cần trực
        // trực tiếp gọi close() method
      ```
    * ```java
        public long skip(long n) throws IOException
        // bỏ qua số lượng n bytes
      ```  
    * ```java
        // JDK 10+
        public long transferTo(OutputStream out) throws IOException
        // transferTo đọc tất cả các bytes của InputStream
        // chuyển tất cả các bytes sang OutputStream chỉ định
        // trả về giá trị kiểu long là số bytes đã chuyển sang OutputStream
        // sau khi kết thúc, đối tượng của InputStream hiện tại sẽ ở cuối stream
        // method này sẽ không tự close InputStream cũng như OutputStream hiện tại
      ```
    * ```java
        public boolean markSupported()
        // kiểm tra InputStream có hỗ trợ hoạt động mark để sử dụng
        // method mark(int) hay không
        ```
    * ```java
        public void mark(int readAheadLimit) throws IOException
        // method này dùng để đánh dấu vị trí của byte hiện tại 
        // trên stream.
        // có thể read() từ byte ở vị trí hiện tại đến các byte tiếp
        // theo trên stream.
        // có thể gọi method reset() để quay trở lại vị trí đã mark()
        // để tiếp tục lặp lại việc read() byte.
        // trong đó readAheadLimit là số byte tối đa tính từ vị trí
        // đã mark(), nếu vượt qua limit (giới hạn) này sẽ không thể
        // reset() quay lại vị trí đã mark() để read() byte
      ```
    * ```java
        public void reset() throws IOException
        // nếu đối tượng của InputStream hiện tại có hỗ trợ việc
        // đánh dấu vị trí thông qua method mark(), thì method
        // reset() được sử dụng để quay trở lại vị trí đã đánh
        // dấu
      ```
## 3. Character Streams - Các luồng ký tự <a id="3"></a>
* các **Byte Stream** được sử dụng để thực hiện **input** và **output** của các<br/>
**byte 8-bit**.
  
* trong khi các **Character Stream** được sử dụng để thực hiện **input** và<br/>
**output** cho các **unicode 16-bit**.
  
* có nhiều class liên quan đến **Character Stream**, nhưng các class này<br/>
được dẫn đầu bởi 2 **abstract class**:
    * **Reader**: sử dụng **đọc** dữ liệu **từ** nguồn (source -> program)
    * **Writer**: sử dụng **ghi** dữ liệu **đến** nguồn (program => source)
  
<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_02_InputStream_OutputStream/character_streams.png">

## 4. Standard Streams - Các luồng tiêu <br/>chuẩn <a id="4"></a>
* tất cả các programming language đều cung cấp hỗ trợ cho **I/O** tiêu<br/>
  chuẩn, nơi mà program của người dùng có thể lấy dữ liệu từ bàn phím<br/>
  và sau đó tạo ra 1 đầu ra trên màn hình máy tính.
  
* Java cung cấp 3 Standard Streams sau:
  * **Standard Input**: dùng để nhập dữ liệu vào trong chương trình của<br/>
  người dùng, và thường là 1 bàn phím sử dụng như là **Standard <br/>
    Input Stream** và được thể hiện dưới dạng **System.in**
    
  * **Standard Output**: dùng để xuất dữ liệu được tạo ra bởi chương<br/>
  trình của người dùng, và thường là màn hình máy tính được sử<br/>
    dụng cho **Standard Output Stream** và được thể hiện dưới dạng<br/>
    **System.out**
    
  * **Standard Error**: được sử dụng để xuất dữ liệu lỗi do chương trình<br/>
  người dùng tạo ra, và thường là màn hình máy tính được sử dụng<br/>
    cho **Standard Error Stream**  và được thể hiện dưới dạng <br/>
    **System.err**
    
## 5. UTF-8 encoding & UTF-16 encoding <a id="5"></a>
### 5.1 UTF-8 encoding <a id="5.1"></a>
* với mã hóa (encoding) **UTF-8** để lưu 1 ký tự vào bộ nhớ.
* **UTF-8** là 1 bảng mã mở rộng so với bảng mã **ASCII**.
* trong **UTF-8** gồm 2 phần:
  * từ 0-127: là các ký tự trong bảng **ASCII**
  * \> 127: là các ký tự mở rộng
* **UTF-8** sử dụng từ 1, 2, hoặc 3 bytes để lưu trữ 1 ký tự.
* quy tắc lưu trữ của **UTF-8** encoding:
  * đọc 1 byte nếu <= 127: thì đó là 1 ký tự trong bảng mã **ASCII**.
  * nếu byte đang đọc > 127: nó sẽ đọc byte thứ 2, và kiểm tra 2 byte<br/>
  đó có thuộc ký tự nào trong bảng mã **UTF-8** hay không.
  * nếu byte thứ 2 và thứ 1 không tạo thành 1 ký tự, đọc tiếp byte thứ<br/>
  3 và chắc chắn sẽ ghép thành 1 ký tự trong bảng mã **UTF-8**
### 5.2 UTF-16 encoding <a id="5.2"></a>
* với mã hóa (encoding) **UTF-16** để lưu trữ ký tự vào bộ nhớ.
* cách thức lưu trữ của **UTF-16** là sử dụng 2 bytes liên tiếp nhau, để tạo<br/>
thành 1 ký tự tương ứng trong bảng mã **UTF-16**.
* quy tắc lưu trữ của **UTF-16** encoding:
  * 2 bytes đầu tiên của **stream** sẽ có giá trị lần lượt là: 254 , 255<br/>
  2 bytes này có ý nghĩa thông báo rằng nó bắt đầu 1 chuỗi mã hóa<br/>
    **UTF-16**
    
  * cứ mỗi 2 bytes tiếp theo là 1 mã hóa của ký tự trong bảng **UTF-16**.
  
> như vậy việc lưu 1 văn bản với mã hóa (encoding) gì,<br/>
> thì khi đọc ra cũng phải dùng mã hóa tương ứng, nếu không thì sẽ xảy<br/>
> ra tình trạng mã hóa sai dẫn đến xuất ra thông tin sai, vì với mỗi bảng mã<br/>
> khác nhau sẽ có cách đọc và ghi thông tin khác nhau.

