package _44_Collection_Framework._09_Map_interface._03_LinkedHashMap_class;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_with_Wrapper {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "BasicJava");
        map.put("2", "OOP");
        map.put("3", "Multi-Thread");
        map.put("4", "Collection");

        // Show map using keySet()
        System.out.println("Using map.keySet()");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println();

        // Show map using map.entrySet()
        System.out.println("Using map.entrySet()");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
