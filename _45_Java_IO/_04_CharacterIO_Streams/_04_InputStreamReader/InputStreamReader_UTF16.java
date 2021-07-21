package _45_Java_IO._04_CharacterIO_Streams._04_InputStreamReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReader_UTF16 {
    private static String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_03_OutputStreamWriter\\utf16_file_out.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("--- read character in character stream using InputStreamReader with utf16 file ---");
        readAs_UTF16_CharacterStream();
        System.out.println();

        System.out.println("--- read as a binary stream ---");
        readAs_BinaryStream();
    }

    private static void readAs_UTF16_CharacterStream() throws IOException {
        File file = new File(path);
        InputStream is = new FileInputStream(file);
        Reader isr = new InputStreamReader(is, StandardCharsets.UTF_16);

        int charCode;
        while ((charCode = isr.read()) != -1) {
            System.out.println((char) charCode + "\t" + charCode);
        }

        isr.close();
        is.close();
    }

    private static void readAs_BinaryStream() throws IOException {
        File file = new File(path);
        InputStream is = new FileInputStream(file);

        int charCode;
        while ((charCode = is.read()) != -1) {
            System.out.println((char) charCode + "\t" + charCode);
        }

        is.close();
    }
}
