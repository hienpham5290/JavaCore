package _31_Wrapper;

public class BT3 {
    public static void main(String[] args) {
        Integer i = Integer.parseInt("123456");
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toBinaryString(i));
        Integer i2 = Integer.parseInt("12345564");
        System.out.println(Integer.max(i, i2));
        System.out.println(Integer.min(i, i2));

        Character c1 = 'H';
        Character c2 = '4';
        Character c3 = 'i';
        System.out.println(Character.isAlphabetic(c1));
        System.out.println(Character.isDigit(c2));
        System.out.println(Character.isLowerCase(c3));
        System.out.println(Character.isUpperCase(c1));
        System.out.println(Character.toLowerCase(c1));
        System.out.println(Character.toUpperCase(c3));
        System.out.println(Character.isAlphabetic(234));
    }
}
