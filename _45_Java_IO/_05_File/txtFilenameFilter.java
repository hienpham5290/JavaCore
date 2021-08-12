package _45_Java_IO._05_File;

import java.io.File;
import java.io.FilenameFilter;

public class txtFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
//        if (name.endsWith(".txt")) {
//            return true;
//        } else {
//            return false;
//        }

        // viết đơn giản
        return name.endsWith(".txt");
    }
}
