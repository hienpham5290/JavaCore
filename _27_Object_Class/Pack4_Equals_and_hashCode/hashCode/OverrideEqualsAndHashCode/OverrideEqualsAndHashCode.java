package _27_Object_Class.Pack4_Equals_and_hashCode.hashCode.OverrideEqualsAndHashCode;

/**
 * ghi đè cả 2 method equals() và hashCode() trong Student class
 *
 * hash value trả về là hash value của id, id là duy nhất của mỗi đối tượng
 *
 */

import java.util.HashSet;
import java.util.Set;

public class OverrideEqualsAndHashCode {
    public static void main(String[] args) {
        Student student1 = new Student("111", "Quang Hien", "quanghien@gmail.com", 30);
        Student student2 = new Student("222", "Quang Hieu", "quanghieu@gmail.com", 27);
        Student student3 = new Student("333", "Quang Tien", "quangtien@gmail.com", 26);
        Student student4 = new Student("333", "Quang Khai", "quangkhai@gmail.com", 1);

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);

        System.out.println("In ra các đối tượng sau khi đã được thêm vào bằng Set");
        for (Student student : studentSet) {
            System.out.println(student.toString());
        }

        System.out.println("In ra hash value của mỗi đối tượng dựa trên hash value của id");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println("ta thấy student3 và student4 có cùng hash value, do hashCode() đã được override trong class Student dựa trên id");

        System.out.println();
        Student searchStudent1 = new Student("666", "Quang Hieu", "quanghieu@gmail.com", 27);
        Student searchStudent2 = new Student("222");
        System.out.println(studentSet.contains(searchStudent1)); // false - do khác id, nên tập Set coi đây là đối tượng khác
        System.out.println(studentSet.contains(searchStudent2)); // true - do trùng id, nên tập Set coi đây là đối tượng đã có trong tập hợp Set
    }
}
