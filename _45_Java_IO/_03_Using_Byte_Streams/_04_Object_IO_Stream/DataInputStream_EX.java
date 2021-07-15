package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;

public class DataInputStream_EX {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\DataOutputStream.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);

        int year = dis.readInt();
        String name = dis.readUTF();
        int id = dis.readInt();

        // id= 2021, name: Java, year: 1
        // lỗi tuần tự, do không đặt chính xác tuần tự của dữ liệu được serialize trước đó
        // serialization: id -> name -> year
        // deserialization: year -> name -> id (lỗi)
        System.out.println("id= " + id + ", name: " + name + ", year: " + year);

        dis.close();
        fis.close();
    }
}
