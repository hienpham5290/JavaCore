package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les18_find {
    public static void main(String[] args) {
        String text = "fuookadaeimiookuzoouromaanooasaki123nagamotoohhooo";
        String regex = "(oo)";
        String text2 = null;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            text2 = text.replaceAll(regex, "-");
        }
        System.out.println(text2);
    }
}
