package _8_This_Parameter_Constructor;

/**
 * sử dụng this như 1 tham số của constructor
 *
 * cách này rất hữu ích nếu ta sử dụng 1 đối tượng trong nhiều lớp
 *
 * [ CÁCH SỬ DỤNG CƠ BẢN ]
 * lớp 1 có 1 phương thức, trong phương thức đó, tạo 1 đối tượng từ constructor của lớp 2
 * tham số truyền vào cho constructor là từ khóa this ( instance của lớp 1 )
 * lớp 2 có 1 field mà kiểu giá trị của field đó chính là lớp 1
 * lớp 2 có 1 constructor, mà tham số truyền vào constructor đó có kiểu là lớp 1
 *
 */

public class Student8 {
    int id;
    String name;

    public Student8() {
        this.id = 10;
        this.name = "HIEN";
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    void ShowStudent8() {
        HelpPrint helpPrint = new HelpPrint(this);
        helpPrint.printInHelp();
    }

    public static void main(String[] args) {
        Student8 student8 = new Student8();
        student8.ShowStudent8();
    }
}
