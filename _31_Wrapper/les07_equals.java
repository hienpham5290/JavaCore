package _31_Wrapper;

/**
 * CÁC PHƯƠNG THỨC HỮU ÍCH TRONG CÁC CLASS WRAPPER
 *
 * equals()
 *
 * public boolean equals(Object obj)
 *
 * tương tự như method equals() khi so sánh chuỗi
 * method này sẽ so sánh các đối tượng thuộc kiểu Wrapper với nhau
 * object1.equals(object2) : object 1 có bằng object 2 hay không
 * kết quả return là kiểu boolean: true ( nếu 2 object bằng nhau ) , false ( nếu 2 object khác nhau )
 *
 */

public class les07_equals {
    public static void main(String[] args) {
        int     i0  = 50;
        Integer i   = 50;
        Integer i1  = Integer.parseInt("51");
        Integer i2  = Integer.valueOf(i0);

        System.out.println(i.equals(i1));
        System.out.println(i.equals(i2));

        float f0 = 2.43F;
        Float f1 = Float.parseFloat("20.25f");
        Float f2 = Float.parseFloat("2.43f");
        Float f3 = Float.valueOf(f0);

        System.out.println("Compare f1 & f2: " + f1.equals(f2));
        System.out.println("Compare f2 & f3: " + f2.equals(f3));
    }
}
