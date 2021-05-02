package _44_Collection_Framework._16_removeDuplicateInArrayList;

import java.util.ArrayList;
import java.util.List;

public class _01_for_each_and_contains_method {
    public static void main(String[] args) {
        List<String> duplicateList = new ArrayList<>();
        duplicateList.add("one");
        duplicateList.add("two");
        duplicateList.add("one");
        duplicateList.add("five");
        duplicateList.add("two");
        duplicateList.add("two");
        duplicateList.add("three");
        duplicateList.add("three");
        duplicateList.add("four");
        duplicateList.add("five");
        duplicateList.add("one");
        duplicateList.add("five");
        duplicateList.add("four");
        System.out.println("duplicateList: " + duplicateList);

        // khởi tạo ArrayList đích dùng để chứa các phần tử không
        // trùng lặp
        List<String> nonDuplicateList = new ArrayList<>();

        // sử dụng for-each loop
        for (String e : duplicateList) {
            // kiểm tra nonDuplicateList đã có phần tử đang duyệt
            // hay chưa
            if (!nonDuplicateList.contains(e)) {
                nonDuplicateList.add(e);
            }
        }

        // show nonDuplicateList
        System.out.println("nonDuplicateList: " + nonDuplicateList);
    }
}
