package _42_MultiThread.Les33_WAITING_State_Of_Thread;

/*
    Tiếp theo:
        - ta khai báo 1 class: MyThread extends Thread superclass
        - công việc của class này là để khởi tạo 1 thread
        - khi thread của class này bắt đầu chạy nó sẽ:
            - in ra console thread của class này bắt đầu start
            - khởi tạo 1 thread của class MyRunnable, và start luôn
            - gọi đến method join() của thread thuộc class MyRunnable
                ( để báo hệ thống biết là thread của MyThread sẽ đợi thread
                của MyRunnable kết thúc mới tiếp tục chạy )
            - in ra console thread của class này kết thúc end
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("My-Thread start");
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
        try {
            myRunnable.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My-Thread end");
    }
}
