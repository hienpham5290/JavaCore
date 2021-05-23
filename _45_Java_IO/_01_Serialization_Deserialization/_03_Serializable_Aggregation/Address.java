package _45_Java_IO._01_Serialization_Deserialization._03_Serializable_Aggregation;

public class Address{
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}
