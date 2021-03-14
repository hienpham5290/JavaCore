package _42_MultiThread.Les24_Thread_Implements_Interface_Runnable;

/*
    Khai báo 1 class, là thread ta cần, và class này implements Runnable interface
 */

public class CountDownThread implements Runnable{
    @Override
    public void run() {
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hết giờ");
    }
}
