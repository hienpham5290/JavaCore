package _44_Collection_Framework._17_HashMap_to_ArrayList;

import java.util.*;

public class HashMap_to_ArrayList_Example {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");

        // lấy Set các key của HashMap truyền vào ArrayList
        // sử dụng keySet() method
        Set<Integer> keySet = hashMap.keySet();

        // truyền Set các key của HashMap vào ArrayList
        List<Integer> keyList = new ArrayList<>(keySet);
        System.out.println("keyList: " + keyList);
        System.out.println("-------------------------------------------");

        // lấy Collection các value của HashMap truyền vào ArrayList
        // sử dụng values() method
        Collection<String> valueCollection = hashMap.values();

        // truyền Collection các value của HashMap vào ArrayList
        List<String> valueList = new ArrayList<>(valueCollection);
        System.out.println("valueList: " + valueList);
        System.out.println("-------------------------------------------");

        // lấy Set các entry của HashMap truyền vào ArrayList
        // sử dụng entrySet() method
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

        // truyền Set các entry của HashMap vào ArrayList
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(entrySet);
        System.out.println("entryList: " + entryList);
    }
}
