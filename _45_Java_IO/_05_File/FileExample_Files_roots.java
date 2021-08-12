package _45_Java_IO._05_File;

import java.io.File;

public class FileExample_Files_roots {
    public static void main(String[] args) {
        File[] listroots = File.listRoots();

        for (File f : listroots) {
            System.out.println(f);
        }
    }
}
