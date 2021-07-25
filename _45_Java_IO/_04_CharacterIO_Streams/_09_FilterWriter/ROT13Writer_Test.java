package _45_Java_IO._04_CharacterIO_Streams._09_FilterWriter;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class ROT13Writer_Test {
    public static void main(String[] args) throws IOException {
        Writer targetWriter = new StringWriter();
        FilterWriter filterWriter = new ROT13Writer(targetWriter);

        String inputString = "Hello World !!!";

        filterWriter.write(inputString);
        filterWriter.close();

        String outputString = targetWriter.toString();
        System.out.println(inputString + " ----> " + outputString);
    }
}
