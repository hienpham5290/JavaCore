package _45_Java_IO._01_Serialization_Deserialization._05_Serializable_transient;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 123321231L;

    transient int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
