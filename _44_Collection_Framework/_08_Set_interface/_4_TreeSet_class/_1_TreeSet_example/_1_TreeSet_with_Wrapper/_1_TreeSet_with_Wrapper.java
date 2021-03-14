package _44_Collection_Framework._08_Set_interface._4_TreeSet_class._1_TreeSet_example._1_TreeSet_with_Wrapper;

import java.util.Set;
import java.util.TreeSet;

public class _1_TreeSet_with_Wrapper {
    public static void main(String[] args) {
        Set<String> listTreeSet = new TreeSet<>();
        listTreeSet.add("Item01");
        listTreeSet.add("Item02");
        listTreeSet.add("Item03");
        listTreeSet.add("Item04");
        listTreeSet.add("Item01");

        for (String item : listTreeSet) {
            System.out.print(item + " ");
        }
    }
}
