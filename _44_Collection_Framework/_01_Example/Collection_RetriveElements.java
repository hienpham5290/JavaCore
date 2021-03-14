package _44_Collection_Framework._01_Example;

// Retrieve elements one by one in Collection

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Collection_RetriveElements {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < NUM_OF_ELEMENT; i++) {
            stringList.add("0" + i);
        }

        System.out.print("Using For-loop with Size: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();

        System.out.print("Using For-each: ");
        for (String e : stringList) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.print("Using For-loop with Iterator: ");
        for (Iterator<String> iterator = stringList.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("Using While-loop with Iterator: ");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("Using While-loop with SIZE: ");
        int i = 0;
        while (i < NUM_OF_ELEMENT) {
            System.out.print(stringList.get(i) + " ");
            i++;
        }
        System.out.println();

        System.out.print("Using For-each Java8: ");
        stringList.forEach(element -> System.out.print(element + " "));
        System.out.println();

        System.out.print("Using Stream forEach Java8: ");
        stringList.stream().forEach(element -> System.out.print(element + " "));
    }
}
