package _43_Java_Generic._07_WildCard_Generic._01_Upper_Bounded_WildCard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCard {
    public static void main(String[] args) {
        // Upper Bounded Integer List
        List<Integer> list1= Arrays.asList(4,5,6,7);

        // show tổng các phần tử trong list, sử dụng method
        // sum có sử dụng wildcard
        System.out.println("sum of list1 = " + sum(list1));

        //Double list
        List<Double> list2=Arrays.asList(4.1,5.1,6.1);

        //printing the sum of elements in list
        System.out.print("Total sum is:"+sum(list2));
    }

    // Generic Method sử dụng WildCard (ký tự đại diện)
    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
