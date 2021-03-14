package _43_Java_Generics.Generic_Class._1;

public class KeyValue<K, V> {
    // attributes
    private K key;
    private V value;

    // constructors
    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value = value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
