package _30_ArrayWithScanner;

import java.util.Scanner;

/**
 * thực hiện nhập số phần tử của mảng 1 chiều từ bàn phím
 * nhập giá trị các phần tử của mảng từ bàn phím
 */

public class ArrayWithScanner {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int m; // row
        System.out.print("m = ");
        m = scanner.nextInt();

        int n; //  collum
        System.out.print("n = ");
        n = scanner.nextInt();

        int[] arr1 = new int[n];

//        nhapMang(arr1);
//        inMang(arr1);
//

        int[][] arr2 = new int[m][n];

        nhapMang2Chieu(arr2);
        inMang2Chieu(arr2);
    }


    public static void nhapMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void inMang(int[] ar) {
        for (int value : ar) {
            System.out.println(value);
        }
    }

    public static void nhapMang2Chieu(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void inMang2Chieu(int[][] arr) {
        for (int[] ar : arr) {
            for (int a : ar) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }
}
