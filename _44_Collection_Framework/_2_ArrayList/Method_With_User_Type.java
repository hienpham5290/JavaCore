package _44_Collection_Framework._2_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Method_With_User_Type {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < NUM_OF_ELEMENT; i++) {
            studentList.add(new Student(i, "name_" + i));
        }

        // show list
        for (Student student : studentList) {
            System.out.println(student);
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
        return "Student [id = " + this.id + ", name = " + this.name + "]";
    }
}
