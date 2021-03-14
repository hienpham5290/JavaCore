package _44_Collection_Framework._6_ListIterator_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("0" + i);
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+", ");
        }
        System.out.println();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+", ");
        }
        System.out.println();
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + ", ");
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + ", ");
        }
        System.out.println();
        System.out.println(list.isEmpty());
    }
}
