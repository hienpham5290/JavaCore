package _01_Class_Object;

/**
 * khởi tạo đối tượng mặc định từ constructor mặc định
 * thay đổi giá trị trạng thái của đối tượng thông qua phương thức của đối tượng
 */

public class Student2 {
    int     id;
    String  name;

    Student2 (){

    }

    // method chèn bản ghi
    void insertRecord(int id, String name) {
        this.id     =   id;
        this.name   =   name;
    }

    // method show bản ghi
    void showInfo() {
        System.out.println(this.id + " - " + this.name);
    }



    // chương trình chính
    public static void main(String[] args) {
        Student2 student21 = new Student2();
        Student2 student22 = new Student2();

        student21.insertRecord(12, "Hien");
        student22.insertRecord(13, "Khai");

        student21.showInfo();
        student22.showInfo();
    }
}
