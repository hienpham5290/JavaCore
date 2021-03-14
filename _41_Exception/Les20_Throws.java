package _41_Exception;

/*
    Throws - hoàn toàn đẩy exception đi nơi khác xử lý try-catch exception
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Les20_Throws {
    public static void main(String[] args) {
        try {
            ghiFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void ghiFile() throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream;
        fileOutputStream = new FileOutputStream("E://fileNotFound.txt");
        fileOutputStream.write(99);
        fileOutputStream.close();
    }
}
