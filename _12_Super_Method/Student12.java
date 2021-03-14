package _12_Super_Method;

/**
 * super
 *
 * gọi trực tiếp phương thức của lớp cha từ 1 phương thức trong lớp con
 *
 * sử dung trong trường hợp muốn sử dụng phương thức của lớp cha ở lớp con
 * hoặc trong trường hợp cần sử dụng phương thức của lớp cha, nhưng lớp con cũng có phương thức trùng tên (overriding)
 *
 */

class Person {
    void message() {
        System.out.println("Welcome !!!");
    }
}

public class Student12 extends Person{
    @Override
    void message() {
        System.out.println("Welcome to Java !!!");
    }

    void Display() {
        super.message();
        message();
    }

    public static void main(String[] args) {
        Student12 student12 = new Student12();
        student12.Display();
    }
}
