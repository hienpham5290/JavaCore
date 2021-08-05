package _45_Java_IO._04_CharacterIO_Streams._16_StringReader;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class StringReader_with_StreamTokenizer {
    public static void main(String[] args) throws IOException {
        String s = "Apple Apricots Apricots Blackberries Apple";

        StringReader stringReader = new StringReader(s);

        StreamTokenizer streamTokenizer = new StreamTokenizer(stringReader);

        Map<String, Integer> wordMap = new HashMap<>();

        while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
                int count;

                if (wordMap.containsKey(streamTokenizer.sval)) {
                    count = wordMap.get(streamTokenizer.sval).intValue();
                    count++;
                } else {
                    count = 1;
                }
                wordMap.put(streamTokenizer.sval, count);
            }
        }

        wordMap.forEach((word, count) -> {
            System.out.println(word + " : " + count);
        });
    }
}
