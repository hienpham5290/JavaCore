package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_EX {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\FilterOutputStream.txt";

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        FilterOutputStream filter = null;

        try {
            fos = new FileOutputStream(new File(filePath));
            filter = new FilterOutputStream(fos);

            String s = "dotdash.com";

            byte[] b = s.getBytes();

            filter.write(b);
            filter.flush();

            System.out.println("success...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            filter.close();
            fos.close();
        }
    }
}
