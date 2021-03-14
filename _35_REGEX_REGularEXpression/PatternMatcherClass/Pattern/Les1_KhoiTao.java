package _35_REGEX_REGularEXpression.PatternMatcherClass.Pattern;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Les1_KhoiTao {
    public static void main(String[] args) {
        // định nghĩa chuỗi REGEX
        String regex = ".*";

        // khai báo chuỗi cần so khớp với regex
        String s1 = "This is my sample text";

        // khởi tạo object pattern tham số là regex
        Pattern pattern = Pattern.compile(regex);

        // khởi tạo object matcher từ đối tượng pattern bằng method matcher() của Pattern class
        Matcher matcher = pattern.matcher(s1);

        // kiểm tra boolean của matcher qua method matches()
        boolean match = matcher.matches();

        // in giá trị boolean
        System.out.println(match);

        String  dateText1   = "Friday, 21-08-2020";
        String  regex1      = ".+\\d{2}-\\d{2}-\\d{4}";
        Pattern patternDateText = Pattern.compile(regex1);
        Matcher matcher1        = patternDateText.matcher(dateText1);
        boolean match1           = matcher1.matches();
        System.out.println(match1);

        String email = "quanghien123@gmail.com";
        String regex2 = "^\\w.*@gmail.com$";
        Pattern patternEmail = Pattern.compile(regex2);
        Matcher matcher2 = patternEmail.matcher(email);
        boolean match2 = matcher2.matches();
        System.out.println(match2);
    }
}
