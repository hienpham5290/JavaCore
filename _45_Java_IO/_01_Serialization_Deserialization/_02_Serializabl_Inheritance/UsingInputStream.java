package _45_Java_IO._01_Serialization_Deserialization._02_Serializabl_Inheritance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UsingInputStream {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Engineer.txt"));
            Engineer engineer = (Engineer) ois.readObject();
            System.out.println(engineer);
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
