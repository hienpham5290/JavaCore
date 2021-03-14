package _44_Collection_Framework._05_Iterator_interface;

import java.util.ArrayList;
import java.util.List;

public class _4_remove_element_with_foreach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("0" + i);
        }
        // for-each dưới đây sẽ ném ConcurrentModificationException
        // nếu sử dụng for-each để vừa duyệt list vừa xóa phần tử
        for (String item :
                list) {
//            list.remove(item);
        }
        System.out.println(list.isEmpty());
    }
}
