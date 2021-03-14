package _20_Static_Block;

public class Student20 {
    int id;
    static String college;
    static int count;


    public static void main(String[] args) {
        System.out.println("\nMain method: Hello");
        System.out.println(Student20.college);
        System.out.println(Student20.count);
        System.out.println("Vì khối static chạy trước main");
        System.out.println("Nên giá trị của biến thành viên mới tồn tại");
    }

    static {
        college = "123 University";
        count = 1;
        System.out.println("\"Khối static viết sau, \nnhưng sẽ thực hiện trước cả main method\"\nStatic block: Hello");
        System.out.println("--------------------------------------------------------------------");
    }

}
