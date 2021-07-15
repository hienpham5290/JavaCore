package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GameSetting implements Serializable {
    private static final long serialVersionUID = 1L;

    private int sound;
    private int brightness;
    private String difficultyLevel;

    private String userNote;

    public GameSetting() {
    }

    public GameSetting(int sound, int brightness, String difficultyLevel, String userNote) {
        this.sound = sound;
        this.brightness = brightness;
        this.difficultyLevel = difficultyLevel;
        this.userNote = userNote;
    }

    public int getSound() {
        return sound;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getUserNote() {
        return userNote;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        /**
         * khai báo object của GetField dùng để truy cập các field được đọc liên tục từ input stream
         * instance của GetFields được trả về bởi method readFields() được gọi từ input stream
         */
        ObjectInputStream.GetField fields = ois.readFields();

        /**
         * thực hiện get() từng field đồng thời chỉnh sửa giá trị của từng field
         * return giá trị về cho object đang được đọc, nếu field đang đọc không có giá trị
         */
        // get value=50 nếu sound không có giá trị
        this.sound = fields.get("sound", 50);

        this.brightness = fields.get("brightness", 50);

        // get value=50 nếu brightness không có giá trị
        this.brightness = fields.get("brightness", 50);

        // edit difficultyLevel nếu không có giá trị
        this.difficultyLevel = (String) fields.get("difficultyLevel", "Easy"); // default
        if (this.difficultyLevel == null) {
            this.difficultyLevel = "Easy";
        }

        // edit userNote nếu không có giá trị
        this.userNote = (String) fields.get("userNote", "Have Fun"); // default
        if (this.userNote == null) {
            this.userNote = "Have Fun";
        }

    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        /**
         * khởi tạo 1 object của ObjectOutputStream.PutField class
         * từ method putFields() trả về 1 object dùng làm bộ đệm cho stream gọi đến
         * để đặt các field chỉ định vào, trong quá trình này có thể sửa đổi giá trị của field
         * các field này sẽ được ghi vào stream khi method writeFields() được gọi
         */
        ObjectOutputStream.PutField putField = oos.putFields();

        putField.put("sound", Math.max(this.sound, 20));
        putField.put("brightness", Math.max(this.brightness, 30));
        putField.put("difficultyLevel", this.difficultyLevel);
        // không ghi field userNote

        /**
         * sau khi đã put những field cần ghi vào trong bộ đệm
         * tiến hành ghi đối tượng chứa các field này vào stream
         */
        oos.writeFields();
    }
}
