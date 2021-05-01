package _44_Collection_Framework._14_Collections_class;

/*
    Tìm vị trí bắt đầu của 1 list con trong list chỉ định.
    dùng phương thức:
        - Collections.indexOfSubList(specifiedList, findList)
            -> trả về index tìm thấy đầu tiên của list cần tìm trong list chỉ định
            -> trả về -1 nếu list cần tìm không có trong list chỉ định
        - Collections.lastIndexOfSubList(specifiedList, findList)
            -> trả về index tìm thấy cuối cùng của list cần tìm trong list chỉ định
            -> trả về -1 nếu list cần tìm không có trong list chỉ định
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _14_indexOfSublist_and_lastIndexOfSubList_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(400);

        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(40);

        System.out.println("list's elements: " + list);
        System.out.println("list1's elements: " + list1);
        System.out.println("list2's elements: " + list2);

        int num1 = Collections.indexOfSubList(list, list1);
        System.out.println("first index of list1 in list: " + num1);

        int num2 = Collections.lastIndexOfSubList(list, list1);
        System.out.println("last index of list1 in list: " + num2);

        int num3 = Collections.indexOfSubList(list, list2);
        System.out.println("first index of list2 in list: " + num3);

        int num4 = Collections.lastIndexOfSubList(list, list2);
        System.out.println("last index of list2 in list: " + num4);
    }
}