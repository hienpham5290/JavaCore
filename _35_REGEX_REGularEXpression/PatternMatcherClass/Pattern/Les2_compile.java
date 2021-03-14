package _35_REGEX_REGularEXpression.PatternMatcherClass.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * public static Pattern compile(String regex, int flags);
 *
 * đây là phương thức dùng để tạo đối tượng
 * non-access modifier là static, nên phương thức này gọi từ class Pattern
 * trả về là 1 instance của Pattern class
 * 2 tham số truyền vào: regex và flags
 * regex do người dùng định nghĩa
 * flags do class Pattern cung cấp ( trong Pattern class cung cấp 1 list các flags hữu ích )
 * các flags là các static CONSTANTS
 *
 * phương thức này ném ra các exception sau
 *      PatternSyntaxException: cú pháp của regex không hợp lệ
 *      IllegalArgumentException: Ngoại lệ này được nêu ra nếu các giá trị bit khác với giá trị tương ứng với các cờ so
 *          khớp đã xác định được đặt trong cờ.
 *
 */

public class Les2_compile {
    public static void main(String[] args) {
        //create a REGEX String
        String REGEX = "(.*)(for)(.*)";

        // create a String in which you want to search
        String actualString = "code fo Machine";

        // compile the REGEX to create pattern, using compile(String regex, int flags) method
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);

        // 1st way - check whether REGEX String is found in actualString or not
//        boolean match = pattern.matcher(actualString).matches();

        // 2nd way - create matcher from pattern, parameter is String
        Matcher matcher = pattern.matcher(actualString);
        // find boolean
        boolean match = matcher.matches();
        System.out.println(match);

        String domain = "Geekforgeek.org";
        String REGEX2 = ".*org.*";
        Pattern pattern1 = Pattern.compile(REGEX2, Pattern.CASE_INSENSITIVE);
        boolean match2 = pattern1.matcher(domain).matches();
        System.out.println(match2);
    }
}
