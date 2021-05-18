package _43_Java_Generic._07_WildCard_Generic._03_Unbounded_Wildcard;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList1 = Arrays.asList(1.2, 4.4, 2.4, 5.66, 2.333);
        List<String> stringList1 = Arrays.asList("android", "java", "sql");

        printList(integerList1);
        printList(doubleList1);
        printList(stringList1);
    }

    // phương thức sử dụng unbounded wildcard, không giới hạn kiểu dữ liệu của
    // đối số truyền vào
    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
