package _45_Java_IO._04_CharacterIO_Streams._13_BufferedReader;

import java.io.*;
import java.net.URL;

public class BufferedReader_read_URL {
    public static void main(String[] args) throws IOException {
        URL oracleURL = new URL("https://www.oracle.com/");

        InputStream inputStream = oracleURL.openStream();

        // tạo 1 đối tượng Reader từ subclass của nó là InputStreamReader
        // InputStreamReader quản lý 1 InputStream
        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
