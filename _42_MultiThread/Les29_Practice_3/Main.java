package _42_MultiThread.Les29_Practice_3;

import java.util.Scanner;

/*
    Tạo luồng từ lớp luồng vô danh implements interface Runnable
    người dùng nhập vào 1 số trong dãy 0-100
    khởi tạo 2 luồng đồng thời đoán số người dùng nhập vào
 */

public class Main {
    public static void main(String[] args) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số trong dãy 0 - 100: ");
        userNumber = scanner.nextInt();
        Runnable anonymousThread = new Runnable() {
            int randomNumber;
            int count = 0;
            @Override
            public void run() {
                do {
                    randomNumber = (int) (Math.random() * 100 + 1);
                    count++;
                    System.out.println(Thread.currentThread().getName() + " đoán số: " + randomNumber);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (randomNumber != userNumber);
                System.out.println(Thread.currentThread().getName() + " đoán số: " + randomNumber + " trong: " + count + " lần đoán.");
            }
        };

        Thread thread1 = new Thread(anonymousThread);
        thread1.setName("Thread 1");

        Thread thread2 = new Thread(anonymousThread);
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
