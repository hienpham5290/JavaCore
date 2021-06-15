package _45_Java_IO._03_Using_Byte_Streams._02_File_IO_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * chương trình ghi từng byte ra file bằng FileOutputStream
 */

public class Output_File_byte {
    public static void main(String[] args) throws IOException {
        /**
         * khởi tạo đối tượng OutputStream
         * instance là FileOutputStream
         */
        OutputStream outputStream = new FileOutputStream(
                "test_output_stream.txt"
        );

        /**
         * khởi tạo 1 mảng các byte, ta sẽ ghi từng byte của mảng này ra
         * file stream ở trên
         */
        byte[] bytes = new byte[]
                {'H', 'i','-', 'J', 'a', 'v', 'a', 'C', 'o', 'r', 'e', '-', 'H', 'e', 'l','l','o'};

        /**
         * lần lượt ghi từng byte ra file
         */
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            outputStream.write(b);
        }

        /**
         * đóng file output stream sau khi sử dụng
         */
        outputStream.close();
    }
}
