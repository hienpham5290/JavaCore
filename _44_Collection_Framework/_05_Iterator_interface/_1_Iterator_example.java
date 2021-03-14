package _44_Collection_Framework._05_Iterator_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1_Iterator_example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("0" + i);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            iterator.remove();
        }

        System.out.println("\nlist is empty: " + list.isEmpty());
    }
}
