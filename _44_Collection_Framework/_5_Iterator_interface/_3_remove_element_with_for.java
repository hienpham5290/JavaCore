package _44_Collection_Framework._5_Iterator_interface;

import java.util.ArrayList;
import java.util.List;

public class _3_remove_element_with_for {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("0" + i);
        }
        // ta có thể xóa phần tử trong list với for
        // khi ta cho for duyệt phần tử lùi về đầu list (previous)
        // lúc này lệnh for duyệt xong phần tử nào, phần tử đó sẽ bị xóa
        // và không kiểm tra lại lần nữa, nên không xảy ra xung đột
        for (int i = (list.size() - 1); i >= 0  ; i--) {
            list.remove(i);
        }
        System.out.println(list.isEmpty());
    }
}
