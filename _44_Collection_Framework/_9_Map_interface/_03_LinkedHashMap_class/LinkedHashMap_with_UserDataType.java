package _44_Collection_Framework._09_Map_interface._3_LinkedHashMap_class;

import java.util.LinkedHashMap;
import java.util.Map;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class LinkedHashMap_with_UserDataType {
    public static void main(String[] args) {
        // Create Student's objects
        Student s1 = new Student(1, "student1");
        Student s2 = new Student(2, "student2");
        Student s3 = new Student(3, "student3");

        // Initial Map by instance of LinkedHashMap
        Map<Integer, Student> map = new LinkedHashMap<>();
        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);

        // Show map using keySet()
        for (Integer key : map.keySet()) {
            Student value = map.get(key);
            System.out.println(value);
        }

        // Show map using entrySet()
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
