package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;

public class DataOutputStream_EX {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\DataOutputStream.txt";

    public static void main(String[] args) throws IOException {
        int id = 1;
        String name = "Java";
        int year = 2021;
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(id);
        dos.writeUTF(name);
        dos.writeInt(year);

        dos.close();
        fos.close();
    }
}
