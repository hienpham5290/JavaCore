package _45_Java_IO._01_Serialization_Deserialization._02_Serializabl_Inheritance;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UsingOutputStream {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("Engineer.txt"));
            Engineer engineer = new Engineer(22, "Jack", "Java");
            oos.writeObject(engineer);
            oos.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("success...");
    }
}
