package _45_Java_IO._04_CharacterIO_Streams._01_Writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class append_char {
    public static void main(String[] args) throws IOException {
        Writer writer = new StringWriter();

        writer.append('J')
                .append('P')
                .append('日')
                .append('本');

        System.out.println(writer.toString());

        writer.close();
    }
}
