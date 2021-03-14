package _26_Interface.Pack_7;

import java.lang.annotation.*;

/**
 * Annotation
 *
 * tương tự như Maker Interface, chúng ta có thể sử dụng Annotation cho cùng mục đích đánh dấu ( Annotation được thêm từ JDK 5 )
 * chúng ta có thể chỉ giới hạn sử dụng Annotation ở mức class giống như interface bằng cách khai báo java.lang.annotation.ElementType là TYPE
 *
 * hãy xem cách sử dụng Annotation để thay thế cho Marker Interface
 *
 */

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

// dưới đây khai báo interface SafeDeleteable là annotation
@interface SafeDeleteable {

}

//
class Order {

}

// đánh dấu 1 annotation SafeDeleteable cho class Customer dưới đây
@SafeDeleteable
class Customer {

}

public class AnnotationMakerInterfaceExample {
    public static void delete(Object object) {
        if (object.getClass().isAnnotationPresent(SafeDeleteable.class)) {
            System.out.println("Set flag to delete: " + object.getClass());
        } else {
            System.out.println("Call delete object from database: " + object.getClass());
        }
    }

    public static void main(String[] args) {
        delete(new Order());
        delete(new Customer());
    }
}
