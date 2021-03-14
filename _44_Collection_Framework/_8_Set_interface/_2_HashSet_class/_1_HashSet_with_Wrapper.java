package _44_Collection_Framework._8_Set_interface._2_HashSet_class;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _1_HashSet_with_Wrapper {
    public static void main(String[] args) {
        Set<String> hashSetList = new HashSet<String>();
        hashSetList.add("A");
        hashSetList.add("G");
        hashSetList.add("D");
        hashSetList.add("E");
        hashSetList.add("C");
        hashSetList.add("A");

        Iterator<String> stringIterator = hashSetList.iterator();
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }
    }
}
