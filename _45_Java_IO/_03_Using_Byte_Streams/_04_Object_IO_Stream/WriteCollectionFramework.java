package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;
import java.util.ArrayList;

public class WriteCollectionFramework {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\flower.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeFile();

        readFile();
    }

    public static void writeFile() throws IOException {
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Tulip");
        flowers.add("Daffodil");
        flowers.add("Poppy");
        flowers.add("Sunflower");
        flowers.add("Bluebell");

        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // ghi thông tin bằng method writeUTF()
        oos.writeUTF("List of Flower");

        // ghi object vào ObjectOutputStream
        oos.writeObject(flowers);

        // đóng object output stream
        oos.close();

        // đóng file output stream
        fos.close();
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        String info = ois.readUTF();
        ArrayList<String> flowers = (ArrayList<String>) ois.readObject();

        System.out.println(info);
        System.out.println();

        for (String s : flowers) {
            System.out.println(s);
        }

        // đóng object input stream
        ois.close();

        // đóng file input stream
        fis.close();
    }
}
