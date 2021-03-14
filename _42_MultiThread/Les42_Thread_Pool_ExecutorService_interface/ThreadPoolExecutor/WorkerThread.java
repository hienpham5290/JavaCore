package _42_MultiThread.Les42_Thread_Pool_ExecutorService_interface.ThreadPoolExecutor;

public class WorkerThread implements Runnable{
    private String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Starting... Task = " + taskName);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " Finished///");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "Task = " + taskName;
    }
}

