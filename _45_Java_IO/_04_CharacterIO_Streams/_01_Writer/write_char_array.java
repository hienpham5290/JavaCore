package _45_Java_IO._04_CharacterIO_Streams._01_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class write_char_array {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\writeCharArray.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Writer writer = new FileWriter(file, StandardCharsets.UTF_8);

        writer.write((int) 'J');

        char[] cbuf = new char[] {'P', '日', '本', '-', '八', '洲'};

        writer.write(cbuf);

        writer.close();
    }
}
