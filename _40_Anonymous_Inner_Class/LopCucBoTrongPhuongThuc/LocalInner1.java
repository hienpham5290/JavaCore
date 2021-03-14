package _40_Anonymous_Inner_Class.LopCucBoTrongPhuongThuc;

public class LocalInner1 {
    private int data = 30; // biến instance

    public void Display() {
        int value = 50; // trước jdk 1.7 phải là "final int value = 50;"
        class LocalInnerClassInMethod {
            void message() {
                System.out.println("Gọi từ phương thức của lớp nằm trong phương thức của lớp bao");
                System.out.println("gọi biến local: " + value);
            }
        }
        LocalInnerClassInMethod l = new LocalInnerClassInMethod();
        l.message();
    }
    public static void main(String[] args) {
        LocalInner1 L = new LocalInner1();
        L.Display();
//        LocalInnerClassInMethod l = new LocalInnerClassInMethod(); // không thể gọi từ đây
    }
}
