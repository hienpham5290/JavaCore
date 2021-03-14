package _30_ArrayWithScanner;

import java.util.Scanner;

public class ArrayAccessElement {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println();

        int i = 0;
        while (i < a.length) {
            System.out.print(a[i] + "\t");
            i++;
        }
    }
}
