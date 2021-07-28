package _45_Java_IO._04_CharacterIO_Streams._12_BufferedWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedWriter_Ex1 {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_12_BufferedWriter\\out_BufferedWriter.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Writer writer = new FileWriter(file, StandardCharsets.UTF_16);
        BufferedWriter bufferedWriter = new BufferedWriter(writer, 16384);

        bufferedWriter.write("Line 1");
        bufferedWriter.newLine();

        bufferedWriter.write("Line 2");
        bufferedWriter.newLine();

        String s = "already flushed !!!";
        bufferedWriter.write(s);
        bufferedWriter.flush();
        bufferedWriter.newLine();

        bufferedWriter.write("Line 3");

        bufferedWriter.close();
    }
}
