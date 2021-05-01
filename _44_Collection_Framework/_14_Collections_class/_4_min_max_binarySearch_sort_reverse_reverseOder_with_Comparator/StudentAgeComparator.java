package _44_Collection_Framework._14_Collections_class._4_min_max_binarySearch_sort_reverse_reverseOder_with_Comparator;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else return 1;
    }
}
