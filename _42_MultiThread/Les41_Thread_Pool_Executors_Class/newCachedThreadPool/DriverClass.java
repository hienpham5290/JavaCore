package _42_MultiThread.Les41_Thread_Pool_Executors_Class.newCachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DriverClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            MyRunnable myRunnable = new MyRunnable("Thread " + (i + 1));
            executorService.execute(myRunnable);
        }
        executorService.shutdown();
    }
}
