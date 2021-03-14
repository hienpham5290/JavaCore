package _42_MultiThread.Les42_Thread_Pool_ExecutorService_interface.submit_Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DriverClass {
    public static void main(String[] args) throws InterruptedException{
        // dùng Executors class khởi tạo Thread Pool có pool size = 5, dùng newFixedThreadPool(5)
        // trả về cho object executorService của ExecutorService interface quản lý
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // khởi tạo ArrayList chứa các object kiểu Future<String>
        // trả về cho object futureList của List<Future<String>> quản lý
        List<Future<String>> futureList = new ArrayList<Future<String>>();

        // dùng for loop khởi tạo 10 Callable
        // mỗi lần khởi tạo Callable, dùng submit(Callable) thực thi thread
        // kết quả trả về cho object future của Future<String> <-- do MyCallable thực thi xong trả về String
        // nên Future cũng sẽ định nghĩa chỉ nhận giá trị String
        // add object future và futureList
        for (int i = 0; i < 10; i++) {
            MyCallable myCallable = new MyCallable("Thread " + (i+1));
            Future<String> future = executorService.submit(myCallable);
            futureList.add(future);
        }

        // dùng foreach duyệt qua futureList, lấy những object của kiểu Future<String>
        // với mỗi object future call get() method để lấy kết quả trả về sau khi thread thực thi xong
        for (Future<String> future : futureList) {
            try {
                System.out.println(future.get() + " kết thúc");
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
