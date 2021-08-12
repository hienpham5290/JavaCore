package _45_Java_IO._05_File;

import java.io.File;

public class FileExample_listFile {
    public static void main(String[] args) {
        File dir = new File("D:\\\\Learning\\\\Java\\\\JavaOOP\\\\src\\\\_45_Java_IO\\\\_05_File\\\\");

        System.out.println("using File[] listFile(): \n");
        File[] children = dir.listFiles();

        for (File f : children) {
            System.out.println(f.getAbsolutePath());
        }
        System.out.println("--------------------------------");
        System.out.println("using String[] list(): \n");
        String[] listString = dir.list();

        for (String s : listString) {
            System.out.println(s);
        }
    }
}
