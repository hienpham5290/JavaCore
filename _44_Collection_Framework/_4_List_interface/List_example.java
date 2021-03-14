package _44_Collection_Framework._4_List_interface;

import java.util.List;
import java.util.ArrayList;

public class List_example {
    public static void main(String[] args) {
        // create List without parameter
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("0" + i);
        }

        // show List through for-each
        for (String e : list) {
            System.out.print(e + " ");
        }
    }
}
