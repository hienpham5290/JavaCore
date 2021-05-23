package _45_Java_IO._01_Serialization_Deserialization._03_Serializable_Aggregation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Company.txt"));
            Address address = new Address("14", "HCM", "South");
            Company company = new Company(9, "TheCompany", address);
            oos.writeObject(company);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }

        System.out.printf("success...");
    }
}
