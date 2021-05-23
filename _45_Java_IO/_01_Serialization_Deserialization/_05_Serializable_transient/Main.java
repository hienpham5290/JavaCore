package _45_Java_IO._01_Serialization_Deserialization._05_Serializable_transient;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "Employee.txt";
        Employee employee = new Employee(10, "Jack", 20);

        // Serialization
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(employee);

            System.out.println("employee object has been serialized");
            System.out.println("data before Deserialization");
            printData(employee);

            employee = null;
            System.out.println("assign employee object = null to get data during deserialization");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Deserialization
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            employee = (Employee) in.readObject();

            System.out.println("employee object has been deserialization");
            System.out.println("data after Deserialization");
            printData(employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printData(Employee employee) {
        System.out.println("Employee:");
        System.out.println("\t id=" + employee.id);
        System.out.println("\t name=" + employee.name);
        System.out.println("\t age=" + employee.age);
    }
}
