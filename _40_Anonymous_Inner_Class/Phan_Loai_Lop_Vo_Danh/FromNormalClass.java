package _40_Anonymous_Inner_Class.Phan_Loai_Lop_Vo_Danh;

public class FromNormalClass {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng t, từ 1 lớp vô danh kế thừa lớp Thread
        Thread t = new Thread() {
            public void run() {
                System.out.println("đối tượng t đã được khởi tạo từ lớp vô danh extends từ Thread class");
            }
        };

        // run đối tượng t
        t.start();
    }
}
