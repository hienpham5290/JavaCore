package _36_String_Class;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Les23_getBytes {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ABCDEFGHIJK";

        byte[] b1 = s.getBytes();
        byte[] b2 = s.getBytes("ASCII");

        System.out.println(Arrays.toString(b1));
        System.out.println(Arrays.toString(b2));

        String s1 = new String(b1);
        System.out.println(s1);
    }
}
