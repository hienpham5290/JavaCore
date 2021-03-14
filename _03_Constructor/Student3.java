package _03_Constructor;

public class Student3 {
    int id;
    String name;

    public Student3() {
    }

    public Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void showObject() {
        System.out.println("id\t\t: \t\t" + this.id);
        System.out.println("name\t: \t\t" + this.name);
    }
}
