package _38_StringBuilder_Class;

public class Les5_ImmutableClass {
    private final String cardNumber; // private, chỉ đối tượng của Les5_ImmutableClass truy cập được

    // chỉ có các Constructor để khởi tạo đối tượng, không có bất cứ method nào thay đổi đối tượng
    public Les5_ImmutableClass(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // chỉ có lấy đối tượng từ getter, không có setter để thay đối giá trị đối tượng
    public String getCardNumber() {
        return cardNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Les5_ImmutableClass immutableClass1 = new Les5_ImmutableClass("cardnumber1111111111");
        System.out.println(immutableClass1.hashCode());
        System.out.println(immutableClass1.getCardNumber());

        Les5_ImmutableClass immutableClass2 = new Les5_ImmutableClass("cardnumber2222222222");
        System.out.println(immutableClass2.hashCode());
        System.out.println(immutableClass2.getCardNumber());
    }
}
