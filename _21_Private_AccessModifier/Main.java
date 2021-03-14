package _21_Private_AccessModifier;

/**
 * private
 *
 * chỉ trong cùng 1 lớp với phần tử được chỉ định là private, mới truy cập đến được phần tử được chỉ định private
 * nếu cố gắng truy cập những phần tử private từ lớp khác, chương trình sẽ báo lỗi
 * dùng cho: biến, phương thức, constructor ( sẽ không thể tạo đối tượng từ bên ngoài lớp ), class ( chỉ dùng với lớp lồng nhau )
 *
 */

class Student21 {
    private int id;
    private String name;
    private int age;
    private static int count = 0;

    public Student21() {}

    public Student21(String name, int age) {
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

    private void Greeting() {
        System.out.println("Hello !!!");
    }
}

public class Main {
    public static void main(String[] args) {
        Student21 student211 = new Student21("Quang Hien", 31);
        Student21 student212 = new Student21("Quang Hieu", 26);
        Student21 student213 = new Student21("Quang Tien", 25);

        student211.Show();
        student212.Show();
        student213.Show();

//        System.out.println(student211.id); // thuộc tính id là private, chỉ trong class Student21 mới gọi được
//        student211.Greeting(); // phương thức Greeting là private, chỉ trong class Student21 mới gọi được
    }
}
