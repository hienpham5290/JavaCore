package _44_Collection_Framework._14_Collections_class;

/*
    thực hiện khởi tạo 1 collection không thể thay đổi bởi người dùng, sử dụng method
        - Collections.unmodifiableCollection(collection gốc);
    unmodifiableCollection chỉ bị thay đổi khi collection gốc của nó thay đổi
    (do hiện tại nó đang tham chiếu đến collection gốc)
 */

import java.util.*;

public class _15_unmodifiableCollection_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("elements of unmodifiableList: " + unmodifiableList);

        // change unmodifiableList
//        unmodifiableList.add(50); // throw UnsupportedOperationException

        System.out.println("elements of list: " + list);
        list.add(50);
        System.out.println("elements of list after adding number 50: " + list);
        System.out.println("elements of unmodifiableList: " + unmodifiableList);

        System.out.println("-------------------------------------------------");
        Set<String> set = new HashSet<>();
        set.add("JavaBasic");
        set.add("JavaCore");
        set.add("SQLite");
        set.add("Android");

        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
        System.out.println("elements of unmodifiableSet: " + unmodifiableSet);

        // change unmodifiableSet
//        unmodifiableSet.add("HelloWorld"); // throw UnsupportedOperationException

        System.out.println("elements of set: " + set);
        set.add("SeniorAndroid");
        System.out.println("elements of set after adding \"SeniorAndroid\": " + set);
        System.out.println("elements of unmodifiableSet: " + unmodifiableSet);

        System.out.println("-------------------------------------------------");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println("elements of unmodifiableMap: " + unmodifiableMap);

        // change unmodifiableMap
//        unmodifiableMap.put(4, "four"); // throw UnsupportedOperationException

        System.out.println("elements of map: " + map);
        map.put(5, "five");
        System.out.println("elements of map after adding 5-five: " + map);
        System.out.println("elements of unmodifiableMap: " + unmodifiableMap);
    }
}
