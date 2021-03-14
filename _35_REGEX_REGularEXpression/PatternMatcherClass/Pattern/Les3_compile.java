package _35_REGEX_REGularEXpression.PatternMatcherClass.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * public static Pattern compile(String regex);
 *
 * phương thức static ( gọi trực tiếp từ Pattern class )
 * 1 tham số kiểu String: regex
 * trả về 1 đối tượng có instance của Pattern class
 *
 * phương thức này ném ra các exception sau
 *      PatternSyntaxException: cú pháp của regex không hợp lệ
 */

public class Les3_compile {
    public static final String REGEX = "(.*)\\d+(.*)";
    public static final String INPUT = "This is a sample Text, 1234, with numbers in between.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        boolean match = matcher.matches();
        System.out.println(match);
    }
}
