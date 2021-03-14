package _42_MultiThread.Les35_2_Daemon_Thread.Daemon;

public class Main {
    public static void main(String[] args) {
        WorkingThread workingThread = new WorkingThread();
        Thread daemonThread = new Thread(workingThread);
        daemonThread.setDaemon(true);
        daemonThread.start();

        // cho Main thread ngủ 5 giây
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // sau 5 giây, xuất thông báo Main thread kết thúc
        // ta thấy sau khi Main thread kết thúc, daemon thread cũng kết thúc theo
        // dù cho daemon thread công việc của nó là lặp vô hạn
        System.out.println(">>> Main Thread End <<<");
    }
}
