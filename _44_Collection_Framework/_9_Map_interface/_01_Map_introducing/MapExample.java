package _44_Collection_Framework._09_Map_interface._1_Map_introducing;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Basic Java");
        map.put(2, "OOP");
        map.put(3, "Collection");

        System.out.println("Show map using keySet()");
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
        System.out.println("-------------------------------------");

        System.out.println("Show map using entrySet()");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
