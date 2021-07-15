package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;
import java.util.Date;

public class WriteFieldToStream {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\gamesetting.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GameSetting gameSetting = new GameSetting(10, 20, "Hard", "Try game again");

        // ghi object
        writeGameSetting(gameSetting);
        // đọc object
        readGameSetting();
    }

    public static void writeGameSetting(GameSetting gameSetting) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // ghi 1 vài thông tin
        oos.writeUTF("GameSetting, save at: " + new Date());

        // ghi object vào stream
        oos.writeObject(gameSetting);

        oos.close();
        fos.close();
    }

    public static void readGameSetting() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // đọc thông tin UTF
        System.out.println(ois.readUTF());

        // đọc object
        GameSetting gameSetting = (GameSetting) ois.readObject();

        // 10 -> 20
        System.out.println("sound: " + gameSetting.getSound());
        // 20 -> 30
        System.out.println("brightness: " + gameSetting.getBrightness());
        // giá trị giữ nguyên như khi được ghi vào stream
        System.out.println("difficultyLevel: " + gameSetting.getDifficultyLevel());

        // userNote return null vì trong serialization nó không được ghi
        // nên khi deserialization nó trả về giá trị mặc định là null (String)
        System.out.println("userNote: " + gameSetting.getUserNote());

        ois.close();
        fis.close();
    }
}
