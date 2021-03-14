package _44_Collection_Framework._09_Map_interface._04_TreeMap_class;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_with_Wrapper {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Basic Java");
        map.put(3, "Multi-Thread");
        map.put(2, "OOP");
        map.put(4, "Collection");

        // Show map with keySet()
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println();

        // Show map with entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
