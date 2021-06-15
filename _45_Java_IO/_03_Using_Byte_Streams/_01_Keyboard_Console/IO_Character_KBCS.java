package _45_Java_IO._03_Using_Byte_Streams._01_Keyboard_Console;

import java.io.IOException;
import java.io.InputStream;

/**
 * chương trình nhập từng ký tự từ Keyboard sau đó xuất ra Console
 *
 * input stream từ Keyboard
 * {@code InputStream inputKeyboard = System.in;}
 *
 * output stream ra Console
 * {@code OutputStream outputConsole = System.out;}
 */
public class IO_Character_KBCS {
    public static void main(String[] args) throws IOException {
        // khởi tạo instance của input stream từ Keyboard
        InputStream inputKeyboard = System.in;

        while (true) {
            System.out.print("Nhập 1 ký tự: ");

            // biến c kiểu int chứa giá trị của byte đọc từ keyboard
            int c = inputKeyboard.read();

            if (c == 'q') {
                System.out.println("Finished");
                break;
            }

            // bỏ qua 2 bytes
            // byte hiện tại - ký tự vừa nhập
            // byte kế - là dấu enter \r hoặc \n)
            inputKeyboard.skip(2);

            // cast biến c về kiểu char, và in ra màn hình console với System.out.println();
            System.out.println("Đã nhập ---------------: " + (char) c);
        }
    }
}
