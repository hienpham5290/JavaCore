package _44_Collection_Framework._8_Set_interface._4_TreeSet_class._4_sort_List_with_Comparator;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() == o2.getId()) {
            return 0;
        } else return 1;
    }
}
