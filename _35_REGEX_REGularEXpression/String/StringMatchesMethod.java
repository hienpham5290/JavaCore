package _35_REGEX_REGularEXpression.String;

/**
 *
 *
 * public boolean matches(String regex) {
 *      return Pattern.matches(regex, this);
 * }
 *
 *
 */

public class StringMatchesMethod {
    public static void main(String[] args) {
        String s1 = "a";
        System.out.println(s1);
        // kiểm tra toàn bộ s1
        // khớp với bất kỳ ký tự nào
        // quy tắc: .
        // ==> true
        boolean match = s1.matches(".");
        System.out.println(match + " :(bất kỳ ký tự, chỉ 1 ký tự) .");

        String s2 = "abc";
        System.out.println(s2);
        // kiểm tra toàn bộ s2
        // khớp với bất kỳ ký tự nào
        // quy tắc: .
        // ==> false ( chuỗi 3 ký tự, regex chỉ so 1 ký tự ==> không match )
        match = s2.matches(".");
        System.out.println(match + " :(bất kỳ ký tự, chỉ 1 ký tự) .");

        // khớp với bất kỳ ký tự nào
        // 0 hoặc nhiều lần
        // quy tắc: .*
        // true
        match = s2.matches(".*");
        System.out.println(match + " :(bất kỳ ký tự, 0 hoặc nhiều lần) .*");

        String s3 = "m";
        System.out.println(s3);
        // kiểm tra toàn bộ s3
        // khớp bắt đầu với ký tự m
        // quy tắc: ^
        // ==> true
        match = s3.matches("^m");
        System.out.println(match + " :(bắt đầu với 1 ký tự m) ^m");

        String s4 = "mnp";
        System.out.println(s4);
        // kiểm tra toàn bộ s4
        // khớp bắt đầu với ký tự m
        // quy tắc: ^
        // ==> false ( chuỗi 3 ký tự, chỉ so khớp 1 ký tự đầu, ==> không khớp)
        match = s4.matches("^m");
        System.out.println(match + " :(bắt đầu với 1 ký tự m) ^m");

        // kiểm tra toàn bộ s4
        // khớp bắt đầu với ký tự m
        // sau đó là ký tự bất kỳ xuất hiện 1 hoặc nhiều lần
        // quy tắc: ^m.+
        // ==> true
        match = s4.matches("^m.+");
        System.out.println(match + " :(bắt đầu với 1 ký tự m, sau đó ký tự bất kỳ xuất hiện 1 hoặc nhiều lần) ^m.+");

        String s5 = "p";
        System.out.println(s5);
        // kiểm tra toàn bộ s5
        // khớp kết thúc với ký tự p
        // quy tắc: $
        // true
        match = s5.matches("p$");
        System.out.println(match + " :(kết thúc với 1 ký tự p) p$");

        String s6 = "2nnp";
        System.out.println(s6);
        // kiểm tra toàn bộ s6
        // khớp kết thúc với ký tự p
        // false ( chuỗi có 4 ký tự, chỉ khớp với ký tự cuối ==> không khớp )
        match = s6.matches("p$");
        System.out.println(match + " :(chỉ kết thúc với p) p$");

        // kiểm tra toàn bộ s6
        // khớp với bất kỳ ký tự 1 lần
        // khớp với n, xuất hiện 1 hoặc đến 3 lần
        // kết thúc với p
        // quy tắc: .n{1,3}p$
        // true
        match = s6.matches("^.n{1,3}p$");
        System.out.println(match + " :(bắt đầu 1 bất kỳ, ký tự n xuất hiện khoảng 1-3 lần, kết thúc với p) .n{1,3}p$");

        String s7 = "2ybcd";
        System.out.println(s7);
        // kiểm tra toàn bộ s7
        // bắt đầu là 2
        // tiếp theo 1 ký tự x hoặc y hoặc z
        // quy tắc: 2[xyz].+
        // true
        match = s7.matches("^2[xyz].+$");
        System.out.println(match + " :(bắt đầu là 2, sau đó là x hoặc y hoặc z, còn lại bất kỳ 1 hoặc nhiều lần) 2[xyz].+");

        String s8 = "2bkbv";
        System.out.println(s8);
        // kiểm tra toàn bộ s8
        // bắt đầu bất kỳ 1 hoặc nhiều lần
        // tiếp theo a hoặc b hoặc c
        // tiếp theo z hoặc v
        // tiếp theo bất kỳ 0 đến nhiều lần
        // quy tắc: .+[abc][zv].
        // true
        match = s8.matches("^.+[abc][zv].*$");
        System.out.println(match + " :(bắt đầu bất kỳ 1 đến nhiều lần, a hoặc b hoặc c, z hoặc v, bất kỳ 0 đến nhiều lần) ^.+[abc][zv].*$");
    }
}
