package _44_Collection_Framework._16_removeDuplicateInArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _03_using_LinkedHashSet {
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

        // khởi tạo LinkedHashSet làm cấu trúc trung gian
        // tham số đầu vào là duplicateList
        Set<Integer> linkedHashSet = new LinkedHashSet<>(duplicateList);
        System.out.println("linkedHashSet: " + linkedHashSet);

        // khởi tạo ArrayList đích chứa các phần tử không trùng lặp
        // tham số đầu vào là linkedHashSet
        List<Integer> nonDuplicateList = new ArrayList<>(linkedHashSet);
        System.out.println("nonDuplicateList: " + nonDuplicateList);
    }
}
