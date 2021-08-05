package _45_Java_IO._04_CharacterIO_Streams._16_StringReader;

import java.io.BufferedReader;
import java.io.StringReader;

public class StringReader_with_BufferedReader {
    public static void main(String[] args) {
        String students = //
                "# Students:\n" //
                        + "John P\n" //
                        + "Sarah M\n" //
                        + "# Sarah B\n" //
                        + "Charles B\n" //
                        + "Mary T\n" //
                        + "Sophia B\n";

        StringReader stringReader = new StringReader(students);
        BufferedReader bufferedReader = new BufferedReader(stringReader);

        bufferedReader.lines()
                .filter(s -> !s.trim().startsWith("#"))
                .filter(s -> s.endsWith("B"))
                .forEach(System.out::println);
    }
}
