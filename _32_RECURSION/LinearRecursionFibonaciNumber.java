package _32_RECURSION;

import java.util.Scanner;

/**
 *
 * Bài toán tìm dãy số fibonaci theo yêu cầu
 *
 *
 */
class Fibonaci{
    static void NoRecursion(int n) {
        long f0 = 0L;
        long f1 = 1L;
        long f2 = f0 + f1;

        for (int i = 0; i < n; i++) {
            System.out.print(f0 + "\t");
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
    }
}

public class LinearRecursionFibonaciNumber {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số lượng số fibonaci đầu tiên: ");
        n = scanner.nextInt();
        scanner.close();

        // KHÔNG DÙNG RECURSION
        Fibonaci.NoRecursion(n);
        // DÙNG RECURSION

    }
}
