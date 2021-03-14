package _06_This_Method;

/**
 * sử dụng this gọi phương thức của lớp hiện tại
 */

public class Student6 {
    int     id;
    String  name;
    int     age;

    public Student6() {
    }

    public Student6(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void showTitle(){
        System.out.println("Information of Student Object");
    }

    void showEndLine(){
        System.out.println("---------------------------------------------------------");
    }

    void show(){
        this.showTitle(); // this.showTitle để gọi phương thức của lớp hiện tại đang chứa showTitle
        System.out.println("id\t\t: " + this.id);
        System.out.println("name\t: " + this.name);
        System.out.println("age\t\t: " + this.age);
        showEndLine(); // compiler sẽ thêm <this.> để gọi showEndLine() tương đương với this.showEndLine();
    }

    public static void main(String[] args) {
        Student6 student61 = new Student6();
        student61.show();
    }
}
