package _14_Static_Final_Variable;

/**
 * biến static final trống
 *
 * là biến final thêm thuộc tính static nhưng chưa gán giá trị khi khai báo biến
 *
 * biến static final trống chỉ được gán giá trị trong khối static
 *
 */

public class Student14 {
    static final String NAME_UNI;
    static {
        NAME_UNI = "HKT University";
    }

    public static void main(String[] args) {
        Student14 student14 = new Student14();
        System.out.println(student14.NAME_UNI);
    }
}
