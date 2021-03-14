package _42_MultiThread.Les32_BLOCKED_State_Of_Thread;

/*
    Khai báo 1 class có name: DemoSynchronization
    trong class này, khai báo 1 method có name: commonResource
    đây là 1 static method, và được đánh dấu synchronized
    công việc của method này chỉ là việc lặp lại 1 khoảng thời gian
    đủ để khi có 2 thread cùng gọi đến sẽ có 1 thread rơi vào trạng thái BLOCKED
 */

public class DemoSynchronization {
    public static synchronized void commonResource() {
        long millisecond1 = System.currentTimeMillis();
        while (true) {
            long millisecond2 = System.currentTimeMillis();
            long result = millisecond2 - millisecond1;
            if (result == 10000) {
                break;
            }
        }
    }
}
