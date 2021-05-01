package _44_Collection_Framework._14_Collections_class;

/*
    sử dụng các phương thức thống kê tìm kiếm sắp xếp cho
    kiểu dữ liệu String, Wrapper (những kiểu đã implements Comparable)
    - Collections.min(),
    - Collections.max(),
    - Collections.binarySearch(),
    - Collections.sort(),
    - Collections.reverse(),
    - Collections.reverseOrder().
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _03_min_max_binarySearch_sort_reverse_reverseOder {
    public static void main(String[] args) {
        // khởi tạo ArrayList
        List<Integer> list = new ArrayList<>();

        // thêm phần tử vào ArrayList
        list.add(46);
        list.add(67);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);

        // show collection
        System.out.println("list: " + list);

        // get max value của collection với Collection class
        System.out.println("Maximum value: " + Collections.max(list));

        // lấy min value của collection với Collections class
        System.out.println("Minimum value: " + Collections.min(list));

        // get index của value chỉ định trong collection với Collections class
        // với value là kiểu Wrapper đã implements Comparable
        System.out.println("Index of 24: " + Collections.binarySearch(list, 24));
        System.out.println("Index of 10: " + Collections.binarySearch(list, 10));

        // sort collection chỉ định với phương thức của Collections class
        // với element của collection thuộc kiểu Wrapper đã implements Comparable
        Collections.sort(list);
        System.out.println("list after sort: " + list);

        // reverse (đảo ngược) collection với phương thức của Collections class
        // với element của collection thuộc kiểu Wrapper đã implements Comparable
        Collections.reverse(list);
        System.out.println("list after reverse: " + list);

        // lấy bộ Comparator, có thứ tự đảo ngược với trật tự tự nhiên của kiểu Wrapper
        // kiểu Wrapper này chính là kiểu của element trong collection
        Comparator<Integer> compareDesc = Collections.reverseOrder();

        // sort lại collection theo Comparator mới
        // ở trên, collection sau khi sort tăng dần, đã bị reverse thành giảm dần
        // Comparator mới là đảo ngược với trật tự tự nhiên là giảm dần
        // việc sort lại collection đang giảm dần theo bộ Comparator giảm dần sẽ
        // không thay đổi gì, collection vẫn sẽ được sort theo giảm dần
        Collections.sort(list, compareDesc);
        System.out.println("list after sort with compareDesc: " + list);

        // lấy bộ Comparator, có thứ tự ngược lại với trật tự của Comparator chỉ định
        // CompareDesc có thứ tự ngược với trật tự tự nhiên là giảm dần
        // việc lấy Comparator ngược với compareDesc sẽ có trật tự là tăng dần
        Comparator<Integer> compareAsc = Collections.reverseOrder(compareDesc);

        // sort lại  collection theo Comparator mới là compareAsc, có trật tự tăng dần
        // collection phía trên hiện đang có trật tự giảm dần, việc sort lại sẽ đảo
        // trật tự của collection
        Collections.sort(list, compareAsc);
        System.out.println("list after sort with compareAsc: " + list);
    }
}