package _9_This_Return_Instance;

/**
 * trả về instance của lớp hiện tại, hay đối tượng của lớp hiện tại
 * kiểu trả về lúc này chính là lớp hiện tại
 */

public class Student9 {
    int     id;
    String  name;
    int     age;
    String  gender;

    public Student9() {
    }

    public Student9(int id, String name, int age, String gender) {
        this.id     = id;
        this.name   = name;
        this.age    = age;
        this.gender = gender;
    }

    // đây là phương thức trả về đối tượng hiện tại, kiểu dữ liệu trả về là Student9
    // this ở đây chính là instance hay là đối tượng hiện tại
    Student9 getStudent() {
        this.id     = 99;
        this.name   = "Khai";
        this.age    = 25;
        this.gender = "male";
        return this;
    }

    void Display() {
        System.out.println("ID\t\t: " + this.id);
        System.out.println("NAME\t: " + this.name);
        System.out.println("AGE\t\t: " + this.age);
        System.out.println("GENDER\t: " + this.gender);
    }

    public static void main(String[] args) {
        Student9 student9 = new Student9(12, "Hien", 31, "male");
        student9.Display();
        System.out.println(student9.getStudent());
        System.out.println("------------------------------");
        System.out.println(student9.getStudent().id);
        System.out.println(student9.getStudent().name);
        System.out.println(student9.getStudent().age);
        System.out.println(student9.getStudent().gender);
        System.out.println(student9.getStudent());
        System.out.println("------------------------------");

        // phương thức getStudent() trả về 1 đối tượng thuộc lớp Student9
        // mà trong lớp Student9 có phương thức Display()
        // nên ta có thể viết liền như dưới đây
        student9.getStudent().Display();
        System.out.println(student9.getStudent());
    }
}
