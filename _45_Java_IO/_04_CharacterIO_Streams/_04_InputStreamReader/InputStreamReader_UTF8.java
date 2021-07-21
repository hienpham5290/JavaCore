package _45_Java_IO._04_CharacterIO_Streams._04_InputStreamReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReader_UTF8 {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_03_OutputStreamWriter\\utf8_file_out.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("--- readAs_UTF8_CharacterStream ---");
        readAs_UTF8_CharacterStream();
        System.out.println();

        System.out.println("--- readAs_BinaryStream ---");
        readAs_BinaryStream();
    }

    private static void readAs_UTF8_CharacterStream() throws IOException {
        InputStream is = new FileInputStream(path);
        Reader isr = new InputStreamReader(is, StandardCharsets.UTF_8);

        int charCode;
        while ((charCode = isr.read()) != -1) {
            System.out.println((char) charCode + "\t" + charCode);
        }

        isr.close();
        is.close();
    }

    private static void readAs_BinaryStream() throws IOException {
        InputStream is = new FileInputStream(path);

        int charCode;
        while ((charCode = is.read()) != -1) {
            System.out.println((char) charCode + "\t" + charCode);
        }

        is.close();
    }
}
