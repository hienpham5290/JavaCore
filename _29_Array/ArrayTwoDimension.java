package _29_Array;

import java.util.Arrays;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3]; // default array - do khai báo đầy đủ chỉ số
        int[][] arr4 = new int[3][]; // null array - do không khai báo đầy đủ chỉ số
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr3;
        arr3 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));
        System.out.println();

        // dùng vòng for lồng phương thức copyOf vào trong copy từng mảng con trong mảng lớn
        for (int i = 0; i < arr2.length; i++) {
            arr1[i] = Arrays.copyOf(arr2[i], arr2[i].length);
        }

        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = Arrays.copyOf(arr3[i], arr3[i].length);
        }

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));
        System.out.println();

        arr2[2][2] = 0;
        arr3[2][2] = 0;

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));
        System.out.println();

        int[][] arr5 = new int[3][];

        for (int i = 0; i < arr1.length; i++) {
            arr5[i] = Arrays.copyOfRange(arr1[i], 1, 4);
        }

        System.out.println(Arrays.deepToString(arr5));
        System.out.println();


        System.out.println(Arrays.deepEquals(arr1, arr2));

    }
}
