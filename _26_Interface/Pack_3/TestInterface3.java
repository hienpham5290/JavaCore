package _26_Interface.Pack_3;

/**
 * Câu hỏi: Đa kế thừa không được hỗ trợ thông qua lớp trong Java nhưng là có thể bởi Interface, tại sao?
 * <p>
 * Như đa thảo luận trong chương về tính kế thừa, đa kế thừa không được hỗ trợ thông qua lớp.
 * Nhưng nó được hỗ trợ bởi Interface bởi vì không có tính lưỡng nghĩa khi trình triển khai được cung cấp bởi lớp Implementation.
 * Ví dụ:
 */

interface Printable {
    void print();
}

interface Showable {
    void print();
}

public class TestInterface3 implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}

/**
 * Trong ví dụ trên, Printable và Showable interface có cùng các phương thức
 * nhưng trình triển khai của nó được cung cấp bởi lớp TestInterface3,
 * vì thế không có tính lưỡng nghĩa ở đây.
 *
 */
