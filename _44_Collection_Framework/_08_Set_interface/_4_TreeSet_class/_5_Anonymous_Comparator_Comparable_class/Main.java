package _44_Collection_Framework._08_Set_interface._4_TreeSet_class._5_Anonymous_Comparator_Comparable_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student student1 = new Student(1, "FFF", 25);
        Student student2 = new Student(2, "EEE", 34);
        Student student3 = new Student(3, "DDD", 14);
        Student student4 = new Student(4, "CCC", 15);
        Student student5 = new Student(5, "BBB", 29);
        Student student6 = new Student(6, "AAA", 32);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        System.out.println("Show list");
        printData(list);

        System.out.println("Sort list by id with anonymous class comparator");
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
        printData(list);

        System.out.println("Sort list by name with anonymous class comparator");
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printData(list);

        System.out.println("Sort list by age with anonymous class comparator");
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        printData(list);
    }

    public static void printData(List<Student> list) {
        for (Student item : list) {
            System.out.println(item);
        }
        System.out.println("-----------------------------------------------------");
    }
}
