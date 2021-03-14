package _42_MultiThread.Les32_BLOCKED_State_Of_Thread;

/*
    Khai báo 1 class Main
    khởi tạo nhiều thread, sau đó khởi động các thread này
    in ra trạng thái của các thread, để kiểm tra xem nếu các thread
    đều gọi đến 1 đối tượng được đánh dấu synchronized sẽ như thế nào
 */

public class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();

        myThread1.setName("Thread 1");
        myThread2.setName("Thread 2");
        myThread3.setName("Thread 3");
        myThread4.setName("Thread 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        System.out.println(myThread1.getName() + " : " + myThread1.getState());
        System.out.println(myThread2.getName() + " : " + myThread2.getState());
        System.out.println(myThread3.getName() + " : " + myThread3.getState());
        System.out.println(myThread4.getName() + " : " + myThread4.getState());
    }
}
