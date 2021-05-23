package _45_Java_IO._01_Serialization_Deserialization._04_Serializable_static;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 123454321L;

    static int count;
    int age;
    String name;

    public Student(int count, String name, int age) {
        this.count = count;
        this.name = name;
        this.age = age;
    }
}
