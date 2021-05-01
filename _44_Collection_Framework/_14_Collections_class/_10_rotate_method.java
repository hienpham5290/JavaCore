package _44_Collection_Framework._14_Collections_class;

/*
    Xoay các phần tử trong list, sử dụng phương thức
    - Collections.rotate(List<?> list, int distance)
        - list: danh sách chỉ định
        - distance: khoảng cách hay số lượng phần tử dùng để xoay
    - nếu xem các phần tử trong list, được sắp xếp theo 1 vòng tròn, trong
    đó, bắt đầu là phần tử index=0, ..., đến index cuối, thì tham số distance
    là khoảng cách hay số phần tử sẽ được lấy thay vào vị trí index=0
    ví dụ: size() = 10, index[0 - 9], distance=3, => phần tử từ index=size(10)-distance(3)=7
    đến phần tử index=9 sẽ được đưa về đầu list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _10_rotate_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        // show list
        System.out.println("before rotate: " + list);

        // rotate list
        Collections.rotate(list, 3);
        System.out.println("distance=3: " + list);
    }
}
