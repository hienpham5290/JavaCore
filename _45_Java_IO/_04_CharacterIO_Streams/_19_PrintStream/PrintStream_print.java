package _45_Java_IO._04_CharacterIO_Streams._19_PrintStream;

import java.io.PrintStream;

public class PrintStream_print {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);

        String s = "abcd";
        char[] c = s.toCharArray();
        char c1 = 'C';
        boolean b = true;
        int i = 100;

        printStream.println(i);
        printStream.println(b);
        printStream.println(c1);
        printStream.println(c);
        printStream.println(s);

        printStream.close();
    }
}
