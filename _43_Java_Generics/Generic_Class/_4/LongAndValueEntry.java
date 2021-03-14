package _43_Java_Generics.Generic_Class._4;

// class này mở rộng ( extends ) từ KeyValue class
// V - Generic Type vẫn giữ lại, trong cú pháp khai báo Subclass vẫn khai báo lại
// chỉ có Generic Type được chỉ định rõ Reference Type sẽ khai báo rõ sau Superclass
// trong cú pháp khai báo extends
// Generic Type V đổi thành String type

public class LongAndValueEntry<V> extends KeyValue<Long, V> {
    public LongAndValueEntry(Long key, V value) {
        super(key, value);
    }
}
