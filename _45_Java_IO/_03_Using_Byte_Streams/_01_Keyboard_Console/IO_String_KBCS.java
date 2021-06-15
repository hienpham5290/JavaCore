package _45_Java_IO._03_Using_Byte_Streams._01_Keyboard_Console;

import java.io.IOException;

/**
 * chương trình nhập 1 chuỗi String từ Keyboard và xuất ra Console
 */
public class IO_String_KBCS {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("nhập 1 chuỗi: ");

            // tạo 1 vùng đệm lưu ký tự, 1 mảng kiểu byte
            byte[] bytes = new byte[100];

            // đọc các byte từ input-stream, gán từng byte vào từng phần tử
            // trong mảng bytes
            // đồng thời trả về số lượng các byte đọc được từ input-stream
            int length = System.in.read(bytes);

            // khởi tạo 1 đối tượng String từ mảng bytes
            // bắt đầu từ vị trí đầu tiên = 0 trong mảng
            // số lượng phần tử cần lấy từ vị trí bắt đầu lấy
            String string = new String(bytes, 0, length - 1);

            // kiểm tra nếu thỏa điều kiện sẽ thoát vòng lặp
            if (string.equalsIgnoreCase("exit")) {
                System.out.println("finished !!!");
                break;
            }

            // xuất kết quả, và tiếp tục vòng lặp
            System.out.println("- chuỗi nhận được -: " + string);
        }
    }
}
