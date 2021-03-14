package _44_Collection_Framework._10_Vector_class;

import java.util.List;
import java.util.Vector;

public class Vector_with_Wrapper {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        // Init list with no parameter by Vector's instance
        List<String> list1 = new Vector<>();

        // Add element into list1 by for-loop
        for (int i = 0; i <= NUM_OF_ELEMENT; i++) {
            list1.add("0" + i);
        }
        System.out.print("Init list1= ");
        PrintData(list1);

        // use addAll(Collection c) to create a duplicate list
        List<String> list2 = new Vector<>();
        list2.addAll(list1);
        System.out.print("list2.addAll(list1), list2 = ");
        PrintData(list2);

        // indexOf()
        System.out.println("list2.indexOf(\"03\") = " + list2.indexOf("03"));
        System.out.println("list2.indexOf(\"06\") = " + list2.indexOf("06"));

        // lastIndexOf()
        System.out.println("list2.lastIndexOf(\"03\") = " + list2.lastIndexOf("03"));

        // remove()
        list2.remove("01");
        System.out.print("list2.remove(\"01\"), list2 = ");
        PrintData(list2);

        // retainAll()
        List<String> list4 = new Vector<>(list1);
        Vector<String> list3 = new Vector<>();
        list3.add("03");
        list3.add("02");
        list4.retainAll(list3);
        System.out.print("list4.retainAll(list3), list4 = ");
        PrintData(list4);

        // removeAll()
        List<String> list5 = new Vector<>(list1);
        list5.removeAll(list3);
        System.out.print("list5.removeAll(list3), list5 = ");
        PrintData(list5);
    }

    public static void PrintData(List<String> list) {
        for (String e : list) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }
}
