package _45_Java_IO._04_CharacterIO_Streams._05_FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_write {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_05_FileWriter\\FileWriter_write.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(file.getAbsolutePath());
        fileWriter.write("\n");
        fileWriter.write(fileWriter.getEncoding());
        fileWriter.write("\n");

        fileWriter.write("Line 1");
        fileWriter.write("\n");

        fileWriter.write("Line 2");
        fileWriter.write("\n");

        fileWriter.write("Line 3");
        fileWriter.write("\n");

        fileWriter.write("Line 4");
        fileWriter.write("\n");

        fileWriter.close();
    }
}

