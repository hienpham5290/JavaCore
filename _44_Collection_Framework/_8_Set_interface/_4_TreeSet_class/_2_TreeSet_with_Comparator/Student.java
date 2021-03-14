package _44_Collection_Framework._8_Set_interface._4_TreeSet_class._2_TreeSet_with_Comparator;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student [id = " + this.id + ", name = " + this.name + " ]";
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
