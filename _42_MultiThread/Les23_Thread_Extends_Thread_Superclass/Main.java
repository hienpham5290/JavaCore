package _42_MultiThread.Les23_Thread_Extends_Thread_Superclass;

public class Main {
    public static void main(String[] args) {
        CountDownThread countDownThread = new CountDownThread();
        countDownThread.start();
    }
}
