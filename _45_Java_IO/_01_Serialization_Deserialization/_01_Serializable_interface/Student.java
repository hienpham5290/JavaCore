package _45_Java_IO._01_Serialization_Deserialization._01_Serializable_interface;

import java.io.Serializable;

public class Student implements Serializable {
    // serialVersionUID có thể được khởi tạo thủ công
    // hoặc sẽ mặc định được tạo bởi JVM (JVM ở thiết bị khác
    // có thể sẽ khởi tạo ra serialVersionUID có giá trị khác)
    public static final long serialVersionUID = 1234567890L;

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
