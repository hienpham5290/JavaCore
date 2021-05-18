package _43_Java_Generic._01_Class_Generic;

/*
    định nghĩa 1 class KeyValuePair
    đây là class Generics với 2 kiểu tham số
    là K và V
    K và V sẽ được chỉ định rõ trong khi sử dụng
    đến class KeyValuePair
 */

public class KeyValuePair<K, V> {
    // fields - các trường thuộc tính
    private K key;
    private V value;

    // constructor - hàm khởi tạo
    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // getter
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    // setter
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
