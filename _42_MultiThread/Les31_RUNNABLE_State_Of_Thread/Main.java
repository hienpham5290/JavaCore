package _42_MultiThread.Les31_RUNNABLE_State_Of_Thread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
    }
}
