package _45_Java_IO._04_CharacterIO_Streams._10_FilterReader;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class RemoveHtmlTagReader extends FilterReader {

    private boolean intag = false;

    public RemoveHtmlTagReader(Reader in) {
        super(in);
    }

    // We override this method.
    // The principle will be:
    // Read only characters outside of the tags.
    @Override
    public int read(char[] buf, int from, int len) throws IOException {
        // charCount : biến dùng để đếm số ký tự cần đọc
        int charCount = 0;

        // vòng lặp while khi nào charCount != 0 thì thoát
        // đồng thời copy nội dung cần lấy sau khi loại bỏ các tag HTML
        while (charCount == 0) {

            // lấy số ký tự cần đọc, lúc này bao gồm cả ký tự tag của HTML
            charCount = super.read(buf, from, len);

            // nếu đọc các ký tự mà bị trả về cuối stream = -1 thì return = -1 và thoát while
            if (charCount == -1) {
                return -1;
            }

            // thiết lập vị trí ban đầu của mảng sao chép bắt đầu từ from
            int last = from;

            // vòng lặp for chạy từ from đến charCount
            // if-else dùng để kiểm tra tag bắt đầu và tag kết thúc
            // chỉ khi nào đã kiểm tra gặp tag kết thúc mới tiến hành gán ký tự ở vị trí hiện tại
            for (int i = from; i < from + charCount; i++) {
                // ở đây có 2 trường hợp để lệnh if này true
                // giá trị ban đầu intag=false -> if(true)
                // vị trị hiện tại là tag kết thúc '>' , nên intag=false -> if(true)
                if (!this.intag) {
                    // lệnh if này chỉ xảy ra khi intag=false
                    if (buf[i] == '<') {
                        this.intag = true;
                    // lệnh else này chỉ được xảy ra khi đã duyệt qua tag kết thúc '>' , intag=false, nhưng
                        // vị trí hiện tại không phải tag bắt đầu '<', -> đã mở tag và đóng tag, và vị trí hiện
                        // tại không phải đang mở tag mới, mà là nội dung cần đọc
                        // ===> tiến hành sao chép dữ liệu tại vị trí hiện tại [i] cho [last], sau đó tăng last = last + 1
                    } else {
                        buf[last] = buf[i];
                        last++;
                        // có thể viết gọn
                        // buf[last] = buf[i];
                        // last++;
                        // ==> thành
                        // buf[last++] = buf[i];
                    }
                // else if này chỉ xảy ra khi đã duyệt qua tag bắt đầu '<', intag=true, -> if(false)
                } else if (buf[i] == '>') {
                    // lệnh intaf=false chỉ được thực hiện khi gặp tag kết thúc '>'
                    // sau đó nhảy đến lệnh kiểm tra có phải tag bắt đầu, nếu không phải tag bắt đầu, chính là dữ liệu cần copy
                    this.intag = false;
                }
            }
            charCount = last - from;
        }
        return charCount;
    }

    // Also need to override this method.
    @Override
    public int read() throws IOException {
        char[] buf = new char[1];
        int result = read(buf, 0, 1);
        if (result == -1) {
            return -1;
        } else {
            return (int) buf[0];
        }
    }
}
