package _19_Static_Method;

public class Student19 {
    int id;
    String name;
    static int count = 0;
    static String college = "ABC Univeristy";

    public Student19() {
    }

    public Student19(String name) {
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

    static void ChangeUniName() {
        college = "XYZ University";
//        this.name = "Annonymous"; // ChangeUniName là phương thức static, nên không thể sử dụng biến non-static
    }
}

class Main {
    public static void main(String[] args) {
        Student19 student1 = new Student19("Quang Hien");
        Student19 student2 = new Student19("Quang Hieu");
        Student19 student3 = new Student19("Quang Tien");
        Student19 student4 = new Student19("Quang Khai");
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