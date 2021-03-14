package _44_Collection_Framework._08_Set_interface._4_TreeSet_class._2_TreeSet_with_Comparator;

import java.util.Comparator;

// class bộ so sánh theo Name
public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
