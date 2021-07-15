package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadUnsharedFromStream {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\FilewriteObject.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        

        writeUnsharedTest();
        
        readUnsharedTest();
    }
    
    private static void writeUnsharedTest() throws IOException {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        File file = new File(filePath);
        file.getParentFile().mkdirs();
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeUnshared(list);
        oos.writeUnshared(list);
        
        oos.close();
        fos.close();
    }
    
    private static void readUnsharedTest() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<String> list1 = (List<String>) ois.readUnshared();
        List<String> list2 = (List<String>) ois.readUnshared();

        System.out.println(list1.toString());
        System.out.println();

        System.out.println(list2.toString());
        System.out.println();

        System.out.println("[reference: list1 == list2] : " + (list1 == list2));
        System.out.println("[size: list1.equals(list2) ] : " + (list1.equals(list2)));
        ois.close();
        fis.close();
    }
}
