package _31_Wrapper;

/**
 * CÁC METHOD HỮU ÍCH TRONG CÁC LỚP WRAPPER
 *
 * public static String toString(byte b)
 *
 * đây là 1 method static
 * giá trị truyền vào là 1 kiểu nguyên thủy tương ứng với lớp Wrapper đó
 * kết quả return là 1 giá trị kiểu String
 *
 * các lớp Wrapper khác tương tự
 */

public class les03_toString {
    public static void main(String[] args) {
        byte    b1  = 12;
        String  b   = Byte.toString(b1);
        String  boo = Boolean.toString(false);
        String  c   = Character.toString('H');
        String  i   = Integer.toString(123);
        String  l   = Long.toString(12345L);
        String  f   = Float.toString(3.14F);
        String  d   = Double.toString(3.14123421);

        System.out.println(b);
        System.out.println(boo);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
