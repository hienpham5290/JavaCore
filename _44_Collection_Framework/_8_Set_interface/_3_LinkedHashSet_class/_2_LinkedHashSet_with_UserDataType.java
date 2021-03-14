package _44_Collection_Framework._8_Set_interface._3_LinkedHashSet_class;

import java.util.LinkedHashSet;
import java.util.Set;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student [id= " + id + ", name= " + name + " ]";
    }
}

public class _2_LinkedHashSet_with_UserDataType {
    public static void main(String[] args) {
        Student student1 = new Student(1, "AAA");
        Student student2 = new Student(2, "BBB");
        Student student3 = new Student(3, "HHH");
        Student student4 = new Student(4, "RRR");
        Student student5 = new Student(2, "BBB");

        Set<Student> students = new LinkedHashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student e : students) {
            System.out.println(e);
        }

        // ví dụ trên, ta thêm 2 phần tử có giá trị giống nhau
        // nhưng LinkedHashSet lại coi đó là 2 đối tượng khác nhau
        // vì hash code của 2 đối tượng này do JVM định nghĩa khi khởi tạo
        // là 2 đối tượng khác nhau, ở 2 địa chỉ khác nhau, do đó có
        // hash code khác nhau
        // nếu muốn không chứa giá trị trùng nhau về mặt giá trị
        // ta phải override lại hashCode() method theo id của Student class
    }
}
