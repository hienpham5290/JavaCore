package _45_Java_IO._04_CharacterIO_Streams._06_FileReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReader_UTF8_BOM {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_06_FileReader\\file_UTF8_with_BOM.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);

        System.out.println("read by FileReader");
        readByFileReader(file);
        System.out.println();

        System.out.println("read by InputStreamReader");
        readByInputStreamReader(file);

    }

    public static void readByFileReader(File file) throws IOException {
        Reader reader = new FileReader(file, StandardCharsets.UTF_8);

        int charCode;
        while ((charCode = reader.read()) != -1) {
            System.out.println((char) charCode + "\t" + charCode);
        }

        reader.close();
    }

    public static void readByInputStreamReader(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);

        int charCode;
        while ((charCode = reader.read()) != -1) {
            System.out.println((char) charCode + "\t" + charCode);
        }

        reader.close();
        inputStream.close();
    }
}
