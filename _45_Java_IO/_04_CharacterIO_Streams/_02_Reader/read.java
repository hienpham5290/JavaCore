package _45_Java_IO._04_CharacterIO_Streams._02_Reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class read {
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("JP日本-八洲");

        int charCode = 0;

        while ((charCode = reader.read()) != -1) {
            System.out.println((char) charCode + "\t" + charCode);
        }

        reader.close();
    }
}
