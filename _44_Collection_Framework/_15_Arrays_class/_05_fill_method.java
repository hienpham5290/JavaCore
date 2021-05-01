package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;

public class _05_fill_method {
    public static void main(String[] args) {
        int[] ints = new int[5];
        Arrays.fill(ints, 10);
        System.out.println("intsArray: " + Arrays.toString(ints));

        double[] doubles = new double[] {12.5, 22.9, 32.1, 44.22};
        System.out.println("doubles before fill: " + Arrays.toString(doubles));
        Arrays.fill(doubles, 0.1);
        System.out.println("doubles after fill: " + Arrays.toString(doubles));

        boolean[] booleans = new boolean[5];
        Arrays.fill(booleans, true);
        System.out.println("booleans: " + Arrays.toString(booleans));

        char[] chars = new char[10];
        Arrays.fill(chars, 'x');
        System.out.println("chars: " + Arrays.toString(chars));

        String[] strings = {"one", "two", "three", "four"};
        System.out.println("strings before fill: " + Arrays.toString(strings));
        Arrays.fill(strings, "hi");
        System.out.println("strings after fill: " + Arrays.toString(strings));
    }
}
