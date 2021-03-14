package _41_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Les18_Throw {
    public static void main(String[] args) {
        try {
            System.out.println("nhập tuổi nhân viên: ");
            int tuoi = nhapTuoiNhanVien();
            System.out.println("tuổi đã nhập: " + tuoi);
        } catch (InputMismatchException e) {
            System.out.println("Tuổi nhập vào chưa hợp lệ: " + e.getMessage());
        }
    }

    private static int nhapTuoiNhanVien() {
        Scanner scanner = new Scanner(System.in);
        int tuoi = scanner.nextInt();

        // nếu tuổi < 0, ném ra 1 đối tượng vô danh của lớp InputMismatchException
        // với chuỗi String truyền vào cho constructor của lớp exception tương ứng
        // chính là giá trị của getMessage() method
        // và exception này nếu xảy ra sẽ trả về cho khối try-catch đang làm việc với nó
        if (tuoi < 0) throw new InputMismatchException("Tuổi không được < 0.");
        return tuoi;
    }
}
