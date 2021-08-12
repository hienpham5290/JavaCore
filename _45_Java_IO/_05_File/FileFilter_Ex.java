package _45_Java_IO._05_File;

import java.io.File;

public class FileFilter_Ex {
    public static void main(String[] args) {
        File file = new File("D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_05_File");

        File[] listTxt = file.listFiles(new txtFileFilter());

        for (File f : listTxt) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
