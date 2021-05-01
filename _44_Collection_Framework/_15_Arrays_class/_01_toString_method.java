package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;

public class _01_toString_method {
    public static void main(String[] args) {
        byte[] byteArray = {10, 20, 30};
        System.out.println(Arrays.toString(byteArray));

        short[] shortArray = {40, 50, 60};
        System.out.println(Arrays.toString(shortArray));

        int[] intArray = {70, 80, 90};
        System.out.println(Arrays.toString(intArray));

        long[] longArray = {100, 200, 300};
        System.out.println(Arrays.toString(longArray));

        double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println(Arrays.toString(doubleArray));

        char[] charArray = {'A', 'B', 'C'};
        System.out.println(Arrays.toString(charArray));

        boolean[] booleanArray = {true, false, true};
        System.out.println(Arrays.toString(booleanArray));

        String[] stringArray = {"Hi", "There", "Yummy"};
        System.out.println(Arrays.toString(stringArray));
    }
}
