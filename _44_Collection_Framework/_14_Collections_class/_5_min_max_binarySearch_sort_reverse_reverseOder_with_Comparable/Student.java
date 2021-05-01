package _44_Collection_Framework._14_Collections_class._5_min_max_binarySearch_sort_reverse_reverseOder_with_Comparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student [id=" + id + " ,name=" + name + " ,age=" + age + " ]";
    }

    @Override
    public int compareTo(Student o) {
        if (this.age < o.getAge()) {
            return -1;
        } else if (this.age == o.getAge()) {
            return 0;
        } else return 1;
    }
}
