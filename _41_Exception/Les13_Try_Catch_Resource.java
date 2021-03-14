package _41_Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Les13_Try_Catch_Resource {
    public static void main(String[] args) {
        // với Try-Catch-Resource ta không cần quan tâm đến việc đóng tài nguyên
        try (FileOutputStream fileOutputStream = new FileOutputStream("E://file.txt")) {
            fileOutputStream.write(99);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
