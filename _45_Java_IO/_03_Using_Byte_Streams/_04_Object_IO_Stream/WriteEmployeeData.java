package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

/**
 * class WriteEmployeeData
 * dùng để ghi đối tượng Employee vào ObjectOutputStream
 */

import java.io.*;
import java.util.Date;

public class WriteEmployeeData {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\employee.txt";

    public static void main(String[] args) {
        File outFile = new File(filePath);

        outFile.getParentFile().mkdirs();

        Employee e1 = new Employee("Tom", 1000f);
        Employee e2 = new Employee("Jerry", 2000f);
        Employee e3 = new Employee("Donald", 1200f);

        Employee[] employees = new Employee[] {e1, e2, e3};

        try {
            FileOutputStream fos = new FileOutputStream(outFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // thông báo bắt đầu ghi file
            System.out.println("Writting file: " + outFile.getName());

            // ghi mốc thời gian ghi file vào stream
            oos.writeObject(new Date());

            // ghi thông tin về file vào stream
            oos.writeUTF("Employee Data");

            // ghi số lượng đối tượng vào stream
            oos.writeInt(employees.length);

            // ghi các đối tượng vào stream
            for (Employee e : employees) {
                oos.writeObject(e);
            }

            // đóng stream
            oos.close();

            // đóng file
            fos.close();

            // thông báo kết thúc quá trình ghi đối tượng lên console
            System.out.println("Finished writting");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
