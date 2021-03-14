package _42_MultiThread.Les22_Thread_Class_Example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // yêu cầu người dùng nhấn 1 phím bất kỳ để khởi động vòng xoay
        System.out.println("Nhấn phím bất kỳ để khởi động vòng xoay: ");
        scanner.nextLine();

        // khai báo 1 object của của CountTheNumberThread ( khai báo 1 Thread )
        CountTheNumberThread countTheNumberThread = new CountTheNumberThread();

        // khởi chạy Thread này thông qua start() method của superclass Thread class
        // khi start, Thread này sẽ chạy liên tục, đến khi nhận được tín hiệu ngừng
        countTheNumberThread.start();

        // yêu cầu người dùng nhấn 1 phím bất kỳ để kết thúc vòng xoay
        // lưu ý là Thread countTheNumberThread vẫn đang run
        System.out.println("Nhấn phím bất kỳ để kết thúc vòng xoay");
        scanner.nextLine();

        // khi người dùng nhấn phím bất kỳ kết thúc Thread vòng xoay
        // thực hiện gọi phương thức kết thúc Thread vòng xoay thông qua end() method đã được setup
        countTheNumberThread.end();

        // in ra con số tại thời điểm phát tín hiệu ngừng Thread vòng xoay
        System.out.println("Con số may mắn là: " + countTheNumberThread.getCount());
    }
}
