package _45_Java_IO._04_CharacterIO_Streams._06_FileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Create_file_UTF8_with_BOM {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_06_FileReader\\file_UTF8_with_BOM.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Writer writer = new FileWriter(file);
        writer.write(65279);
        writer.write(72);
        writer.write(101);
        writer.write(108);
        writer.write(108);
        writer.write(111);

        writer.close();
    }
}
