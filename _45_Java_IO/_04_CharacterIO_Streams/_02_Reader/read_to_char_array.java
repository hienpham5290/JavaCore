package _45_Java_IO._04_CharacterIO_Streams._02_Reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class read_to_char_array {
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("1234567891234567891100");

        char[] cbuf = new char[10];
        int charCount = -1;

        while ((charCount = reader.read(cbuf)) != -1) {
            String s = new String(cbuf, 0, charCount);
            System.out.println(charCount + "\t" + s);
        }

        reader.close();
    }
}
