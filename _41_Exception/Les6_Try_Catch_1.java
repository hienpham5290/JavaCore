package _41_Exception;

public class Les6_Try_Catch_1 {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[6]); // phần tử thứ 6 nằm ngoài phạm vi của mảng, Exception bị ném ra
            // luồng logic bị bẻ vào khối catch
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Không thể in được vì không tìm thấy phần tử mảng như mong đợi.");
        }
    }
}
