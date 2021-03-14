package _25_Abstract_Class.Pack_1;

import _25_Abstract_Class.Pack_2.Bike;

/**
 * abstract - trừu tượng
 *
 * trừu tượng nghĩa là rút ra những thứ cụ thể, chi tiết từ những thứ khái quát, chung chung của 1 sự vật, sự việc nào đó
 *
 * trong Java, trừu tượng là việc 1 subclass sẽ thực hiện cụ thể chi tiết 1 công việc nào đó, mà ở superclass ( chính là
 * class abstract ) chỉ đưa ra 1 tên chung chung, không có chi tiết rõ ràng, chỉ nêu ra và bắt buộc subclass phải override
 * ( hay implement ) công việc đó 1 cách cụ thể chi tiết thay cho superclass ( hay class abstract )
 *
 * [KHAI BÁO ABSTRACT CLASS]
 * thêm từ khóa abstract trước từ khóa class, còn lại khai báo như khai báo 1 class thông thường
 *
 * [KHAI BÁO ABSTRACT METHOD]
 * [access modifier] abstract [return data type] ();
 * thêm từ khóa abstract trước từ khóa kiểu trả về của method, có cặp ngoặc tròn (), nhưng không có tham số,
 * không có cặp ngoặc nhọn {} và kết thúc bằng dấu chấm phẩy ; , còn lại đều tuân theo quy tắc phương thức thông thường
 *
 *
 */

class Honda extends Bike {
    public void run(){
        System.out.println("Honda running....");
    }
}

public class Main {
    public static void main(String[] args) {
        Honda honda1 = new Honda();
        honda1.run();
    }
}
