package _45_Java_IO._07_FilePermission;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermission_implies {
    public static void main(String[] args) {
        // "\-" ở cuối đường dẫn, các quyền sẽ được cấp cho tất cả mọi thứ chứa trong directory \\implies
        String dir1 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_07_FilePermission\\implies\\-";

        // các quyền được cấp cho đường dẫn này chỉ có tác dụng với file test_implies.txt
        String dir2 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_07_FilePermission\\implies\\test_implies.txt";

        // cấp quyền "read" cho tất cả mọi thứ trong dir1, bao hàm ngụ ý cấp quyền cả cho test_implies.txt được chứa trong dir1
        FilePermission file1 = new FilePermission(dir1, "read");

        FilePermission file2 = new FilePermission(dir2, "write");

        PermissionCollection permissionCollection = file1.newPermissionCollection();

        permissionCollection.add(file1);
        permissionCollection.add(file2);

        if (permissionCollection.implies(new FilePermission(dir2, "read, write"))) {
            System.out.println("read, write permission is granted for dir2: " + dir2);
        } else {
            System.out.println("NO read, write permission is granted for dir2: " + dir2);
        }
        System.out.println("----------------------------------------------------");

        // kiểm tra action của file2
        System.out.println("file1's actions: " + file1.getActions());
        System.out.println("file2's actions: " + file2.getActions());
    }
}
