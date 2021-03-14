package _22_Default_AccessModifier.Pack2;

public class Student22 {
    private int id;
    private String name;
    private int age;
    private static int count = 0;

    public Student22 () {
        count++;
        this.id = count;
    }

    public Student22(String name, int age) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
    }

    public void Show() {
        System.out.println("--------------------------------------------");
        Greeting();
        System.out.println("ID\t\t: " + this.id);
        System.out.println("NAME\t: " + this.name);
        System.out.println("AGE\t\t: " + this.age);
    }

    // ở đây không khai báo access modifier, compiler sẽ hiểu phương thức này có access modifier là default
    void Greeting() {
        System.out.println("Hello !!!");
    }
}
