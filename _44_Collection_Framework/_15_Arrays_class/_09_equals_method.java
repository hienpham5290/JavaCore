package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;

public class _09_equals_method {
    public static void main(String[] args) {
        String[] s1 = { "java", "j2ee", "struts", "hibernate" };
        String[] s2 = { "jsp", "spring", "jdbc", "hibernate" };
        String[] s3 = { "java", "j2ee", "struts", "hibernate" };
        String[] s4 = { "java", "struts", "j2ee", "hibernate" };

        // equals()
        System.out.println("s1==s2: " + Arrays.equals(s1, s2));
        System.out.println("s1==s3: " + Arrays.equals(s1, s3));
        System.out.println("s1==s4: " + Arrays.equals(s1, s4));

        // nếu muốn so sánh 2 mảng có cùng số lượng phần tử và
        // các phần tử thì giống nhau, nhưng ở vị trí khác nhau
        // trước tiên cần sort lại mảng theo thứ tự tăng dần
        // sau đó tiến hành so sánh bằng Arrays.equals() method
        String[] s5 = { "java", "j2ee", "struts", "hibernate" };
        String[] s6 = {"hibernate", "struts", "j2ee", "java"};

        System.out.println("s5==s6: " + Arrays.equals(s5, s6));

        // sort()
        Arrays.sort(s5);
        Arrays.sort(s6);

        // equals()
        System.out.println("s5==s6: " + Arrays.equals(s5, s6));
    }
}
