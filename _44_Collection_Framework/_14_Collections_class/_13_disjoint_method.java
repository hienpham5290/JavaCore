package _44_Collection_Framework._14_Collections_class;

/*
    Sử dụng phương thức:
    - Collections.disjoint(list1, list2)
    để kiểm tra 2 list không chứa phần tử giống nhau đúng hay sai
    disjoint <=> không có giao nhau, ở đây là không chứa phần tử giống nhau

    kết quả trả về là giá trị boolean:
    - true: nếu 2 list không chứa phần tử giống nhau
    - false: nếu 2 list có chứa phần tử giống nhau
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _13_disjoint_method {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(40);
        list2.add(20);

        List<Integer> list3 = new ArrayList<>();
        list3.add(60);
        list3.add(40);
        list3.add(50);

        System.out.println("Elements of list1: " + list1);
        System.out.println("Elements of list2: " + list2);
        System.out.println("Elements of list3: " + list3);

        boolean exist;
        exist = Collections.disjoint(list1, list2);
        System.out.println("list1 & list2, disjoint ? : " + exist);

        exist = Collections.disjoint(list1, list3);
        System.out.println("list1 & list3, disjoint ? : " + exist);
    }
}
