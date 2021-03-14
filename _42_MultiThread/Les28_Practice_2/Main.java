package _42_MultiThread.Les28_Practice_2;

/*
    yêu cầu người dùng nhập vào 1 con số trong dãy từ 0 đến 100
    khởi chạy 2 luồng, 2 luồng này sẽ lần lượt đoán số bằng cách chọn ngẫu nhiên
    1 số trong dãy từ 0 đến 100
    nếu kết quả in ra trùng với số người dùng nhập, luồng sẽ dừng lại

    LỚP KHỞI TẠO LUỒNG SẼ IMPLEMENTS INTERFACE RUNNABLE
 */

public class Main {
    public static void main(String[] args) {
        GuessNumberThread guessNumberThread1 = new GuessNumberThread(20);
        GuessNumberThread guessNumberThread2 = new GuessNumberThread(20);

        Thread thread1 = new Thread(guessNumberThread1);
        Thread thread2 = new Thread(guessNumberThread2);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
