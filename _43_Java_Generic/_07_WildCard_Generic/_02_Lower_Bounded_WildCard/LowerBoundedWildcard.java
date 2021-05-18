package _43_Java_Generic._07_WildCard_Generic._02_Lower_Bounded_WildCard;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // Integer list1 object is being passed
        printOnlyIntegerOrSuperClass(list1);

        // Number List
        List<Number> list2 = Arrays.asList(1, 3, 4, 5, 6);
        printOnlyIntegerOrSuperClass(list2);
    }

    // wildcard chỉ nhận Integer hoặc các superclass của Integer
    // ví dụ: Double là không thể, vì Integer và Double không liên quan kế thừa
    public static void printOnlyIntegerOrSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }
}
