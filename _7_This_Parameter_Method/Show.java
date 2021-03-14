package _7_This_Parameter_Method;

public class Show{

    // 1 phương thức mà giá trị truyền vào là 1 đối tượng, kiểu là class của đối tượng đó
    void show(Student7 obj) {
        System.out.println("ID\t\t: " + obj.getId());
        System.out.println("Name\t: " + obj.getName());
        System.out.println("Age\t\t: " + obj.getAge());
    }
}
