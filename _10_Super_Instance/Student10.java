package _10_Super_Instance;

/**
 * super
 *
 * tham chiếu biến instance ở lớp cha gần nhất
 *
 */

class Person {
    String ethnic = "Asian";
}

public class Student10 extends Person{
    String ethnic = "European";

    void Display() {
        System.out.println(super.ethnic); // nếu không có super, ở đây sẽ gọi thuộc tính của lớp hiện tại
    }


    public static void main(String[] args) {
        Student10 student10 = new Student10();
        System.out.println(student10.ethnic); // European
        student10.Display(); // Asian
    }
}
