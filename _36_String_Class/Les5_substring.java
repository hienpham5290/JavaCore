package _36_String_Class;

/**
 *      SUBSTRING - CHUỖI CON
 */

public class Les5_substring {
    public static void main(String[] args) {
        String s = "Hello This Is My Program In Java";
        System.out.println(s);
        System.out.println(s.length()); // lấy giá trị độ dài của string = 32

        // in ra từng ký tự trong chuỗi theo thứ tự
        for (int i = 0; i < s.length(); i++) {
            System.out.println("i = " + i + " : " + s.charAt(i));
        }

        String sub1 = s.substring(5);
        System.out.println(sub1);

        String sub2 = s.substring(5, 32);
        System.out.println(sub2);

        // end index vượt quá length của string ban đầu sẽ bị ném ra 1 ngoại lệ
//        String sub3 = s.substring(5, 35);
//        System.out.println(sub3);
    }
}
