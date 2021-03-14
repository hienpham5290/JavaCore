package _40_Anonymous_Inner_Class.Phan_Loai_Lop_Vo_Danh;

public class FromInterface {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng r, từ 1 lớp vô danh, lớp vô danh implements interface Runnable
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("đối tượng r đã được khởi tạo từ lớp vô danh implements interface Runnable");
            }
        };

        // run đối tượng r
        r.run();
    }
}
