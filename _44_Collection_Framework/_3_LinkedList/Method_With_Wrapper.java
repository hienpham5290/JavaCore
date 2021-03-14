package _44_Collection_Framework._3_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Method_With_Wrapper {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        // create list1 with no parameter
        List<String> list1 = new LinkedList<>();
        for (int i = 0; i < NUM_OF_ELEMENT; i++) {
            list1.add("0" + (i + 1));
        }
        System.out.print("list1 = ");
        Print(list1);

        // addAll
        System.out.println("\n- addAll");
        // create list2 with no parameter
        List<String> list2 = new LinkedList<>();
        list2.addAll(list1);
        System.out.print("list2 = ");
        Print(list2);
        list2.add("0" + 3);
        System.out.println("- after list2.add(\"0\" + 3)");
        System.out.print("list2 = ");
        Print(list2);
        
        // indexOf
        System.out.println("\n- indexOf");
        System.out.println("list2.indexOf(\"03\") = " + list2.indexOf("03"));
        System.out.println("list2.indexOf(\"06\") = " + list2.indexOf("06"));

        // lastIndexOf
        System.out.println("\n- lastIndexOf");
        System.out.println("list2.lastIndexOf(\"-3\") = " + list2.lastIndexOf("03"));

        // remove
        System.out.println("\n- remove");
        System.out.print("list2.remove(\"01\") = ");
        list2.remove("01");
        Print(list2);

        // retainAll
        System.out.println("\n- retainAll");
        List<String> list4 = new LinkedList<>(list1);
        List<String> list3 = new LinkedList<>();
        list3.add("03");
        list3.add("02");
        System.out.print("list3 = ");
        Print(list3);
        System.out.print("list4 = ");
        Print(list4);
        System.out.println("list4.retainAll(list3)");
        list4.retainAll(list3);
        System.out.print("list4 = ");
        Print(list4);

        // removeAll
        System.out.println("\n- removeAll");
        List<String> list5 = new ArrayList<>(list1);
        list5.removeAll(list3);
        System.out.print("after list5.removeAll(list3)\nlist5 = ");
        Print(list5);
        System.out.print("list1 = ");
        Print(list1);
    }

    private static void Print(List<String> list) {
        for (String e : list) {
            System.out.print(e + ", ");
        }
        System.out.println("[size() = " + list.size() + " ]");
    }
}
