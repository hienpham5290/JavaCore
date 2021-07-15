package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;

public class FilterInputStream_EX {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\FilterOutputStream.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FilterInputStream filter = null;

        try {
            fis = new FileInputStream(new File(filePath));
            filter = new BufferedInputStream(fis);

            int i = 0;

            while ((i = filter.read()) != -1) {
                System.out.println(i + "\t" + (char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            filter.close();
            fis.close();
        }
    }
}
