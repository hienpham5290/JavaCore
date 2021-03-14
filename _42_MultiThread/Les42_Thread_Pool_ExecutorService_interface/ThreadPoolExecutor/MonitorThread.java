package _42_MultiThread.Les42_Thread_Pool_ExecutorService_interface.ThreadPoolExecutor;

import java.util.concurrent.ThreadPoolExecutor;

public class MonitorThread implements Runnable{
    private ThreadPoolExecutor threadPoolExecutor;
    private int second;
    private boolean run = true;

    public MonitorThread(ThreadPoolExecutor threadPoolExecutor, int delay) {
        this.threadPoolExecutor = threadPoolExecutor;
        this.second = delay;
    }

    public void shutdown() {
        this.run = false;
    }

    @Override
    public void run() {
        while (run) {
            System.out.println(String.format(
                    "[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                    this.threadPoolExecutor.getCorePoolSize(),
                    this.threadPoolExecutor.getMaximumPoolSize(),
                    this.threadPoolExecutor.getActiveCount(),
                    this.threadPoolExecutor.getCompletedTaskCount(),
                    this.threadPoolExecutor.getTaskCount(),
                    this.threadPoolExecutor.isShutdown(),
                    this.threadPoolExecutor.isTerminated()
            ));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
