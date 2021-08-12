package _45_Java_IO._05_File;

import java.io.File;
import java.io.FileFilter;

public class txtFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        // nếu pathname không phải là File, return false
        if (!pathname.isFile()) {
            return false;
        }
        // nếu pathname không kết thúc với .txt, return false
//        if (pathname.getAbsolutePath().endsWith(".txt")) {
//            return true;
//        } else {
//            // nếu pathname là File nhưng pathname không kết thúc với .txt, return false
//            return false;
//        }
        // nếu pathname là File nhưng pathname không kết thúc với .txt, return false

        // viết đơn giản
        return pathname.getAbsolutePath().endsWith(".txt");
    }
}
