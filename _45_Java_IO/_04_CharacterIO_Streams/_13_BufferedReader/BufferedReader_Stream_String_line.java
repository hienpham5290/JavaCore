package _45_Java_IO._04_CharacterIO_Streams._13_BufferedReader;

import java.io.*;
import java.util.stream.Stream;

public class BufferedReader_Stream_String_line {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_13_BufferedReader\\student.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Reader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader, 16384);

        Stream<String> stream = bufferedReader.lines();

        stream
                .filter(line -> {
                    return !line.trim().startsWith("#") && line.endsWith("B");
                })
                .forEach(System.out::println);

        bufferedReader.close();
    }
}
