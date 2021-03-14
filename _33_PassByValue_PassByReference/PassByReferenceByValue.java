package _33_PassByValue_PassByReference;

/**
 * PASS BY REFERENCE BY VALUE - TRUYỀN THAM CHIẾU BẰNG GIÁ TRỊ
 *
 * NGHĨA LÀ KHI TRUYỀN 1 ĐỐI TƯỢNG VÀO 1 PHƯƠNG THỨC, JVM VẪN TẠO 1 BẢN SAO, CHỨA CÙNG THAM CHIẾU CỦA ĐỐI TƯỢNG GỐC
 * TRONG PHƯƠNG THỨC, TA GÁN BẢN SAO ĐẾN 1 THAM CHIẾU KHÁC BẰNG CÁCH CẤP PHÁT 1 ĐỊA CHỈ BỘ NHỚ KHÁC CHO NÓ THÔNG QUA TOÁN TỬ NEW
 * TỪ ĐÂY MỌI THAY ĐỔI CỦA BẢN SAO, LÀ SỰ THAY ĐỔI Ở ĐỊA CHỈ KHÁC, KHÔNG LIÊN QUAN ĐẾN ĐỊA CHỈ CỦA ĐỐI TƯỢNG TRUYỀN VÀO PHƯƠNG THỨC
 *
 */

class ObjReferByValue {
    int id;
    int age;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}

public class PassByReferenceByValue {
    public static void main(String[] args) {
        ObjReferByValue obj = new ObjReferByValue();
        obj.id = 11;
        obj.setAge(300);

        addAge(obj);

        // mặc dù đã truyền tham chiếu, nhưng phương thức addAge() lại cho bản sao tham chiếu đến địa chỉ khác
        // nên mọi thay đổi trong addAge() chỉ ảnh hưởng đến địa chỉ khác, không ảnh hưởng đến địa chỉ truyền vào
        System.out.println(obj.getAge());
    }

    public static void addAge(ObjReferByValue objRefer) {
        objRefer = new ObjReferByValue(); // bản sao sẽ tham chiếu đến địa chỉ khác
        objRefer.setAge(objRefer.getAge() + 50); // setup giá trị thuộc tính của bản sao ở địa chỉ khác
    }
}
