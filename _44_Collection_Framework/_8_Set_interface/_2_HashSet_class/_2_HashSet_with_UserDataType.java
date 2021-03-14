package _44_Collection_Framework._8_Set_interface._2_HashSet_class;

import java.util.HashSet;
import java.util.Set;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student [id= " + id + ", name= " + name + " ]";
    }
}

public class _2_HashSet_with_UserDataType {
    public static void main(String[] args) {
        Set<Student> studentHashSet = new HashSet<Student>();
        Student student1 = new Student(1, "AAA");
        Student student2 = new Student(2, "BBB");
        Student student3 = new Student(3, "CCC");
        Student student4 = new Student(4, "DDD");
        Student student5 = new Student(5, "EEE");

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
        studentHashSet.add(student1);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        for (Student item :
                studentHashSet) {
            System.out.println(item);
        }
    }
}
