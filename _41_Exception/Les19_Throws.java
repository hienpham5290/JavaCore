package _41_Exception;

/*
    bên trong phương thức kèm theo throw - chủ động ném ra exception
    nhưng phương thức không xử lý exception mà throws - đẩy exception đi nơi khác xử lý
 */

import java.io.IOException;
import java.util.Scanner;

public class Les19_Throws {
    public static void main(String[] args) {
        System.out.println("Nhập tuổi nhân viên: ");
        int tuoi = 0;
        try {
            tuoi = nhapTuoiNhanVien();
            System.out.println("Tuổi vừa nhập: " + tuoi);
        } catch (IOException e) {
            System.out.println("Phương thức main catch exception này: tuổi < 0");
        }
    }

    private static int nhapTuoiNhanVien() throws IOException {
        int tuoi = 0;
        Scanner scanner = new Scanner(System.in);
        tuoi = scanner.nextInt();
        if (tuoi < 0) throw new IOException("Tuổi nhập không chính xác");
        return tuoi;
    }
}
