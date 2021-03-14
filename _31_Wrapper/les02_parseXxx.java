package _31_Wrapper;

/**
 * CÁC METHOD HỮU ÍCH TRONG CÁC CLASS WRAPPER
 *
 * public static boolean parseXxx(String s)
 *
 * Xxx: là kiểu nguyên thủy sẽ trả về
 * vì là method static nên lớp Wrapper sẽ có nhiệm vụ gọi những method tương ứng với Wrapper đó
 *
 * tham số truyền vào cho method static này là 1 String
 * kết quả return là 1 giá trị nguyên thủy tương ứng với String truyền vào
 */

public class les02_parseXxx {
    public static void main(String[] args) {
        String boo  = "false";
        String b    = "1";
        String c    = "H";
        String i    = "123";
        String l    = "123445555";
        String f    = "3.14";
        String d    = "1.2222222222";

        boolean boo2    = Boolean.parseBoolean(boo);
        byte    b2      = Byte.parseByte(b);
//        char    c2      = Character.parseCharater(c);
        int     i2      = Integer.parseInt(i);
        long    l2      = Long.parseLong(l);
        float   f2      = Float.parseFloat(f);
        double  d2      = Double.parseDouble(d);

        System.out.println(boo2);
        System.out.println(b2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);

    }
}
