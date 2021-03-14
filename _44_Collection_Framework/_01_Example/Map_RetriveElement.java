package _44_Collection_Framework._01_Example;

import java.util.Map;
import java.util.HashMap;

public class Map_RetriveElement {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < NUM_OF_ELEMENT; i++) {
            hashMap.put("key0" + i, i);
        }

        System.out.print("Using keySet() method: ");
        for (String key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            System.out.print(key + "=" + value + ", ");
        }

        System.out.println();
        System.out.print("Using entrySet() method: ");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(key + "=" + value + ", ");
        }
    }
}
