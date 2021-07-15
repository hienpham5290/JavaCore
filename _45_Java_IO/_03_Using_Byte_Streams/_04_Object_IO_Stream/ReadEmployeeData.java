package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

/**
 * chương trình đọc các object đã được ghi vào file trước đó
 * bởi ObjectOutputStream bằng cách sử dụng ObjectInputStream
 */

import java.io.*;
import java.util.Date;

public class ReadEmployeeData {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\employee.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(filePath);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("Reading file: " + file.getAbsoluteFile());
        System.out.println();

        Date date = (Date) ois.readObject();
        String info = ois.readUTF();

        System.out.println(date);
        System.out.println(info);
        System.out.println();

        int employeeCount = ois.readInt();

        for (int i = 0; i < employeeCount; i++) {
            Employee e = (Employee) ois.readObject();
            System.out.println("Employee: fullName=" + e.getFullName() + ", salary=" + e.getSalary());
        }

        ois.close();
        fis.close();

    }
}
