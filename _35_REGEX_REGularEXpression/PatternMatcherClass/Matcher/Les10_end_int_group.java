package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les10_end_int_group {
    public static void main(String[] args) {
        String string = "Hello Java";
        String regex = "^.+(l+o).+(av)a$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        boolean boo = matcher.matches();
        System.out.println(boo);
        System.out.println("start1: " + matcher.start(1) + " - end1: " + matcher.end(1));
        System.out.println("start2: " + matcher.start(2) + " - end2: " + matcher.end(2));


//        while (matcher.find()) {
//            System.out.println("start1: " + matcher.start(1) + " - end1: " + matcher.end(1));
//            System.out.println("start2: " + matcher.start(2) + " - end2: " + matcher.end(2));
//        }
    }
}
