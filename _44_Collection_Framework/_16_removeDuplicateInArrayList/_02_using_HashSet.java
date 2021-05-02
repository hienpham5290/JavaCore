package _44_Collection_Framework._16_removeDuplicateInArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _02_using_HashSet {
    public static void main(String[] args) {
        List<Integer> duplicateList = new ArrayList<>();
        duplicateList.add(5);
        duplicateList.add(5);
        duplicateList.add(4);
        duplicateList.add(4);
        duplicateList.add(3);
        duplicateList.add(3);
        duplicateList.add(2);
        duplicateList.add(2);
        duplicateList.add(1);
        duplicateList.add(1);
        System.out.println("duplicateList: " + duplicateList);

        // khởi tạo HashSet, tham số đầu vào là duplicateList
        Set<Integer> set = new HashSet<>(duplicateList);
        System.out.println("HashSet: " + set);

        // khởi tạo ArrayList chứa các phần tử không trùng lặp
        // tham số đầu vào là HashSet
        List<Integer> nonDuplicateList = new ArrayList<>(set);
        System.out.println("nonDuplicateList: " + nonDuplicateList);
    }
}
