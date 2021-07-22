package _45_Java_IO._04_CharacterIO_Streams._06_FileReader;

import java.io.*;

public class FileReader_in_BufferedReader_without_sharp_sign {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_06_FileReader\\Student.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);

        Reader reader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(reader);

        bufferedReader.lines()
                .filter(line -> !line.startsWith("#"))
                .forEach(System.out::println);

        bufferedReader.close();
        reader.close();
    }
}
