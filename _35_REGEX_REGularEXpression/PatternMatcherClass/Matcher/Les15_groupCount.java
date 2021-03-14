package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les15_groupCount {
    public static void main(String[] args) {
        String text = "aabfooaabfooaabfooaabfoo";
        String regex = "(a*b)(foo)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Group count: " + matcher.groupCount());
        }
    }
}
