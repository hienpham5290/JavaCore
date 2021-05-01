package _44_Collection_Framework._14_Collections_class._4_min_max_binarySearch_sort_reverse_reverseOder_with_Comparator;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + " ,name=" + name + " ,age=" + age + " ]";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
