package _45_Java_IO._04_CharacterIO_Streams._01_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class close_automation {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\close_automation.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        try (Writer writer = new FileWriter(file, StandardCharsets.UTF_8)) {
            writer.write((int) 'J'); // 74
            writer.write((int) 'P'); // 80
            writer.write((int) '日'); // 26085
            writer.write(26412); // 本
            writer.write((int) '-'); // 45
            writer.write(20843); // 八
            writer.write((int) '洲'); // 27954
        }
    }
}
