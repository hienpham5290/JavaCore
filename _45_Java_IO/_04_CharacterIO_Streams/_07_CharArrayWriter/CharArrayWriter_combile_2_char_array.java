package _45_Java_IO._04_CharacterIO_Streams._07_CharArrayWriter;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_combile_2_char_array {
    public static void main(String[] args) {
        String s = "Hello";
        char[] arr1 = s.toCharArray();

        char[] arr2 = new char[] {'W','o','r','l','d','!'};

        char[] result = add(arr1, arr2);

        System.out.println(result);
    }

    private static char[] add(char[] arr1, char[] arr2) {
        if (arr1 == null) {
            return arr2;
        }
        if (arr2 == null) {
            return arr1;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        try {
            charArrayWriter.write(arr1);
            charArrayWriter.write(arr2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return charArrayWriter.toCharArray();
    }
}
