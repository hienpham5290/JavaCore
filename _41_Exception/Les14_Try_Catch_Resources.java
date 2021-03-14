package _41_Exception;

import java.io.*;

public class Les14_Try_Catch_Resources {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("E://file.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            int data = bufferedInputStream.read();
            while (data != -1) {
                System.out.println((char) data);
                data = bufferedInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
