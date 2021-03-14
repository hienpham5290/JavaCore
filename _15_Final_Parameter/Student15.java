package _15_Final_Parameter;

/**
 * tham số final
 *
 * khi truyền giá trị cho 1 phương thức có tham số là final, thì giá trị đó chỉ được sử dụng chứ không thể thay đổi
 *
 */

public class Student15 {
    int age;

    void setAge(final int age) {
//        this.age = age++; // ở đây sẽ báo lỗi, vì tham số truyền vào là thuộc tính final, lệnh này thay đổi giá trị là không được
    }

    public static void main(String[] args) {
        Student15 student15 = new Student15();
        student15.setAge(18);
    }
}
