package _44_Collection_Framework._8_Set_interface._4_TreeSet_class._4_sort_List_with_Comparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
