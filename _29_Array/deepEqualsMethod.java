package _29_Array;

import java.util.Arrays;

public class deepEqualsMethod {
    public static void main(String[] args) {
        String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
        String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };

        System.out.println(Arrays.equals(s1, s2)); // Output : false
        System.out.println(Arrays.deepEquals(s1, s2)); // Output : true
    }
}
