package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;

public class _03_sort_method {
    public static void main(String[] args) {
        byte[] bytesArray = {99, 88, 77, 66};
        Arrays.sort(bytesArray);
        System.out.println("bytesArray: " + Arrays.toString(bytesArray));

        short[] shortsArray = {99, 88, 77, 66};
        Arrays.sort(shortsArray);
        System.out.println("shortsArray: " + Arrays.toString(shortsArray));

        int[] intsArray = {99, 88, 77, 66};
        Arrays.sort(intsArray);
        System.out.println("intsArray: " + Arrays.toString(intsArray));

        long[] longsArray = {99, 88, 77, 66};
        Arrays.sort(longsArray);
        System.out.println("longsArray: " + Arrays.toString(longsArray));

        double[] doublesArray = {99.9, 88.8, 77.7, 66.6};
        Arrays.sort(doublesArray);
        System.out.println("doublesArray: " + Arrays.toString(doublesArray));

        char[] charsArray = {'z', 'y', 'x', 'v'};
        Arrays.sort(charsArray);
        System.out.println("charsArray: " + Arrays.toString(charsArray));

        String[] stringsArray = {"zzz", "xxx", "vvv", "uuu"};
        Arrays.sort(stringsArray);
        System.out.println("stringsArray: " + Arrays.toString(stringsArray));

        boolean[] booleansArray = {true, false, true, false, false};
//        Arrays.sort(booleansArray); // compile time error
        // không có method nào dùng để sort kiểu boolean
        System.out.println("booleansArray: " + Arrays.toString(booleansArray));
    }
}
