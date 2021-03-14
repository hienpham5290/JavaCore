package _43_Java_Generics.Generic_Method;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // K -> Long
        // V -> String
        KeyValue<Long, String> entry1 = new KeyValue<Long, String>(12345L, "Tom");
        KeyValue<Long, String> entry2 = new KeyValue<Long, String>(12346L, "Jerry");

        Long phone1 = MyUtils.getKey(entry1);
        Long phone2 = MyUtils.getKey(entry2);

        System.out.println(phone1);
        System.out.println(phone2);

        ArrayList<KeyValue<Long, String>> list = new ArrayList<KeyValue<Long, String>>();
        list.add(entry1);
        list.add(entry2);

        KeyValue<Long, String> firstEntry = MyUtils.getFirstElement(list);
        System.out.println("Value 0 = " + firstEntry.getValue());
    }
}
