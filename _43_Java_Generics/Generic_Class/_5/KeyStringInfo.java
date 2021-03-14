package _43_Java_Generics.Generic_Class._5;

// Subclass giữ nguyên tham số kiểu K, chỉ định V là String, tăng thêm tham số kiểu I

public class KeyStringInfo<K, I> extends KeyValue<K, String, I> {
    // attribute kiểu I của Subclass
    private I info;

    // kết hợp constructor của Superclass thiết lập hàm khởi tạo của Subclass
    public KeyStringInfo(K key, String value, I info) {
        super(key, value);
        this.info = info;
    }

    public I getInfo() {
        return this.info;
    }

    public void setInfo(I info) {
        this.info = info;
    }
}
