package _18_Static_Field;

/**
 * thuộc tính static - trường static - static field
 *
 * dùng làm thuộc tính chung cho tất cả các đối tượng được tạo ra ( VD: tên công ty, tên trường, …)
 * biến static chỉ lấy bộ nhớ chỉ 1 lần, vì là chung nên tất cả các đối tượng đều tham chiếu đến ( tiết kiệm bộ nhớ )
 *
 */

public class Student {
    int id;
    String name;
    static int count = 0;
    static String college = "ABC Univeristy";

    public Student() {
    }

    public Student(String name) {
        // sau mỗi lần tạo 1 đối tượng, biến count có thuộc tính static sẽ tăng lên 1, và biến này là của class
        // biến này có nhiệm vụ đếm số đối tượng
        // với 1 đối tượng mới được tạo ra chính là số thứ tự của đối tượng, ta gán cho id của đối tượng
        // biến count static vẫn là biến class, tất cả các đối tượng đều tham chiếu đến nó
        count++;
        this.id = count;
        this.name = name;
    }

    void ShowStudent() {
        System.out.println("--------------------------------------------");
        System.out.println("ID\t\t: " + this.id);
        System.out.println("Name\t: " + this.name);
        System.out.println("College\t: " + college);
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Quang Hien");
        Student student2 = new Student("Quang Hieu");
        Student student3 = new Student("Quang Tien");
        Student student4 = new Student("Quang Khai");
        student1.ShowStudent();
        student2.ShowStudent();
        student3.ShowStudent();
        student4.ShowStudent();
        System.out.println("--------------------------------------------");
        System.out.println("Tất cả các đối tượng đều có chung thuộc tính static");
        System.out.println("count = " + student1.count);
        System.out.println("count = " + student2.count);
        System.out.println("count = " + student3.count);
        System.out.println("count = " + student4.count);
    }
}
