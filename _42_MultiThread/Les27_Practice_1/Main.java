package _42_MultiThread.Les27_Practice_1;

/*
    yêu cầu người dùng nhập vào 1 con số trong dãy từ 0 đến 100
    khởi chạy 2 luồng, 2 luồng này sẽ lần lượt đoán số bằng cách chọn ngẫu nhiên
    1 số trong dãy từ 0 đến 100
    nếu kết quả in ra trùng với số người dùng nhập, luồng sẽ dừng lại
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        do {
            System.out.println("Nhập vào 1 số trong dãy từ 0 đến 100: ");
            userNumber = scanner.nextInt();
        } while (userNumber < 0 || userNumber > 100);


        GuessNumberThread thread1 = new GuessNumberThread(userNumber);
        GuessNumberThread thread2 = new GuessNumberThread(userNumber);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
