package _44_Collection_Framework._11_Vector_and_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_with_Iterator {
    public static void main(String[] args) {
        ArrayList<String> languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("XML");
        languageList.add("Mardown");
        languageList.add("SQL");

        Iterator<String> iterator = languageList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
