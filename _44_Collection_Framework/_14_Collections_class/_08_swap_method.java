package _44_Collection_Framework._14_Collections_class;

/*
    sử dụng Collections.swap(list, index1, index2) để hoán
    đổi 2 phần tử trong list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_swap_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(40);
        System.out.println("list before swap: " + list);

        // swap phần tử thứ 0 và thứ 1
        Collections.swap(list, 0, 1);
        System.out.println("list after swap 0 & 1: " + list);

        // swap phần tử thứ 2 và thứ 3
        Collections.swap(list, 2, 3);
        System.out.println("list after swap 2 & 3: " + list);
    }
}
