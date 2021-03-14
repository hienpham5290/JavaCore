package _44_Collection_Framework._08_Set_interface._4_TreeSet_class._5_Anonymous_Comparator_Comparable_class;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "Student [id= " + this.id + " ,name= " + this.name + " ,age= " + this.age + " ]";
    }
}
