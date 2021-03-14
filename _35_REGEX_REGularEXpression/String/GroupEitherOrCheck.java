package _35_REGEX_REGularEXpression.String;

public class GroupEitherOrCheck {
    public static void main(String[] args) {
        String s1 = "The film Tom and Jerry";
        System.out.println(s1);
        // Kiểm tra toàn bộ s
        // Bắt đầu bởi ký tự bất kỳ xuất hiện 0 hoặc nhiều lần
        // Tiếp theo là từ Tom hoặc Jerry
        // Kết thúc bởi ký tự bất kỳ xuất hiện 0 hoặc nhiều lần
        // Kết hợp các quy tắc: ., *, X|Z
        // true
        String regex1 = ".*(Tom|Jerry).*";
        System.out.println(regex1);
        boolean match = s1.matches(regex1);
        System.out.println(match);

        String s2 = "The film Toom and Jerry";
        System.out.println(s2);
        match = s2.matches(regex1);
        System.out.println(match);

        String s3 = "The film Tom and Jeerry";
        System.out.println(s3);
        match = s3.matches(regex1);
        System.out.println(match);

        String s4 = "The film Toom and Jeerry";
        System.out.println(s4);
        match = s4.matches(regex1);
        System.out.println(match);
    }
}
