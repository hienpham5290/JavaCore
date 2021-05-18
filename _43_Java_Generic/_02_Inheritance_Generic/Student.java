package _43_Java_Generic._02_Inheritance_Generic;

/*
    Student extends Person<String, Integer>
    và chỉ định rõ kiểu dữ liệu thay vì dùng Generics
 */

public class Student extends Person<String, Integer>{
    public Student(String name, Integer id) {
        super(name, id);
    }
}
