package _35_REGEX_REGularEXpression.String;

public class StringSplitMethod {
    public static void main(String[] args) {
        String TEXT = "This     is     my              Text";

        // khởi tạo 1 regex
        // khoảng trắng xuất hiện 1 hoặc nhiều lần
        // \s (đại diện cho khoảng trắng) viết ngắn gọn của \t\n\x0b\r\f
        // kết hợp quy tắc: \s và +
        String regex = "\\s+";

        // dùng method split của String class, tách các từ được phân cách với nhau bằng khoảng trắng, đưa vào 1 chuỗi
        String[] newTEXT = TEXT.split(regex);

        // in mảng chứa các từ của chuỗi ban đầu
        for (String element : newTEXT) {
            System.out.println(element);
        }

        // in chiều dài của mảng
        System.out.println(newTEXT.length);

        // thay thế chuỗi ban đầu các khoảng trắng bởi 1 khoảng trắng
        String adjustTEXT = TEXT.replaceAll(regex, " ");
        System.out.println(adjustTEXT);
    }
}
