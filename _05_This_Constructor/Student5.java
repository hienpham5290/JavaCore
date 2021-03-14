package _05_This_Constructor;

/**
 * sử dụng this gọi constructor của lớp hiện tại
 * this() gọi constructor mặc định
 * this(para1, para2, ... ) gọi constructor có tham số tương ứng với tham số constructor chứa nó
 */

public class Student5 {
    int id;
    String name;
    int age;

    // constructor 1
    public Student5() {
        System.out.println("gọi constructor mặc định");
    }

    // constructor 2
    public Student5(int id) {
        System.out.println("gọi constructor id");
        this.id = id;
    }

    // constructor 3
    public Student5(int id, String name, int age) {
//        this(id); // this và truyền tham số về constructor chứa tham số tương ứng
        this(); // this và không truyền gì cả, this() sẽ gọi constructor mặc định
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(id + " - " + name + " - " + age);
    }

    public static void main(String[] args) {
        Student5 stuA = new Student5(1, "Hien", 30);
        // bật tắt this trong constructor thứ ba để kiểm chứng
        // khi không truyền tham số, this sẽ gọi constructor mặc định
        // khi truyền tham số, this sẽ gọi constructor có tham số tương ứng, điều kiện constructor chứa nó, cũng phải cung cấp tham số tương ứng
        stuA.show();
    }
}
