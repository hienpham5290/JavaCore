package _45_Java_IO._04_CharacterIO_Streams._05_FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_write_append {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_05_FileWriter\\FileWriter_write - Copy.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        FileWriter fileWriter = new FileWriter(file, true);

        System.out.println(file.getAbsoluteFile());
        System.out.println(fileWriter.getEncoding());

        fileWriter.write("\n");
        fileWriter.write("Line 5");
        fileWriter.write("\n");
        fileWriter.append("Line 6").append("\n").append("Line 7").append("\n");

        fileWriter.close();
    }
}
