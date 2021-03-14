package _44_Collection_Framework._10_Vector_class;

import java.util.List;
import java.util.Vector;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student[id=" + id + ", name=" + name + "]";
    }
}

public class Vector_with_UserDataType {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        // init list
        List<Student> studentList = new Vector<>(NUM_OF_ELEMENT);

        // use for-loop init object & add object into list
        for (int i = 0; i <= NUM_OF_ELEMENT; i++) {
            Student student = new Student(i, "student" + 1);
            studentList.add(student);
        }

        // show list
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
