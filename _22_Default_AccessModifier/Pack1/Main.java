package _22_Default_AccessModifier.Pack1;

import _22_Default_AccessModifier.Pack2.Student22;

/**
 *
 * default - access modifier
 *
 * nếu 1 phần tử không khai báo bất cứ access modifier nào, compiler sẽ ngầm định nó là default access modifier
 *
 * chỉ những phần tử ở trong cùng package với nó mới truy cập được đến nó
 *
 */

public class Main {
    public static void main(String[] args) {
        // nếu class Student22 ở pack2 không khai báo bất cứ access modifier nào, nghĩa là ngầm định access modifier là default
        // thì những dòng khởi tạo đối tượng dưới đây sẽ thông báo lỗi, vì default chỉ cho phép truy cập từ cùng package
        Student22 student221 = new Student22();
        Student22 student222 = new Student22("Quang Hien", 31);
        Student22 student223 = new Student22("Quang Hieu", 26);
        Student22 student224 = new Student22("Quang Tien", 25);

        student221.Show();
        student222.Show();
        student223.Show();
        student224.Show();

//        student221.Greeting(); // compiler báo lỗi, yêu cầu thay đổi Greeting từ default thành public
//        student222.Greeting();
//        student223.Greeting();
//        student224.Greeting();

    }
}