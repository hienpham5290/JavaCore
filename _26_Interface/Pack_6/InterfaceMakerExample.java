package _26_Interface.Pack_6;

/**
 * tạo 1 maker interface: SafeDeleteable{}
 * maker interface này dùng để chỉ ra 1 đối tượng nào đó không được xóa khỏi database, chỉ được set flag (gắn cờ) là delete khi được yêu cầu delete
 *
 * tạo 1 class Order{} , class này có thể xóa khỏi database
 *
 * tạo 1 class Customer{} implements SafeDeleteable ; class này không thể xóa khỏi database, chỉ gắn cờ là delete khi được yêu cầu delete
 *
 */

public class InterfaceMakerExample {
    public static void delete(Object object) {
        if (object instanceof SafeDeleteable) {
            System.out.println("Set flag to delete: " + object.getClass());
        } else {
            System.out.println("Call delete object from database: " + object.getClass());
        }
    }

    public static void main(String[] args) {
        delete(new Order());
        delete(new Customer());
    }
}
