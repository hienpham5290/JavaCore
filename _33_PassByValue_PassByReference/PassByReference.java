package _33_PassByValue_PassByReference;

/**
 * PASS BY REFERENCE - TRUYỀN THAM CHIẾU ( TRUYỀN THAM SỐ ĐỊA CHỈ )
 *
 * ĐỐI VỚI TRUYỀN THAM CHIẾU, GIÁ TRỊ TRUYỀN VÀO CHÍNH LÀ ĐỐI TƯƠNG, ĐỐI TƯỢNG CHỨA ĐỊA CHỈ
 * VÌ KHI 1 ĐỐI TƯỢNG ĐƯỢC TẠO MỚI THÔNG THƯỜNG PHẢI QUA TOÁN TỬ NEW CẤP PHÁT BỘ NHỚ ( BỘ NHỚ THÌ PHẢI CÓ ĐỊA CHỈ RÕ RÀNG )
 * KHI TRUYỀN 1 BIẾN ĐỐI TƯỢNG ( HAY GỌI LÀ BIẾN THAM CHIẾU ) VÀO 1 PHƯƠNG THỨC
 * JVM CŨNG SẼ TẠO RA 1 BẢN SAO CHỨA GIÁ TRỊ CỦA BIẾN TRUYỀN VÀO, CHÍNH LÀ ĐỊA CHỈ
 * BẢN SAO VÀ BẢN GỐC CÙNG CHỨA 1 ĐỊA CHỈ, NÊN MỌI THAY ĐỔI Ở BẢN SAO SẼ ẢNH HƯỚNG ĐẾN BẢN GỐC
 * VÌ THỰC CHẤT, CHỈ TÁC ĐỘNG XỬ LÝ TRÊN CÙNG 1 ĐỊA CHỈ
 *
 */

class ObjRefer {
    int id;
    int age;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}

public class PassByReference {
    public static void main(String[] args) {
        ObjRefer obj = new ObjRefer();
        obj.id = 10;
        obj.age = 31;

        addAge(obj);

        System.out.println(obj.getAge());
    }

    public static void addAge(ObjRefer objRefer) {
        objRefer.setAge(objRefer.getAge() + 1);
    }
}
