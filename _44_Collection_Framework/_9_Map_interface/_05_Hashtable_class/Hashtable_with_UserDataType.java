package _44_Collection_Framework._09_Map_interface._5_Hashtable_class;

import java.util.Hashtable;
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

public class Hashtable_with_UserDataType {
    public static void main(String[] args) {
        Student s1 = new Student(1, "student1");
        Student s2 = new Student(2, "student2");
        Student s3 = new Student(3, "student3");
        Student s4 = new Student(4, "student4");
        Student s5 = new Student(5, "student5");

        Hashtable<Integer, Student> ht = new Hashtable<>();

        ht.put(s1.getId(), s1);
        ht.put(s2.getId(), s2);
        ht.put(s3.getId(), s3);
        ht.put(s4.getId(), s4);
        ht.put(s5.getId(), s5);

        for (Map.Entry<Integer, Student> entry : ht.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("-------------------------------------");
        for (Integer key : ht.keySet()) {
            Student value = ht.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
