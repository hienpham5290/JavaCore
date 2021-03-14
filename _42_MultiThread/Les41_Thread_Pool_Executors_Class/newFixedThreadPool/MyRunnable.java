package _42_MultiThread.Les41_Thread_Pool_Executors_Class.newFixedThreadPool;

public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " đang thực thi...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " kết thúc.");
    }
}
