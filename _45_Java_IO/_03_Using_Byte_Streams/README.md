# Hướng Dẫn Sử Dụng Các Byte <br/>Stream Trong Java
___
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

___
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
___
## 1. Đọc ký tự từ Console<a id="1"></a>

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
      
###   2.1. Ví dụ read() nội dung của file - Sử dụng <br/>FileInputStream<a id="2.1"></a>

<img src="">

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

![]()

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

![]()

## 3. Sử dụng ByteArrayInputStream & <br/>ByteArrayOutputStream<a id="3"></a>
      
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

![]()

## 4. Sử dụng ObjectInputStream & <br/>ObjectOutputStream<a id="4"></a>

###   4.1. Ví dụ Sử dụng ObjectOutputStream write() object <br/>ra file<a id="4.1"></a>
* **ObjectOutputStream** là **1 subclass** của **abstract OutputStream**
* **ObjectOutputStream** ghi các kiểu dữ liệu **primitive** & **instance** của<br/>
các **object** ra **OutputStream**, các **object** có thể được đọc <br/>
  (**reconstituted** - hoàn nguyên) bằng cách sử dụng **ObjectInputStream**.
  
* việc lưu trữ liên tục các đối tượng có thể được hoàn thành bằng cách sử<br/>
dụng file cho stream.
  
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
  cơ chế chia sẻ tham chiếu để hình ảnh của các object có thể được khôi<br/>
  phục về hình dạng như khi bản gốc được ghi.
  

* **Nested Class của ObjectOutputStream**
```java
static class ObjectOutputStream.PutField {
    //Provide programmatic access 
        // to the persistent fields 
        // to be written to ObjectOutput.
        }
```
  

* **Constructor của ObjectOutputStream**
  
    * ```java
      ObjectOutputStream()
      // cung cấp cách để các subclass hoàn thành việc thực thi lại
      // ObjectOutputStream mà không phải cấp phát dữ liệu riêng vừa
      // được sử dụng bởi sự triển khai của ObjectOutputStream này
      ```

  * ```java
      ObjectOutputStream(OutputStream out)
      // tạo ObjectOutputStream ghi vào OutputStream chỉ định
      ```
 
   
* **Method của ObjectOutputStream**

Return|Method & _Description_
----|----
void|**annotateClass(Class<?> cl)**<br/>_các subclass có thể implements method này để cho phép class data được lưu trữ trong stream_
void|**annotateProxyClass(Class<?> cl)**<br/>_các subclass có thể implements method này để lưu trữ dữ liệu tùy chình trong stream cùng với bản mô tả cho các dynamic proxy class_
void|**close()**<br/>_đóng stream_
void|**defaultWriteObject()**<br/>_ghi các non-static & non-transient field của class hiện tại vào stream_
void|**drain()**<br/>_xả bất kỳ dữ liệu đệm nào trong ObjectOutputStream nhưng không ảnh hưởng đến stream bên dưới_
void|**flush()**<br/>_đẩy stream, Điều này sẽ ghi bất kỳ byte đầu ra có bộ đệm nào và chuyển qua luồng bên dưới._
boolean|**enableReplaceObject(boolean enable)**<br/>
Object|**replaceObject(Object obj)**<br/>
void|**reset()**<br/>
void|**useProtocolVersion(int version)**<br/>
void|**write(byte[] buf)**<br/>
void|**write(byte[] buf, int off, int len)**<br/>
void|**write(int val)**<br/>
void|**writeBoolean(boolean val)**<br/>
void|**writeByte(int val)**<br/>
void|**writeBytes(String str)**<br/>
void|**writeShort(int val)**<br/>
void|**writeChar(int val)**<br/>
void|**writeChars(String str)**<br/>
void|**writeInt(int val)**<br/>
void|**writeLong(long val)**<br/>
void|**writeFloat(float val)**<br/>
void|**writeDouble(double val)**<br/>
void|**writeUTF(String str)**<br/>
void|**writeFields()**<br/>
void|**writeObject(Object obj)**<br/>
void|**writeObjectOverride(Object obj)**<br/>
void|**writeStreamHeader()**<br/>
void|**writeUnshared(Object obj)**<br/>

ObjectOutputStream.PutField|**putFields()**<br/>



###   4.2. Ví dụ Sử dụng ObjectInputStream  read() object từ <br/>file<a id="4.2"></a>

## 5. Sử dụng DataInputStream &<br/> DataOutputStream<a id="5"></a>

###   5.1. Ví dụ write() file sử dụng DataOutputStream<a id="5.1"></a>

###   5.2. Ví dụ read() file sử dụng DataInputStream<a id="5.2"></a>

## 6. Sử dụng FilterInputStream & <br/>FilterOutputStream<a id="6"></a>

###   6.1. Ví dụ write() file sử dụng FilterOutputStream<a id="6.1"></a>

###   6.2. Ví dụ read() file sử dụng FilterInputStream<a id="6.2"></a>

## 7. Sử dụng SequenceInputStream<a id="7"></a>
## 8. Sử dụng PipedInputStream & <br/>PipedOutputStream<a id="8"></a>
