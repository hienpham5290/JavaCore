package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;

public class _07_copyOfRange_method {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("ints: " + Arrays.toString(ints));
        int[] ints1 = Arrays.copyOfRange(ints, 2, 5);
        System.out.println("ints1: " + Arrays.toString(ints1));

        double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("doubles: " + Arrays.toString(doubles));
        double[] doubles1 = Arrays.copyOfRange(doubles, 2, 7);
        System.out.println("doubles1: " + Arrays.toString(doubles1));

        boolean[] booleans = {true, true, true};
        System.out.println("booleans: " + Arrays.toString(booleans));
        boolean[] booleans1 = Arrays.copyOfRange(booleans, 1, booleans.length + 1);
        System.out.println("booleans1: " + Arrays.toString(booleans1));

        char[] chars = {'a', 'b', 'c'};
        System.out.println("chars: " + Arrays.toString(chars));
        char[] chars1 = Arrays.copyOfRange(chars, 1, 5);
        System.out.println("chars1: " + Arrays.toString(chars1));

        String[] strings = {"aaa", "bbb", "ccc"};
        System.out.println("strings: " + Arrays.toString(strings));
        String[] strings1 = Arrays.copyOfRange(strings, 2, strings.length + 4);
        System.out.println("strings1: " + Arrays.toString(strings1));
    }
}
