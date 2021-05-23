package _45_Java_IO._01_Serialization_Deserialization._02_Serializabl_Inheritance;

import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersioUID = 1234567890L;

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
