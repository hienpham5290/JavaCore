package _41_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Les21_CustomException {
    public static void main(String[] args) {
        try {

            int tuoi = nhapTuoiNhanVien();
            System.out.println("Tuổi vừa nhập: " + tuoi);
        } catch (AgeCheckingException e) {
            System.out.println(e.getMessage());
        }
    }

    // nhapTuoiNhanVien() method throws AgeCheckingException là 1 custom exception
    // cho method gọi tới nó, ở đây là main() method
    private static int nhapTuoiNhanVien() throws AgeCheckingException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuổi nhân viên: ");
        int tuoi = 0;
        try {
            tuoi = scanner.nextInt();
            if (tuoi < 0) {
                throw new AgeCheckingException("Tuổi không được < 0");
            }
        } catch (InputMismatchException e) {
            throw new AgeCheckingException("Tuổi phải là 1 số");
        }
        return tuoi;
    }
}
