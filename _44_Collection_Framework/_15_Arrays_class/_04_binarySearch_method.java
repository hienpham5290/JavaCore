package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;

public class _04_binarySearch_method {
    public static void main(String[] args) {
        byte[] bytesArray = {9, 8, 7, 6};
        Arrays.sort(bytesArray);
        System.out.println("bytesArray: " + Arrays.toString(bytesArray));
        System.out.println("7 index=" + Arrays.binarySearch(bytesArray, (byte) 7));
        System.out.println("10 index=" + Arrays.binarySearch(bytesArray, (byte) 10));
        System.out.println("3 index=" + Arrays.binarySearch(bytesArray, (byte) 3));

        short[] shortsArray = {99, 88, 77, 66};
        Arrays.sort(shortsArray);
        System.out.println("shortsArray: " + Arrays.toString(shortsArray));
        System.out.println("77 index=" + Arrays.binarySearch(shortsArray, (short) 77));
        System.out.println("100 index=" + Arrays.binarySearch(shortsArray, (short) 100));
        System.out.println("55 index=" + Arrays.binarySearch(shortsArray, (short) 55));

        int[] intsArray = {99, 88, 77, 66};
        Arrays.sort(intsArray);
        System.out.println("intsArray: " + Arrays.toString(intsArray));
        System.out.println("77 index=" + Arrays.binarySearch(intsArray, 77));
        System.out.println("100 index=" + Arrays.binarySearch(intsArray, 100));
        System.out.println("55 index=" + Arrays.binarySearch(intsArray, 55));

        long[] longsArray = {99, 88, 77, 66};
        Arrays.sort(longsArray);
        System.out.println("longsArray: " + Arrays.toString(longsArray));
        System.out.println("66 index=" + Arrays.binarySearch(longsArray, 66));
        System.out.println("120 index=" + Arrays.binarySearch(longsArray, 120));
        System.out.println("23 index=" + Arrays.binarySearch(longsArray, 23));

        double[] doublesArray = {99.9, 88.8, 77.7, 66.6};
        Arrays.sort(doublesArray);
        System.out.println("doublesArray: " + Arrays.toString(doublesArray));
        System.out.println("88.8 index=" + Arrays.binarySearch(doublesArray, 88.8));
        System.out.println("199.99 index=" + Arrays.binarySearch(doublesArray, 199.99));
        System.out.println("25.52 index=" + Arrays.binarySearch(doublesArray, 25.52));

        char[] charsArray = {'z', 'y', 'x', 'v'};
        Arrays.sort(charsArray);
        System.out.println("charsArray: " + Arrays.toString(charsArray));
        System.out.println("x index=" + Arrays.binarySearch(charsArray, 'x'));
        System.out.println("a index=" + Arrays.binarySearch(charsArray, 'a'));

        String[] stringsArray = {"zzz", "xxx", "vvv", "uuu"};
        Arrays.sort(stringsArray);
        System.out.println("stringsArray: " + Arrays.toString(stringsArray));
        System.out.println("vvv index=" + Arrays.binarySearch(stringsArray, "vvv"));
        System.out.println("zzzzz index=" + Arrays.binarySearch(stringsArray, "zzzzz"));
        System.out.println("aaa index=" + Arrays.binarySearch(stringsArray, "aaa"));

        boolean[] booleansArray = {true, false, true, false, false};
//        Arrays.sort(booleansArray); // compile time error
        // không có method nào dùng để sort kiểu boolean
        // dẫn đến không thể tìm kiếm trong mảng boolean
        System.out.println("booleansArray: " + Arrays.toString(booleansArray));
    }
}
