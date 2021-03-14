package _1_Class_Object;

/**
 * tạo lớp - khởi tạo đối tượng có giá trị thuộc tính mặc định thông qua constructor mặc định
 */

public class Student1 {
    // các thuộc tính
    int     id;
    String  name;

    // default constructor - không có tham số
    public Student1() {

    }

    public static void main(String[] args) {
        // khởi tạo đối tượng từ lớp Student1 thông qua constructor mặc định không có tham số, các giá trị sẽ mặc định
        Student1 student1 = new Student1();
        Student1 student2 = new Student1();
        System.out.println(student1.id);
        System.out.println(student1.name);
        System.out.println();
        System.out.println(student2.id + " " + student2.name);
    }
}
