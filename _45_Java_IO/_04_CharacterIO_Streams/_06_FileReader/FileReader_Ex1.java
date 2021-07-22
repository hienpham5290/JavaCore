package _45_Java_IO._04_CharacterIO_Streams._06_FileReader;

import java.io.*;

public class FileReader_Ex1 {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_06_FileReader\\FileReader_Ex1.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);

        Reader reader = new FileReader(file);

        int charCode;
        while ((charCode = reader.read()) != -1) {
            System.out.println((char) charCode + "\t" + charCode);
        }

        reader.close();
    }
}
