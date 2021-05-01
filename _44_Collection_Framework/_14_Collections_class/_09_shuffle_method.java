package _44_Collection_Framework._14_Collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
    Sử dụng phương thức xáo trộn các phần tử trong 1 collection
    - Collections.shuffle(List<?> list) -> trộn ngẫu nhiên theo nguồn mặc định
        - throw UnsupportedOperationException nếu list hoặc list-iterator không hỗ trợ hoạt động set
    - Collections.shuffle(List<?> list, Random random) -> trộn ngẫu nhiên theo nguồn chỉ định
        - throw UnsupportedOperationException nếu list hoặc list-iterator không hỗ trợ hoạt động set

    - 
 */
public class _09_shuffle_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("before shuffle, list: " + list);

        // shuffle list
        Collections.shuffle(list);
        System.out.println("after shuffle, list: " + list);

        // shuffle list with Random
        Collections.shuffle(list, new Random());
        System.out.println("after shuffle with Random object, list: " + list);

        Collections.shuffle(list, new Random(2));
        System.out.println("after shuffle with Random object, list: " + list);
    }
}
