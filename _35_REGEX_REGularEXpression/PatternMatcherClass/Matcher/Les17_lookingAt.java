package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les17_lookingAt {
    public static void main(String[] args) {
        String text = "foooooooooooooMooooooooooooooooooooooooooooo";
        String regex1 = "fAA";
        String regex2 = "foo";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(text);

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text);

        System.out.println(matcher1.lookingAt()); // false
        System.out.println(matcher2.lookingAt()); // true
    }
}
