package _44_Collection_Framework._08_Set_interface._4_TreeSet_class._2_TreeSet_with_Comparator;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // tạo TreeSet với bộ so sánh theo name, để TreeSet có thể sắp xếp
        // thêm các phần tử tăng dần theo name
        Set<Student> sets = new TreeSet<>(new StudentNameComparator());
        Student student1 = new Student(1, "EEE");
        Student student2 = new Student(2, "DDD");
        Student student3 = new Student(3, "CCC");
        Student student4 = new Student(4, "BBB");
        Student student5 = new Student(5, "AAA");

        sets.add(student1);
        sets.add(student2);
        sets.add(student3);
        sets.add(student4);
        sets.add(student5);

        // in ra TreeSet đã được thêm và sort by name
        System.out.println("add & sort by name");
        for (Student item : sets) {
            System.out.println(item);
        }

        // in ra TreeSet đã được thêm và sort by id
        System.out.println("\nadd & sort by id");
        Set<Student> setss = new TreeSet<>(new StudentIdComparator());
        setss.addAll(sets);
        for (Student item : setss) {
            System.out.println(item);
        }
    }
}
