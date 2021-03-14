package _36_String_Class;

import java.util.Arrays;

public class Les21_toCharArray {
    public static void main(String[] args) {
        String s = "Welcome to Java";

        char[] cArr = s.toCharArray();
        System.out.println(Arrays.toString(cArr));
    }
}
