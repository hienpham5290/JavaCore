# Documentation Comment

## Nội Dung

1. [Các loại Comment trong Java](#1)
2. [Công dụng của Documentation Comment](#2)
3. [Tạo HTML Document trên IntellJ](#3)
4. [Định dạng Java Doc thông qua sử dụng Tag](#4)

    4.1. [@author, @version, @since](#4.1)
   
    4.2. [{@code}, @param](#4.2)
   
    4.3. [@deprecated, {@link}](#4.3)
   
    4.4. [@exception, @throws](#4.4)
   
    4.5. [@return, @see](#4.5)
   
    4.6. [{@value}](#4.6)
   
    4.7. [Tham khảo 1 số định dạng khác](#4.7)
   
5. [Kết luận](#5)

## 1. Các loại Comment trong Java <a id="1"></a>
* Comment 1 dòng:
```java
// đây là comment 1 dòng 
```
* Comment nhiều dòng:
```java
/*
        có thể xuống dòng tùy ý nội dung comment giữa /* và */
 */
```
* Documentation Comment - Comment dạng Tài liệu
```java
/** đây là Documentation Comment
 *  nội dung giữa /** và */ là Doc Comment
 */
```
## 2. Công dụng của Documentation Comment <a id="2"></a>
* **Doc Comment** có định dạng rõ ràng khi cần chú thích về các **parameter**
* hiển thị nội dung của **Doc Comment** về **class** hay **method** đã được <br/>
thêm **Doc Comment** trước đó, khi trỏ chuột vào **class** hay **method**
  
* **Doc Comment** được công cụ **Javadoc** build ra 1 trang mô tả theo kiểu<br/>
**HTML**, là 1 trang Web được xây dựng hoàn chỉnh có thể publish hay <br/>
  nhúng vào các trang Web khác. Rất thích hợp để tạo ra các **Library Java**<br/>
  và gửi đến người dùng **Library** của bạn với đầy đủ hướng dẫn sử dụng<br/>
  code **Java** mà bạn đã xây dựng.
  
>**Javadoc** là 1 tool đi kèm với **JDK**<br/>
> **Javadoc** dùng để xuất xưởng ra 1 **document** theo định dạng **HTML**, để<br/>
> giúp mô tả rõ hơn về các **source code Java** của bạn hay của tổ chức <br/>
>của bạn.<br/>
> Để **Javadoc** có thể build ra 1 **document** hoàn chỉnh cần tuân thủ 1 số<br/>
> quy tắc.
## 3. Tạo HTML Document trên IntellJ <a id="3"></a>
* trong IntelliJ -> Tools -> Generate Javadoc
## 4. Định dạng Java Doc thông qua sử dụng Tag <a id="4"></a>

### 4.1. @author, @version, @since <a id="4.1"></a>

### 4.2. {@code}, @param <a id="4.2"></a>

### 4.3. @deprecated, {@link} <a id="4.3"></a>

### 4.4. @exception, @throws <a id="4.4"></a>

### 4.5. @return, @see <a id="4.5"></a>

### 4.6. {@value} <a id="4.6"></a>

### 4.7. Tham khảo 1 số định dạng khác <a id="4.7"></a>

## 5. Kết luận <a id="5"></a>