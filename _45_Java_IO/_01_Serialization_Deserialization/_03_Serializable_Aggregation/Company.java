package _45_Java_IO._01_Serialization_Deserialization._03_Serializable_Aggregation;

import java.io.Serializable;

public class Company implements Serializable {
    public static final long serialVersionUID = 1222333333L;

    private int id;
    private String name;
    private Address address; // HAS-A relationship

    public Company(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
