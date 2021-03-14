package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les6_start {
    public static void main(String[] args) {
        String string = "Hello Paris";
        String regex = ".*(Paris).*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        // nếu không gọi matches() method hay bất cứ method kiểm thử nào, không thể gọi start() method, và compile sẽ ném ra exception
        System.out.println(matcher.matches());
        // sau khi đã kiểm tra có khớp hay không, nếu không khớp start() method vẫn bị ném ra exception
        System.out.println("matcher start at: " + matcher.start());

        String regex2 = "(lo)";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(string);

        while (matcher2.find()) {
            System.out.println("matcher2 start: " + matcher2.start() +" - end: " + matcher2.end());
        }


        Pattern p = Pattern.compile("a(bb)");
        Matcher m = p.matcher("aabbabbabbaaa");
        while (m.find()) {
            System.out.println("Start: " + m.start() + " - end: " + m.end());
        }
    }
}
