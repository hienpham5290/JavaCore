package _31_Wrapper;

/**
 * CÁC METHOD HỮU ÍCH CỦA CÁC LỚP WRAPPER
 *
 * public byte byteValue()
 *
 * method này chuyển giá trị của 1 đối tượng của class Wrapper về kiểu nguyên thủy tương ứng
 *
 */

public class les04_xxxValue {
    public static void main(String[] args) {
        // CÁC ĐỐI TƯỢNG
        Byte        b   = 125;
        Character   c   = 'H';
        Boolean     boo = false;
        Integer     i   = 12;
        Long        l   = 1234L;
        Float       f   = 3.14F;
        Double      d   = 3.1415214;

        // CHUYỂN VỀ KIỂU NGUYÊN THỦY TƯƠNG ỨNG VỚI MỖI ĐỐI TƯỢNG
        byte        b2  = b.byteValue();
        char        c2  = c.charValue();
        boolean     boo2= boo.booleanValue();
        int         i2  = i.intValue();
        long        l2  = l.longValue();
        float       f2  = f.floatValue();
        double      d2  = d.doubleValue();

        System.out.println(b2);
        System.out.println(c2);
        System.out.println(boo2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);

    }
}
