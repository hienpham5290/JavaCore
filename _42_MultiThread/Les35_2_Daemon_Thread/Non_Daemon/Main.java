package _42_MultiThread.Les35_2_Daemon_Thread.Non_Daemon;

public class Main {
    public static void main(String[] args) {
        Thread nonDaemonThread = new Thread(new WorkingThread(), "My Non-Daemon Thread");
        nonDaemonThread.start();

        // continue program
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // xuất dòng thông báo main thread kết thúc
        // nhưng thread mà ta khởi tạo vì nó là non-Daemon
        // công việc của nó là in ra vô hạn với while(true)
        // main thread cũng là non-daemon, và nó kết thúc,
        // nhưng working thread vẫn hoạt động
        System.out.println(">>> Finishing main program <<<");
    }
}
