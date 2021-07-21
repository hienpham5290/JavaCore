package _45_Java_IO._04_CharacterIO_Streams._02_Reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class mark_int {
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("----------ABCDEF123456");

        reader.skip(10);

        System.out.println("markSupported() ? - " + reader.markSupported());
        reader.mark(6);
        System.out.println("mark(int)");

        int count = 0;

        while (!(count == 6)) {
            char c = (char) reader.read();
            System.out.println(c);
            count++;
        }

        reader.reset();
        System.out.println("reset()");

        int charCode = 0;
        while ((charCode = reader.read()) != -1) {
            System.out.println((char) charCode);
        }

        reader.close();
    }
}
