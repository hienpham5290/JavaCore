package _45_Java_IO._04_CharacterIO_Streams._02_Reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class close_AutoCloseable {
    public static void main(String[] args) throws IOException {
        try (Reader reader = new StringReader("01234567890123456789")){
            int charCount;
            char[] cbuf = new char[5];
            while ((charCount = reader.read(cbuf)) != -1) {
                String s = new String(cbuf, 0, charCount);
                System.out.println(charCount +"\t" + s);
            }
        }
    }
}
