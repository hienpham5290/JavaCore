package _42_MultiThread.Les41_Thread_Pool_Executors_Class.newSingleThreadExecutors;

public class MyRunnable implements Runnable {
    // Tên của Runnable, giúp chúng ta phân biệt Runnable nào đang thực thi trong Thread Pool
    private String name;

    // khởi tạo Runnable với biến name truyền vào
    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " : đang thực thi...");
        // giả lập thời gian chạy của Runnable mất 2 giây
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " : kết thúc.");
    }
}
