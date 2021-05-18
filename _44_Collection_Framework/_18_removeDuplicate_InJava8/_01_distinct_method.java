package _44_Collection_Framework._18_removeDuplicate_InJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _01_distinct_method {
    public static void main(String[] args) {
        List<String> listWithDuplicate = new ArrayList<>();
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("J2EE");
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("J2EE");
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("ANDROID");
        listWithDuplicate.add("JAVA");

        List<String> listWithoutDuplicate = listWithDuplicate
                .stream() // đưa vào stream
                .distinct() // return stream các phần tử không trùng lặp
                .collect(Collectors.toList()); // truyền vào List

        System.out.println(listWithoutDuplicate);
    }
}
