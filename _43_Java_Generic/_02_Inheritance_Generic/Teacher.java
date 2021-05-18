package _43_Java_Generic._02_Inheritance_Generic;

/*
    Teacher<K, V> extends Person<K, V>
    và giữ nguyên các tham số Generics
 */
public class Teacher<K, V> extends Person<K, V> {
    public Teacher(K key, V value) {
        super(key, value);
    }
}
