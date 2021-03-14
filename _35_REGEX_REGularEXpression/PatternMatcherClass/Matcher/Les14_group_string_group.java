package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les14_group_string_group {
    public static void main(String[] args) {
        String text = "aabfooaabfooabfoob";
        String regex = "(?<group1>a*b)(?<group2>foo)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("group1: " + matcher.group("group1"));
            System.out.println("group2: " + matcher.group("group2"));
        }
    }
}
