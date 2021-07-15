package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

/**
 * chuong trinh noi 2 input stream tao thanh 1 input stream duy nhat
 *
 * su dung SequenceInputStream, InputStreamReader, BufferedInputStream
 * de noi va read du lieu tu input stream
 */

import java.io.*;

public class SequenceInputStream_EX2 {
    // duong dan cua 2 file van ban ma hoa UTF-8
    private static String path1 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\test_SequenceInputStream_1.txt";
    private static String path2 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\test_SequenceInputStream_2.txt";

    // chung ta se doc 2 file tren bang SequenceInputStream, InputStreamReader, BufferedReader
    public static void main(String[] args) throws IOException {
        InputStream inputStream1 = new FileInputStream(path1 );
        InputStream inputStream2 = new FileInputStream(path2);

        // tao object cua SequenceInputStream
        InputStream sequenceInputStream = new SequenceInputStream(inputStream1, inputStream2);

        // tao object cua InputStreamReader
        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
        inputStreamReader.close();
        sequenceInputStream.close();
        inputStream2.close();
        inputStream1.close();
    }
}
