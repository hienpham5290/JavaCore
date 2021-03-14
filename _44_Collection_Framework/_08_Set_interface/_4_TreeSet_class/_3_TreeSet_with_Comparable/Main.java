package _44_Collection_Framework._08_Set_interface._4_TreeSet_class._3_TreeSet_with_Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(6, "AAA");
        Student std2 = new Student(5, "BBB");
        Student std3 = new Student(4, "CCC");
        Student std4 = new Student(3, "DDD");
        Student std5 = new Student(2, "EEE");
        Student std6 = new Student(1, "FFF");

        Set<Student> sets = new TreeSet<>();
        sets.add(std1);
        sets.add(std2);
        sets.add(std3);
        sets.add(std4);
        sets.add(std5);
        sets.add(std6);

        // in ra TreeSet đã được add & sort by id được cung cấp
        // bởi bộ so sánh bằng cách implements Comparable<T> và override
        // compareTo(T obj) method by id
        for (Student item : sets) {
            System.out.println(item);
        }
    }
}
