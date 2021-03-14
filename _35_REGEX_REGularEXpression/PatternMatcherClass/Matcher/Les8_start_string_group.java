package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les8_start_string_group {
    public static void main(String[] args) {
        String text = " My number phone is 0369310105, my name is Jack";
        String regex = ".*(?<numberphone>\\d{10}).*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Start of group <numberphone> : " + matcher.start("numberphone"));
        }
    }
}
