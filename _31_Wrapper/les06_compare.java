package _31_Wrapper;

/**
 * CÁC PHƯƠNG THỨC HỮU ÍCH TRONG CÁC CLASS WRAPPER
 *
 * public int compare(Integer anotherInteger)
 *
 * method này dùng để so sánh 2 đối tượng cùng kiểu Wrapper với nhau
 * method này là method static, nên có thể gọi trực tiếp từ class Wrapper tương ứng, tham số là 2 object cần compare
 * có thể đọc là: compare 2 object ( object 1, object 2 )
 * kết quả return:
 *  -1: object1 < object2
 *   0: object1 == object2
 *   1: object1 > object2
 *
 * tất cả các class Wrapper đều có method này
 */

public class les06_compare {
    public static void main(String[] args) {
        int     i0  = 51;
        Integer i   = 50;
        Integer i1  = Integer.valueOf(i0);
        Integer i2  = Integer.parseInt("50");
        Integer i3  = 49;

        System.out.println(Integer.compare(i, i1));
        System.out.println(Integer.compare(i, i2));
        System.out.println(Integer.compare(i, i3));
    }
}
