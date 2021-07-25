package _45_Java_IO._04_CharacterIO_Streams._10_FilterReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class RemoveHtmlTagTest {
    public static void main(String[] args) throws IOException {
        // Create a Reader.
        Reader in = new StringReader("<h1>Hello \n <b>World</b><h1>");

        RemoveHtmlTagReader filterReader = new RemoveHtmlTagReader(in);
        BufferedReader br = new BufferedReader(filterReader);

        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
    }
}
