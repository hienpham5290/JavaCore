package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;

/**
 * chuong trinh noi 2 input stream voi nhau tao thanh 1 input stream duy nhat
 * va read du lieu tu input stream do
 *
 * su dung SequenceInputStream de noi 2 input stream voi nhau
 * su dung InputStreamReader va BufferedInputStream de read du lieu tu input stream
 */

public class SequenceInputStream_EX3 {
    // duong dan cua 2 file van ban ma hoa UTF-8
    private static String path1 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\test_SequenceInputStream_1.txt";
    private static String path2 = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\test_SequenceInputStream_2.txt";

    public static void main(String[] args) throws IOException {
        InputStream inputStream1 = new FileInputStream(path1);
        InputStream inputStream2 = new FileInputStream(path2);

        SequenceInputStream sequenceInputStream = new SequenceInputStream(inputStream1, inputStream2);

        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        bufferedReader.lines()
                .filter(line -> !line.isBlank()) // is not Blank
                .filter(line -> !line.startsWith("#")) // not start with #
                .forEach(System.out::println);

        bufferedReader.close();
    }
}
