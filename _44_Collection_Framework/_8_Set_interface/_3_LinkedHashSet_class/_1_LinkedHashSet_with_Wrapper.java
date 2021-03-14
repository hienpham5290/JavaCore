package _44_Collection_Framework._8_Set_interface._3_LinkedHashSet_class;

import java.util.LinkedHashSet;
import java.util.Set;

public class _1_LinkedHashSet_with_Wrapper {
    public static void main(String[] args) {
        Set<String> setList = new LinkedHashSet<String>();
        setList.add("Item01");
        setList.add("Item03");
        setList.add("Item02");
        setList.add("Item05");
        setList.add("Item03");

        for (String e : setList) {
            System.out.print(e + " ");
        }
    }
}
