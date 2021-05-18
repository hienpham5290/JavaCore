package _43_Java_Generic._07_WildCard_Generic._04_Wildcard_Object;

import java.util.ArrayList;
import java.util.List;

public class WildcardObjectExample {
    public static void main(String[] args) {
        // khởi tạo 1 List chứa các phần tử kiểu String
        List<String> stringList = new ArrayList<>();

        // sử dụng phương thức Generic: add(E)
        // thêm phần tử khác null vào List
        stringList.add("Tom");
        stringList.add("Jerry");

        // thêm phần tử null vào List
        stringList.add(null);
        System.out.println("stringList: " + stringList);

        // khai báo 1 đối tượng chứa các phần tử là Wildcard
        List<? extends Object> wildcardList = stringList;

        // sử dụng phương thức Generic: add(E)
        // đối tượng kiểu Wildcard không thể sử dụng phương
        // thức Generic add(E) để
        // thêm phần tử khác null vào đối tượng kiểu Wildcard
//        wildcardList.add("Cat"); // Error

        // đối tượng kiểu Wildcard vẫn có thể sử dụng phương
        // thức Generic add(E) để thêm phần tử null
        wildcardList.add(null);
        wildcardList.add(null);
        System.out.println("wildcardList: " + wildcardList);
    }
}
