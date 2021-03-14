package _41_Exception;

// THỰC HÀNH TRY VỚI NHIỀU KHỐI CATCH

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Les8_Try_With_Multiple_Catch {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E://file.txt");
            fileOutputStream.write(65);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
