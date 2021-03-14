package _04_This_Instance;

public class Student4 {
    int id;
    String name;
    int age;

    public Student4() {
    }

    // constructor không dùng this tham chiếu đến biến instance
    public Student4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // constructor dùng this tham chiếu đến biến instance
    public Student4(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void showWithoutThis() {
        System.out.println("id: " + id + "\t" + "name: " + name + "\t" + "age: " + age);
    }

    void showWithThis() {
        System.out.println("id: " + this.id + "\t" + "name: " + this.name + "\t" + "age: " + this.age);
    }
}
