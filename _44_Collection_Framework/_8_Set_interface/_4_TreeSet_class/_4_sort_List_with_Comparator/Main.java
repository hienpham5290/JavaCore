package _44_Collection_Framework._8_Set_interface._4_TreeSet_class._4_sort_List_with_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student(1, "FFF");
        Student student2 = new Student(2, "EEE");
        Student student3 = new Student(3, "DDD");
        Student student4 = new Student(4, "CCC");
        Student student5 = new Student(5, "BBB");
        Student student6 = new Student(6, "AAA");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        System.out.println("Show list without sort");
        printData(list);

        System.out.println("Copy list & sort by name");
        Collections.sort(list, new StudentNameComparator());
        printData(list);

        System.out.println("Copy list & sort by id");
        Collections.sort(list, new StudentIdComparator());
        printData(list);
    }

    public static void printData(List<Student> list) {
        for (Student item : list) {
            System.out.println(item);
        }
        System.out.println("-----------------------------------------------");
    }
}
