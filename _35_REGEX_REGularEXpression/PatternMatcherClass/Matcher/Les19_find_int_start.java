package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les19_find_int_start {
    public static void main(String[] args) {
        String text = "aaaaabbbbcccccdddddeeeeeeffffffggggghhhh";
        String regex = "d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find(5)) {
            System.out.println(matcher.group() + " - " + matcher.start() + " - " + matcher.end());
        }
    }
}
