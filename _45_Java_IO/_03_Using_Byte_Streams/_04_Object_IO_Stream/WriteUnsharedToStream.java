package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

/**
 * chương trình thực hiện ghi 1 đối tượng Collection 2 lần vào ObjectOutputStream
 * lần lượt sử dụng các method writeObject(Object) và writeUnshared(Object)
 * với mỗi method ghi ra mỗi file khác nhau, file được ghi bằng writeUnshared(Object)
 * sẽ có kích thước lớn hơn
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteUnsharedToStream {
    private static String path1 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\File1writeObject.txt";
    private static String path2 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\File2writeUnshared.txt";

    public static void main(String[] args) throws IOException {
        writeObjectTest();
        writeUnsharedTest();
    }

    public static void writeObjectTest() throws IOException {
        File file1 = new File(path1);
        file1.getParentFile().mkdirs();

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        FileOutputStream fos = new FileOutputStream(file1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(list);
        oos.writeObject(list);

        oos.close();
        fos.close();
    }

    public static void writeUnsharedTest() throws IOException {
        File file2 = new File(path2);
        file2.getParentFile().mkdirs();

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        FileOutputStream fos = new FileOutputStream(file2);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeUnshared(list);
        oos.writeUnshared(list);

        oos.close();
        fos.close();
    }
}
