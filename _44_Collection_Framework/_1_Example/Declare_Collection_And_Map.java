package _44_Collection_Framework._1_Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Declare_Collection_And_Map {
    public static final int NUM_OF_ELEMENTS = 5;

    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            arrayList.add("0" + i);
        }
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            linkedList.add("0" + i);
        }
        System.out.println("LinkedList: " + linkedList);

        // HashSet
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            hashSet.add("0" + i);
        }
        System.out.println("HashSet: " + hashSet);

        // Map
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            hashMap.put("key0" + i, i);
        }
        System.out.println("HashMap: " + hashMap.toString());
    }
}
