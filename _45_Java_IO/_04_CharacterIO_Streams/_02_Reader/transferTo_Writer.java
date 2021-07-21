package _45_Java_IO._04_CharacterIO_Streams._02_Reader;

import java.io.*;

public class transferTo_Writer {
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("123456789-987654321-ABCDE");

        File file = new File("D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\transferToWriter.txt");
        file.getParentFile().mkdirs();
        Writer writer = new FileWriter(file);

        reader.skip(10);

        reader.transferTo(writer);

        writer.close();
        reader.close();
    }
}
