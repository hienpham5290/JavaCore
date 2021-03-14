package _41_Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Les12_Try_Catch_Finally {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("E://file.txt");
            fileOutputStream.write(99);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Ngoại lệ vào ra");
        } finally {
            // đề phòng trường hợp, lệnh đóng file không được thực hiện
            // ta đưa lệnh đóng file vào trong khối finally
            // trong khối finally, lệnh đóng file vẫn xảy ra IOException
            // tiếp tục bao lệnh này bằng Try-Catch
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Ngoại lệ vào ra");
//                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("Có 1 đối tượng chưa được khởi tạo");
            }
        }
    }
}
