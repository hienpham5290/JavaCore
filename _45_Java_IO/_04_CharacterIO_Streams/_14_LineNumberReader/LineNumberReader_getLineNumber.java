package _45_Java_IO._04_CharacterIO_Streams._14_LineNumberReader;

import java.io.*;

public class LineNumberReader_getLineNumber {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_13_BufferedReader\\test-buffered-reader.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Reader reader = new FileReader(file);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);

        System.out.println("Start lineNumber: " + lineNumberReader.getLineNumber());
        System.out.println("-------------------------------------");

        String line;
        while ((line = lineNumberReader.readLine()) != null) {
            System.out.println("line Number: " + lineNumberReader.getLineNumber() + "\tline Content: " + line);
        }

        lineNumberReader.close();
        reader.close();
    }
}
