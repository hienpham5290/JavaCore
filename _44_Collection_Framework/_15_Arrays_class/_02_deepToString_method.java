package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;

public class _02_deepToString_method {
    public static void main(String[] args) {
        String[] oneDimArray = new String[]
                {"one", "two", "three"};

        System.out.println("One Dimensional Array:");
        System.out.println(Arrays.deepToString(oneDimArray) + "\n");

        String[][] twoDimArray = new String[][]
                {
                        {"one", "two", "three"},
                        {"four", "five", "six"},
                        {"seven", "eight", "nine"}
                };

        System.out.println("Two Dimensional Array:");
        System.out.println(Arrays.deepToString(twoDimArray) + "\n");

        String[][][] threeDimArray = new String[][][]
                {
                        {
                                {"a", "b", "c"},
                                {"e", "f", "g"},
                                {"h", "i", "j"}
                        },
                        {
                                {"k", "l", "m"},
                                {"n", "o", "p"},
                                {"q", "r", "t"}
                        },
                        {
                                {"t", "v", "u"},
                                {"w", "y", "x"},
                                {"z", "s", "zs"}
                        }
                };

        System.out.println("Three Dimensional Array:");
        System.out.println(Arrays.deepToString(threeDimArray));
    }
}
