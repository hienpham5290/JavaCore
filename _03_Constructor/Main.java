package _03_Constructor;

public class Main {
    public static void main(String[] args) {
        // khi không có constructor có tham số
        // JVM sẽ tạo 1 default constuctor
        // ta có thể khởi tạo đối tượng với default constructor mà không xảy ra lỗi

        // nhưng khi có constructor có tham số
        // người dùng bắt buộc phải khai báo tường minh default constructor
        // nếu muốn khởi tạo đối tượng với default constructor

        // dưới đây khởi tạo đối tượng với default constructor mặc dù trong class Student không khai báo
        // nếu trong class Student khai báo thêm 1 constructor có tham số
        // nhưng người dùng không khai báo rõ default constructor
        // dòng khởi tạo đối tượng dưới đây sẽ bị lỗi
        // ( bật tắt comment constructor có tham số trong class Student để kiểm chứng )
        Student3 stuA     = new Student3();
        Student3 stuB = new Student3(30092019, "Quang Khải");
        stuA.showObject();
        stuB.showObject();
    }
}
