package _41_Exception;

public class Les7_Try_Catch_2 {
    public static void main(String[] args) {
        try {
            System.out.println("Thực hiện phép chia");
            System.out.println("10 / 2 = " + (10 / 2));
            System.out.println("10 / 1 = " + (10 / 1));
            System.out.println("10 / 0 = " + (10 / 0)); // 10 / 0 là không thể, xảy ra exception ở đây
            // từ vị trí dòng code xảy ra exception, luồng xử lý sẽ chạy vào khối catch
            // bỏ qua tất cả các dòng còn lại trong khối try
            System.out.println("10 / 5 = " + (10 / 5));
        } catch (ArithmeticException e) {
            System.out.println("Có 1 phép chia không thể thực hiện");
        }
    }
}
