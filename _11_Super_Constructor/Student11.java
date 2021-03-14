package _11_Super_Constructor;

/**
 * super();
 *
 * gọi constructor của lớp cha gần nhất
 *
 * có thể truyền tham số vào super(), nếu constructor chứa super() cung cấp tham số tương ứng với tham số ở lớp cha
 *
 * dù người dùng có hay không có khai báo super() trong constructor của bất kỳ lớp nào, thì compiler vẫn khai báo ngầm
 * định 1 super() trong mỗi constructor
 */

class Person {
    public Person() {
        System.out.println("Person is created");
    }
}

public class Student11 extends Person{
    int     id      = 12;
    String  name    = "Quang Hien";
    int     age     = 31;
    String  gender  = "male";

    public Student11() {
        // dù có khai báo tường minh gọi constructor của lớp cha hay không
        // compiler vẫn sẽ cung cấp 1 khai báo super() gọi constructor đến lớp cha gần nhất cho mọi lớp
        // lệnh super() dưới đây dù có hay không có khai báo, constructor của lớp cha gần nhất vẫn được gọi
//        super();
        System.out.println("Student11 is created");
    }

    public static void main(String[] args) {
        Student11 student11 = new Student11();
    }
}
