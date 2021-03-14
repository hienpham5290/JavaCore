package _44_Collection_Framework._5_Iterator_interface;

import java.util.ArrayList;
import java.util.List;

public class _2_remove_element_with_for {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("0" + i);
        }
        for (int i = 0; i < 5; i++) {
            // dòng code dưới đây sẽ ném ra IndexOutOfBoundsException
            // vì khi xóa phần tử trong lúc duyệt về cuối list (foward)
            // sẽ xung đột với lệnh for, vì mỗi khi xóa 1 phần tử
            // size() của list sẽ giảm đi 1
//            list.remove(i);
        }
    }
}
