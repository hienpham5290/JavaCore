package _45_Java_IO._04_CharacterIO_Streams._13_BufferedReader;

import java.io.*;

public class BufferedReader_readLine {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_13_BufferedReader\\test-buffered-reader.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        Reader reader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(reader, 16384);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
