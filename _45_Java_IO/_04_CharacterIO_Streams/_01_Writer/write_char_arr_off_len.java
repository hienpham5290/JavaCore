package _45_Java_IO._04_CharacterIO_Streams._01_Writer;

import java.io.StringWriter;

public class write_char_arr_off_len {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();

        char[] cbuf = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        stringWriter.write(cbuf, 2, 5); // '2'...'6'

        String s = stringWriter.toString();

        System.out.println(s);
    }
}
