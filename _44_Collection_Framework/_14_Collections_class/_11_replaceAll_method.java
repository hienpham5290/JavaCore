package _44_Collection_Framework._14_Collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Tìm kiếm và thay thế phần tử trong list, với phương thức
    - Collections.replaceAll(List<T> list, T oldVal, T newVal);
 */
public class _11_replaceAll_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        // show list
        System.out.println("before replaceAll: " + list);

        // replaceAll
        boolean booVarReplaceSuccess = Collections.replaceAll(list, 20, 999);
        System.out.println("replace success: " + booVarReplaceSuccess);
        System.out.println("after replace: " + list);

        booVarReplaceSuccess = Collections.replaceAll(list, 40, 200);
        System.out.println("replace success: " + booVarReplaceSuccess);
        System.out.println("after replace: " + list);
    }
}
