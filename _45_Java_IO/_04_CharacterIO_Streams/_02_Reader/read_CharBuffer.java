package _45_Java_IO._04_CharacterIO_Streams._02_Reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;

public class read_CharBuffer {
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("0123456789012456789");

        CharBuffer charBuffer = CharBuffer.allocate(7);

        int charCount;

        while ((charCount = reader.read(charBuffer)) != -1) {
            System.out.println(charCount + "\t" + charBuffer.flip().toString());
        }

        reader.close();
    }
}
