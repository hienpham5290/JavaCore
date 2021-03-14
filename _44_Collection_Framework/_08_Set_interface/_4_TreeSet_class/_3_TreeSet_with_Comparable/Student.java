package _44_Collection_Framework._08_Set_interface._4_TreeSet_class._3_TreeSet_with_Comparable;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Student [id= " + this.id + ", name= " + this.name + " ]";
    }

    // override compareto(T obj) method by id theo 2 cách dưới đây
//    @Override
//    public int compareTo(Student o) {
//        if (this.id < o.id) {
//            return -1;
//        } else if (this.id == o.id) {
//            return 0;
//        } else return 1;
//    }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }
}
