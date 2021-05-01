package _44_Collection_Framework._14_Collections_class;

/*
    ngoại trừ đối tượng của Vector hay Hashtable là synchronized ngầm định
    để có đối tượng synchronized từ các class khác trong Collection Framework
    ta sử dụng method
        - Collections.synchronizedCollection()
        -> trả về 1 đối tượng của collection tương ứng đã được synchronized
 */

import java.util.*;

public class _16_synchronizedCollection_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("elements of list: " + list);
        System.out.println("elements of synchronizedList: " + synchronizedList);
        list.add(30);
        System.out.println("list add more element: 30");
        System.out.println("elements of list: " + list);
        System.out.println("elements of synchronizedList: " + synchronizedList);
        System.out.println("-----------------------------------------------------------");

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        Set<String> synchronizedSet = Collections.synchronizedSet(set);
        System.out.println("elements of set: " + set);
        System.out.println("elements of synchronizedSet: " + synchronizedSet);
        set.add("three");
        System.out.println("set add \"three\"");
        System.out.println("elements of set: " + set);
        System.out.println("elements of synchronizedSet: " + synchronizedSet);
        System.out.println("-----------------------------------------------------------");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        System.out.println("elements of map: " + map);
        System.out.println("elements of synchronizedMap: " + synchronizedMap);
        map.put(3, "three");
        System.out.println("map add \"3-three\"");
        System.out.println("elements of map: " + map);
        System.out.println("elements of synchronizedMap: " + synchronizedMap);
    }
}
