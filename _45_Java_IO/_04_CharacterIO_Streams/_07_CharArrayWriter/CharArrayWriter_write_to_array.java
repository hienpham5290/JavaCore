package _45_Java_IO._04_CharacterIO_Streams._07_CharArrayWriter;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_write_to_array {
    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter(1024);

        charArrayWriter.write("One");

        charArrayWriter.append(' ').append("Two");

        charArrayWriter.write(' ');
        charArrayWriter.append("Three");

        char[] charArray = charArrayWriter.toCharArray();

        System.out.println(charArray);

        charArrayWriter.close();
    }
}
