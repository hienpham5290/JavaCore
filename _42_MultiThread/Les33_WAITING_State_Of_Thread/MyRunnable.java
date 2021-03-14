package _42_MultiThread.Les33_WAITING_State_Of_Thread;

/*
    Khai báo 1 class: MyRunnable implements Runnable interface
    class này chỉ đơn giản là 1 lớp để khởi tạo 1 thread bình thường
    và khi thread của class này được khởi tạo công việc của nó chỉ là
        - in ra console thread bắt đầu start
        - sau đó làm 1 công việc gì đó trong 1 khoảng thời gian
            ( nhằm mục đích có thời gian để in trạng thái của thread khác đang
            đợi thread của class này )
        - in ra console thread đã end
 */

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("My-Runnable start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 10; i > 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("My-Runnable end");
    }
}
