package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les13_group_int_group {
    public static void main(String[] args) {
        String text = "aabfooaabfooabfoob";
        String regex = "(a*b)(foo)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // if find được chuỗi khớp thực hiện lệnh
        if (matcher.find()) {
            System.out.println("group 1: " + matcher.group(1));
            System.out.println("group 2: " + matcher.group(2));
        }
    }
}
