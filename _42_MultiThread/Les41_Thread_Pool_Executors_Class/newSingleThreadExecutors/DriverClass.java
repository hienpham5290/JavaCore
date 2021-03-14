package _42_MultiThread.Les41_Thread_Pool_Executors_Class.newSingleThreadExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DriverClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            MyRunnable myRunnable = new MyRunnable("MyRunnable " + i);
            executorService.execute(myRunnable);
        }
        executorService.shutdown();
    }
}
