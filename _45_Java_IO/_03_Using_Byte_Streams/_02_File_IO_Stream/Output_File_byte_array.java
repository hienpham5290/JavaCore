package _45_Java_IO._03_Using_Byte_Streams._02_File_IO_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * chương trình ghi byte array ra file bằng FileOutputStream
 */

public class Output_File_byte_array {
    public static void main(String[] args) throws IOException {
        /**
         * khởi tạo đối tượng output stream
         * instance là FileOutputStream
         */
        OutputStream outputStream = new FileOutputStream("test_output_stream.txt");

        /**
         * các mảng byte sẽ được ghi ra source bên ngoài chương trình
         */
        byte[] bytes1 = new byte[] {'J','a','v','a','-','C','o','r','e'};
        byte[] bytes2 = new byte[] {'.','c','o','m'};
        byte[] bytes3 = new byte[] {13, 10}; // những byte xuống dòng mới
        byte[] bytes4 = new byte[] {'I','/','O','-','S','t','r','e','a','m'};

        /**
         * ghi các mảng byte lên output stream
         */
        outputStream.write(bytes1);
        outputStream.write(bytes2);
        outputStream.write(bytes3);
        outputStream.write(bytes4);

        /**
         * đóng output stream sau khi sử dụng xong
         */
        outputStream.close();
    }
}
