package _41_Exception;

public class Les2_Unchecked_Exception {
    public static void main(String[] args) {
        int[] number = {1, 3, 5, 9};

        // dòng code in ra phần tử thứ 5 không bị compiler phát hiện là lỗi
        // nhưng khi chạy chương trình, hệ thống không tìm thấy phần tử thứ 5, câu lệnh in sẽ không được thực thi
        // ArrayIndexOutOfBoundsException sẽ bị ném ra
        System.out.println(number[5]);
    }
}
