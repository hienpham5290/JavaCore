package _27_Object_Class.Pack4_Equals_and_hashCode.hashCode.OverrideEqualsNonHashCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Ghi đè equals() nhưng không ghi đè hashCode()
 *
 * Xem xét equals() và hashCode() ảnh hưởng như thế nào đến hành vi của đối tượng Set
 *
 */

public class OverrideEqualsNonHashCode {
    public static void main(String[] args) {
        Student student1 = new Student("111", "Quang Hien", "quanghien@gmail.com", 30);
        Student student2 = new Student("222", "Quang Hieu", "quanghieu@gmail.com", 27);
        Student student4 = new Student("222", "Quang Hieu", "quanghieu@gmail.com", 27);
        Student student3 = new Student("333", "Quang Tien", "quangtien@gmail.com", 26);

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);

        for (Student student : studentSet) {
            System.out.println(student.toString());
        }
    }
}
