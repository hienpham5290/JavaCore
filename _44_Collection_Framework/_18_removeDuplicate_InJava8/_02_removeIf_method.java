package _44_Collection_Framework._18_removeDuplicate_InJava8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _02_removeIf_method {
    public static void main(String[] args) {
        List<String> listWithDuplicate = new ArrayList<>();
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("J2EE");
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("J2EE");
        listWithDuplicate.add("JAVA");
        listWithDuplicate.add("ANDROID");
        listWithDuplicate.add("JAVA");

        Set<String> elementsAlreadySeen = new HashSet<>();
        listWithDuplicate.removeIf(s -> !elementsAlreadySeen.add(s));

        System.out.println(elementsAlreadySeen);
    }
}
