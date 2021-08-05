package _45_Java_IO._04_CharacterIO_Streams._19_PrintStream;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStream_getStackTrace {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
        } catch (Exception e) {
            // e.printStackTrace(); là câu lệnh bình thường khi bắt exception
//            e.printStackTrace();

            String s = getStackTrace(e);
            System.err.println(s);

        }
    }

    private static String getStackTrace(Throwable throwable) {
        OutputStream outputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(outputStream);

        throwable.printStackTrace(printStream);
        printStream.close();

        String s = outputStream.toString();

        return s;
    }
}
