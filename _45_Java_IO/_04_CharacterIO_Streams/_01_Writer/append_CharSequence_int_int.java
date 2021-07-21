package _45_Java_IO._04_CharacterIO_Streams._01_Writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class append_CharSequence_int_int {
    public static void main(String[] args) throws IOException {
        Writer writer = new StringWriter();

        String s = "0123456789";

        writer.append(s, 0, 3)
                .append(s, 3, 7)
                .append(s, 7, 9)
                .write("9");

        System.out.println(writer.toString());

        writer.close();
    }
}
