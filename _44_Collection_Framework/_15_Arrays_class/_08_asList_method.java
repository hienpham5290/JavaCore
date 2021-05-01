package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _08_asList_method {
    public static void main(String[] args) {
        Integer[] integers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("integers: " + Arrays.toString(integers));
        List<Integer> list = Arrays.asList(integers);
        System.out.println("list: " + list);

        Collections.sort(list);
        System.out.println("list after sort: " + list);
        System.out.println("integer after sorting list: " + Arrays.toString(integers));

        Collections.fill(list, 90);
        System.out.println("list after fill: " + list);
        System.out.println("integers after filling list: " + Arrays.toString(integers));

        list.set(0, 1);
        System.out.println("list after set: " + list);
        System.out.println("integers after set list: " + Arrays.toString(integers));

//        list.add(77); // throw UnsupportedOperationException
//        list.remove(5); // throw UnsupportedOperationException
    }
}
