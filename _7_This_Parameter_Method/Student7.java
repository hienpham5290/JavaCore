package _7_This_Parameter_Method;

/**
 * sử dụng this như 1 tham số của phương thức
 * this lúc này đóng vai trò là 1 đối tượng, và phương thức lúc này có tham số là đối tượng
 * kiểu của tham số trong phương thức chính là kiểu class của đối tượng tương ứng
 *
 * [ CÁCH SỬ DỤNG CƠ BẢN ]
 * ở lớp 1 tạo 1 đối tượng từ lớp 2
 * ở lớp 1 gọi phương thức của lớp 2 thông qua đối tượng tạo từ lớp 2
 * giá trị truyền vào phương thức của lớp 2 nằm trong lớp 1 là từ khóa this ( chính là tham chiếu của biến instance lớp 1 )
 * lớp 2 có 1 phương thức mà kiểu giá trị nhận vào là kiểu lớp 1
 *
 * cách dùng này chủ yếu được sử dụng trong xử lý sự kiện
 *  hoặc cung cấp tham chiếu biến instance của 1 lớp cho 1 lớp khác
 */

public class Student7 {

    int     id      = 10;
    String  name    = "Quang Hien";
    int     age     = 31;

    public Student7() {
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    void HelpShow() {
        // khởi tạo đối tượng từ class khác, mà ở đó có 1 phương thức nhận vào là 1 đối tượng, kiểu giá trị là class tương ứng
        Show show = new Show();

        // truyền đối tượng của lớp hiện tại, là đối tượng của lớp Student7, sử dụng this, ý là đối tượng của lớp hiện tại
        // phương thức show được gọi thông qua đối tượng show của lớp Show
        show.show(this);
    }

    public static void main(String[] args) {
        Student7 stuA = new Student7();
        stuA.HelpShow();
    }
}
