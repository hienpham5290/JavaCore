package _31_Wrapper;

/**
 * CÁC PHƯƠNG THỨC HỮU ÍCH TRONG CÁC CLASS WRAPPER
 *
 * public int compareTo(Integer anotherInteger)
 *
 * method này dùng để so sánh 2 đối tượng cùng kiểu Wrapper với nhau, giống như compareTo() của class String
 * method này được gọi từ object 1, tham số truyền vào là object 2
 * có thể đọc là: object 1 compare to object 2
 * kết quả return:
 *  -1: object1 < object2
 *   0: object1 == object2
 *   1: object1 > object2
 *
 * tất cả các class Wrapper đều có method này
 */

public class les05_compareTo {
    public static void main(String[] args) {
        int     i0  = 51;
        Integer i   = 50;
        Integer i1  = Integer.valueOf(i0);
        Integer i2  = Integer.parseInt("50");
        Integer i3  = 49;

        System.out.println(i.compareTo(i1));
        System.out.println(i.compareTo(i2));
        System.out.println(i.compareTo(i3));
    }
}
