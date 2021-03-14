package _44_Collection_Framework._08_Set_interface._4_TreeSet_class._1_TreeSet_example._2_TreeSet_with_UserDataType;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_with_UserDataType {
    public static void main(String[] args) {
        Set<Student> treeSet = new TreeSet<>();
        Student student1 = new Student(1, "QQQ");
        Student student2 = new Student(2, "EEE");
        Student student3 = new Student(3, "TTT");
        Student student4 = new Student(4, "PPP");
        Student student5 = new Student(5, "RRR");
        Student student6 = new Student(1, "QQQ");

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        treeSet.add(student6);
        treeSet.add(student5);

        for (Student item : treeSet) {
            System.out.println(item);
        }
    }
}
