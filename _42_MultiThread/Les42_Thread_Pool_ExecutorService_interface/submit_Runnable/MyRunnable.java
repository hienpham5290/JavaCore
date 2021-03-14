package _42_MultiThread.Les42_Thread_Pool_ExecutorService_interface.submit_Runnable;

public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " đang thực thi...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " kết thúc.");
    }
}
