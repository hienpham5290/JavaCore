package _45_Java_IO._04_CharacterIO_Streams._08_CharArrayReader;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_trim {
    public static void main(String[] args) throws IOException {
        String originText = "  One \n Two \t\n \t\t Three ";
        System.out.println(originText);
        System.out.println("---------------------------------------------------------------");

        String newText = trimLine(originText);
        System.out.println(newText);
    }

    private static String trimLine(String str) throws IOException {
        char[] cbuf = str.toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(cbuf);
        BufferedReader bufferedReader = new BufferedReader(charArrayReader);
        StringBuilder stringBuilder = new StringBuilder(str.length());

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line.trim()).append('\n');
        }

        return stringBuilder.toString();
    }
}
