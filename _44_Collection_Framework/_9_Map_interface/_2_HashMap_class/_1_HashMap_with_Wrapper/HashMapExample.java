package _44_Collection_Framework._9_Map_interface._2_HashMap_class._1_HashMap_with_Wrapper;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "C");
        map.put(3, "Kotlin");
        map.put(4, "C++");
        map.put(5, "Javascript");

        System.out.println("Show map with keySet()");
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
        System.out.println("-------------------------------------------");
        System.out.println("Show map with entrySet()");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
