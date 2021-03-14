package _44_Collection_Framework._09_Map_interface._02_HashMap_class._2_HashMap_with_UserDataType;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Student 1");
        Student student2 = new Student(2, "Student 2");
        Student student3 = new Student(3, "Student 3");
        Student student4 = new Student(4, "Student 4");
        Student student5 = new Student(5, "Student 5");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
        studentMap.put(student4.getId(), student4);
        studentMap.put(student5.getId(), student5);

        System.out.println("Show studentMap with keySet()");
        for (Integer key : studentMap.keySet()) {
            Student value = studentMap.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("----------------------------------------");
        System.out.println("Show studentMap with entrySet()");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
