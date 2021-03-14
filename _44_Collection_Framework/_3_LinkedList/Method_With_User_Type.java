package _44_Collection_Framework._3_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Method_With_User_Type {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        for (int i = 0; i < NUM_OF_ELEMENT; i++) {
            Student student = new Student(i, "student_" + i);
            studentList.add(student);
        }

        for (Student e : studentList) {
            System.out.println(e);
        }
    }
}

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [ id: " + id + ", name: " + name + " ]";
    }
}
