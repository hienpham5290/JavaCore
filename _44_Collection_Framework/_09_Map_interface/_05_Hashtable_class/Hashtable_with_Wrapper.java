package _44_Collection_Framework._09_Map_interface._05_Hashtable_class;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable_with_Wrapper {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Basic Java");
        ht.put(2, "Java OOP");
        ht.put(3, "Collection");

        // Show by entrySet()
        for (Map.Entry<Integer, String> entry : ht.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------------");

        // Show by keySet()
        for (Integer key : ht.keySet()) {
            String value = ht.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
