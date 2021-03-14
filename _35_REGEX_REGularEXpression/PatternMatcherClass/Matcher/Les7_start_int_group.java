package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les7_start_int_group {
    public static void main(String[] args) {
        String string = "HelloJava";

        // định nghĩa regex có 2 group: group1: (l*o) và group2: (av) , trong java cả regex là group 0
        String regex = "(l*o)J(av)a";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        System.out.println(string);

        // dùng find() tìm vị trí khớp regex
        while (matcher.find()) {
            // tìm vị trí khớp với group 1
            System.out.println("group 1: " + matcher.start(1)); // 2

            // tìm vị trí khớp với group 2
            System.out.println("group 2: " + matcher.start(2)); // 6
        }
    }
}
