package _42_MultiThread.Les32_BLOCKED_State_Of_Thread;

/*
    Khai báo 1 thread class, có name: MyThread
    method khởi chạy của đối tượng thuộc thread class này
    là gọi đến method commonResource của DemoSynchronization class
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        DemoSynchronization.commonResource();
    }
}
