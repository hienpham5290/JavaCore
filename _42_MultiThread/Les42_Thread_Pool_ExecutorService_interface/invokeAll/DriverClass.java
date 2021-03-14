package _42_MultiThread.Les42_Thread_Pool_ExecutorService_interface.invokeAll;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class DriverClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // khai báo object quản lý Thread Pool
        // khởi tạo Thread Pool thông qua method định nghĩa Thread Pool của Executors class
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // khai báo object List quản lý các Callable<String>
        List<Callable<String>> callableList = new ArrayList<Callable<String>>();

        // khởi tạo 10 Callable<String> từ anonymous class thông qua forloop
        // với mỗi loop add tương ứng object từ anonymous class từ Callable<String>
        for (int i = 0; i < 10; i++) {
            final int _i = i + 1;
            callableList.add(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "Callable " + _i;
                }
            });
        }

        // ta muốn thực thi 1 list thành các thread, nên dùng invokeAll()
        // invokeAll() trả về kết quả của tất cả các thread trong list,
        // nên ta dùng list các Future<String> quản lý
        List<Future<String>> futureList = executorService.invokeAll(callableList);

        // dùng foreach duyệt qua từng phần tử trong futureList, lấy kết quả sau khi thực thi callableList
        for (Future<String> future : futureList) {
            System.out.println(future.get() + " thực thi xong");
        }

        // đóng Thread Pool
        executorService.shutdown();
    }
}
