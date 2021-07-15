package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;
import java.util.Date;

public class ReadFieldFromStream {
    private static String filePath = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_03_Using_Byte_Streams\\_04_Object_IO_Stream\\ReadGameSetting.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GameSetting gameSetting = new GameSetting(10, 15, null, null);
        // những giá trị sẽ thay đổi hoặc không khi ghi object của GameSetting
        // this.sound < 20 ? 20 : this.sound
        // this.brightness < 30 ? 30 : this.brightness
        // this.difficultyLevel
        // không thay đổi userNote
        writeGameSetting(gameSetting);

        // những giá trị sẽ thay đổi hoặc không khi đọc object của GameSetting
        // sound = 50
        // brightness = 50
        // difficultyLevel = "Easy"
        // userNote = "Have Fun"
        readGameSetting();
    }

    private static void writeGameSetting(GameSetting gameSetting) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Date());
        oos.writeUTF("GameSetting Data");

        oos.writeObject(gameSetting);

        oos.close();
        fos.close();
    }

    private static void readGameSetting() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Date date = (Date) ois.readObject();
        System.out.println(date);

        String info = (String) ois.readUTF();
        System.out.println(info);

        GameSetting gameSetting = (GameSetting) ois.readObject();
        System.out.println(gameSetting.getSound());
        System.out.println(gameSetting.getBrightness());
        System.out.println(gameSetting.getDifficultyLevel());
        System.out.println(gameSetting.getUserNote());

        ois.close();
        fis.close();
    }
}
