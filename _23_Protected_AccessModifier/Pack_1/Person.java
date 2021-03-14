package _23_Protected_AccessModifier.Pack_1;

public class Person {
    private int id;
    private String name;
    private int age;

    protected Person() {
    }

    protected Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    protected void ShowInfo() {
        System.out.println("------------------------------------------------------");
        System.out.println("ID\t\t: " + this.id);
        System.out.println("NAME\t: " + this.name);
        System.out.println("AGE\t\t: " + this.age);
    }
}
