package _45_Java_IO._03_Using_Byte_Streams._02_File_IO_Stream;

/**
 * chương trình đọc và xuất ra từng byte trong FileInputStream
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Input_File_byte {
    public static void main(String[] args) throws IOException {
        /**
         * khởi tạo đối tượng InputStream, instance là FileInputStream
         * tham số truyền vào cho Constructor của FileInputStream là
         * 1 file bất kỳ (ở đây sử dụng file .txt) đặt trong /Project
         * nội dung của file .txt là bất kỳ
         */
        InputStream inputStream = new FileInputStream(
                "test_input_stream.txt");

        /**
         * khởi tạo 1 biến int = -1, để chứa dữ liệu byte đọc được
         */
        int check = -1;

        /**
         * vòng lặp while, chỉ dừng khi đọc được giá trị =-1 từ stream
         * đồng thời gán giá trị byte đọc được ở vị trí hiện tại đang đứng
         * xuất ra giá trị kiểu char cast từ biến check
         */
        while ((check = inputStream.read()) != -1) {
            System.out.println((char) check);
        }

        /**
         * đóng stream sau khi sử dụng xong
         */
        inputStream.close();
    }
}
