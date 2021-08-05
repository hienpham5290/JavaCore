package _45_Java_IO._04_CharacterIO_Streams._15_StringWriter;

import java.io.StringWriter;

public class StringWriter_append {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();

        stringWriter.write("Java Tutorials");
        stringWriter.append("\n").append("C# Tutorials").append("\n").append("Python Tutorials");

        String s = stringWriter.toString();

        System.out.println(s);
    }
}
