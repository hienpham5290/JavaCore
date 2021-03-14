package _41_Exception;

public class Les11_Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;
            int c = 2;
            int d = 0;

            System.out.println(a / b);
            System.out.println(a / c);
            System.out.println(a / d);
        } catch (ArithmeticException e) {
            System.out.println("Có 1 phép chia không thực hiện được");
        } finally {
            // dù không có exception xảy ra
            // thì khối finally vẫn sẽ được thực hiện cuối cùng
            System.out.println("Kết thúc chương trình");
        }
    }
}
