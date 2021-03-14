package _42_MultiThread.Les35_1_TERMINATED_State_Of_Thread;

/*
    khai báo 1 thread class: MyRunnable implements Runnable
    class này chỉ dùng để khai báo 1 thread object bình thường
    dùng để thực thi công việc:
        in ra thông báo thread này start
        cho chạy vòng lặp đủ 10 giây thì thoát
        in ra thông báo thread này end
 */

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable start");
        long currentTime = System.currentTimeMillis();
        while (true) {
            long currentTime2 = System.currentTimeMillis();
            long result = currentTime2 - currentTime;
            if (result == 10000) {
                break;
            }
        }
        System.out.println("MyRunnable end");
    }
}
