package _36_String_Class;


public class Les3_compare_string {
    public static void main(String[] args) {
        // SO SÁNH NỘI DUNG VỚI METHOD EQUALS() - method equals() phân biệt chữ HOA và chữ thường
        String s1 = "Welcome";
        String s2 = "Welcome";
        String s3 = "wElCoMe";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false

        // SO SÁNH NỘI DUNG VỚI METHOD EQUALS IGNORE CASE - method này không phân biệt chữ HOA chữ thường
        System.out.println(s1.equalsIgnoreCase(s3)); // true

        // SO SÁNH GIÁ TRỊ CỦA 2 CHUỖI VỚI NHAU, S1 < S2 : < 0, S1 = S2 : 0, S1 > S2 : > 0
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        // SO SÁNH GIÁ TRỊ VÀ KHÔNG QUAN TÂM CHỮ HOA CHỮ THƯỜNG
        System.out.println(s1.compareToIgnoreCase(s3));

        // SO SÁNH THAM CHIẾU
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
