# Properties class
________________________________________________________________________________
## 1. Giới thiệu
* `Properties` class `extends` từ `Hashtable` class.
* `Properties` class được đóng gói trong `java.util.Properties`.
* `Properties` class được **sử dụng** để.
  * __tạo ra__ đối tượng chứa cặp `key-value` như 1 chuỗi.
  * __lấy__ `value`dựa trên `key` của thuộc tính.
  * __lấy__ các thuộc tính hay `property` của `System`.
* `Properties` class cung cấp các `method` để lấy dữ liệu ra hoặc ghi dữ liệu vào từ các file `.properties`.
* Nếu có bất kỳ thay đổi nào từ phía file `.properties`, ta cũng không cần phải compile lại file `.java`.
* `Properties` class trong `package` `java.util.Properties` được declare như sau:

```java
public class Properties extends Hashtable<Object, Object> {
    // There are something here...
}
```
________________________________________________________________________________
## 2. Một số quy tắc trong file `.properties`
|Quy tắc|Mẫu|
|-------------|--------|
|Mỗi cặp `key=value` được viết trên 1 dòng, và được phân cách bởi dấu `=`|`key=value`|
|`keyName` không được chứa khoảng trắng, `key Name` là SAI|`keyName`|
|có thể thêm `khoảng trắng` ở 2 đầu của `key` hoặc `value`, mặc định `Properties` class sẽ tự loại bỏ|` key = value ` tương đương `key=value`|
|sử dụng dấu `#` để viết comment cho cặp `key=value`|`# your comment`|
|những dòng sẽ bị bỏ qua khi bắt đầu với những ký tự sau |`khoảng trắng`, dấu `!`, và dấu `#`|
|có thể `add` trùng `key`, tuy nhiên `Properties` class chỉ lấy`value` của `key` cuối cùng, <br />do `Properties` class sử dụng `Map` interface để lưu trữ dữ liệu, nên cặp `key=value` cuối cùng được giữ lại| |
|`value` có thể kéo dài vài dòng, nếu cuối mỗi dòng kết thúc bằng dấu `\` |`targetCities=\`<br />`Detroit,\`<br />`Chicago,\`<br />`Los Angeles`|
|những ký tự có thể sử dụng trong file `.properties`|`\n`, `\r`, `\t`|
|để sử dụng ký tự gạch chéo ngược `\`, thêm ký tự gạch chéo ngược phía trước| `\\`|
|ký tự UNICODE có thể được nhập như 1 chương trình Java, sử dụng tiền tố `\u`|Ex: `\u002c`|

________________________________________________________________________________
## 3. Các `method` của `Properties` class
1. `Properties` class `extends` `Hashtable` class
2. `Hashtable` class `implements` `Map` interface
<br /> => do đó có thể sử dụng các `method` đã định nghĩa ở `Hashtable` class và `Map` interface.
<br />
3. Ngoài ra, `Properties` class còn có các `method` riêng của nó như sau:

|Method|Description|
|-------------|----------|
|`public void load(Reader reader)`|tải dữ liệu từ đối tượng của `Reader`|
|`public void load(InputStream inputStream)`|tải dữ liệu từ đối tượng của `InputStream`|
|`public String getProperty(String key)`|lấy `value` dựa trên `key` truyền vào|
|`public void setProperty(String key,String value)`|thiết lập 1 `property` với `key` và `value` truyền vào|
|`public void store(Writer writer, String comment)`|lưu trữ các `property` vào đối tượng của `Writer` kèm theo `String` `comment`|
|`public void store(OutputStream outputStream, String comment)`|Lưu các `property` vào đối tượng của `OutputStream`|
|`storeToXML(OutputStream outputStream, String comment)`|Lưu các property` trong đối tượng của `Writer` để tạo tài liệu `xml` kèm theo `String` `comment`|
|`public void storeToXML(Writer writer, String comment, String encoding)`|Lưu các `property` trong đối tượng của `Writer` để tạo ra tài liệu `xml` với `String` `encoding` được chỉ định|
___

## 4. Ví dụ minh họa
### 4.1. Sử dụng `Properties` class khởi tạo đối tượng để `setProperty(key, value)` vào file `.properties`
```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Properties_Output_Example {
  public static void main(String[] args) throws Exception{
    OutputStream outputStream = null;
    try {
      // initial a output stream file by FileOutputStream's object at project's root folder
      // outputStream = new FileOutputStream("database.config.properties");

      // or we can choose any location
      outputStream = new FileOutputStream("D:\\Learning\\Java\\JavaOOP\\src\\_44_Collection_Framework\\" +
              "_9_Map_interface\\_6_Properties_class\\database.config.properties");

      // initial Properties object
      Properties properties = new Properties();

      // setProperty key-value to Properties' object
      properties.setProperty("database", "localhost");
      properties.setProperty("dbuser", "coderlangthang");
      properties.setProperty("dbpassword", "password");

      // store Properties object into file .properties by FileOutputStream's object
      properties.store(outputStream, "Config Database Connection");
    } catch (IOException ioException) {
      ioException.printStackTrace();
    } finally {
      if (outputStream != null) {
        try {
          outputStream.close();
        } catch (IOException ioException) {
          ioException.printStackTrace();
        }
      }
    }
  }
}
```
OUTPUT: ta được 1 file `database.config.properties` trong thư mục gốc (`root`) của project và không thuộc bất kỳ thư mục con nào.
```
#Config Database Connection
#Sun Mar 14 12:16:33 ICT 2021
database=localhost
dbpassword=password
dbuser=gpcoder
```
___
### 4.2. Sử dụng `getPropety(key)` để lấy `value` thông qua đối tượng của `FileReader`
Sử dụng lại file `database.config.properties` trong thư mục `root` của project vừa init ở ví dụ trên.
`database.config.properties`
```
#Config Database Connection
#Sun Mar 14 12:39:16 ICT 2021
database=localhost
dbuser=coderlangthang
dbpassword=password
```
```java
import java.io.FileReader;
import java.util.Properties;

public class Properties_Reader_Example {
  public static void main(String[] args) throws Exception {
    // init FileReader's object
    FileReader fileReader = new FileReader("database.config.properties");

    // init Properties' object
    Properties properties = new Properties();

    // load data into Properties' object from FileReader's object
    properties.load(fileReader);

    // Output data of Properties' object
    System.out.println("database=" + properties.getProperty("database"));
    System.out.println("dbpassword=" + properties.getProperty("dbpassword"));
    System.out.println("dbuser=" + properties.getProperty("dbuser"));
  }
}
```
OUTPUT: in console
```
database=localhost
dbpassword=password
dbuser=coderlangthang
```
___
### 4.3 Sử dụng `Properties`' object để `getProperty(key)` của `System`
```java
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Properties_of_System {
    public static void main(String[] args) {
        // init Properties' object contain System's data
        Properties properties = System.getProperties();

        // transfer data of Properties' object into a Set's object
        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();

        // get Iterator's object base Set's object, to retrive through Set's object
        Iterator<Map.Entry<Object, Object>> iterator = entrySet.iterator();

        // show System's properties
        while (iterator.hasNext()) {
            // get Map.Entry's object from Iterator's object
            Map.Entry<Object, Object> entry = iterator.next();

            // init a key object to contain data
            Object key = entry.getKey();
            // init a value object to contain data
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
```
OUTPUT: in console
```
sun.desktop=windows
awt.toolkit=sun.awt.windows.WToolkit
java.specification.version=11
sun.cpu.isalist=amd64
sun.jnu.encoding=Cp1252
java.class.path=D:\Learning\Java\JavaOOP\out\production\JavaOOP
java.vm.vendor=Oracle Corporation
sun.arch.data.model=64
user.variant=
java.vendor.url=https://openjdk.java.net/
user.timezone=
os.name=Windows 10
java.vm.specification.version=11
sun.java.launcher=SUN_STANDARD
user.country=US
sun.boot.library.path=C:\Program Files\Java\jdk-11.0.9\bin
sun.java.command=_44_Collection_Framework._9_Map_interface._6_Properties_class.Properties_of_System
jdk.debug=release
sun.cpu.endian=little
user.home=C:\Users\jackp
user.language=en
java.specification.vendor=Oracle Corporation
java.version.date=2020-10-20
java.home=C:\Program Files\Java\jdk-11.0.9
file.separator=\
java.vm.compressedOopsMode=Zero based
line.separator=

java.specification.name=Java Platform API Specification
java.vm.specification.vendor=Oracle Corporation
java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
user.script=
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
java.runtime.version=11.0.9+7-LTS
user.name=jackp
path.separator=;
os.version=10.0
java.runtime.name=Java(TM) SE Runtime Environment
file.encoding=UTF-8
java.vm.name=Java HotSpot(TM) 64-Bit Server VM
java.vendor.version=18.9
java.vendor.url.bug=https://bugreport.java.com/bugreport/
java.io.tmpdir=C:\Users\jackp\AppData\Local\Temp\
java.version=11.0.9
user.dir=D:\learning\java\JavaOOP
os.arch=amd64
java.vm.specification.name=Java Virtual Machine Specification
java.awt.printerjob=sun.awt.windows.WPrinterJob
sun.os.patch.level=
java.library.path=C:\Program Files\Java\jdk-11.0.9\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files\Java\jdk-11.0.9\bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\iCLS\;C:\Program Files\Intel\Intel(R) Management Engine Components\iCLS\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\ProgramData\chocolatey\bin;C:\Program Files\Git\cmd;C:\Users\jackp\AppData\Local\Temp;C:\Users\jackp\AppData\Local\Programs\Microsoft VS Code\bin;.
java.vendor=Oracle Corporation
java.vm.info=mixed mode
java.vm.version=11.0.9+7-LTS
sun.io.unicode.encoding=UnicodeLittle
java.class.version=55.0
```
___
THE END









