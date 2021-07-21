package _45_Java_IO._04_CharacterIO_Streams._03_OutputStreamWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriter_UTF16 {
    private static String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_03_OutputStreamWriter\\utf16_file_out.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("--- write UTF-16 file ---");
        write_UTF16_Character_stream();

        System.out.println("--- read file as a binary stream ---");
        read_as_a_Binary_stream();
    }

    private static void write_UTF16_Character_stream() throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        OutputStream os = new FileOutputStream(file);
        Writer osw = new OutputStreamWriter(os, StandardCharsets.UTF_16);

        String s = "JP日本-八洲";

        osw.write(s);

        osw.close();
        os.close();
    }

    private static void read_as_a_Binary_stream() throws IOException {
        InputStream is = new FileInputStream(path);

        int byteCode;
        while ((byteCode = is.read()) != -1) {
            System.out.println((char) byteCode + "\t" + byteCode);
        }

        is.close();
    }
}
