package _45_Java_IO._05_File;

import java.io.File;

public class RecursiveFile {
    private void fetchFile(File dir) {
        // in ra đường dẫn tuyệt đối của đường dẫn hiện tại
        System.out.println(dir.getAbsolutePath());

        // nếu đường dẫn hiện tại là 1 directory
        if (dir.isDirectory()) {
            // lấy danh sách các đường dẫn con bên trong directory hiên tại
            File[] listChild = dir.listFiles();

            // duyệt từng đường dẫn con
            for (File f : listChild) {
                // gọi đệ quy
                fetchFile(f);
            }
        }
    }

    public static void main(String[] args) {
        File dir = new File("D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_05_File");

        RecursiveFile recursiveFile = new RecursiveFile();
        recursiveFile.fetchFile(dir);
    }
}
