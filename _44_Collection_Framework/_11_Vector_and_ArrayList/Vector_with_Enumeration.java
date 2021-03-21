package _44_Collection_Framework._11_Vector_and_ArrayList;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_with_Enumeration {
    public static void main(String[] args) {
        Vector<String> languageList = new Vector<>();
        languageList.add("Java");
        languageList.add("XML");
        languageList.add("SQL");
        languageList.add("Markdown");

        Enumeration<String> enumeration = languageList.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
