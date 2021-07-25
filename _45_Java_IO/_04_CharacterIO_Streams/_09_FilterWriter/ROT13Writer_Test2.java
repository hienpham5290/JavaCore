package _45_Java_IO._04_CharacterIO_Streams._09_FilterWriter;

import java.io.*;

public class ROT13Writer_Test2 {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_09_FilterWriter\\RotWriter-out-file.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Writer writer = new FileWriter(file);
        FilterWriter filterWriter = new ROT13Writer(writer);

        String inputString = "Hello World !!!";

        filterWriter.write(inputString);
        filterWriter.close();
    }
}
