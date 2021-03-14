package _43_Java_Generics.Generic_Class._3;

// lớp này mở rộng ( extends ) từ KeyValue class
// và chỉ định rõ kiểu tham chiếu của K, V trong KeyValue class
// K = Integer
// V = String

public class PhoneNameEntry extends KeyValue<Integer, String> {
    public PhoneNameEntry(Integer phoneNumber, String name) {
        super(phoneNumber, name);
    }
}
