package _35_REGEX_REGularEXpression.PatternMatcherClass.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les4_matcher {
    public static void main(String[] args) {
        String actualString = "Geeksforgeeks";
        String regex = "(.*)(ee)(.*)?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actualString);

        boolean matchFound = false;
        while (matcher.find()) {
            System.out.println("found the regex in text: " +
                    matcher.group() + " starting index: " + matcher.start() + " ending index: " + matcher.end());
            matchFound = true;
        }
        if (!matchFound) {
            System.out.println("No match found for regex");
        }


        String regex1 = "(.*)(Welcome)(.*)?";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(actualString);

        boolean matchFound1 = false;
        while (matcher1.find()) {
            System.out.println("match found");
            matchFound1 = true;
        }
        if (!matchFound1) {
            System.out.println("Not match found");
        }
    }
}
