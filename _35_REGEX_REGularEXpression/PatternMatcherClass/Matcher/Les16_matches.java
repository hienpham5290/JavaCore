package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les16_matches {
    public static void main(String[] args) {
        String text = "foooooooooooooMooooooooooooooooooooooooooooo";
        String regex = "(Mo)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // matches() dùng để so khớp toàn bộ chuỗi với regex
        boolean match = matcher.matches();
        System.out.println(match); // false

        // find và group dùng để thao tác với nhóm
//        while (matcher.find()) {
//            System.out.println(matcher.group()); // Mo
//        }
    }
}
