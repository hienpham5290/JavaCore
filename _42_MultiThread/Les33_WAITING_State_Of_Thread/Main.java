package _42_MultiThread.Les33_WAITING_State_Of_Thread;

/*
    Ở Main class, trong main() method, chỉ cần khởi tạo thread của MyThread class
    và khởi chạy thread đó
    sau đó đợi khoảng 100 millisecond thì getState() trạng thái của thread đó
    phải đợi 1 khoảng thời gian, rồi mới in trạng thái của myThread là vì
    để cho myThread có thời gian để khởi tạo myRunnable, rồi myThread rơi vào WAITING
    nếu in nhanh quá có thể sẽ không thấy trạng thái WAITING của myThread
 */

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        try {
            Thread.sleep(100);
            System.out.println(myThread.getName() + " : " + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
