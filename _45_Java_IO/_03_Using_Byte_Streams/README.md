# Hướng Dẫn Sử Dụng Các Byte <br/>Stream Trong Java
_________________________________________________________________________________________________________
* có nhiều class hỗ trợ xử lý các luồng vào ra nhị phân (byte-stream).
* dẫn đầu là 2 **abstract class**:
    * **InputStream**
    * **OutputStream**
   
* **InputStream class**:
   * là 1 **abstract class**, nên không thể khởi tạo **object** trực tiếp, mà<br/>
   phải thông qua các **subclass** của **InputStream** class.
     
   * tùy vào tình huống, có thể sử dụng **Constructor** của các **subclass**<br/>
   của **InputStream** để khởi tạo **instance** cho **InputStream** class.
     
```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // khởi tạo instance của InputStream thông qua FileInputStream
        InputStream inputStream = new FileInputStream("inputstream.txt");
        
        // input stream từ bàn phím
        InputStream inputKeyboard = System.in;
    }
}
```
* **OutputStream class**:
    * là 1 **abstract class**, nên không thể khởi tạo **object** trực tiếp, mà<br/>
    phải thông qua các **subclass** của **OutputStream** class.
      
    * tùy vào tình huống, có thể sử dụng **Constructor** của các **subclass**<br/>
    của **OutputStream** để khởi tạo **instance** cho **OutputStream** class.
      
```java
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // khởi tạo instance của OutputStream thông qua FileOutputStream
        OutputStream outputStream = new FileOutputStream("outputstream.txt");

        // output stream ra màn hình Console
        OutputStream outputConsole = System.out;
    }
}
```
    
<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/byte_streams.png">

_________________________________________________________________________________________________________
## Nội dung
1. [Đọc ký tự từ Console](#1)
    
    1.1. [Ví dụ Nhập từng ký tự từ Bàn phím & Hiển thị kết quả lên màn hình](#1.1)

    1.2. [Ví dụ Nhập chuỗi ký tự từ Bàn phím & Hiển thị kết quả lên màn hình](#1.2)
   
2. [Sử dụng FileInputStream & FileOutputStream](#2)

    2.1. [Ví dụ read() nội dung của file - Sử dụng FileInputStream](#2.1)
   
    2.2. [Ví dụ read() nhiều byte - Sử dụng FileInputStream](#2.2)
   
    2.3. [Ví dụ write() nội dung ra file - Sử dụng FileOutputStream](#2.3)
   
    2.4. [Ví dụ write() nhiều byte - Sử dụng FileOutputStream](#2.4)
   
3. [Sử dụng ByteArrayInputStream & ByteArrayOutputStream](#3)

    3.1. [Ví dụ Sử dụng ByteArrayInputStream](#3.1)
   
    3.2. [Ví dụ Sử dụng ByteArrayOutputStream](#3.2)
   
4. [Sử dụng ObjectInputStream & ObjectOutputStream](#4)

    4.1. [Ví dụ Sử dụng ObjectOutputStream write() object ra file](#4.1)
   
    4.2. [Ví dụ Sử dụng ObjectInputStream  read() object từ file](#4.2)
   
5. [Sử dụng DataInputStream & DataOutputStream](#5)

    5.1. [Ví dụ write() file sử dụng DataOutputStream](#5.1)
   
    5.2. [Ví dụ read() file sử dụng DataInputStream](#5.2)
   
6. [Sử dụng FilterInputStream & FilterOutputStream](#6)
    
    6.1. [Ví dụ write() file sử dụng FilterOutputStream](#6.1)
    
    6.2. [Ví dụ read() file sử dụng FilterInputStream](#6.2)
   
7. [Sử dụng SequenceInputStream](#7)
8. [Sử dụng PipedInputStream & PipedOutputStream](#8)
_________________________________________________________________________________________________________
## 1. Đọc ký tự từ Console<a id="1"></a>
_________________________________________________________________________________________________________
###   1.1. Ví dụ Nhập từng ký tự từ Bàn phím & Hiển thị kết <br/>quả lên màn hình<a id="1.1"></a>
```java
import java.io.IOException;
import java.io.InputStream;

public class IO_Character_KBCS {
    public static void main(String[] args) throws IOException {
        // khởi tạo instance của input stream từ Keyboard
        InputStream inputKeyboard = System.in;

        while (true) {
            System.out.print("Nhập 1 ký tự: ");

            // biến c kiểu int chứa giá trị của byte đọc từ keyboard
            int c = inputKeyboard.read();

            if (c == 'q') {
                System.out.println("Finished");
                break;
            }

            // bỏ qua 2 bytes
            // byte hiện tại - ký tự vừa nhập
            // byte kế - là dấu enter \r hoặc \n)
            inputKeyboard.skip(2);
            
            // cast biến c về kiểu char, và in ra màn hình console với System.out.println();
            System.out.println("Đã nhập ---------------: " + (char) c);
        }
    }
}
```   
```
OUTPUT

Nhập 1 ký tự: e
Đã nhập ---------------: e
Nhập 1 ký tự: w
Đã nhập ---------------: w
Nhập 1 ký tự: q
Finished
```
_________________________________________________________________________________________________________
###   1.2. Ví dụ Nhập chuỗi ký tự từ Bàn phím & Hiển thị kết <br/>quả lên màn hình<a id="1.2"></a>
```java
import java.io.IOException;

/**
 * chương trình nhập 1 chuỗi String từ Keyboard và xuất ra Console
 */
public class IO_String_KBCS {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("nhập 1 chuỗi: ");

            // tạo 1 vùng đệm lưu ký tự, 1 mảng kiểu byte
            byte[] bytes = new byte[100];

            // đọc các byte từ input-stream, gán từng byte vào từng phần tử
            // trong mảng bytes
            // đồng thời trả về số lượng các byte đọc được từ input-stream
            int length = System.in.read(bytes);

            // khởi tạo 1 đối tượng String từ mảng bytes
            // bắt đầu từ vị trí đầu tiên = 0 trong mảng
            // số lượng phần tử cần lấy từ vị trí bắt đầu lấy
            String string = new String(bytes, 0, length - 1);

            // kiểm tra nếu thỏa điều kiện sẽ thoát vòng lặp
            if (string.equalsIgnoreCase("exit")) {
                System.out.println("finished !!!");
                break;
            }

            // xuất kết quả, và tiếp tục vòng lặp
            System.out.println("- chuỗi nhận được -: " + string);
        }
    }
}
```
```
OUTPUT

nhập 1 chuỗi: android developer
- chuỗi nhận được -: android developer
nhập 1 chuỗi: java core
- chuỗi nhận được -: java core
nhập 1 chuỗi: exit
finished !!!

```
_________________________________________________________________________________________________________
## 2. Sử dụng FileInputStream & <br/>FileOutputStream<a id="2"></a>
* **FileInputStream** class:
    * dùng để **đọc** các **byte** từ input file.
    * dùng để **đọc** dữ liệu theo định dạng byte (các **byte-stream**) như dữ<br/>
    liệu hình ảnh, âm thanh, video,...
      
    * cũng có thể dùng để **đọc** các dữ liệu có định dạng ký tự, tuy nhiên<br/>
    với các **character-stream** nên dùng **FileReader** class.
      
* **FileOutputStream** class:
    * dùng để **ghi** các **byte** ra output file.
    * dùng để **ghi** dữ liệu theo định dạng byte (các **byte-stream**) như dữ<br/>
    liệu hình ảnh, âm thanh, video,...
      
    * cũng có thể dùng để **ghi** các dữ liệu có định dạng ký tự, tuy nhiên<br/>
    với các **character-stream** nên dùng **FileWriter** class.

_________________________________________________________________________________________________________     
###   2.1. Ví dụ read() nội dung của file - Sử dụng <br/>FileInputStream<a id="2.1"></a>

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/test_input_stream_txt.png">

```java
/**
 * chương trình đọc và xuất ra từng byte trong FileInputStream
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Input_File_byte {
    public static void main(String[] args) throws IOException {
        /**
         * khởi tạo đối tượng InputStream, instance là FileInputStream
         * tham số truyền vào cho Constructor của FileInputStream là
         * 1 file bất kỳ (ở đây sử dụng file .txt) đặt trong /Project
         * nội dung của file .txt là bất kỳ
         */
        InputStream inputStream = new FileInputStream(
                "test_input_stream.txt");

        /**
         * khởi tạo 1 biến int = -1, để chứa dữ liệu byte đọc được
         */
        int check = -1;

        /**
         * vòng lặp while, chỉ dừng khi đọc được giá trị =-1 từ stream
         * đồng thời gán giá trị byte đọc được ở vị trí hiện tại đang đứng
         * xuất ra giá trị kiểu char cast từ biến check
         */
        while ((check = inputStream.read()) != -1) {
            System.out.println((char) check);
        }

        /**
         * đóng stream sau khi sử dụng xong
         */
        inputStream.close();
    }
}
```
```
OUTPUT

H
e
l
l
o
J
a
v
a
C
o
r
e
```
_________________________________________________________________________________________________________
###   2.2. Ví dụ read() nhiều byte - Sử dụng FileInputStream<a id="2.2"></a>
```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * chương trình đọc và xuất byte dạng chuỗi từ FileInputStream
 */

public class Input_File_string {
    public static void main(String[] args) throws IOException {
        /**
         * khởi tạo InputStream
         * instance là FileInputStream
         */
        InputStream inputStream = new FileInputStream(
                "test_input_stream.txt");

        /**
         * khởi tạo vùng đệm là mảng 5 byte, dùng để chứa các
         * byte đọc được từ FileInputStream
         */
        byte[] bytes = new byte[5];

        /**
         * biến check = -1; dùng để kiểm tra kết thúc stream
         * đồng thời là số lượng byte trả về trong method read(byte[] b)
         */
        int check = -1;

        while ((check = inputStream.read(bytes)) != -1) {
            String s = new String(bytes, 0, check);
            System.out.println(check + " bytes:" + "\t\t" + s);
        }

        /**
         * đóng stream sau khi sử dụng
         */
        inputStream.close();
    }
}
```
```
OUTPUT

5 bytes:		Hello
5 bytes:		JavaC
3 bytes:		ore
```
_________________________________________________________________________________________________________
###   2.3. Ví dụ write() nội dung ra file - Sử dụng <br/>FileOutputStream<a id="2.3"></a>
```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * chương trình ghi từng byte ra file bằng FileOutputStream
 */

public class Output_File_byte {
    public static void main(String[] args) throws IOException {
        /**
         * khởi tạo đối tượng OutputStream
         * instance là FileOutputStream
         */
        OutputStream outputStream = new FileOutputStream(
                "test_output_stream.txt"
        );

        /**
         * khởi tạo 1 mảng các byte, ta sẽ ghi từng byte của mảng này ra
         * file stream ở trên
         */
        byte[] bytes = new byte[] 
                {'H', 'i','-', 'J', 'a', 'v', 'a', 'C', 'o', 'r', 'e', '-', 'H', 'e', 'l','l','o'};

        /**
         * lần lượt ghi từng byte ra file
         */
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            outputStream.write(b);
        }

        /**
         * đóng file output stream sau khi sử dụng
         */
        outputStream.close();
    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/test_output_stream.png">

_________________________________________________________________________________________________________
###   2.4. Ví dụ write() nhiều byte - Sử dụng <br/>FileOutputStream<a id="2.4"></a>
```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * chương trình ghi byte array ra file bằng FileOutputStream
 */

public class Output_File_byte_array {
    public static void main(String[] args) throws IOException {
        /**
         * khởi tạo đối tượng output stream
         * instance là FileOutputStream
         */
        OutputStream outputStream = new FileOutputStream("test_output_stream.txt");

        /**
         * các mảng byte sẽ được ghi ra source bên ngoài chương trình
         */
        byte[] bytes1 = new byte[] {'J','a','v','a','-','C','o','r','e'};
        byte[] bytes2 = new byte[] {'.','c','o','m'};
        byte[] bytes3 = new byte[] {13, 10}; // những byte xuống dòng mới
        byte[] bytes4 = new byte[] {'I','/','O','-','S','t','r','e','a','m'};

        /**
         * ghi các mảng byte lên output stream
         */
        outputStream.write(bytes1);
        outputStream.write(bytes2);
        outputStream.write(bytes3);
        outputStream.write(bytes4);

        /**
         * đóng output stream sau khi sử dụng xong
         */
        outputStream.close();
    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/test_output_stream_txt_write_byte_array.png">

_________________________________________________________________________________________________________
## 3. Sử dụng ByteArrayInputStream & <br/>ByteArrayOutputStream<a id="3"></a>

_________________________________________________________________________________________________________     
###   3.1. Ví dụ Sử dụng ByteArrayInputStream<a id="3.1"></a>
* **ByteArrayInputStream**: bao gồm **ByteArray** & **InputStream**, nghĩa là<br/>
  nó được sử dụng để đọc mảng byte như là input stream.

    * **ByteArrayInputStream** chứa 1 bộ đệm bên trong được sử dụng<br/>
      để đọc mảng byte như 1 input stream, trong stream này, dữ liệu<br/>
      được đọc từ 1 mảng byte truyền vào **Constructor**.

    * **bộ đệm** của **ByteArrayInputStream** tự động tăng theo kích thước<br/>
      dữ liệu.

    * **closing** 1 byte array input stream không có tác dụng, các **method**<br/>
      trong **ByteArrayInputStream** class có thể được gọi sau khi **close**<br/>
      byte array input stream mà không phát sinh **IOException**.
      

* **Constructor của ByteArrayInputStream**
    * ```java
      ByteArrayInputStream(byte[] array)
      // tạo 1 byte array input stream mới, sử dụng array được truyền
      // vào như 1 mảng đệm của nó
      ```
    * ```java
      ByteArrayInputStream(byte[] ary, int offset, int len)
      // tạo 1 byte array input stream mới, sử dụng array được truyền
      // vào như 1 mảng đệm của nó
      // và byte array input stream này có thể đọc 1 số lượng byte
      // chỉ định là len byte của dữ liệu từ 1 mảng
      ```

* **Method của ByteArrayInputStream**

Method|Description
  ----|----
int available()|trả về số lượng byte còn lại <br/>có thể đọc trong input stream
int read()|tương tự InputStream
int read(byte[] ary, int off, int len)|tương tự InputStream
boolean markSupported()|tương tự InputStream
long skip(long x)|tương tự InputStream
void mark(int readAheadLimit)|tương tự InputStream
void reset()|tương tự InputStream
void close()|tương tự InputStream

* **Ví dụ cách sử dụng ByteArrayInputStream**
```java
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStream_Example {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[] {84, 104, 105, 115, 32, 105, 115, 32, 116, 101, 120, 116};

        /**
         * tạo byte array input stream
         */
        InputStream bais = new ByteArrayInputStream(bytes);

        int k = 0;

        while ((k = bais.read()) != -1) {
            /**
             * chuyển đổi giá trị của byte sang character
             */
            char ch = (char) k;
            System.out.println("ASCII: " + ch + " - byte value: " + k);
        }
    }
}
```
```
OUTPUT

ASCII: T - byte value: 84
ASCII: h - byte value: 104
ASCII: i - byte value: 105
ASCII: s - byte value: 115
ASCII:   - byte value: 32
ASCII: i - byte value: 105
ASCII: s - byte value: 115
ASCII:   - byte value: 32
ASCII: t - byte value: 116
ASCII: e - byte value: 101
ASCII: x - byte value: 120
ASCII: t - byte value: 116
```
_________________________________________________________________________________________________________
###   3.2. Ví dụ Sử dụng ByteArrayOutputStream<a id="3.2"></a>
* **ByteArrayOutputStream**: được sử dụng để **ghi dữ liệu chung ra<br/>
  nhiều file**, trong stream này, dữ liệu byte sẽ được ghi vào mảng byte<br/>
  mà **ByteArrayOutputStream** quản lý, .

    * **ByteArrayOutputStream** giữ 1 bản sao của dữ liệu, và chuyển <br/>
      tiếp nó đến nhiều stream.

    * khi số lượng byte ghi ra **ByteArrayOutputStream** lớn hơn độ dài<br/>
    của mảng đệm, **ByteArrayOutputStream** sẽ tạo ra mảng đệm mới<br/>
      với độ dài lớn hơn và copy các byte từ mảng đệm cũ sang.

    * dữ liệu của stream có thể được **retrieved** (truy xuất) thông qua<br/>
    method **toByteArray()** hoặc **toString()**.
      
    * **closing** 1 byte array output stream không có hiệu quả, các <br/>
    **method** của **ByteArrayOutputStream** class có thể được gọi<br/>
      sau khi **close** byte array output stream mà không phát sinh<br/>
      **IOException**.
      

* **Constructor của ByteArrayOutputStream**
    
    * ```java
      ByteArrayOutputStream()
      // tạo 1 byte array output stream mới, với dung lượng ban đầu
      // là 32 bytes, và kích thước sẽ tăng khi cần thiết
      ```
      
    * ```java
      ByteArrayOutputStream(int size)
      // tạo 1 byte array output stream mới, với mảng byte đệm có
      // kích thước ban đầu được chỉ định
      ```
      
    
* **Method của ByteArrayOutputStream**

Return|Method|Description
----|----|----
int |**size()**<br/>|trả về **size** hiện tại của mảng đệm
byte[] |**toByteArray()**<br/>|trả về 1 mảng byte mới được cấp phát
String |**toString()**<br/>|trả về 1 String từ nội dung của các byte được giải mã bằng<br/> cách sử dụng nền tảng tập ký tự mặc định
String |**toString(String charsetName)**<br/>|sử dụng bộ ký tự chỉ định, chuyển nội dung của mảng byte<br/> về 1 String
void |**reset()**<br/>|thiết lập lại giá trị count của mảng đệm về giá trị 0
void |**writeTo(OutputStream out)**<br/>|ghi nội dung hoàn chỉnh của 1 byte array input stream ra 1 <br/>output stream chỉ định
void |**write(int b)**<br/>|tương tự OutputStream
void |**write(byte[] b, int off, int len)**<br/>|tương tự OutputStream
void |**close()**<br/>|tương tự OutputStream

* **Ví dụ cách sử dụng ByteArrayOutputStream**
```java
import java.io.*;

/**
 * chương trình ghi các byte ra ByteArrayOutputStream
 * sau đó ghi nội dung của ByteArrayOutputStream ra các OutputStream khác nhau
 */

public class ByteArrayOutputStream_Example {
    public static void main(String[] args) throws IOException {
        /**
         * tạo 2 FileOutputStream
         */
        FileOutputStream fos1 = new FileOutputStream("FOS1.txt");
        FileOutputStream fos2 = new FileOutputStream("FOS2.txt");

        /**
         * tạo 1 mảng các giá trị byte
         */
        byte[] bytes = new byte[] {'H','e','l','l','o',' ','B'};

        /**
         * tạo ByteArrayOutputStream
         */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        /**
         * ghi mảng bytes ra ByteArrayOutputStream
         */
        baos.write(bytes);

        /**
         * ghi ByteArrayOutputStream đã hoàn thành ra OutputStream chỉ định
         */
        baos.writeTo(fos1);
        baos.writeTo(fos2);
        baos.flush();

        /**
         * đóng stream
         */
        baos.close();
    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/byte_array_output_stream.png">

_________________________________________________________________________________________________________
## 4. Sử dụng ObjectInputStream & <br/>ObjectOutputStream<a id="4"></a>
_________________________________________________________________________________________________________
###   4.1. Ví dụ Sử dụng ObjectOutputStream write() object <br/>ra file<a id="4.1"></a>
* **ObjectOutputStream** là **1 subclass** của **abstract OutputStream**
* **ObjectOutputStream** ghi các kiểu dữ liệu **primitive** & **instance** của<br/>
các **object** ra **OutputStream**, các **object** có thể được đọc <br/>
  (**reconstituted** - hoàn nguyên) bằng cách sử dụng **ObjectInputStream**.
  
* việc lưu trữ liên tục các đối tượng có thể được hoàn thành bằng cách <br/>
  sử dụng file cho stream.
  
* nếu stream là 1 **network socket stream**, thì **object** có thể được hoàn<br/>
nguyên bằng 1 **host** khác, hoặc 1 quy trình khác.
  
* chỉ những **object** cung cấp **Serializable interface** mới có thể được<br/>
ghi vào stream.
  
* **writeObject() method** được sử dụng để ghi 1 **object** vào stream, bất<br/>
kỳ **object** nào, kể cả **String** và **mảng** đều được ghi bằng **writeObject()**<br/>
  method, nhiều **object** hoặc những kiểu nguyên thủy cũng có thể được<br/>
  ghi vào **ObjectOutputStream**, các đối tượng sẽ được đọc lại từ<br/>
  **ObjectInputStream** tương ứng với cùng kiểu và theo thứ như khi chúng<br/>
  được ghi.
  
* các kiểu dữ liệu **primitive** cũng có thể được ghi vào stream bằng các<br/>
**method** thích hợp từ **DataOutput**, **String** cũng có thể được ghi bằng<br/>
  **writeUTF() method**.
  
* cơ chế **Serialization** mặc định cho 1 object ghi class của object, chữ ký<br/>
của class, value của các field **non-transient** & **non-static**, những tham<br/>
  chiếu đến object khác (trừ transient field & static field) khiến những object<br/>
  đó cũng được ghi, nhiều tham chiếu đến 1 object đơn được mã hóa bằng<br/>
  cơ chế chia sẻ tham chiếu để biểu đồ của các object có thể được khôi<br/>
  phục về hình dạng như khi bản gốc được ghi.

_________________________________________________________________________________________________________
#### **Nested Class của ObjectOutputStream**
```java
public abstract static class PutField {
    //Provide programmatic access 
        // to the persistent fields 
        // to be written to ObjectOutput.
}
```

_________________________________________________________________________________________________________
#### **Constructor của ObjectOutputStream**
  
* ```java
    ObjectOutputStream(
    // cung cấp cách để các subclass hoàn thành việc thực thi lại
    // ObjectOutputStream mà không phải cấp phát dữ liệu riêng vừa
    // được sử dụng bởi sự triển khai của ObjectOutputStream này
    ```

* ```java
    ObjectOutputStream(OutputStream out)
    // tạo ObjectOutputStream ghi vào OutputStream chỉ định
    ```

_________________________________________________________________________________________________________
#### **Method của ObjectOutputStream**
_________________________________________________________________________________________________________
* ``protected void annotateClass(Class<?> cl)``<br/>
    * _các subclass có thể implements method này để cho phép class data <br/>
      được lưu trữ trong stream_

_________________________________________________________________________________________________________
* ``protected void annotateProxyClass(Class<?> cl)``<br/>
    * _các subclass có thể implements method này để lưu trữ dữ liệu tùy <br/>
      chình trong stream cùng với bản mô tả cho các dynamic proxy class_

_________________________________________________________________________________________________________
* ``void close()``<br/>
    * _đóng stream_

_________________________________________________________________________________________________________
* ``void defaultWriteObject()``<br/>
    * _ghi các non-static & non-transient field của class hiện tại vào stream_

_________________________________________________________________________________________________________
* ``protected void drain()``<br/>
    * _xả bất kỳ dữ liệu đệm nào trong ObjectOutputStream nhưng không <br/>
      ảnh hưởng đến stream bên dưới_

_________________________________________________________________________________________________________
* ``void flush()``<br/>
    * _đẩy stream, Điều này sẽ ghi bất kỳ byte đầu ra có bộ đệm nào và <br/>
      chuyển qua luồng bên dưới._

_________________________________________________________________________________________________________
* ``protected boolean enableReplaceObject(boolean enable)``<br/>
    * _enable the stream để thay thế các object trong stream, khi được <br/>
      enabled, **replaceObject** method được gọi cho mọi object đang được <br/>
      **serialized**_

_________________________________________________________________________________________________________
* ``protected Object replaceObject(Object obj)``<br/>
    * _method này cho phép các subclass đáng tin cậy của <br/>
      **ObjectOutputStream** thay thế 1 object này bằng 1 object khác trong <br/>
      suốt quá trình **Serialization**, sự thay thế này bị disable cho đến khi <br/>
      **enableReplaceObject** được gọi.<br/>
      method **enableReplaceObject** kiểm tra xem stream yêu cầu thực<br/>
      hiện thay thế có đáng tin cậy hay không.<br/>
      lần xuất hiện đầu tiên của mỗi đối tượng được ghi vào stream<br/>
      serialization được truyền đến **replaceObject** method.<br/>
      các tham chiếu tiếp theo đến object được thay thế bởi object được<br/>
      trả về ở lần gọi ban đầu đến **replaceObject** method.<br/>
      để đảm bảo trạng thái riêng của đối tượng không bị lộ ra ngoài ý<br/>
      muốn, chỉ có các stream đáng tin cậy mới có thể sử dụng <br/>
      **replaceObject** method._

_________________________________________________________________________________________________________
* ``void reset()``<br/>
    * _**reset** method sẽ bỏ qua trạng thái của bất kỳ object nào đã được<br/>
    ghi vào stream.<br/>
    trạng được **reset** giống như 1 **ObjectOutputStream** mới.<br/>
      vị trí hiện tại trong stream được đánh dấu là **reset** nên<br/>
    **ObjectInputStream** tương ứng sẽ được **reset** lại cùng vị trí.<br/>
    các object trước đó được ghi vào stream sẽ không được coi là đã<br/>
    có trong stream, chúng sẽ được ghi lại lần nữa._
      
 _________________________________________________________________________________________________________     
* ``void useProtocolVersion(int version)``<br/>
    * _chỉ định stream protocol version được sử dụng khi ghi vào stream.<br/>
    công việc này cung cấp 1 hook để cho phép current version của <br/>
      Serialization ghi ở định dạng backward compatible (tương thích<br/>
      ngược) với previous version của định dạng stream._

_________________________________________________________________________________________________________
* ``void write(byte[] buf)``<br/>
    * _ghi mảng byte vào stream_

_________________________________________________________________________________________________________
* ``void write(byte[] buf, int off, int len)``<br/>
    * _ghi mảng con của mảng byte vào stream từ vị trí off đến off+len_

_________________________________________________________________________________________________________
* ``void write(int val)``<br/>
    * _ghi 1 byte code vào stream, byte code này là 1 số kiểu int_

_________________________________________________________________________________________________________
* ``void writeBoolean(boolean val)``<br/>
    * _ghi 1 giá trị boolean vào stream_

_________________________________________________________________________________________________________
* ``void writeByte(int val)``<br/>
    * _ghi 1 byte 8 bit vào stream_

_________________________________________________________________________________________________________
* ``void writeBytes(String str)``<br/>
    * _ghi 1 chuỗi vào stream dưới dạng 1 chuỗi các byte code_

_________________________________________________________________________________________________________
* ``void writeShort(int val)``<br/>
    * _ghi 1 giá trị short 16 bit_

_________________________________________________________________________________________________________
* ``void writeChar(int val)``<br/>
    * _ghi 1 giá trị char 16 bit_

_________________________________________________________________________________________________________
* ``void writeChars(String str)``<br/>
    * _ghi 1 chuỗi dưới dạng 1 chuỗi các char_

_________________________________________________________________________________________________________
* ``void writeInt(int val)``<br/>
    * _ghi 1 giá trị int 32 bit_

_________________________________________________________________________________________________________
* ``void writeLong(long val)``<br/>
    * _ghi 1 giá trị long 64 bit_

_________________________________________________________________________________________________________
* ``void writeFloat(float val)``<br/>
    * _ghi 1 giá trị float 32 bit_

_________________________________________________________________________________________________________
* ``void writeDouble(double val)``<br/>
    * _ghi 1 giá trị double 64 bit_

_________________________________________________________________________________________________________
* ``void writeUTF(String str)``<br/>
    * _ghi dữ liệu nguyên thủy của String chỉ định ở định dạng UTF-8 đã<br/>
    chỉnh sửa_

_________________________________________________________________________________________________________
* ``void writeFields()``<br/>
    * _ghi buffered fields vào stream_

_________________________________________________________________________________________________________
* ``void writeObject(Object obj)``<br/>
    * _ghi object chỉ định vào ObjecOutputStream_

_________________________________________________________________________________________________________
* ``protected void writeObjectOverride(Object obj)``<br/>
    * _method này được sử dụng bởi subclass để override writeObject <br/>
      method_

_________________________________________________________________________________________________________
* ``protected void writeStreamHeader()``<br/>
    * _writeStreamHeader được cung cấp để các subclass có thể nối thêm<br/>
      hoặc thêm tiêu đề của chính chúng vào stream._

_________________________________________________________________________________________________________
* ``void writeUnshared(Object obj)``<br/>
    * _dùng để ghi 1 object không chia sẻ vào stream.<br/>
      method này giống writeObject, ngoại trừ việc nó luôn ghi object đã <br/>
      cho dưới dạng 1 object mới, duy nhất trong stream (trái ngược với<br/>
      tham chiếu ngược trỏ đến 1 thể hiện được serialization trước đó).<br/>
      **đặc biệt:**<br/>_
         * _1 object được ghi thông qua writeUnshared luôn được tuần tự<br/>
    hóa (serialized) theo cùng 1 cách giống như 1 object mới xuất<br/>
        hiện._
        
        * _nếu writeObject được sử dụng để ghi 1 object đã được ghi<br/>
    trước đó bằng writeUnshared, thì thao tác writeUnshared trước<br/>
          đó được coi là 1 lần ghi của 1 đối tượng riêng biệt, nói cách<br/>
          khác, ObjectOutputStream sẽ không bao giờ tạo ra các tham<br/>
          chiếu ngược đến dữ liệu của object được ghi bởi writeUnshared._
          
    * _mặc dù việc ghi 1 object thông qua writeUnshared tự nó không đảm<br/>
    bảo 1 tham chiếu duy nhất đến object khi nó được deserialized, <br/>
      nhưng nó cho phép 1 object duy nhất được xác định nhiều lần trong<br/>
      1 stream, do đó nhiều lệnh gọi đến readUnshared của người nhận sẽ<br/>
      không bị xung đột, lưu ý các quy tắc mô tả ở trên chỉ áp dụng cho<br/>
      các object cấp cơ sỡ được ghi bởi writeUnshared, và không áp dụng<br/>
      cho bất kỳ sub-object nào được tham chiếu chuyển tiếp trong biểu đồ<br/>
      được tuần tự hóa._

  * _Các lớp con ObjectOutputStream ghi đè phương thức này chỉ có thể <br/>
    được xây dựng trong các ngữ cảnh bảo mật sở hữu <br/>
    SerializablePermission "enableSubclassImplementation"; bất kỳ nỗ <br/>
    lực nào để khởi tạo một lớp con như vậy mà không có sự cho phép <br/>
    này sẽ khiến một SecurityException được ném ra._

_________________________________________________________________________________________________________
* ``protected writeClassDescriptor(ObjectStreamClass desc)``<br/>
    * _ghi 1 descriptor (bộ mô tả) class chỉ định vào ObjectOutputStream.<br/>
      class descriptor dùng để xác định các class của object được ghi vào<br/>
      stream.<br/>
      các subclass của ObjectOutputStream có thể override method này<br/>
      để tùy chỉnh cách cách mà class descriptor được ghi vào serialization<br/>
      stream.<br/>
      method tương ứng trong ObjectInputStream là readClassDescriptor,<br/>
      sau đó sẽ được override để tạo lại class descriptor từ biểu diễn<br/>
      stream tùy chỉnh của chính nó.<br/>
      theo mặc định method này ghi class descriptor theo định dạng được<br/>
      xác định trong đặc tả của Object Serialization._      
    * _Lưu ý rằng phương thức này sẽ chỉ được gọi nếu <br/>
      ObjectOutputStream không sử dụng định dạng luồng tuần tự hóa cũ <br/>
      (được đặt bằng cách gọi phương thức useProtocolVersion của <br/>
      ObjectOutputStream). Nếu luồng tuần tự hóa này đang sử dụng định <br/>
      dạng cũ (PROTOCOL_VERSION_1), thì bộ mô tả lớp sẽ được ghi <br/>
      bên trong theo cách không thể ghi đè hoặc tùy chỉnh._

_________________________________________________________________________________________________________
* ``ObjectOutputStream.PutField putFields()``<br/>
    * _Truy xuất đối tượng được sử dụng để đệm các trường liên tục được <br/>
      ghi vào luồng. Các trường sẽ được ghi vào luồng khi phương thức <br/>
      writeFields được gọi._

_________________________________________________________________________________________________________
#### **Ví dụ về ObjectOutputStream**
```java
import java.io.Serializable;

/**
 * class Employee implements Serializable để có thể
 * thực hiện cơ chế Serialization
 * nhằm mục đích thực hiện việc ghi và đọc đối tượng
 * vào trong stream
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 1l;

    private String fullName;
    private float salary;

    public Employee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
```

```java
/**
 * class WriteEmployeeData
 * dùng để ghi đối tượng Employee vào ObjectOutputStream
 */

import java.io.*;
import java.util.Date;

public class WriteEmployeeData {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\employee.txt";

    public static void main(String[] args) {
        File outFile = new File(filePath);

        outFile.getParentFile().mkdirs();

        Employee e1 = new Employee("Tom", 1000f);
        Employee e2 = new Employee("Jerry", 2000f);
        Employee e3 = new Employee("Donald", 1200f);

        Employee[] employees = new Employee[] {e1, e2, e3};

        try {
            FileOutputStream fos = new FileOutputStream(outFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // thông báo bắt đầu ghi file
            System.out.println("Writting file: " + outFile.getName());

            // ghi mốc thời gian ghi file vào stream
            oos.writeObject(new Date());

            // ghi thông tin về file vào stream
            oos.writeUTF("Employee Data");

            // ghi số lượng đối tượng vào stream
            oos.writeInt(employees.length);

            // ghi các đối tượng vào stream
            for (Employee e : employees) {
                oos.writeObject(e);
            }

            // đóng stream
            oos.close();

            // đóng file
            fos.close();

            // thông báo kết thúc quá trình ghi đối tượng lên console
            System.out.println("Finished writting");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
```
OUTPUT

Writting file: employee.txt
Finished writting
```

<img src="">


_________________________________________________________________________________________________________
#### **Ví dụ về ghi các object của các Collection ra file**
* hầu hết các class trong **Java Collection Framework** đều **implements <br/>Serializable**.
* vì vậy các object của các class trong **Collection** đều có thể được ghi<br/>
vào **ObjectOutputStream**.
  
```java
import java.io.*;
import java.util.ArrayList;

public class WriteCollectionFramework {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\flower.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeFile();

        readFile();
    }

    public static void writeFile() throws IOException {
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Tulip");
        flowers.add("Daffodil");
        flowers.add("Poppy");
        flowers.add("Sunflower");
        flowers.add("Bluebell");

        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // ghi thông tin bằng method writeUTF()
        oos.writeUTF("List of Flower");

        // ghi object vào ObjectOutputStream
        oos.writeObject(flowers);

        // đóng object output stream
        oos.close();

        // đóng file output stream
        fos.close();
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        String info = ois.readUTF();
        ArrayList<String> flowers = (ArrayList<String>) ois.readObject();

        System.out.println(info);
        System.out.println();

        for (String s : flowers) {
            System.out.println(s);
        }

        // đóng object input stream
        ois.close();
        
        // đóng file input stream
        fis.close();
    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/_04_Object_IO_Stream/collectionIO.png">

```
OUTPUT

List of Flower

Tulip
Daffodil
Poppy
Sunflower
Bluebell
```
_________________________________________________________________________________________________________
#### **Ví dụ về writeFields() method của ObjectOutputStream**
* giả sử ta có 1 object của **GameSetting**
* ta cần ghi thông tin của object này vào **ObjectOutputStream**
* nhưng có 1 số **field** ta sẽ không ghi vào **stream**
* có 1 số field ta lại cần chỉnh sửa lại giá trị trước khi ghi vào stream
* lúc này ta có thể sử dụng ObjectOutputStream.PutField để lấy object từ<br/>
  method putFields() làm bộ đệm để put nhưng field cần ghi vào
* sau đó ta có thể sử dụng method **writeField()** để ghi những **field** cần<br/>
  ghi vào stream


* class **GameSetting**
```java
/**
 * class GameSetting
 */

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GameSetting implements Serializable {
    private static final long serialVersionUID = 1L;

    private int sound;
    private int brightness;
    private String difficultyLevel;

    private String userNote;

    public GameSetting(int sound, int brightness, String difficultyLevel, String userNote) {
        this.sound = sound;
        this.brightness = brightness;
        this.difficultyLevel = difficultyLevel;
        this.userNote = userNote;
    }

    public int getSound() {
        return sound;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getUserNote() {
        return userNote;
    }


    // cài đặt method writeObject(ObjectOutputStream oos) bên trong class cần ghi object
    private void writeObject(ObjectOutputStream oos) throws IOException {
        /**
         * khởi tạo 1 object của ObjectOutputStream.PutField class
         * từ method putFields() trả về 1 object dùng làm bộ đệm cho stream gọi đến
         * để đặt các field chỉ định vào, trong quá trình này có thể sửa đổi giá trị của field
         * các field này sẽ được ghi vào stream khi method writeFields() được gọi
         */
        ObjectOutputStream.PutField putField = oos.putFields();

        putField.put("sound", this.sound < 20 ? 20 : this.sound);
        putField.put("brightness", this.brightness < 30 ? 30 : this.brightness);
        putField.put("difficultyLevel", this.difficultyLevel);
        // không ghi field userNote

        /**
         * sau khi đã put những field cần ghi vào trong bộ đệm
         * tiến hành ghi đối tượng chứa các field này vào stream
         */
        oos.writeFields();
    }
}
```

* class Main
```java
import java.io.*;
import java.util.Date;

public class WriteFieldToStream {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\gamesetting.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GameSetting gameSetting = new GameSetting(10, 20, "Hard", "Try game again");

        // ghi object
        writeGameSetting(gameSetting);
        // đọc object
        readGameSetting();
    }

    public static void writeGameSetting(GameSetting gameSetting) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // ghi 1 vài thông tin
        oos.writeUTF("GameSetting, save at: " + new Date());

        // ghi object vào stream
        oos.writeObject(gameSetting);

        oos.close();
        fos.close();
    }

    public static void readGameSetting() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // đọc thông tin UTF
        System.out.println(ois.readUTF());

        // đọc object
        GameSetting gameSetting = (GameSetting) ois.readObject();

        // 10 -> 20
        System.out.println("sound: " + gameSetting.getSound());
        // 20 -> 30
        System.out.println("brightness: " + gameSetting.getBrightness());
        // giá trị giữ nguyên như khi được ghi vào stream
        System.out.println("difficultyLevel: " + gameSetting.getDifficultyLevel());

        // userNote return null vì trong serialization nó không được ghi
        // nên khi deserialization nó trả về giá trị mặc định là null (String)
        System.out.println("userNote: " + gameSetting.getUserNote());

        ois.close();
        fis.close();
    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/_04_Object_IO_Stream/gamesetting.png">

```
OUTPUT

GameSetting, save at: Wed Jun 30 22:58:52 ICT 2021
sound: 20
brightness: 30
difficultyLevel: Hard
userNote: null
```
_________________________________________________________________________________________________________
#### **Ví dụ method writeUnshared(Object)**
* method **writeUnshared(Object)** hoạt động tương tự như method<br/>
**writeObject(Object)** nhưng khác biệt ở đặc điểm:
    * với **writeObject(Object)**: cùng 1 object, ở lần ghi thứ 2 sẽ là ghi<br/>
    tham chiếu.
      
    * với **writeUnshared(Object)**: cùng 1 object, ở lần ghi thứ 2 sẽ là<br/>
    1 object mới.
      
* giả sử ta muốn ghi object **"X"** 2 lần vào **ObjectOutputStream**

Operation|Meaning
----|----
1. oos.writeObject(X);<br/>2. oos.writeObject(X);|1. serialize **X**, nhận được **Y**, ghi **Y** vào **stream**<br/>2. ghi tham chiếu của **Y** vào **stream**
1. oos.writeUnshared(X);<br/>2. oos.writeUnshared(X);|1. serialize **X**, nhận được **Y**, ghi **Y** vào **stream**<br/>2. serialize **X**, nhận được **Y**, ghi **Y** vào **stream**

* **ví dụ so sánh ghi object sử dụng writeObject(Object) và <br/>
  writeUnshared(Object) vào file1 và file2, file sử dụng <br/>
  writeUnshared(Object) sẽ có kích thước lớn hơn**
  
```java
/**
 * chương trình thực hiện ghi 1 đối tượng Collection 2 lần vào ObjectOutputStream
 * lần lượt sử dụng các method writeObject(Object) và writeUnshared(Object)
 * với mỗi method ghi ra mỗi file khác nhau, file được ghi bằng writeUnshared(Object)
 * sẽ có kích thước lớn hơn
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteUnsharedToStream {
    private static String path1 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\File1writeObject.txt";
    private static String path2 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\File2writeUnshared.txt";

    public static void main(String[] args) throws IOException {
        writeObjectTest();
        writeUnsharedTest();
    }

    public static void writeObjectTest() throws IOException {
        File file1 = new File(path1);
        file1.getParentFile().mkdirs();

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        FileOutputStream fos = new FileOutputStream(file1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(list);
        oos.writeObject(list);

        oos.close();
        fos.close();
    }

    public static void writeUnsharedTest() throws IOException {
        File file2 = new File(path2);
        file2.getParentFile().mkdirs();

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        FileOutputStream fos = new FileOutputStream(file2);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeUnshared(list);
        oos.writeUnshared(list);

        oos.close();
        fos.close();
    }
}
```
<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/_04_Object_IO_Stream/comparewriteObjectwriteUnshared.png">
_________________________________________________________________________________________________________

###   4.2. Ví dụ Sử dụng ObjectInputStream  read() object từ <br/>file<a id="4.2"></a>
* **ObjectInputStream** là **subclass** của **InputStream**.
* **ObjectInputStream** nó quản lý 1 object **InputStream**, và cung cấp các<br/>
method để đọc dữ liệu primitive hoặc object từ **InputStream** mà nó quản<br/>
  lý.
  
* **ObjectInputStream** thực hiện **deserialize** các dữ liệu primitive và object<br/>
mà trước đó được **serialize** bởi **ObjectOutputStream**.
  
* **ObjectOutputStream** và **ObjectInputStream** có thể cung cấp 1 ứng<br/>
dụng có khả năng lưu trữ đồ thị liên tục của các object khi được sử<br/>
  dụng với **FileOutputStream** và **FileInputStream** tương ứng.
  
* các ứng dụng khác bao gồm truyền các object giữa các **host** bằng cách<br/>
sử dụng 1 **socket stream** hoặc để **marshaling** và **unmarhaling** các đối<br/>
  số hoặc tham số trong 1 hệ thống giao tiếp từ xa.
  
* **ObjectInputStream** đảm bảo các kiểu của các object trong biểu đồ được<br/>
tạo từ stream khớp với class hiện tại trong JVM.
  
* chỉ có thể đọc các object **implements Serializable** hoặc **Externalizable**<br/>
**_interface_** từ stream.
  
* **readObject** method được sử dụng để đọc 1 object từ stream.
* **safe casting của Java** nên được sử dụng để có được kiểu mong muốn.
* trong Java, String và array là những object, và được coi như là các object<br/>
trong quá trình **Serialization**, khi đọc, chúng cần được **cast** sang kiểu<br/>
  mong muốn.
  
* các kiểu primitive có thể được đọc từ stream bằng cách sử dụng các<br/>
method thích hợp trên **DataInput**.
  
* cơ chế **Deserialization** mặc định cho object, khôi phục lại nội dung của<br/>
mỗi field trở về giá trị và kiểu của nó khi nó được ghi vào stream, những<br/>
  field được khai báo là **transient** hoặc **static** sẽ bị bỏ qua trong qua trình<br/>
  **Deserialization**.<br/>
  tham chiếu đến các object khác dẫn đến các object đó được đọc từ<br/>
  stream khi cần thiết, đồ thị của các object được khôi phục chính xác bằng<br/>
  cách sử dụng cơ chế chia sẻ tham chiếu.<br/>
  các object mới luôn được cấp phát bộ nhớ khi thực hiện **deserialization**,<br/>
  điều này ngăn các object đang tồn tại bị ghi đè.
  
* việc đọc object tương tự như việc khởi chạy 1 constructor của 1 object<br/>
mới, bộ nhớ được cấp phát cho object và được khởi tạo bằng 0 (NULL),<br/>
  các constructor No-arg (không có đối số) được gọi cho các class <br/>
  non-serializable, sau đó các field của các class serializable được khôi<br/>
  phục từ stream bắt đầu với class serializable gần nhất với <br/>java.lang.object
  và kết thúc với class cụ thể nhất của object.

_________________________________________________________________________________________________________
#### **Nested class của ObjectInputStream**
```java
public abstract static class GetField {
    // Provide access to 
    // the persistent fields read 
    // from the input stream.
}
```
_________________________________________________________________________________________________________
#### **Constructor của ObjectInputStream**
* ```java
  ObjectInputStream()
  // cung cấp cách cho các subclass hoàn thành việc thực thi lại
  // ObjectInputStream để không phải cấp phát dữ liệu riêng vừa được
  // sử dụng bởi việc triển khai ObjetInputStream này 
  ```

* ```java
  ObjectInputStream(InputStream is)
  // khởi tạo 1 object của ObjectInputStream đọc từ 1 InputStream chỉ định
  // 1 serialization stream header được đọc từ stream và được xác thực
  // constructor này sẽ bị chặn cho đến khi ObjectOutputStream được ghi
  // và đẩy ra header
  ```
_________________________________________________________________________________________________________
#### **Method của ObjectInputStream**
_________________________________________________________________________________________________________
* ``int available()``
    * _return số lượng byte có thể đọc được mà không bị block_

_________________________________________________________________________________________________________
* ``void close()``
    * _đóng input stream_

_________________________________________________________________________________________________________
* ``void defaultReadObject()``
    * _đọc các field non-static & non-transient của class hiện tại từ stream<br/>
      này_
    * _method này chỉ có thể được gọi từ method readObject của class <br/>
      đang deserialized, nếu từ class khác NotActiveException sẽ bị ném<br/>
      ra_

_________________________________________________________________________________________________________
* ``int read()``
    * _đọc 1 byte dữ liệu_

_________________________________________________________________________________________________________
* ``int read(byte[] buf, int off, int len)``
    * _return số byte đọc được, return -1 nếu tiến tới cuối stream_
    * _đọc số lượng **len** byte từ stream hiện tại, lưu vào trong mảng byte<br/>
      **buf**, bắt đầu từ vị trí chỉ định **off**_

_________________________________________________________________________________________________________
* ``boolean readBoolean()``
    * _return giá trị boolean đã đọc_

_________________________________________________________________________________________________________
* ``byte readByte()``
    * _return byte 8 bit được đọc_

_________________________________________________________________________________________________________
* ``char readChar()``
    * _return ký tự 16 bit được đọc_

_________________________________________________________________________________________________________
* ``int readUnsignedByte()``
    * _return giá trị int không dấu trong khoảng 0 - 255_

_________________________________________________________________________________________________________
* ``short readShort()``
    * _return giá trị short 16 bit được đọc_

_________________________________________________________________________________________________________
* ``int readUnsignedShort()``
    * _đọc 2 byte đầu vào và return giá trị int trong khoảng 0 - 65535_

_________________________________________________________________________________________________________
* ``int readInt()``
    * _return giá trị int 32 bit được đọc_

_________________________________________________________________________________________________________
* ``long readLong()``
    * _return giá trị long 64 bit được đọc_

_________________________________________________________________________________________________________
* ``float readFloat()``
    * _return giá trị float 32 bit được đọc_

_________________________________________________________________________________________________________
* ``double readDouble()``
    * _return giá trị double 64 bit được đọc_

_________________________________________________________________________________________________________
* ``void readFully(byte[] buf)``
    * _đọc các byte từ mảng byte **buf** đầu vào_

_________________________________________________________________________________________________________
* ``void readFully(byte[] buf, int off, int len)``
    * _đọc các byte từ mảng byte **buf** đầu vào, bắt đầu từ vị trí **off**, với số<br/>
    byte được đọc là **len**_

_________________________________________________________________________________________________________
* ``int skipBytes(int len)``
    * _return số byte thực tế đã bỏ qua_
    * _len: số byte bị bỏ qua không đọc_
_________________________________________________________________________________________________________
* ``String readUTF()``
    * _return 1 String, đọc 1 String ở định dạng UTF-8 đã được sửa đổi_

_________________________________________________________________________________________________________
* ``final ObjectInputFilter getObjectInputFilter()``

_________________________________________________________________________________________________________
* ``final void setObjectInputFilter(ObjectInputFilter filter)``

_________________________________________________________________________________________________________
* ``final Object readObject()``
    * _return object đọc từ stream_
    * _đọc 1 object từ ObjectInputStream, class của object, signature của<br/>
      class, và các giá trị của các field non-static, non-transient của class<br/>
      và tất cả kiểu cha của class đều được đọc_
    * _quá trình deserialization mặc định cho 1 class có thể bị override bằng<br/>
      cách sử dụng method writeObject & readObject_
    * _các object được tham chiếu bởi object này được đọc chuyển tiếp, để<br/>
      1 đồ thị tương đương hoàn chỉnh của các object được tái tạo lại bởi<br/>
      readObject_

_________________________________________________________________________________________________________
* ``Object readUnshared()``
    * _readUnshared method đọc 1 unshared object từ ObjectInputStream,<br/>
      method này giống như readObject method, ngoại trừ việc nó ngăn<br/>
      các lệnh gọi tiếp theo đến readObject và readUnshared từ việc trả<br/>
      về các tham chiếu bổ sung cho các thể hiện đã deserialized thu được<br/>
      thông qua lệnh gọi readUnshared._
        * _If readUnshared is called to deserialize a back-reference (the <br/>
          stream representation of an object which has been written <br/>
          previously to the stream), an ObjectStreamException will be <br/>
          thrown._
          
        * _If readUnshared returns successfully, then any subsequent <br/>
          attempts to deserialize back-references to the stream handle <br/>
          deserialized by readUnshared will cause an <br/>
          ObjectStreamException to be thrown._
          
    * _Deserializing an object via readUnshared invalidates the stream <br/>
      handle associated with the returned object. Note that this in itself <br/>
      does not always guarantee that the reference returned by <br/>
      readUnshared is unique; the deserialized object may define a <br/>
      readResolve method which returns an object visible to other parties, <br/>
      or readUnshared may return a Class object or enum constant <br/>
      obtainable elsewhere in the stream or through external means. If the <br/>
      deserialized object defines a readResolve method and the invocation <br/>
      of that method returns an array, then readUnshared returns a shallow <br/>
      clone of that array; this guarantees that the returned array object is <br/>
      unique and cannot be obtained a second time from an invocation of <br/>
      readObject or readUnshared on the ObjectInputStream, even if the <br/>
      underlying data stream has been manipulated._
      
    * _ObjectInputStream subclasses which override this method can only <br/>
      be constructed in security contexts possessing the <br/>
      "enableSubclassImplementation" SerializablePermission; any <br/>
      attempt to instantiate such a subclass without this permission will <br/>
      cause a SecurityException to be thrown._

_________________________________________________________________________________________________________
* ``void defaultReadObject()``

_________________________________________________________________________________________________________
* ``ObjectInputStream.GetField readFields()``
    * _the GetField object representing the persistent fields of the object <br/>
      being deserialized_
    * _đọc các field liên tục từ stream và làm chúng available theo tên_  

_________________________________________________________________________________________________________
* ``void registerValidation(ObjectInputValidation obj, int prio)``
    * _Đăng ký một đối tượng để được xác thực trước khi biểu đồ được trả <br/>
      về. Trong khi tương tự với resolveObject, các xác thực này được gọi <br/>
      sau khi toàn bộ biểu đồ đã được hoàn thiện. Thông thường, phương <br/>
      thức readObject sẽ đăng ký đối tượng với luồng để khi tất cả các đối <br/>
      tượng được khôi phục, một tập hợp xác thực cuối cùng có thể được <br/>
      thực hiện._

_________________________________________________________________________________________________________
* ``protected Class<?> resolveClass(ObjectStreamClass desc)``
    * _return 1 Class object tương ứng với desc_
    * _load 1 local class tương đương với bản mô tả stream class chỉ định,<br/>
      các subclass có thể implements method này để có thể tìm nạp từ 1<br/>
      nguồn thay thế_
    * _Phương thức tương ứng trong ObjectOutputStream là annotateClass._  

_________________________________________________________________________________________________________
* ``protected Object readObjectOverride()``
    * _return 1 object được đọc từ stream_
    * _method này được gọi bởi các subclass đáng tin cậy của <br/>
      ObjectOutputStream đã construct ObjectOutputStream bằng cách sử<br/>
      dụng constructor không đối số có modifier là protected, subclass<br/>
      mong đợi sẽ cung cấp 1 method override với modifier là **final**_

_________________________________________________________________________________________________________
* ``protected Class<?> resolveProxyClass(String[] interfaces)``

_________________________________________________________________________________________________________
* ``protected Object resolveObject(Object obj)``
    * _return 1 object được thay thế_
    * _method này cho phép các trusted subclass của ObjectInputStream<br/>
      thay thế 1 object cho 1 object khác trong quá trình deserialization._
    * _việc thay thế bị disable cho đến khi method enableResolveObject<br/>
      được gọi.<br/>
      method enableResolveObject kiểm tra xem stream đang yêu cầu để<br/>
      resolve object có được trusted hay không.<br/>
      mọi tham chiếu đến các object có khả năng serialize đều được<br/>
      truyền đến method resolveObject._
    * _để đảm bảo các trạng thái riêng của object không bị lộ ra ngoài ý<br/>
      muốn, chỉ các stream được trusted mới có thể sử dụng method<br/>
      resolveObject._
    * _method này được gọi sau khi 1 object được đọc, nhưng trước khi<br/>
      object đó được return từ method readObject.<br/>
      mặc định method resolveObject chỉ trả về cùng 1 object._
    * _khi 1 subclass thay thế 1 object, nó phải đảm bảo rằng object được<br/>
      thay thế tương thích với mọi field nơi tham chiếu sẽ được lưu trữ.<br/>
      Các đối tượng có kiểu không phải là lớp con của kiểu trường hoặc <br/>
      phần tử mảng sẽ hủy tuần tự hóa bằng cách tăng một ngoại lệ và đối <br/>
      tượng không được lưu trữ._  
    * _Phương thức này chỉ được gọi một lần khi mỗi đối tượng được gặp <br/>
      lần đầu tiên. Tất cả các tham chiếu tiếp theo đến đối tượng sẽ được <br/>
      chuyển hướng đến đối tượng mới._  

_________________________________________________________________________________________________________
* ``protected boolean enableResolveObject(boolean enable)``

_________________________________________________________________________________________________________
* ``protected void readStreamHeader()``
    * _method readStreamHeader cung cấp để cho phép các subclsas đọc<br/>
      và xác minh các stream header của riêng chúng, nó đọc và xác minh<br/>
      magic number và version number_

_________________________________________________________________________________________________________
* ``protected ObjectStreamClass readClassDescriptor()``
    * _return bản mô tả class được đọc_
    * _method này đọc 1 class descriptor từ serialization stream_
    * _method được gọi khi ObjectInputStream mong đợi 1 class descriptor<br/>
      là mục tiếp theo trong serialization stream_
    * _các subclass của ObjectInputStream có thể override method này để<br/>
      đọc trong các class descriptor đã được ghi với định dạng không<br/>
      chuẩn, bởi các subclass của ObjectOutputStream đã override<br/>
      method writeClassDescriptor_
    * _theo mặc định, method này đọc class descriptor theo định dạng được<br/>
      xác định trong đặc tả object serialization_

_________________________________________________________________________________________________________     
#### **Ví dụ về ObjectInputStream**
* tạo **class Employee implements Serializable**
```java
import java.io.Serializable;

/**
 * class Employee implements Serializable để có thể
 * thực hiện cơ chế Serialization
 * nhằm mục đích thực hiện việc ghi và đọc đối tượng
 * vào trong stream
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 1l;

    private String fullName;
    private float salary;

    public Employee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
```

* tạo **class WriteEmployeeData** để ghi object vào stream
```java
/**
 * class WriteEmployeeData
 * dùng để ghi đối tượng Employee vào ObjectOutputStream
 */

import java.io.*;
import java.util.Date;

public class WriteEmployeeData {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\employee.txt";

    public static void main(String[] args) {
        File outFile = new File(filePath);

        outFile.getParentFile().mkdirs();

        Employee e1 = new Employee("Tom", 1000f);
        Employee e2 = new Employee("Jerry", 2000f);
        Employee e3 = new Employee("Donald", 1200f);

        Employee[] employees = new Employee[] {e1, e2, e3};

        try {
            FileOutputStream fos = new FileOutputStream(outFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // thông báo bắt đầu ghi file
            System.out.println("Writting file: " + outFile.getName());

            // ghi mốc thời gian ghi file vào stream
            oos.writeObject(new Date());

            // ghi thông tin về file vào stream
            oos.writeUTF("Employee Data");

            // ghi số lượng đối tượng vào stream
            oos.writeInt(employees.length);

            // ghi các đối tượng vào stream
            for (Employee e : employees) {
                oos.writeObject(e);
            }

            // đóng stream
            oos.close();

            // đóng file
            fos.close();

            // thông báo kết thúc quá trình ghi đối tượng lên console
            System.out.println("Finished writting");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
* tạo **class ReadEmployeeData** để đọc object từ stream
```java
/**
 * chương trình đọc các object đã được ghi vào file trước đó
 * bởi ObjectOutputStream bằng cách sử dụng ObjectInputStream
 */

import java.io.*;
import java.util.Date;

public class ReadEmployeeData {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\employee.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(filePath);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("Reading file: " + file.getAbsoluteFile());
        System.out.println();

        Date date = (Date) ois.readObject();
        String info = ois.readUTF();

        System.out.println(date);
        System.out.println(info);
        System.out.println();

        int employeeCount = ois.readInt();

        for (int i = 0; i < employeeCount; i++) {
            Employee e = (Employee) ois.readObject();
            System.out.println("Employee: fullName=" + e.getFullName() + ", salary=" + e.getSalary());
        }

        ois.close();
        fis.close();

    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/_04_Object_IO_Stream/oos.png">

```
OUTPUT

Reading file: D:\Learning\Java\JavaOOP\src\_45_Java_IO\_03_Using_Byte_Streams\_04_Object_IO_Stream\employee.txt

Sat Jun 19 21:59:26 ICT 2021
Employee Data

Employee: fullName=Tom, salary=1000.0
Employee: fullName=Jerry, salary=2000.0
Employee: fullName=Donald, salary=1200.0
```
_________________________________________________________________________________________________________
#### **Ví dụ sử dụng readFields(ObjectInputStream ois) để đọc object từ <br/>stream**
* giả sử ta dùng **ObjectInputStream** để đọc object của class **GameSetting**
* đồng thời, trong quá trình đọc, ta muốn sửa đổi giá trị của 1 vài field
* lúc đó ta sử dụng method **readFields()**
* cách sử dụng như sau:
* tạo **class GameSetting implements Serializable**
```java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GameSetting implements Serializable {
    private static final long serialVersionUID = 1L;

    private int sound;
    private int brightness;
    private String difficultyLevel;

    private String userNote;

    public GameSetting(int sound, int brightness, String difficultyLevel, String userNote) {
        this.sound = sound;
        this.brightness = brightness;
        this.difficultyLevel = difficultyLevel;
        this.userNote = userNote;
    }

    public int getSound() {
        return sound;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getUserNote() {
        return userNote;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        /**
         * khai báo object của GetField dùng để truy cập các field được đọc liên tục từ input stream
         * instance của GetFields được trả về bởi method readFields() được gọi từ input stream
         */
        ObjectInputStream.GetField fields = ois.readFields();

        /**
         * thực hiện get() từng field đồng thời chỉnh sửa giá trị của từng field
         * return giá trị về cho object đang được đọc
         */
        this.sound = fields.get("sound", 50);
        this.brightness = fields.get("brightness", 50);

        this.difficultyLevel = (String) fields.get("difficultyLevel", "Easy"); // default
        if (this.difficultyLevel == null) {
            this.difficultyLevel = "Easy";
        }

        this.userNote = (String) fields.get("userNote", "Have Fun"); // default
        if (this.userNote == null) {
            this.userNote = "Have Fun";
        }
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        /**
         * khởi tạo 1 object của ObjectOutputStream.PutField class
         * từ method putFields() trả về 1 object dùng làm bộ đệm cho stream gọi đến
         * để đặt các field chỉ định vào, trong quá trình này có thể sửa đổi giá trị của field
         * các field này sẽ được ghi vào stream khi method writeFields() được gọi
         */
        ObjectOutputStream.PutField putField = oos.putFields();

        putField.put("sound", this.sound < 20 ? 20 : this.sound);
        putField.put("brightness", this.brightness < 30 ? 30 : this.brightness);
        putField.put("difficultyLevel", this.difficultyLevel);
        // không ghi field userNote

        /**
         * sau khi đã put những field cần ghi vào trong bộ đệm
         * tiến hành ghi đối tượng chứa các field này vào stream
         */
        oos.writeFields();
    }
}
```

* tạo **class ReadFieldFromStream**
```java
import java.util.Date;

public class ReadFieldFromStream {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\ReadGameSetting.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GameSetting gameSetting = new GameSetting(10, 15, null, null);

        // những giá trị sẽ thay đổi hoặc không khi ghi object của GameSetting
        // this.sound < 20 ? 20 : this.sound
        // this.brightness < 30 ? 30 : this.brightness
        // this.difficultyLevel
        // không thay đổi userNote
        writeGameSetting(gameSetting);

        // những giá trị sẽ thay đổi hoặc không khi đọc object của GameSetting
        // sound = 50
        // brightness = 50
        // difficultyLevel = "Easy"
        // userNote = "Have Fun"
        readGameSetting();
    }

    private static void writeGameSetting(GameSetting gameSetting) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Date());
        oos.writeUTF("GameSetting Data");

        oos.writeObject(gameSetting);

        oos.close();
        fos.close();
    }

    private static void readGameSetting() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Date date = (Date) ois.readObject();
        System.out.println(date);

        String info = (String) ois.readUTF();
        System.out.println(info);

        GameSetting gameSetting = (GameSetting) ois.readObject();
        System.out.println(gameSetting.getSound());
        System.out.println(gameSetting.getBrightness());
        System.out.println(gameSetting.getDifficultyLevel());
        System.out.println(gameSetting.getUserNote());

        ois.close();
        fis.close();
    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/_04_Object_IO_Stream/ReadGameSetting.png">

```
OUTPUT

Sun Jul 04 21:41:12 ICT 2021
GameSetting Data
20
30
Easy
Have Fun
```
_________________________________________________________________________________________________________
#### **Ví dụ đọc object bằng method readUnshared()**
* method **readUnshared()** được sử dụng để đọc 1 object được ghi bởi<br/>
method **writeUnshared()**
  
```java
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadUnsharedFromStream {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\FilewriteObject.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        

        writeUnsharedTest();
        
        readUnsharedTest();
    }
    
    private static void writeUnsharedTest() throws IOException {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        File file = new File(filePath);
        file.getParentFile().mkdirs();
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeUnshared(list);
        oos.writeUnshared(list);
        
        oos.close();
        fos.close();
    }
    
    private static void readUnsharedTest() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<String> list1 = (List<String>) ois.readUnshared();
        List<String> list2 = (List<String>) ois.readUnshared();

        System.out.println(list1.toString());
        System.out.println();

        System.out.println(list2.toString());
        System.out.println();

        System.out.println("[reference: list1 == list2] : " + (list1 == list2));
        System.out.println("[size: list1.equals(list2) ] : " + (list1.equals(list2)));
        ois.close();
        fis.close();
    }
}
```

```
OUTPUT

[one, two, three]

[one, two, three]

[reference: list1 == list2] : false
[size: list1.equals(list2) ] : true
```
_________________________________________________________________________________________________________
## 5. Sử dụng DataInputStream &<br/> DataOutputStream<a id="5"></a>
___________________________________________________________________________________________________________

###   5.1. Ví dụ write() file sử dụng DataOutputStream<a id="5.1"></a>
* **class DataOutputStream** trong Java cho phép ứng dụng ghi các kiểu dữ<br/>
liệu primitive vào **output stream** theo cách di động.
  
* ứng dụng có thể sử dụng **class DataInputStream** tương ứng để đọc dữ <br/>
  liệu trở lại.
  
```java
import java.io.*;

public class DataOutputStream_EX {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\DataOutputStream.txt";

    public static void main(String[] args) throws IOException {
        int id = 1;
        String name = "Java";
        int year = 2021;
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(id);
        dos.writeUTF(name);
        dos.writeInt(year);

        dos.close();
        fos.close();
    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/_04_Object_IO_Stream/DataOutputStream.png">


___________________________________________________________________________________________________________

###   5.2. Ví dụ read() file sử dụng DataInputStream<a id="5.2"></a>
* **class DataInputStream** trong Java cho phép ứng dụng đọc các dữ liệu<br/>
kiểu primitive được ghi bởi **class DataOutputStream**
  
```java
import java.io.*;

public class DataInputStream_EX {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\DataOutputStream.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);

        int year = dis.readInt();
        String name = dis.readUTF();
        int id = dis.readInt();

        // id= 2021, name: Java, year: 1
        // lỗi tuần tự, do không đặt chính xác tuần tự của dữ liệu được serialize trước đó
        // serialization: id -> name -> year
        // deserialization: year -> name -> id (lỗi)
        System.out.println("id= " + id + ", name: " + name + ", year: " + year);

        dis.close();
        fis.close();
    }
}
```
```
OUTPUT

id= 2021, name: Java, year: 1
```
___________________________________________________________________________________________________________
## 6. Sử dụng FilterInputStream & <br/>FilterOutputStream<a id="6"></a>
___________________________________________________________________________________________________________

###   6.1. Ví dụ write() file sử dụng FilterOutputStream<a id="6.1"></a>
* **class FilterOutputStream extends OutputStream**, nó cung cấp các<br/>
class con khác nhau như:
    * **BufferedOutputStream**
    * **DataOutputStream**
    
* để cung cấp các chức năng bổ sung, vì vậy nó ít được sử dụng riêng lẻ

```java
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_EX {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\FilterOutputStream.txt";

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        FilterOutputStream filter = null;

        try {
            fos = new FileOutputStream(new File(filePath));
            filter = new FilterOutputStream(fos);

            String s = "dotdash.com";

            byte[] b = s.getBytes();

            filter.write(b);
            filter.flush();

            System.out.println("success...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            filter.close();
            fos.close();
        }
    }
}
```

<img src="https://github.com/hienqp/JavaCore/blob/main/_45_Java_IO/_03_Using_Byte_Streams/_04_Object_IO_Stream/FilterOutputStream.png">

_________________________________________________________________________________________________________________
###   6.2. Ví dụ read() file sử dụng FilterInputStream<a id="6.2"></a>
* **class FilterInputStream extends InputStream**, nó cung cấp các<br/>
  class con khác nhau như:
    * **BufferedOutputStream**
    * **DataOutputStream**

* để cung cấp các chức năng bổ sung, vì vậy nó ít được sử dụng riêng lẻ

```java
import java.io.*;

public class FilterInputStream_EX {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\FilterOutputStream.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FilterInputStream filter = null;

        try {
            fis = new FileInputStream(new File(filePath));
            filter = new BufferedInputStream(fis);

            int i = 0;

            while ((i = filter.read()) != -1) {
                System.out.println(i + "\t" + (char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            filter.close();
            fis.close();
        }
    }
}
```
```
OUTPUT

100	d
111	o
116	t
100	d
97	a
115	s
104	h
46	.
99	c
111	o
109	m
```
_________________________________________________________________________________________________________
## 7. Sử dụng SequenceInputStream<a id="7"></a>
* thông thường, ta có thể đọc 1 file nào đó thông qua 1 input stream
* nhưng nếu ta cần đọc nhiều file, và lấy dữ liệu đó ghép thành 1 file khác
* khi đó ta ghép nhiều **input stream** với nhau tạo thành 1 **input stream**<br/>
tổng hợp của các **input stream** nối đuôi nhau
  
* **class SequenceInputStream** dùng để nối các **input stream** với nhau<br/>
và tạo thành 1 **input stream** tổng hợp theo thứ tự các **input stream**<br/>
  được thêm vào
  
* khái niệm nối các **stream** với nhau không hỗ trợ cho **output stream**
_________________________________________________________________________________________________________

```java
/**
 * chương trình gộp 2 input stream thành 1 input stream
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStream_EX1 {
    public static void main(String[] args) throws IOException {
        // đường dẫn của 2 file cần gộp
        String path1 = "D:\\Learning\\Java\\JavaOOP\\test_input_stream.txt";
        String path2 = "D:\\Learning\\Java\\JavaOOP\\test_output_stream.txt";

        // khai báo object của các input stream và của SequenceInputStream
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        SequenceInputStream sis = null;

        try {
            // khởi tạo instance của các object đã khai báo
            fis1 = new FileInputStream(path1);
            fis2 = new FileInputStream(path2);

            // gộp 2 input stream với nhau bằng constructor của SequenceInputStream
            sis = new SequenceInputStream(fis1, fis2);

            int i;
            while ((i = sis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (sis != null) {
                sis.close();
            }
            if (fis2 != null) {
                fis2.close();
            }
            if (fis1 != null) {
                fis1.close();
            }
        }
    }
}
```

```
OUTPUT

HelloJavaCoreJava-Core.com
I/O-Stream
```
_________________________________________________________________________________________________________
```java
/**
 * chuong trinh noi 2 input stream tao thanh 1 input stream duy nhat
 *
 * su dung SequenceInputStream, InputStreamReader, BufferedInputStream
 * de noi va read du lieu tu input stream
 */

import java.io.*;

public class SequenceInputStream_EX2 {
    // duong dan cua 2 file van ban ma hoa UTF-8
    private static String path1 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\test_SequenceInputStream_1.txt";
    private static String path2 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\test_SequenceInputStream_2.txt";

    // chung ta se doc 2 file tren bang SequenceInputStream, InputStreamReader, BufferedReader
    public static void main(String[] args) throws IOException {
        InputStream inputStream1 = new FileInputStream(path1 );
        InputStream inputStream2 = new FileInputStream(path2);

        // tao object cua SequenceInputStream
        InputStream sequenceInputStream = new SequenceInputStream(inputStream1, inputStream2);

        // tao object cua InputStreamReader
        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
        inputStreamReader.close();
        sequenceInputStream.close();
        inputStream2.close();
        inputStream1.close();
    }
}
```
```
OUTPUT

# list 1
one
two
three
four
five
six
seven
eigth
nine
ten
# list 2
red
blue
orange
green
brown
black
white
```
_________________________________________________________________________________________________________
```java
import java.io.*;

/**
 * chuong trinh noi 2 input stream voi nhau tao thanh 1 input stream duy nhat
 * va read du lieu tu input stream do
 *
 * su dung SequenceInputStream de noi 2 input stream voi nhau
 * su dung InputStreamReader va BufferedInputStream de read du lieu tu input stream
 */

public class SequenceInputStream_EX3 {
    // duong dan cua 2 file van ban ma hoa UTF-8
    private static String path1 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\test_SequenceInputStream_1.txt";
    private static String path2 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\test_SequenceInputStream_2.txt";

    public static void main(String[] args) throws IOException {
        InputStream inputStream1 = new FileInputStream(path1);
        InputStream inputStream2 = new FileInputStream(path2);

        SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStream1, inputStream2);

        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        bufferedReader.lines()
                .filter(line -> !line.isBlank()) // is not Blank
                .filter(line -> !line.startsWith("#")) // not start with #
                .forEach(System.out::println);

        bufferedReader.close();
    }
}
```
```
OUTPUT

one
two
three
four
five
six
seven
eigth
nine
ten
red
blue
orange
green
brown
black
white
```
_________________________________________________________________________________________________________

## 8. Sử dụng PipedInputStream & <br/>PipedOutputStream<a id="8"></a>
* giả sử ta đang phát triển ứng dụng **MultiThreading** (Đa luồng), và ta có<br/>
2 **Thread** độc lập là **Thread-A** và **Thread-B**, câu hỏi đặt ra là:
    * làm như thế nào để mỗi khi các **byte** xuất hiện trên **Thread-A**<br/>
    chúng sẽ được chuyển sang **Thread-B** một cách tự động ?
      
* **PipedOutputStream** và **PipedInputStream** được tạo ra giúp bạn xử lý<br/>
tình huống đề cập ở trên, mỗi khi dữ liệu được ghi vào <br/>
  **PipedOutputStream** chúng sẽ xuất hiện một cách tự động trên<br/>
  **PipedInputStream**
_________________________________________________________________________________________________________
### **PipedOutputStream**
* 1 **piped output stream** có thể **connect** đến 1 **piped input stream** để <br/>
  tạo 1 **communication pipe**
  
* **piped output stream** là đầu gửi của **pipe** (đường ống)
* thông thường, dữ liệu được ghi vào object của **PipedOutputStream** bởi<br/>
1 **thread**, và dữ liệu được đọc từ **PipedInputStream** đã được **connect**<br/>
  bởi 1 hoặc 1 vài **thread** khác.
  
* việc cố gắng sử dụng cả 2 object từ 1 **thread** không được khuyến khích<br/>
vì nó có thể dẫn đến hiện tượng **Deadlock the Thread**, **pipe** (đường <br/>
  ống) được cho là bị gãy, nếu 1 **thread** đang đọc dữ liệu từ **connected <br/>
  piped input stream** không còn tồn tại
  
_________________________________________________________________________________________________________
#### **PipedOutputStream Constructor**
* ``PipedOutputStream()``
    * tạo 1 piped output stream chưa connect đến piped input stream
    

* ``PipedOutputStream(PipedInputStream pis)``
    * tạo 1 piped output stream connecet đến 1 piped input stream chỉ <br/>
      định


_________________________________________________________________________________________________________
#### **PipedOutputStream Method**
* ``public void close() throws IOException``
    * đóng piped output stream này, và giải phóng bất kỳ **system <br/>
      resource** nào đang liên kết với stream này, stream này có thể<br/>
      không còn được sử dụng để ghi byte nữa.
      

* ``public void connect(PipedInputStream pis) throws IOException``
    * connect piped output stream này đến receiver (piped input stream)
    * nếu đã connect đến 1 piped input stream nào đó, thì khi gọi method<br/>
    này, 1 IOException sẽ bị ném ra
      
    * nếu piped output stream và piped input stream chưa được connect,<br/>
    chúng có thể được connect bằng 1 trong 2 lệnh sau:
        * pipedOutputStream.connect(pipedInputStream)
        * pipedInputStream.connect(pipedOutputStream)
    

* ``public void flush() throws IOException``
    * đẩy output stream này và bắt buộc bất kỳ byte dữ liệu đầu ra của<br/>
    bộ đệm phải được ghi ra ngoài.
      
    * lệnh này sẽ notify cho các reader rằng các byte đang đợi trong pipe
    

* ``public void write(byte[] b, int off, int len) throws IOException``
    * ghi số lượng ``len`` byte từ mảng các byte ``b`` từ vị trí ``off`` đến<br/>
    output stream
      
    * method này bị block cho đến khi tất cả các byte được ghi đến<br/>
    output stream
      

* ``public void write(int b) throws IOException``
    * ghi giá trị byte ``b`` dạng kiểu int đến output stream
_________________________________________________________________________________________________________
### **PipedInputStream**
* 1 **piped input stream** phải được **connect** với 1 **piped output stream**,<br/>
sau đó **piped input stream** cung cấp bất kỳ byte dữ liệu nào được ghi<br/>
  ra **piped output stream**
  
* thông thường, dữ liệu được đọc từ 1 object **PipedInputStream** trong 1<br/>
**thread** và dữ liệu được ghi đến object **PipedOutputStream** tương ứng<br/>
  ở 1 **thread** khác
  
* việc cố gắng sử dụng cả 2 piped output và piped input trong cùng thread<br/>
không được khuyến khích, nó có thể dẫn đến **Deadlock the Thread**
  
* **piped input stream** chứa 1 buffer, tách hoạt động đọc khỏi hoạt động<br/>
ghi, trong giới hạn
  
* 1 pipe được cho là bị gãy, nếu 1 thread đang cung cấp các byte dữ liệu<br/>
cho **connected piped output stream** không còn tồn tại

_________________________________________________________________________________________________________
#### **PipedInputStream Constructor**
* ``PipedInputStream()``
    * tạo 1 PipedInputStream vẫn chưa được connect
    

* ``PipedInputStream(int pipeSize)``
    * tạo 1 PipedInputStream vẫn chưa được connect và dùng kích<br/>
    thước pipe chỉ định cho buffer của pipe

      
* ``PipedInputStream(PipedOutputStream src)``
    * tạo 1 PipedInputStream được kết nối với 1 PipedOutputStream src
    

* ``PipedInputStream(PipedOutputStream src, int pipeSize)``
    * tạo 1 PipedInputStream được kết nối với 1 PipedOutputStream src,<br/>
    và dùng kích thước pipe chỉ định cho buffer của pipe


_________________________________________________________________________________________________________
#### **PipedInputStream Method**
* ``public int available() throws IOException``
    * trả về số lượng byte có thể được đọc từ input stream không đang<br/>
    bị block
    * trả về 0 nếu input stream đã bị close bởi việc gọi close() method,<br/>
    hoặc nếu pipe bị unconnected, hoặc bị broken
      

* ``public void close() throws IOException``
    * close piped input stream này, và thông báo đến bất kỳ system <br/>
      resource đã liên kết với stream này
      

* ``public void connect(PipedOutputStream src) throws IOException``
    * connect piped input stream này đến sender (piped output stream)
    * nếu đã connect đến 1 piped output stream nào đó, thì khi gọi method<br/>
      này, 1 IOException sẽ bị ném ra

    * nếu piped output stream và piped input stream chưa được connect,<br/>
      chúng có thể được connect bằng 1 trong 2 lệnh sau:
        * pipedOutputStream.connect(pipedInputStream)
        * pipedInputStream.connect(pipedOutputStream)
    

* ``public int read() throws IOException``
    * đọc byte dữ liệu kế tiếp từ piped intput stream
    * giá trị của byte dữ liệu được trả về là 1 giá trị integer trong khoảng<br/>
    0 - 255
      
    * method này bị block cho đến khi dữ liệu input được available, hoặc<br/>
    đầu cuối của stream được xác định, hoặc 1 exception bị ném ra
      

* ``public int read(byte[] b, int off, int len) throws IOException``
    * đọc số lượng ``len`` byte dữ liệu từ piped input stream đưa vào<br/>
    mảng buffer byte ``b`` để chứa dữ liệu đọc được, bắt đầu từ vị trí<br/>
      ``off`` trong mảng byte ``b``
    * trả về số lượng byte dữ liệu đọc được và đưa vào mảng đệm buffer
    * trả về -1 nếu không còn dữ liệu để đọc nếu đã đến cuối stream
    

* ``protected void receive(int b) throws IOException``
    * nhận 1 byte dữ liệu, method này sẽ block nếu không có input nào<br/>
    available
      
    * ``b`` là byte sắp được nhận có giá trị kiểu integer

_________________________________________________________________________________________________________
#### **Ví dụ PipedOutputStream & PipedInputStream**
##### Example 1
```java
import java.io.*;

public class PipedInputStream_Ex1 {
    // khai báo biến toàn cục
    private PipedInputStream in;
    private PipedOutputStream out;

    public static void main(String[] args) throws IOException {
        new PipedInputStream_Ex1().test();
    }

    private void test() throws IOException {
        // tạo 1 PipedInputStream
        in = new PipedInputStream();

        // tạo 1 PipedOutputStream được kết nối với
        // 1 PipedInputStream
        // dữ liệu khi được ghi vào PipedOutputStream
        // sẽ lập tức được đọc ở PipedInputStream
        out = new PipedOutputStream(in);

        new Thread_Out().start();
        new Thread_In().start();
    }

    class Thread_Out extends Thread {
        @Override
        public void run() {
            try {
                byte[] b = new byte[]{'a', 97, 'b', 'c', 101};
                for (byte e : b) {
                    out.write(e);
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(out);
            }
        }
    }

    class Thread_In extends Thread {
        @Override
        public void run() {
            try {
                int b = 0;

                while ((b = in.read()) != -1) {
                    System.out.println(b + " " + (char) b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(in);
            }


        }
    }

    private void closeQuietly(OutputStream out) {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeQuietly(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

##### Example 2
* sử dụng **PipedOutputStream, PipedInputStream** & <br/>
  **BufferedOutputStream, BufferedInputStream** để nâng cao hiệu suất <br/>
  chương trình
  
```java
import java.io.*;

public class PipedInputStream_Ex2 {
    private BufferedOutputStream outBuff;
    private BufferedInputStream inBuff;

    public static void main(String[] args) throws IOException {
        new PipedInputStream_Ex2().test();
    }

    private void test() throws IOException {
        PipedOutputStream outPipe = new PipedOutputStream();
        PipedInputStream inPipe = new PipedInputStream();

        outPipe.connect(inPipe);

        outBuff = new BufferedOutputStream(outPipe);
        inBuff = new BufferedInputStream(inPipe);

        new OutThread().start();
        new InThread().start();
    }

    class OutThread extends Thread {
        @Override
        public void run() {
            try {
                byte[] b = new byte[]{'a', 97, 'b', 'c', 101};

                for (byte e : b) {
                    outBuff.write(e);
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(outBuff);
            }
        }
    }

    class InThread extends Thread {
        @Override
        public void run() {
            int b = 0;
            try {
                while ((b = inBuff.read()) != -1) {
                    System.out.println(b + " " + (char) b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(inBuff);
            }
        }
    }

    private void closeQuietly(OutputStream out) {
        try {
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeQuietly(InputStream in) {
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
________________________________________________________________________________________________________________________________________
