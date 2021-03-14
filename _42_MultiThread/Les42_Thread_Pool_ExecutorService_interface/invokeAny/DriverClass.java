package _42_MultiThread.Les42_Thread_Pool_ExecutorService_interface.invokeAny;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DriverClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // khai báo 1 Thread Pool thông qua newFixedThreadPool của Executors
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // khai báo 1 list các Callable<String>
        List<Callable<String>> callableList = new ArrayList<Callable<String>>();

        // dùng for loop add từng object từ lớp vô danh extends từ Callable<String>
        for (int i = 0; i < 10; i++) {
            final int _i = i;
            callableList.add(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "Callable " + (_i+1);
                }
            });
        }

        // dùng object executorService invokeAny callableList
        // method này sẽ trả về kết quả của thread đầu tiên thực thi xong
        // và kết thúc luôn việc thực thi, dù các thread khác chưa được thực thi
        String result = executorService.invokeAny(callableList);
        System.out.println("Result " + result);

        // sau khi thực thi thread xong đóng Thread Pool lại
        executorService.shutdown();
    }
}
