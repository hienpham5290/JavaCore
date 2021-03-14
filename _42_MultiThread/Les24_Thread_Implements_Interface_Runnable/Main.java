package _42_MultiThread.Les24_Thread_Implements_Interface_Runnable;

public class Main {
    public static void main(String[] args) {
        CountDownThread countDownThread = new CountDownThread();

        // để khởi động 1 thread ta cần start() method chỉ có ở Thread class
        // do đó cần phải khởi tạo 1 object, tham số truyền vào chính là thread cần start
        Thread thread = new Thread(countDownThread);
        thread.start();
    }
}
