package _41_Exception;

import java.util.Scanner;

public class Les10_BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer integerNum = null;

        try {
            System.out.print("Hãy nhập vào 1 số nguyên: ");
            String stringNum = scanner.nextLine();
            integerNum = new Integer(stringNum);
            System.out.println("Chuyển thành Hexa: " + Integer.toHexString(integerNum));
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập vào 1 số nguyên");
        } catch (NullPointerException e) {
            System.out.println("Có 1 đối tượng null");
        }
    }
}
