package _45_Java_IO._04_CharacterIO_Streams._02_Reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class skip {
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("0123456789ABCDEF");

        System.out.println((char) reader.read());
        System.out.println((char) reader.read());
        reader.skip(8);

        int charCode;
        while ((charCode = reader.read()) != -1) {
            System.out.println((char) charCode);
        }

        reader.close();
    }
}
