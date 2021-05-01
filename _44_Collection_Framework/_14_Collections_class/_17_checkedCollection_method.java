package _44_Collection_Framework._14_Collections_class;

import java.util.*;

public class _17_checkedCollection_method {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("list1's elements: " + list1);

        List list2 = Collections.checkedList(list1, Integer.class);
        System.out.println("list2's elements: " + list2);
        list1.add("list1");
        System.out.println("list1 add: " + list1);
//        list2.add("list2"); // throw ClassCastException
        System.out.println("list2's elements: " + list2);
        System.out.println("---------------------------------------------------------");

        Set set1 = new HashSet();
        set1.add("one");
        set1.add("two");
        set1.add("three");
        System.out.println("set1's elements: " + set1);

        Set set2 = Collections.checkedSet(set1, String.class);
        System.out.println("set2's elements: " + set2);
        set1.add(1);
        System.out.println("set1 add: " + set1);
//        set2.add(2); // throw ClassCastException
        System.out.println("set2's elements: " + set2);
        System.out.println("---------------------------------------------------------");

        Map map1 = new HashMap();
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        System.out.println("map1's elements: " + map1);
        Map map2 = Collections.checkedMap(map1, Integer.class, String.class);
        System.out.println("map2's elements: " + map2);
        map1.put("4", "four");
        System.out.println("map1 add: " + map1);
//        map2.put("5", "five"); // throw ClassCastException
        System.out.println("map2's elements: " + map2);
    }
}
