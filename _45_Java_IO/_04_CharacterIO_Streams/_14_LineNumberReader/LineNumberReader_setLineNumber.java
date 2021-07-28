package _45_Java_IO._04_CharacterIO_Streams._14_LineNumberReader;

import java.io.*;

public class LineNumberReader_setLineNumber {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_14_LineNumberReader\\setLineNumber.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Reader reader = new FileReader(file);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);

        // getLineNumber current line
        System.out.println("Start Line Number: " + lineNumberReader.getLineNumber());

        // setLineNumber current line -> 2
        lineNumberReader.setLineNumber(2);
        System.out.println("After setLineNumber for current line: " + lineNumberReader.getLineNumber());

        System.out.println("----------------------------------------------------------");

        String line;
        while ((line = lineNumberReader.readLine()) != null) {
            System.out.println("lineNum: " + lineNumberReader.getLineNumber() + " - " + line);
        }

        lineNumberReader.close();
        reader.close();
    }
}
