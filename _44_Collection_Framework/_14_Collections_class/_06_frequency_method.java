package _44_Collection_Framework._14_Collections_class;

/*
    Sử dụng Collections.frequency(list, key) để đếm tần suất của key
    trong list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _06_frequency_method {
    public static void main(String[] args) {
        // khởi tạo ArrayList
        List<Integer> list = new ArrayList<>();

        // thêm phần tử vào ArrayList
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        // show ArrayList
        System.out.println("list: " + list);

        // sử dụng Collections.frequency(list, key)
        System.out.println("frequency of 10: " + Collections.frequency(list, 10));
        System.out.println("frequency of 20: " + Collections.frequency(list, 20));
        System.out.println("frequency of 30: " + Collections.frequency(list, 30));
    }
}
