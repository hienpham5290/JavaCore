package _35_REGEX_REGularEXpression.PatternMatcherClass.Pattern;

import java.util.regex.Pattern;

public class Les5_matches {
    public static void main(String[] args) {
        String charSequence = "Newyork";
        String regex = "^N.*(yo).*k$";

        System.out.println("charSequence: " + charSequence);
        System.out.println("regex: " + regex);

        boolean match = Pattern.matches(regex, charSequence);
        System.out.println("match found: " + match); // true

        System.out.println("match found: " + Pattern.matches(regex, charSequence)); // true
    }
}
