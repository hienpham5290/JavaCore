package _45_Java_IO._05_File;

import java.io.File;

public class FileExample_make_directory {
    public static void main(String[] args) {
        // sử dụng mkdir() method
        // test13 chưa được tạo, nhưng các thư mục cha của nó đã được tạo
        File dir1 = new File("D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_05_File\\test11\\test12\\test13");

        // sử dụng mkdirs() method
        // test24 và thư mục cha test25 chưa được tạo trong hệ thống
        File dir2 = new File("D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_05_File\\test21\\test22\\test23\\test24\\test25");

        System.out.println("dir1 exist ?: " + dir1.exists() + " -absolute path: " + dir1.getAbsolutePath());
        System.out.println("parentFile of dir1 exist ?: " + dir1.getParentFile().exists());
        boolean createDir1 = dir1.mkdir();
        System.out.println("use mkdir(), dir1 created ?: " + createDir1);
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("dir2 exist ?: " + dir2.exists() + " -absolute path: " + dir2.getAbsolutePath());
        System.out.println("parentFile of dir2 exist ?: " + dir2.getParentFile().exists());
        System.out.println();

        boolean createDir2 = dir2.mkdir();
        System.out.println("use mkdir(), dir2 created ?: " + createDir2);
        System.out.println("parentFile of dir2 exist ?: " + dir2.getParentFile().exists());
        System.out.println();

        createDir2 = dir2.mkdirs();
        System.out.println("use mkdirs(), dir2 created ?: " + createDir2);
        System.out.println("parentFile of dir2 exist ?: " + dir2.getParentFile().exists());

    }
}
