package _45_Java_IO._05_File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample_test {
    public static void main(String[] args) throws IOException {
        // D:\Learning\Java\JavaOOP\src\_45_Java_IO\_05_File\test_file.txt
        File file = new File("D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_05_File\\test_file.txt");

        System.out.println("exist ? : " + file.exists());

        if (file.exists()) {
            System.out.println("is directory ? : " + file.isDirectory());
            System.out.println("is hidden ? : " + file.isHidden());
            System.out.println("simple name: " + file.getName());
            System.out.println("absolute path: " + file.getAbsolutePath());
            System.out.println("length : " + file.length());

            long lastModifiedMillis = file.lastModified();
            Date lastModifiedDate = new Date(lastModifiedMillis);
            System.out.println("last modified date: " + lastModifiedDate);
        }
    }
}
