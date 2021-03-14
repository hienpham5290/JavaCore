package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les20_BT1 {
    public static void main(String[] args) {
        String text = "This \t is a \t\t\t String";

        // khoảng trắng xuất hiện 1 hoặc nhiều lần
        String regex = "\\s+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(text);

        while (matcher.find()) {
            System.out.println("start: " + matcher.start() + " - end: " + matcher.end() + " - group: " + matcher.group());
        }

        text = matcher.replaceAll(" ");
        System.out.println(text);

        String regex2 = "(\\w+)";
        Pattern pattern1 = Pattern.compile(regex2);
        Matcher matcher1 = pattern1.matcher(text);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }
}
