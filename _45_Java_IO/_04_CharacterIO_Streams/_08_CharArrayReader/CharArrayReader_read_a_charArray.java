package _45_Java_IO._04_CharacterIO_Streams._08_CharArrayReader;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

public class CharArrayReader_read_a_charArray {
    public static void main(String[] args) throws IOException {
        String s = "This is a text !!!";
        char[] charArray = s.toCharArray();

        Reader reader = new CharArrayReader(charArray);

        int charCode;
        while ((charCode = reader.read()) != -1) {
            char c = (char) charCode;
            System.out.println(c);
        }

        reader.close();
    }
}
