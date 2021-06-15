package _45_Java_IO._03_Using_Byte_Streams._03_ByteArray_IO_Stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStream_Example {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[] {84, 104, 105, 115, 32, 105, 115, 32, 116, 101, 120, 116};

        /**
         * tạo byte array input stream
         */
        InputStream bais = new ByteArrayInputStream(bytes);

        int k = 0;

        while ((k = bais.read()) != -1) {
            /**
             * chuyển đổi giá trị của byte sang character
             */
            char ch = (char) k;
            System.out.println("ASCII: " + ch + " - byte value: " + k);
        }
    }
}
