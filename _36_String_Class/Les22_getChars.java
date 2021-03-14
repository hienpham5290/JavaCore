package _36_String_Class;

import java.util.Arrays;

public class Les22_getChars {
    public static void main(String[] args) {
        String s = "Welcome to OOP Programming";

        char[] c1 = new char[10];
        char[] c2 = new char[10];
//        char[] c3 = new char[10];
//        char[] c4 = new char[10];

        s.getChars(10, 15, c1, 0);
        System.out.println(Arrays.toString(c1));

        s.getChars(10, 15, c2, 4);
        System.out.println(Arrays.toString(c2));

//        s.getChars(10, 15, c3, 8);
//        System.out.println(Arrays.toString(c3));
//
//        s.getChars(10, 15, c4, -1);
//        System.out.println(Arrays.toString(c4));
    }
}
