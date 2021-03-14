package _44_Collection_Framework._8_Set_interface._4_TreeSet_class._1_TreeSet_example._2_TreeSet_with_UserDataType;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student [id= " + id + " ,name= " + name + "]";
    }

    public String getName() {
        return this.name;
    }
}
