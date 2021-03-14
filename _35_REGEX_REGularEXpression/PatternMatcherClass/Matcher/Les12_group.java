package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les12_group {
    public static void main(String[] args) {
        String text = "aabfooaabfooabfoob";
        String regex = "(a*b)(foo)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean boo = matcher.matches();
        System.out.println(boo);

        // if find được chuỗi khớp thực hiện lệnh in
        if (matcher.find()) {
            System.out.println("chuỗi con đầu tiên khớp: " + matcher.group());
        }

        // while find được chuỗi khớp thì còn thực hiện lệnh in
//        while (matcher.find()) {
//            System.out.println("chuỗi con đầu tiên khớp: " + matcher.group());
//        }
    }
}
