package _44_Collection_Framework._14_Collections_class._5_min_max_binarySearch_sort_reverse_reverseOder_with_Comparable;

/*
    sử dụng phương thức min, max, binarySearch, sort, reverse, reverseOrder của Collections class
    cài đặt kiểu của người dùng tự định nghĩa - kiểu Student (cài đặt 1 class Student) và implements Comparable
    override compareTo() của Comparable interface
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _5_min_max_binarySearch_sort_reverse_reverseOder {
    public static void main(String[] args) {
        // khởi tạo ArrayList
        List<Student> studentList = new ArrayList<>();

        // khởi tạo các object của Student
        Student std1 = new Student(1, "std1", 15);
        Student std2 = new Student(2, "std1", 20);
        Student std3 = new Student(3, "std1", 17);
        Student std4 = new Student(4, "std1", 10);
        Student std5 = new Student(5, "std1", 19);
        Student std6 = new Student(6, "std1", 19);

        // thêm phần tử vào list
        studentList.add(std3);
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std5);
        studentList.add(std4);

        // không cần khởi tạo bộ comparator vì nó đã được cài đặt sẵn trong class Student
        // tìm max
        System.out.println("Max value: " + Collections.max(studentList));

        // tìm min
        System.out.println("Min value: " + Collections.min(studentList));

//        // nếu không sort lại list, việc sử dụng Collections.binarySearch(list, key) sẽ return giá trị âm
//        Collections.sort(studentList);

        // tìm std1
        System.out.println("Index of std1: " + Collections.binarySearch(studentList, std1));

        // tìm std6
        System.out.println("Index of std6: " + Collections.binarySearch(studentList, std6));

        // sort list với Collections.sort(list đã implements Comparable) - tăng dần
        Collections.sort(studentList);
        System.out.println("Sorted List:");
        printData(studentList);
        System.out.println("--------------------------------------------");

        // reverse list với Collections.reverse(list đã implements Comparable) - giảm dần
        Collections.reverse(studentList);
        System.out.println("Reversed List");
        printData(studentList);
        System.out.println("--------------------------------------------");

        // khởi tạo bộ Comparator<Student> descending (giảm dần) dựa trên kiểu dữ liệu đã implements Comparable
        Comparator<Student> compareDesc = Collections.reverseOrder();
        // sort lại list với bộ comparator descending (giảm dần), hiện tại list đang giảm dần
        Collections.sort(studentList, compareDesc);
        System.out.println("Descending List:");
        printData(studentList);
        System.out.println("--------------------------------------------");

        // khởi tạo bộ Comparator<Student> ascending (tăng dần) dựa trên bộ Comparator Descending vừa khởi tạo
        Comparator<Student> compareAsc = Collections.reverseOrder(compareDesc);
        // sort lại list với bộ comparator ascending (tăng dần), hiện tại list đang giảm dần
        Collections.sort(studentList, compareAsc);
        System.out.println("Ascending List:");
        printData(studentList);
        System.out.println("--------------------------------------------");
    }

    public static void printData(List<Student> studentList) {
        for (Student std : studentList) {
            System.out.println(std);
        }
    }
}
