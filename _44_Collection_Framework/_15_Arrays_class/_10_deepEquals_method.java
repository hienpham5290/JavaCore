package _44_Collection_Framework._15_Arrays_class;

import java.util.Arrays;

public class _10_deepEquals_method {
    public static void main(String[] args) {
        String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
        String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };

        System.out.println("s1==s2: " + Arrays.equals(s1, s2));
        System.out.println("s1==s2: " + Arrays.deepEquals(s1, s2));

        String[][][] s3 = {
                {
                        {
                            "one", "two", "three"
                        },
                        {
                            "four", "five", "six"
                        }
                },
                {
                        {
                            "seven", "eight", "nine"
                        },
                        {
                            "eleven", "twelve", "thirteen"
                        }
                }
        };
        String[][][] s4 = {
                {
                        {
                                "one", "two", "three"
                        },
                        {
                                "four", "five", "six"
                        }
                },
                {
                        {
                                "seven", "eight", "nine"
                        },
                        {
                                "eleven", "twelve", "thirteen"
                        }
                }
        };

        System.out.println("s3==s4: " + Arrays.deepEquals(s3, s4));
    }
}
