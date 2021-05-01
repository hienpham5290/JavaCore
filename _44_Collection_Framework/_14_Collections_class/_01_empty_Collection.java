package _44_Collection_Framework._14_Collections_class;

/*
    Sử dụng các thuộc tính EMPTY và các phương thức empty() của Collections Class
    để khởi tạo các Collection empty (rỗng) và immutable (không thể thay đổi)
    - Collections.EMPTY_LIST
    - Collections.EMPTY_SET
    - Collections.EMPTY_MAP
    - Collections.emptyList()
    - Collections.emptySet()
    - Collections.emptyMap()
 */

import java.util.*;

public class _01_empty_Collection {
    public static void main(String[] args) {
        /*
        khởi tạo List, Set, Map thông qua các
        thuộc tính EMPTY của Collections class
         */
        List<Integer> list1 = Collections.EMPTY_LIST;
        Set<Integer> set1 = Collections.EMPTY_SET;
        Map<Integer, String> map1 = Collections.EMPTY_MAP;

        /*
        không thể thêm (add/put) element vào các empty collection
        UnsupportedOperationException sẽ bị ném ra
         */
//        list1.add(10);
//        set1.add(20);
//        map1.put(1, "One");

        /*
         khởi tạo List, Set, Map thông qua các phương
         thức empty() của Collections class
         */
        List<Integer> list2 = Collections.emptyList();
        Set<Integer> set2 = Collections.emptySet();
        Map<Integer, String> map2 = Collections.emptyMap();

        /*
        không thể thêm (add/put) element vào các empty collection
        UnsupportedOperationException sẽ bị ném ra
         */
//        list2.add(10);
//        set2.add(20);
//        map2.put(1, "One");

        /*
        sau khi tham chiếu đến instance với toán tử new
        mọi hoạt động sẽ bình thường với collection tương ứng
         */
        list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        map2 = new HashMap<>();
        map2.put(1, "one");
        map2.put(2, "two");
    }
}
