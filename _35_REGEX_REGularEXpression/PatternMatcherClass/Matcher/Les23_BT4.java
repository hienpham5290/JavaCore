package _35_REGEX_REGularEXpression.PatternMatcherClass.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Les23_BT4 {
    public static void main(String[] args) {
        String TEXT = "<a href='http://HOST/file/FILE1'>File 1</a>"
                + "<a href='http://HOST/file/FILE2'>File 2</a>";

        // regex định nghĩa 1 group là tên file, nằm giữa /file/ và '>
        // trong group tên file, là ký tự bất kỳ, đi kèm với *?
        // vì cả đoạn text dài, nhưng chỉ lấy đoạn text khớp ngắn nhất theo yêu cầu
        String regex = "/file/(?<filename>.*?)'>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(TEXT);

        while (matcher.find()) {
            System.out.println("File name: " + matcher.group("filename"));
        }
    }
}
