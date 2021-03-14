package _44_Collection_Framework._02_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Method_With_Wrapper {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        // init List - ArrayList
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < NUM_OF_ELEMENT; i++) {
            list1.add("0" + (1 + i));
        }
        Print(list1, "list1");

        // addAll
        System.out.println("- addAll():");
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        Print(list2, "list2");

        // add
        list2.add("0" + 3);
        System.out.println("- list2 after list2.add(\"0\" + 3)");
        Print(list2, "list2");

        // indexOf
        System.out.println("- indexOf():");
        System.out.println("list2.indexOf(\"03\") = " + list2.indexOf("03"));
        System.out.println("list2.indexOf(\"06\") = " + list2.indexOf("06"));
        System.out.println();

        // lastIndexOf
        System.out.println("- lastIndexOf(): ");
        System.out.println("list2.lastIndexOf(\"03\") = " + list2.lastIndexOf("03"));
        System.out.println();

        // remove
        System.out.println("- remove(): ");
        System.out.println("after list2.remove(\"03\"): ");
        list2.remove("03");
        Print(list2, "list2");

        // retainAll
        System.out.println("- retainAll(): ");
        // init list4
        List<String> list4 = new ArrayList<>(list1);
        //init list3
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("0" + 3);
        list3.add("0" + 2);
        Print(list1, "list1");
        Print(list2, "list2");
        Print(list3, "list3");
        Print(list4, "list4");
        System.out.println("after list4.retainAll(list3): ");
        list4.retainAll(list3);
        Print(list4, "list4");
        
        // removeAll
        System.out.println("- removeAll(): ");
        // init list5
        ArrayList<String> list5 = new ArrayList<>(list1);
        Print(list5, "list5");
        System.out.println("after list5.removeAll(list3): ");
        list5.removeAll(list3);
        Print(list5, "list5");
    }

    public static void Print(List<String> list, String name) {
        System.out.print(name + ": ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println("\n");
    }
}