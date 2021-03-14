package _42_MultiThread.Les34_TIMED_WAITING_State_Of_Thread;

/*
    khai báo 1 class Main kèm với main() method
    trong main() method, khai báo và khởi chạy thread của MyThread
    sau đó cho dừng khoảng 1 giây, đợi cho thread của MyThread có thời gian
    khai báo và khởi chạy thread của MyRunnable
    sau đó in ra trạng thái hiện tại thread của MyThread có phải đang trong trạng thái TIMED_WAITING
 */

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        try {
            Thread.sleep(1000);
            System.out.println(myThread.getName() + " : " + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
