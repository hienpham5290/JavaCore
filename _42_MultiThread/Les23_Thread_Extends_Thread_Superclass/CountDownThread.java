package _42_MultiThread.Les23_Thread_Extends_Thread_Superclass;

/*
    Khai báo 1 class, là thread cần run, extends từ Thread class
 */

public class CountDownThread extends Thread{
    @Override
    public void run() {
        int count = 10;

        // vòng for, chừng nào count > 0 mà true, thì còn chạy, = 0 thì sẽ false và dừng
        for (int i = count; i > 0; i--) {
            System.out.println(i);

            // nếu đơn giản là vòng for giảm dần, giá trị in ra sẽ không giống với bộ đếm giây
            // vì for loop chạy theo độ khó, chứ không chạy theo thời gian ta cần
            // vì vậy, cứ in ra 1 con số, ta cho vòng for hay thread này sleep 1 giây
            // sau khi thread này wake up và in ra 1 giá trị ta lại cho sleep 1 giây
            // cứ lặp lại như thế đến khi gặp điều kiện dừng
            // sử dụng sleep() method của Thread class, truyền vào giá trị là 1000 ( 1000 millis = 1 second )
            // và khi thực hiện method này phải catch exception của nó
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hết giờ");
    }
}
