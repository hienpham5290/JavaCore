package _38_StringBuilder_Class;

/**
 * toString từ Object class
 */

public class Student {
    int rollno;
    String name;
    String city;

    Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public static void main(String args[]) {
        Student s1 = new Student(101, "Viet", "HaNoi");
        Student s2 = new Student(102, "Nam", "DaNang");

        // trình biên dịch sẽ ghi s1.toString() thay vì s1
        // có nghĩa là khi khai báo s1 thì phương thức s1.toString()
        // được gọi
        System.out.println(s1); // Oop38_StringBuilder_Class.Student@6acbcfc0
        // trình biên dịch sẽ ghi s2.toString() thay vì s2
        System.out.println(s2); // Oop38_StringBuilder_Class.Student@5f184fc6
    }
}
