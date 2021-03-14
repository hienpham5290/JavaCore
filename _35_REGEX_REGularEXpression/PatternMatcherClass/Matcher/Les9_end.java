package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les9_end {
    public static void main(String[] args) {
        String string = "Hello Paris";
        String regex = ".*(Paris).*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("start: " + matcher.start() + "\n" + "end: " + matcher.end());
        }
    }
}
