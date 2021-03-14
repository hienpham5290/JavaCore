package _16_Final_Method;

/**
 * phương thức final
 *
 * trong quan hệ kế thừa, nếu một phương thức ở lớp cha có thuộc tính là final
 * thì ở lớp con không thể ghi đè phương thức đó, lớp con chỉ có thể tái sử dụng nhưng không được ghi đè
 *
 * phương thức final chẳng ảnh hưởng gì đến overloading
 *
 */

class Person {
    final void CheckPerson() {
        System.out.println("This is a person");
    }

    // overloading
    void CheckPerson(int i) {
        System.out.println(i);
    }
}

public class Student16 extends Person {

    // ở đây sẽ báo lỗi vì đã ghi đè phương thức final ở lớp cha
    // nếu muốn tiếp tục ghi đè phương thức ở lớp cha, thì phương thức bị ghi đè phải bỏ final
//    @Override
//    final void CheckPerson() {
//        System.out.println("This is a student");
//    }
    public static void main(String[] args) {
        Student16 student16 = new Student16();
        student16.CheckPerson(5);
        student16.CheckPerson();
    }
}
