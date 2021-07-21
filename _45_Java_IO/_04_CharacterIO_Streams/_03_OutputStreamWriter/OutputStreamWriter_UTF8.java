package _45_Java_IO._04_CharacterIO_Streams._03_OutputStreamWriter;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriter_UTF8 {
    private static String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_03_OutputStreamWriter\\utf8_file_out.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("--- write UTF-8 file ---");
        write_UTF8_Character_stream();

        System.out.println("--- read as a Binary stream ---");
        read_as_a_Binary_stream();
    }

    private static void write_UTF8_Character_stream() throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        OutputStream os = new FileOutputStream(file);
        Writer osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);

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
