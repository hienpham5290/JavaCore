package _45_Java_IO._03_Using_Byte_Streams._03_ByteArray_IO_Stream;

import java.io.*;

/**
 * chương trình ghi các byte ra ByteArrayOutputStream
 * sau đó ghi nội dung của ByteArrayOutputStream ra các OutputStream khác nhau
 */

public class ByteArrayOutputStream_Example {
    public static void main(String[] args) throws IOException {
        /**
         * tạo 2 FileOutputStream
         */
        FileOutputStream fos1 = new FileOutputStream("FOS1.txt");
        FileOutputStream fos2 = new FileOutputStream("FOS2.txt");

        /**
         * tạo 1 mảng các giá trị byte
         */
        byte[] bytes = new byte[] {'H','e','l','l','o',' ','B'};

        /**
         * tạo ByteArrayOutputStream
         */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        /**
         * ghi mảng bytes ra ByteArrayOutputStream
         */
        baos.write(bytes);

        /**
         * ghi ByteArrayOutputStream đã hoàn thành ra OutputStream chỉ định
         */
        baos.writeTo(fos1);
        baos.writeTo(fos2);
        baos.flush();

        /**
         * đóng stream
         */
        baos.close();
    }
}
