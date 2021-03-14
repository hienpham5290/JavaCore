package _44_Collection_Framework._09_Map_interface._4_TreeMap_class;

import java.util.Map;
import java.util.TreeMap;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student[id=" + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class TreeMap_with_UserDataType {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Student1");
        Student s2 = new Student(2, "Student2");
        Student s3 = new Student(3, "Student2");
        Student s4 = new Student(4, "Student2");
        Student s5 = new Student(5, "Student2");

        Map<Integer, Student> map = new TreeMap<>();
        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);
        map.put(s4.getId(), s4);
        map.put(s5.getId(), s5);

        // Show map with map.keySet() & map.get(key)
        for (Integer key : map.keySet()) {
            Student student = map.get(key);
            System.out.println(key + " = " + student);
        }
        System.out.println("--------------------------------------------");

        // Show map with map.entrySet() & entry.getKey() - entry.getValue()
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Student student = entry.getValue();
            System.out.println(key + " = " + student);
        }
    }
}
