package _43_Java_Generics.Generic_Method;

import java.util.ArrayList;

public class MyUtils {
    // method này có 2 tham số Generic là <K, V>
    // return data type : K
    // truyền vào 1 object thuộc kiểu KeyValue<K, V>
    // trả về 1 object kiểu K
    public static <K, V> K getKey(KeyValue<K, V> entry) {
        K key = entry.getKey();
        return key;
    }

    // method này có 2 tham số Generic là <K, V>
    // return data type : V
    // truyền vào 1 object thuộc kiểu KeyValue<K, V>
    // trả về 1 object kiểu V
    public static <K, V> V getValue(KeyValue<K, V> entry) {
        V value = entry.getValue();
        return value;
    }

    // method này có 1 tham số Generic là <E>
    // return data type : E
    // truyền vào 1 danh sách mảng kiểu ArrayList<E>
    // trả về 1 object kiểu E
    public static <E> E getFirstElement(ArrayList<E> list) {
        if ((list == null) || list.isEmpty()) {
            return null;
        }
        E firstElements = list.get(0);
        return firstElements;
    }
}
