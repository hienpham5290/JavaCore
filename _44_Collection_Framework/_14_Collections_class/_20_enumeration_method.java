package _44_Collection_Framework._14_Collections_class;

/*
    sử dụng Collections.enumeration(list) để duyệt các phần tử của list thông qua Enumeration
    sử dụng Collections.enumeration(set) để duyệt các phần tử của set thông qua Enumeration
 */
import java.util.*;

public class _20_enumeration_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list's elements: " + list);

        // khởi tạo đối tương của Enumeration từ List
        Enumeration<Integer> enumerationList = Collections.enumeration(list);
        // duyệt phần tử của đối tượng Enumeration
        System.out.print("enumerationList's elements: ");
        while (enumerationList.hasMoreElements()) {
            Object object = enumerationList.nextElement();
            System.out.print(object + " ");
        }
        System.out.println("\n-------------------------------------------------");

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        System.out.println("set's elements: " + set);

        // khởi tạo đối tượng của Enumeration từ Set
        Enumeration<String> enumerationSet = Collections.enumeration(set);
        // duyệt phần tử của đối tượng Enumeration
        System.out.print("enumerationSet's elements: ");
        while (enumerationSet.hasMoreElements()) {
            Object object = enumerationSet.nextElement();
            System.out.print(object + " ");
        }
    }
}
