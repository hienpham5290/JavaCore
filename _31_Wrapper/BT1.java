package _31_Wrapper;

public class BT1 {
    public static void main(String[] args) {
        int         i   = Integer.parseInt("10");
//        float       f   = Float.parseFloat("4.5a");// format 4.5a sai, 4.5f đúng

        System.out.println(i);
//        System.out.println(f); // NumberFormatException
    }
}
