package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

/**
 * chương trình gộp 2 input stream thành 1 input stream
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStream_EX1 {
    public static void main(String[] args) throws IOException {
        // đường dẫn của 2 file cần gộp
        String path1 = "D:\\Learning\\Java\\JavaOOP\\test_input_stream.txt";
        String path2 = "D:\\Learning\\Java\\JavaOOP\\test_output_stream.txt";

        // khai báo object của các input stream và của SequenceInputStream
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        SequenceInputStream sis = null;

        try {
            // khởi tạo instance của các object đã khai báo
            fis1 = new FileInputStream(path1);
            fis2 = new FileInputStream(path2);

            // gộp 2 input stream với nhau bằng constructor của SequenceInputStream
            sis = new SequenceInputStream(fis1, fis2);

            int i;
            while ((i = sis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (sis != null) {
                sis.close();
            }
            if (fis2 != null) {
                fis2.close();
            }
            if (fis1 != null) {
                fis1.close();
            }
        }
    }
}
