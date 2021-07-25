package _45_Java_IO._04_CharacterIO_Streams._08_CharArrayReader;

import java.io.*;

public class CharArrayReader_read_digit_only {
    public static void main(String[] args) throws IOException {
        String s = "Log20210217.txt";
        char[] origin = s.toCharArray();

        CharArrayReader reader = new CharArrayReader(origin);
        CharArrayWriter writer = new CharArrayWriter();

        int charCode;
        while ((charCode = reader.read()) != -1) {
            if (charCode >= 48 && charCode <= 57) {
                writer.write(charCode);
            }
        }

        char[] newCharArray = writer.toCharArray();
        System.out.println(newCharArray);

        String newText = writer.toString();
        System.out.println(newText);
    }
}
