package _44_Collection_Framework._14_Collections_class._4_min_max_binarySearch_sort_reverse_reverseOder_with_Comparator;

/*
    sử dụng phương thức min, max, binarySearch, sort, reverse, reverseOrder của Collections class
    cài đặt kiểu của người dùng tự định nghĩa - kiểu Student (cài đặt 1 class Student)
    cài đặt 1 Comparator dựa trên kiểu của người dùng tự định nghĩa
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _4_min_max_binarySearch_sort_reverse_reverseOder {
    public static void main(String[] args) {
        // khởi tạo ArrayList
        List<Student> studentList = new ArrayList<>();
        Student std1 = new Student(1, "std1", 15);
        Student std2 = new Student(2, "std2", 20);
        Student std3 = new Student(3, "std3", 17);
        Student std4 = new Student(4, "std4", 10);
        Student std5 = new Student(5, "std5", 19);
        Student std6 = new Student(6, "std6", 19);

        // thêm phần tử vào list
        studentList.add(std3);
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std5);
        studentList.add(std4);

        // khởi tạo Comparator
        StudentAgeComparator ageComparator = new StudentAgeComparator();

        // sử dụng method của Collections class, kèm với bộ Comparator
        // tìm max
        System.out.println("max value: " + Collections.max(studentList, ageComparator));

        // tìm min
        System.out.println("min value: " + Collections.min(studentList, ageComparator));

//        // sort studentList, nếu không sort list, index trả về của phương thức binarySearch sẽ là âm
//        Collections.sort(studentList, ageComparator);

        // tìm std1
        System.out.println("index of std1: " + Collections.binarySearch(studentList, std1, ageComparator));

        // tìm std2
        System.out.println("index of std6: " + Collections.binarySearch(studentList, std6, ageComparator));
        System.out.println("---------------------------------------------");

        // sort lại list bằng Collections.sort(list, comparator) - ascending (tăng dần)
        Collections.sort(studentList, ageComparator);
        System.out.println("Sorted Ascending:");
        printData(studentList);
        System.out.println("---------------------------------------------");

        // reverse các phần tử của list bằng Collections.reverse() - descending (giảm dần)
        System.out.println("reversed list:");
        Collections.reverse(studentList);
        printData(studentList);
        System.out.println("---------------------------------------------");

        // khởi tạo 1 comparator mới bằng các reverseOrder lại comparator cũ - descending (giảm dần)
        Comparator<Student> compareDesc = Collections.reverseOrder(ageComparator);
        // sort lại list the bộ comparator mới, sẽ không thay đổi vì list đã reverse
        // hoạt động sort lại cũng chỉ thuận theo quá trình ngược của comparator
        Collections.sort(studentList, compareDesc);
        System.out.println("Sorted Descending by compareDesc:");
        printData(studentList);
        System.out.println("---------------------------------------------");

        // khởi tạo 1 comparator mới bằng cách reverseOrder lại compareDesc - ascending (tăng dần)
        Comparator<Student> compareAsc = Collections.reverseOrder(compareDesc);
        Collections.sort(studentList, compareAsc);
        System.out.println("Sorted Ascending by compareAsc");
        printData(studentList);
        System.out.println("---------------------------------------------");

    }

    public static void printData(List<Student> studentList) {
        for (Student std : studentList) {
            System.out.println(std);
        }
    }
}
