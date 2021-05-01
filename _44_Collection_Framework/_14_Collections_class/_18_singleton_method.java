package _44_Collection_Framework._14_Collections_class;

/*
 * để có được 1 lớp Singleton từ 1 lớp Collection chung, chúng ta sử dụng
    * Collections.singletonList(element) -> dùng cho List
    * Collections.singleton(element) -> dùng cho Set
    * Collections.singletonMap(key, value) -> dùng cho Map
 */

import java.util.*;

public class _18_singleton_method {
    public static void main(String[] args) {
        List<Integer> singletonList = Collections.singletonList(10);
        System.out.println("singletonList's element: " + singletonList);
//        singletonList.add(20); // throw UnsupportedOperationException

        Set<String> singletonSet = Collections.singleton("one");
        System.out.println("singletonSet's element: " + singletonSet);
//        singletonSet.add("two"); // throw UnsupportedOperationException

        Map<Integer, String> singletonMap = Collections.singletonMap(1, "one");
        System.out.println("singletonMap's element: " + singletonMap);
//        singletonMap.put(2, "two"); // throw UnsupportedOperationException
    }
}
