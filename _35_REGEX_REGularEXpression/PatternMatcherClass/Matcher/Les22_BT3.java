package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les22_BT3 {
    public static void main(String[] args) {
        String text = " int a = 100;float b= 130;float c= 110 ; ";
        String regex = "\\s*(?<khaibao>(int|float)\\s+[a-z])\\s*=\\s*(?<giatri>\\d+)\\s*;";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group("khaibao"));
            System.out.println(matcher.group("giatri"));
            System.out.println("_________________________________");
        }
    }
}
