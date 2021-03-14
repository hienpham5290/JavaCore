package _42_MultiThread.Les35_2_Daemon_Thread.Daemon;

public class WorkingThread implements Runnable{
    @Override
    public void run() {
        processSomething();
    }

    private void processSomething() {
        while (true) {
            System.out.println("daemon thread đang xử lý...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
