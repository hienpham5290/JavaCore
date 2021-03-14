package _23_Protected_AccessModifier.Pack_2;

import _23_Protected_AccessModifier.Pack_1.Person;

/**
 * protected - access modifier trong java
 *
 * chỉ áp dụng cho các fields, constructors, methods
 *
 * không áp dụng cho lớp
 *
 * phạm vi có thể truy cập là từ 1 package khác, với điều kiện có sự kế thừa
 *
 * nghĩa là 1 thành phần được khai báo là protected trong 1 lớp
 * thì 1 thành phần ở lớp khác từ 1 package khác, muốn truy cập đến nó
 * thì giữa 2 lớp của 2 thành phần này phải có sự kế thừa
 *
 * VD: lớp A có phương thức 1 khai báo là protected, nếu lớp B kế thừa lớp A,
 *      thì những phần tử của lớp B có thể gọi phương thức 1 của lớp A, dù lớp B
 *      nằm khác package với lớp A
 */

public class Student23 extends Person {
    private static String uniName = "Ba Dao University";
    private String typeClass;

    public Student23(){
    }

    public Student23(String typeClass) {
        this.typeClass = typeClass;
    }

    public Student23(int id, String name, int age, String typeClass) {
        super(id, name, age);
        this.typeClass = typeClass;
    }

    public void Show() {
        // nếu ShowInfo() ở class Person là default, dòng lệnh dưới đây sẽ báo lỗi,
        // dù kế thừa, nhưng default chỉ cho phép truy cập từ cùng package
        super.ShowInfo();
        System.out.println("CLASS\t: " + this.typeClass);
        System.out.println("UNI\t\t: " + uniName);
    }

    public static void main(String[] args) {
        Student23 student231 = new Student23(90, "Quang Hien", 31, "Java");
        Student23 student232 = new Student23(93, "Quang Hieu", 27, "C++");
        Student23 student233 = new Student23(94, "Quang Tien", 26, "Kotlin");

        student231.ShowInfo();
        student232.Show();
        student233.Show();
    }
}
