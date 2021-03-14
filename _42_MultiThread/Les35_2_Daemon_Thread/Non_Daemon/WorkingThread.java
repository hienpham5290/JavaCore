package _42_MultiThread.Les35_2_Daemon_Thread.Non_Daemon;

public class WorkingThread implements Runnable{
    @Override
    public void run() {
        while (true) {
            processSomething();
        }
    }

    private void processSomething() {
        try {
            System.out.println("đang xử lý...");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
