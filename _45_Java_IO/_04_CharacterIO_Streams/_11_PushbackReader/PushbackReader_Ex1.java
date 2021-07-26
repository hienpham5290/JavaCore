package _45_Java_IO._04_CharacterIO_Streams._11_PushbackReader;

import java.io.*;

public class PushbackReader_Ex1 {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_11_PushbackReader\\filetest-pushbackreader.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        Reader reader = new FileReader(file);
        PushbackReader pushbackReader = new PushbackReader(reader);

        // dùng để nối các ký tự cần đọc
        StringBuilder stringBuilder = new StringBuilder();

        // hiện không đang trong đoạn comment, biến đánh dấu là false
        boolean inComment = false; // không trong comment

        // đọc file
        int currentChar; // ký tự hiện tại đang đọc
        while ((currentChar = pushbackReader.read()) != -1) { // vòng lặp đọc từng ký tự trong PushbackReader
            // đầu tiên, vì không biết là đang trong comment hay không, nên phải kiểm tra
            // việc kiểm tra có phải trong comment hay không ta để cho else giải quyết
            // lệnh if chỉ kiểm tra nếu đúng là trong comment, thì xem xét có kết thúc comment chưa
            if (inComment) { // nếu đang trong comment
                if (currentChar == '\n') { // nếu kết thúc comment
                    stringBuilder.append((char) currentChar); // nối ký tự kết thúc vào StringBuilder
                    inComment = false; // đánh dấu không đang trong comment
                } else { // chưa kết thúc comment, tiếp tục lặp và không có thao tác với currentChar
                    continue;
                }
            } else { // không đang trong comment
                if (currentChar == '-') { // nếu currentChar là '-'
                    int nextChar = pushbackReader.read(); // đọc nextChar
                    if (nextChar == '-') { // nếu nextChar cũng là '-'
                        inComment = true; // đánh dấu đang trong comment
                    } else { // nếu nextChar không phải là '-'
                        stringBuilder.append((char) currentChar); // nối currentChar vào StringBuilder
                        pushbackReader.unread(nextChar); // đẩy ngược nextChar trở lại
                    }
                } else { // nếu currentChar không phải là '-'
                    stringBuilder.append((char) currentChar); // nối currentChar vào StringBuilder
                }
            }
        }

        pushbackReader.close();
        System.out.println(stringBuilder.toString());
    }
}
