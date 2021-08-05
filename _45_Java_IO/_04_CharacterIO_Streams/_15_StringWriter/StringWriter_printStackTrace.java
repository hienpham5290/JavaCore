package _45_Java_IO._04_CharacterIO_Streams._15_StringWriter;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StringWriter_printStackTrace {
    public static void main(String[] args) {
        try {
            int a = 100 / 0; // Exception occur here
        } catch (Exception e) {
            String s = getStackTrace(e);
            System.out.println(s);
        }
    }


    private static String getStackTrace(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);

        throwable.printStackTrace(printWriter);

        printWriter.close();

        String s = stringWriter.getBuffer().toString();

        return s;
    }
}
