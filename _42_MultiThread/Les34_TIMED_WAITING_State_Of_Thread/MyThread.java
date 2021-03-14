package _42_MultiThread.Les34_TIMED_WAITING_State_Of_Thread;

/*
    khai báo 1 thread class: MyThread extends Thread
    thread này có nhiệm vụ là khởi tạo và khởi chạy 1 thread khác
    sau đó thread này dừng lại trong 1 khoảng thời gian nhất định
    đợi cho thread của MyRunnable chạy, trong khoảng thời gian thread MyRunnable chưa kết thúc
    nếu hết giờ thread này sẽ tiếp tục chạy, dù thread của MyRunnble có kết thúc hay chưa
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread start");
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
        try {
            myRunnable.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread end");
    }
}
