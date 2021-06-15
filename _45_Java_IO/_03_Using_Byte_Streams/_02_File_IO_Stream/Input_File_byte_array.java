package _45_Java_IO._03_Using_Byte_Streams._02_File_IO_Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * chương trình đọc và xuất byte array từ FileInputStream
 */

public class Input_File_byte_array {
    public static void main(String[] args) throws IOException {
        /**
         * khởi tạo InputStream
         * instance là FileInputStream
         */
        InputStream inputStream = new FileInputStream(
                "test_input_stream.txt");

        /**
         * khởi tạo vùng đệm là mảng 5 byte, dùng để chứa các
         * byte đọc được từ FileInputStream
         */
        byte[] bytes = new byte[5];

        /**
         * biến check = -1; dùng để kiểm tra kết thúc stream
         * đồng thời là số lượng byte trả về trong method read(byte[] b)
         */
        int check = -1;

        while ((check = inputStream.read(bytes)) != -1) {
            String s = new String(bytes, 0, check);
            System.out.println(check + " bytes:" + "\t\t" + s);
        }

        /**
         * đóng stream sau khi sử dụng
         */
        inputStream.close();
    }
}
