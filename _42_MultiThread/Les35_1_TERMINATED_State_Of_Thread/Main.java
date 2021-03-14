package _42_MultiThread.Les35_1_TERMINATED_State_Of_Thread;

/*
    khai báo 1 class Main kèm với main() method
    trong main() method, khai báo và khởi chạy thread của MyThread
    sau đó cho dừng thread của Main khoảng 20 giây, đợi cho thread của MyThread có thời gian
    khai báo và khởi chạy thread của MyRunnable, rồi kết thúc hẳn thread của MyThread, và MyRunnable
    sau đó in ra trạng thái hiện tại thread của MyThread có phải đang trong trạng thái TERMINATED
 */

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        try {
            Thread.sleep(20000);
            System.out.println(myThread.getName() + " : " + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
