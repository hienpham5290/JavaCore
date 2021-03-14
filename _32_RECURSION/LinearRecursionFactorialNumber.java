package _32_RECURSION;

import java.util.Scanner;

/**
 *      Linear Recursion - Đệ quy tuyến tính
 *
 *      Bài toán tính giai thừa - factorial numer
 *
 * Cho n là một số tự nhiên (n>=0). Hãy tính giai thừa của n (n!) biết rằng 0!=1 và n!=(n-1)! x n.
 *
 * Phân tích :
 * Theo giả thiết, ta có : n! = (n-1)! x n. Như vậy :
 *      Để tính n! ta cần phải tính (n-1)!
 *      Để tính (n-1)! ta phải tính (n-2)!
 *      ...
 * Cứ như vậy, cho tới khi gặp trường hợp 0!. Khi đó ta lập tức có được kết quả là 1, không cần phải tính thông qua một kết quả trung gian khác.
 *
 */

public class LinearRecursionFactorialNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tính factorial number: ");
        number = scanner.nextInt();
        System.out.println("Factorial number của " + number + " là: " + calculateFactorial(number));
    }

    static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }
}
