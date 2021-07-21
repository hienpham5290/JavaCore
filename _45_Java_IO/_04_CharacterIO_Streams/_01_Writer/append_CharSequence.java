package _45_Java_IO._04_CharacterIO_Streams._01_Writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class append_CharSequence {
    public static void main(String[] args) throws IOException {
        Writer writer = new StringWriter();

        writer.append("01234").append("5678").write("9");

        System.out.println(writer.toString());

        writer.close();
    }
}
