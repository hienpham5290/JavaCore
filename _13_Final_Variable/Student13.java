package _13_Final_Variable;

/**
 * biến final
 * <p>
 * là biến được khai báo đi kèm với từ khóa final trước tên kiểu dữ liệu
 * biến final phải được VIẾT HOA
 * biến final được hiểu như là 1 hằng số, và không thể thay đổi
 * <p>
 * ----------------------------------------------------------
 * <p>
 * biến final trống
 * <p>
 * là biến được khai báo là final, nhưng không được gán giá trị
 * giá trị của biến final trống sẽ được gán trong constructor
 */
public class Student13 {
    final int ID;
    final String UNI_NAME = "Universal University";

    public Student13(int ID) {
        this.ID = ID; // do ID là biến final trống, chưa được gán giá trị, nên sẽ được gán giá trị trong constructor
    }

//    void ChangeID() {
//        this.ID = 888; // sau khi khởi tạo đối tượng, biến ID đã được gán giá trị, và giá trị này sẽ không thể thay đổi
//    }
//
//    void ChangeUNI() {
//        this.UNI_NAME = "HKT"; // biến UNI_NAME đã được gán giá trị, và là biến final nên không thể thay đổi giá trị
//    }

    public static void main(String[] args) {
        Student13 student13 = new Student13(999);
//        student13.ChangeID();
//        student13.ChangeUNI();
    }
}
