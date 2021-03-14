package _33_PassByValue_PassByReference;

/**
 *
 * PASS BY VALUE - TRUYỀN THAM TRỊ
 *
 * KHI TRUYỀN 1 BIẾN KIỂU NGUYÊN THỦY VÀO 1 PHƯƠNG THỨC TRONG JAVA
 * JVM SẼ TẠO 1 BẢN SAO Ở 1 ĐỊA CHỈ KHÁC CHỨA CÙNG GIÁ TRỊ VỚI BIẾN TRUYỀN VÀO
 * MỌI XỬ LÝ TÍNH TOÁN CỦA PHƯƠNG THỨC SẼ DỰA TRÊN BẢN SAO ĐÓ, KHÔNG ẢNH HƯỞNG ĐẾN BIẾN GỐC TRUYỀN VÀO
 * CHO NÊN, GỌI LÀ TRUYỀN GIÁ TRỊ, PHƯƠNG THỨC SẼ CHỈ LẤY GIÁ TRỊ
 */

public class PassByValue {
    static int x = 10;

    public static void main(String[] args) {
        System.out.println("giá trị TRƯỚC khi truyền vào phương thức: " + x); // 10
        change(x);
        System.out.println("giá trị SAU khi truyền vào phương thức: " + x); // 10, không thay đổi
    }

    public static void change(int x) {
        System.out.println("giá trị TRƯỚC khi tính toán trong phương thức: " + x); // đây là 1 x khác chứa giá trị = x gốc
        x *= 2;
        System.out.println("giá trị SAU khi tính toán trong phương thức: " + x); // x khác sau khi đã thay đổi giá trị
    }
}
