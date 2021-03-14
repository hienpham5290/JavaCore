package _40_Anonymous_Inner_Class.Phan_Loai_Lop_Vo_Danh;

public class IsParameterForMethod {
    public static void main(String[] args) {
        // khởi tạo đối tượng t
        // truyền tham số vào Constructor
        // tham số là 1 đối tượng vô danh, từ 1 lớp vô danh implements interface Runnable
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("đối tượng t đã được khởi tạo, bằng việc truyền 1 đối tượng vô danh vào Constructor");
                System.out.println("đối tượng vô danh này được khởi tạo từ 1 lớp vô danh, lớp vô danh implements interface Runnable");
            }
        });

        // run đối tượng t
        t.start();
    }
}
