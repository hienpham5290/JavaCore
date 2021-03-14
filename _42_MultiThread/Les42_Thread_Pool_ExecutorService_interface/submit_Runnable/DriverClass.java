package _42_MultiThread.Les42_Thread_Pool_ExecutorService_interface.submit_Runnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DriverClass {
    public static void main(String[] args) throws InterruptedException {
        // khởi tạo Thread Pool
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // khởi tạo danh sách các đối tượng của Future
        List<Future> futureList = new ArrayList<Future>();

        for (int i = 0; i < 10; i++) {
            MyRunnable myRunnable = new MyRunnable("Thread " + (i+1));
            // truyền Runnable vào submit(), mà kết quả của submit() quản lý bởi object của Future
            Future future = executorService.submit(myRunnable);
            // add mỗi object của Future vào futureList, từng future sẽ quản lý 1 Runnable
            futureList.add(future);
        }

        for (Future future : futureList) {
            try {
                System.out.println(future.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
