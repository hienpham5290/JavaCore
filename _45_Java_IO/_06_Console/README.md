# Console class
## Nội Dung
1. [Giới thiệu](#1)
2. [Construct Console's object](#2)
3. [Methods](#3)
4. [Ví Dụ](#4)

   4.1 [Ví dụ đọc 1 dòng văn bản từ console](#4.1)

   4.2 [Ví dụ đọc 1 dóng password từ console](#4.2)

________________________________________________________________________________________________________________________
## 1. Giới thiệu <a id="1"></a>

* lớp **java.io.Console** trong **Java** được sử dụng để lấy nội dung được nhập từ giao diện **console**, nó cung cấp
các phương thức để đọc **văn bản và mật khẩu** ở **runtime**.
* nếu đọc mật khẩu bằng cách sử dụng lớp **Console**, nó sẽ không hiển thị cho người dùng.
* lớp **Console** được gắn với hệ thống điều khiển nội bộ, nó được giới thiệu từ **JDK 1.5**
________________________________________________________________________________________________________________________
## 2. Construct Console's object <a id="2"></a>

* lớp **System** cung cấp 1 phương thức **static console()** trả về **singleton instance** của lớp **Console**.
* LỚP **java.io.Console** KHÔNG THỂ LẤY **Console INSTANCE** TỪ **System.console()** khi chạy code demo trong **IDE**, vì
**IDE** chạy ứng dụng demo như 1 tiến trình (process) background, không phải là 1 tiến trình (process) top-level cùng với
**system console**

>* để thực thi được chương trình, ta cần làm các bước sau:
>    * viết class chương trình trong 1 directory nào đó
>    * dùng cmd, window terminal, powershell hoặc bất cứ chương trình command line
>        * di chuyển đến thư mục chứa file <br/>``filename.java``
>        * thực hiện lệnh trên command line: <br/> ``javac filename.java``
>        * nếu chương trình xảy ra lỗi -> sửa mã chương trình
>        * nếu không xảy ra lỗi, thực thi lệnh trên command line:  <br/>``java filename``

```java
public final class System {
    public static Console console() {//...}
}
```
________________________________________________________________________________________________________________________
## 3. Methods <a id="3"></a>

```java
package java.io;

public final class Console implements Flushable {
    public PrintWriter writer() {//...}
    public Reader reader() {//...}
        
    public Console format(String fmt, Object ...args) {//...}
    public Console printf(String format, Object ... args) {//...}
        
    public String readLine(String fmt, Object ... args) {//...}
    public String readLine() {//...}
        
    public char[] readPassword() {//...}
    public char[] readPassword(String fmt, Object ... args) {//...}
        
    public void flush() {//...}
}
```

AccessModifier  |Return Data    |Method                                   |Description
:---------------|:--------------|:----------------------------------------|:--------------------------------------------------
public          |PrintWriter    |writer()                                 |trả về đối tượng **PrintWriter** duy nhất liên kết với **Console** hiện tại.
public          |Reader         |reader()                                 |trả về đối tượng **Reader** duy nhất liên kết với **Console** hiện tại.
-               |-              |-                                        |-
public          |Console        |format(String fmt, Object ...args)       |ghi 1 chuỗi được định dạng vào **output stream** của **console** hiện tại, sử dụng chuỗi định dạng và các đối số chỉ định. <br/>``fmt`` : chuỗi quy tắc định dạng cho các ``args`` theo chuẩn của **Formatter** class. <br/>``args`` : các đối số sẽ ghi vào **output stream** của **console** hiện tại, sẽ được định dạng bởi ``fmt``.
public          |Console        |printf(String format, Object ... args)   |ghi 1 chuỗi được định dạng vào **output stream** của **console** hiện tại, sử dụng chuỗi định dạng và các đối số chỉ định. <br/>``fmt`` : chuỗi quy tắc định dạng cho các ``args`` theo chuẩn của **Formatter** class. <br/>``args`` : các đối số sẽ ghi vào **output stream** của **console** hiện tại, sẽ được định dạng bởi ``fmt``.
-               |-              |-                                        |-
public          |String         |readLine(String fmt, Object ... args)    |phương thức này cung cấp 1 **String** là ``fmt`` (formatter) dùng để định dạng cho các đối số (các câu thông báo) thuộc kiểu **Object** truyền vào, sau đó đọc 1 dòng văn bản từ màn hình **console**, trả về 1 **String** văn bản đọc được. <br/>``fmt`` : chuỗi quy tắc (theo quy tắc của **Formatter** class) dùng để định dạng cho các đối số (dùng làm chuỗi thông báo) được truyền vào. <br/>``args`` : các đối số chuỗi thông báo truyền vào, nếu có nhiều hơn 1 chuỗi thông báo, các chuỗi thông báo có thể cách nhau bởi dấu ``,``.
public          |String         |readLine()                               |dùng để đọc 1 dòng văn bản từ màn hình **console**, trả về 1 **String** văn bản đọc được.
-               |-              |-                                        |-
public          |char[]         |readPassword()                           |dùng để đọc 1 dòng **password** nhập trên **console**, thao tác nhập **password** sẽ không hiển thị ký tự được nhập trên **console**. 
public          |char[]         |readPassword(String fmt, Object ... args)|dùng để đọc 1 dòng **password** nhập trên **console**, sau câu thông báo (là các đối số - ``args``) được truyền vào phương thức được định dạng theo chuỗi quy tắc ``fmt`` (theo chuẩn của **Formatter** class). <br/>``fmt`` : chuỗi quy tắc định dạng cho các ``args`` theo chuẩn của **Formatter** class. <br/>``args`` : các đối số (là các câu thông báo) sẽ được định dạng theo ``fmt`` để in thông báo ra **console**, nếu có nhiều hơn 1 ``args``, các ``args`` sẽ cách nhau bởi dấu ``,``. <br/>thao tác nhập **password** sẽ không hiển thị ký tự được nhập trên **console**.
-               |-              |-                                        |-
public          |void           |flush()                                  |được sử dụng để xả **console**

________________________________________________________________________________________________________________________
## 4. Ví Dụ <a id="4"></a>
________________________________________________________________________________________________________________________

### 4.1 Ví dụ đọc 1 dòng văn bản từ console <a id="4.1"></a>

[link from tutorialspoint.com](https://www.tutorialspoint.com/java/io/console_readline_formatted.htm)

>* để thực thi được chương trình, ta cần làm các bước sau:
>    * viết class chương trình trong 1 directory nào đó
>    * dùng cmd, window terminal, powershell hoặc bất cứ chương trình command line
>        * di chuyển đến thư mục chứa file <br/>``filename.java``
>        * thực hiện lệnh trên command line: <br/> ``javac filename.java``
>        * nếu chương trình xảy ra lỗi -> sửa mã chương trình
>        * nếu không xảy ra lỗi, thực thi lệnh trên command line:  <br/>``java filename``


```java
import java.io.Console;

public class Console_readLine {
    public static void main(String[] args) {
        Console cnsl = null;
        String fmt = "%1$4s %2$5s %3$10s%n";
        String alpha = null;

        try {
            // creates a console object
            cnsl = System.console();

            // if console is not null
            if (cnsl != null) {

                // read line from the user input
                alpha = cnsl.readLine(fmt, "Enter","Alphabets: ");

                // prints
                System.out.println("Alphabets entered: " + alpha);
            }

        } catch(Exception ex) {
            // if any error occurs
            ex.printStackTrace();
        }
    }
}
```
________________________________________________________________________________________________________________________

### 4.2 Ví dụ đọc 1 dóng password từ console <a id="4.2"></a>

[link from tutorialspoint.com](https://www.tutorialspoint.com/java/io/console_readpassword_formatted.htm)


>* để thực thi được chương trình, ta cần làm các bước sau:
>    * viết class chương trình trong 1 directory nào đó
>    * dùng cmd, window terminal, powershell hoặc bất cứ chương trình command line
>        * di chuyển đến thư mục chứa file <br/>``filename.java``
>        * thực hiện lệnh trên command line: <br/> ``javac filename.java``
>        * nếu chương trình xảy ra lỗi -> sửa mã chương trình
>        * nếu không xảy ra lỗi, thực thi lệnh trên command line:  <br/>``java filename``

```java
import java.io.Console;

public class Console_readPassword {
    public static void main(String[] args) {
        Console cnsl = null;
        String alpha = null;
        String fmt = "%2$5s %3$10s%n";

        try {
            // creates a console object
            cnsl = System.console();

            // if console is not null
            if (cnsl != null) {

                // read line from the user input
                alpha = cnsl.readLine(fmt,"Your","Name: ");

                // prints
                System.out.println("Name is: " + alpha);

                // read password into the char array
                char[] pwd = cnsl.readPassword(fmt,"Enter","Password: ");

                // prints
                System.out.println("Password is: "+pwd);
            }

        } catch(Exception ex) {
            // if any error occurs
            ex.printStackTrace();
        }
    }
}
```