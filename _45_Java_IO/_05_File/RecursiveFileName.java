package _45_Java_IO._05_File;

import java.io.File;

public class RecursiveFileName {
    public static void main(String[] args) {
        File dir = new File("D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_05_File");
        RecursiveFileName treeFileName = new RecursiveFileName();
        treeFileName.recursiveFileName(dir, 0);
    }

    private void recursiveFileName(File dir, int level) {
        if (dir.isDirectory()) {
            System.out.println(getTabSign(level) + "+ " + dir.getName());
            File[] listChildren = dir.listFiles();
            assert listChildren != null;
            for (File f : listChildren) {
                recursiveFileName(f, (level + 1));
            }
        } else {
            System.out.println(getTabSign(level) + "- " + dir.getName());
        }
    }

    private String getTabSign(int level) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < level; i++) {
//            stringBuilder.append("\t");
//        }
//        return stringBuilder.toString();

        // hoặc có thể viết
        return "|\t".repeat(Math.max(0, level));
    }
}
