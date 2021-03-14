package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les21_BT2 {
    public static void main(String[] args) {
        String country1 = "iran";
        String country2 = "Iraq";

        // bắt đầu bởi I, tiếp theo là ký tự bất kỳ, tiếp theo là a hoặc e
        String regex = "^I.[ae]";

        // biên dịch regex , không phân biệt ký tự HOA hay thường
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(country1);

        // lookingAt() chỉ cần khớp ký tự đầu
        System.out.println(matcher.lookingAt()); // true
        // matches() phải khớp toàn bộ
        System.out.println(matcher.matches()); // false

        // reset matcher với input string mới
        matcher.reset(country2);

        System.out.println(matcher.lookingAt());
        System.out.println(matcher.matches());
    }
}
