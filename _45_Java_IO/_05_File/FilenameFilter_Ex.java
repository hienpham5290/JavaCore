package _45_Java_IO._05_File;

import java.io.File;

public class FilenameFilter_Ex {
    public static void main(String[] args) {
        File dir = new File("D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_05_File");

        File[] listTxt = dir.listFiles(new txtFilenameFilter());

        for (File f : listTxt) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
