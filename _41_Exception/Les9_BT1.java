package _41_Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Les9_BT1 {
    public static void main(String[] args) {
        // chương trình tạo ra 10 số nguyên ngẫu nhiên
        // lưu 10 số nguyên đó vào mảng 10 phần tử
        // chương trình yêu cầu người dùng nhập 1 số nguyên, và in ra phần tử đó trong mảng
        Scanner scanner = new Scanner(System.in);
        int[] randomIntArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomIntArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(randomIntArray));

        System.out.print("Nhập 1 chỉ số nguyên để in giá trị của chỉ số đó trong mảng: ");
        try {
            int i = scanner.nextInt();
            System.out.printf("Giá trị của chỉ số %d = %d", i, randomIntArray[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chỉ số nằm ngoài phạm vi của mảng");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập vào không phải là 1 số nguyên");
            e.printStackTrace();
        }
    }
}
