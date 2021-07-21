package _45_Java_IO._04_CharacterIO_Streams._05_FileWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriter_UTF16 {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_05_FileWriter\\FileWriter_UTF16.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("WriterFile in UTF-16");
        write_UTF16_FileWriter();

        System.out.println("read file as BinaryStream");
        readAs_BinaryStream();
    }

    private static void write_UTF16_FileWriter() throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Writer writer = new FileWriter(file, StandardCharsets.UTF_16);

        String s = "JP日本-八洲";

        writer.write(s);

        writer.close();
    }

    private static void readAs_BinaryStream() throws IOException {
        File file = new File(path);
        InputStream fis = new FileInputStream(file  );

        int byteCode;
        while ((byteCode = fis.read()) != -1) {
            System.out.println((char) byteCode + "\t" + byteCode);
        }

        fis.close();
    }
}
