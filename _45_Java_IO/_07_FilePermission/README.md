# FilePermission class
________________________________________________________________________________________________________________________
## Nội Dung
1. [Giới Thiệu](#1)
2. [Constructors](#2)
3. [Methods](#3)
4. [Example](#4)
________________________________________________________________________________________________________________________
## 1. Giới Thiệu <a id="1"></a>

* lớp **java.io.FilePermission** đại diện cho quyền truy cập vào **file** hoặc **directory**.
* 1 đối tượng **FilePermission** bao gồm 1 đường dẫn và 1 tập hợp các hành động hợp lệ cho đường dẫn đó.
* **pathname** là tên đường dẫn của **file** hoặc **directory** được cấp cho các hành động được chỉ định.
    * **pathname** kết thúc với ``/*`` chỉ định tất cả các **file** và **directory** con được chứa trong **directory** đó 
  (trong đó ``/`` là ký tự phân cách đường dẫn - File.separatorChar).
    * **pathname** kết thúc với ``/-`` chỉ định (đệ quy) tất cả các **file** và **directory** con và tất cả các **file** 
    * và **directory** được chứa trong **directory** con được chứa trong **directory** đó.
    * **pathname** chứa 1 **token** đặc biệt ``<<ALL FILES>>`` thì matching any file.
* các **action** (hành động) được cấp cho **pathname** được truyền vào **constructor** trong 1 **String** là danh sách
các từ khóa chỉ hành động cấp cho **pathname** (được phân cách bởi dấu ``,`` nếu có nhiều hơn 1 **action**).
* chuỗi các **action** sẽ được chuyển về dạng ký tự in thường trước tiến trình.
    * **read** - cho phép đọc
    * **write** - cho phép ghi
    * **execute** - cho phép thực thi, cho phép **Runtime.exec** được gọi, tương ứng với **SecurityManager.checkExec**
    * **delete** - cho phép xóa, cho phép gọi **File.delete**. Tương ứng với **SecurityManager.checkDelete**
    * **readlink** - cho phép liên kết đọc, Cho phép đọc target của một liên kết tượng trưng bằng cách gọi phương thức 
      **readSymbolicLink()**
* lưu ý: phải cẩn thận khi cấp quyền truy cập cho **FilePermission**, 
    * lưu ý những tác động của việc cấp quyền truy cập đọc và đặc biệt là ghi vào các **file** và **directory** khác nhau
    * quyền ``<<ALL FILES>>`` với hành động ghi đặc biệt nguy hiểm, điều này cấp quyền ghi vào toàn bộ hệ thống **File**,
    điều này cho phép ảnh hưởng đến sự thay thế **system binary** bao gồm cả **JVM Runtime Enviroment**.
* lưu ý: **code** luôn luôn có thể đọc 1 **file** từ cùng 1 **directory** mà nó nằm trong (hoặc **directory** con của
  **directory** đó), nó không cần 1 **explicit permission** để xin quyền đọc.

```java
package java.io;

public final class FilePermission extends Permission implements Serializable {
    public FilePermission(String path, String actions) {//...}

    public boolean implies(Permission p) {//...}
    public boolean equals(Object obj) {//...}
    public int hashCode() {//...}
    public String getActions() {//...}
    public PermissionCollection newPermissionCollection() {//...}
}
```
________________________________________________________________________________________________________________________
## 2. Constructors <a id="2"></a>
```java
package java.io;

public final class FilePermission extends Permission implements Serializable {
    public FilePermission(String path, String actions) {//...}
}
```

Access Modifier |Constructor                                |Description
:---------------|:------------------------------------------|:----------------------------------------------------------
public          |FilePermission(String path, String actions)|tạo 1 đối tượng **FilePermission** mới cấp quyền các ``actions`` chỉ định cho đường dẫn ``path`` truyền vào. <br/>``path`` : đường dẫn chỉ định được cấp quyền. <br/>``actions`` : các quyền chỉ định cấp cho ``path``. 

________________________________________________________________________________________________________________________
## 3. Methods <a id="3"></a>
```java
package java.io;

public final class FilePermission extends Permission implements Serializable {
    public boolean implies(Permission p) {//...}
    public boolean equals(Object obj) {//...}
    public int hashCode() {//...}
    public String getActions() {//...}
    public PermissionCollection newPermissionCollection() {//...}
}
```

Access Modifier |Return Data          |Methods                  |Description
:---------------|:--------------------|:------------------------|:------------------------------------------------------
public          |boolean              |implies(Permission p)    |kiểm tra đối tượng **FilePermission** hiện tại có **implies** (bao hàm ẩn chứa) việc cấp các quyền cho đối tượng **Permission** ``p`` chỉ định hay không, <br/>nghĩa là việc cấp các quyền cho **FilePermission** hiện tại bao hàm cả việc cấp quyền cho **Permission** chỉ định hay không, <br/>nếu có trả về ``true``, ngược lại là ``false``.
public          |boolean              |equals(Object obj)       |kiểm tra đối tượng ``obj`` chỉ định có phải là 1 đối tượng **FilePermission** hay không, <br/>nếu đúng là 1 đối tượng **FilePermission** thì đường dẫn và các quyền hành động được cấp có bằng với đối tượng **FilePermission** hiện tại hay không. <br/>``obj`` : đối tượng **Object** được chỉ định để so sánh với đối tượng **FilePermission** hiện tại. <br/>return ``true`` nếu ``obj`` chỉ định là 1 đối tượng **FilePermission**, đường dẫn và các hành động được cấp bằng với đối tượng **FilePermission** hiện tại, ngược lại trả về ``false``.  
public          |int                  |hashCode()               |trả về giá trị **int** là **hash code** của đối tượng **FilePermission** hiện tại.
public          |String               |getActions()             |trả về 1 **String** là 1 biểu diễn dạng chuỗi chuẩn quy danh sách các hành động được cấp cho đối tượng **FilePermission** hiện tại, <br/>phương thức này luôn trả về các hành động của đối tượng **FilePermission** hiện tại theo thứ tự sau: ``read, write, execute, delete, readlink``.
public          |PermissionCollection |newPermissionCollection()|trả về 1 đối tượng **PermissionCollection** mới để lưu trữ các đối tượng **FilePermission**, <br/>các đối tượng **FilePermission** phải được lưu trữ theo cách cho phép chúng được chèn vào **collection** theo bất cứ thứ tự nào, nhưng điều đó cũng cho phép **PermissionCollection** phương thức **implies()** được triển khai theo cách hiệu quả. <br/>ví dụ, nếu ta có 2 **FilePermission**: ``1. "/tmp/-", "read"`` và ``2. "/tmp/scratch/foo", "write"`` <br/>và ta gọi phương thức **implies()** với **FilePermission**: ``"/tmp/scratch/foo", "read,write"`` <br/>sau đó phương thức **implies()** phải mang vào danh mục cả 2 quyền ``"/tmp/-"`` và ``"/tmp/scratch/foo"``, do đó, các quyền hệ quả là ``"read, write"`` và **implies()** trả về ``true``,  
________________________________________________________________________________________________________________________
## 4. Example <a id="4"></a>
### FilePermission.implies(Permission)
```java
import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermission_implies {
    public static void main(String[] args) {
        // "\-" ở cuối đường dẫn, các quyền sẽ được cấp cho tất cả mọi thứ chứa trong directory \\implies
        String dir1 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_07_FilePermission\\implies\\-";

        // các quyền được cấp cho đường dẫn này chỉ có tác dụng với file test_implies.txt
        String dir2 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_07_FilePermission\\implies\\test_implies.txt";

        // cấp quyền "read" cho tất cả mọi thứ trong dir1, bao hàm ngụ ý cấp quyền cả cho test_implies.txt được chứa trong dir1
        FilePermission file1 = new FilePermission(dir1, "read");

        FilePermission file2 = new FilePermission(dir2, "write");

        PermissionCollection permissionCollection = file1.newPermissionCollection();

        permissionCollection.add(file1);
        permissionCollection.add(file2);

        if (permissionCollection.implies(new FilePermission(dir2, "read, write"))) {
            System.out.println("read, write permission is granted for dir2: " + dir2);
        } else {
            System.out.println("NO read, write permission is granted for dir2: " + dir2);
        }
        System.out.println("----------------------------------------------------");

        // kiểm tra action của file2
        System.out.println("file1's actions: " + file1.getActions());
        System.out.println("file2's actions: " + file2.getActions());
    }
}
```
* OUTPUT
```text
read, write permission is granted for dir2: D:\Learning\Java\JavaOOP\src\_45_Java_IO\_07_FilePermission\implies\test_implies.txt
----------------------------------------------------
file1's actions: read
file2's actions: write
```
