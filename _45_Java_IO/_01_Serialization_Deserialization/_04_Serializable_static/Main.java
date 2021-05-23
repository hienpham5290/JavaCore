package _45_Java_IO._01_Serialization_Deserialization._04_Serializable_static;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // thông tin ban đầu của đối tượng trước khi serialized
        Student studentObj = new Student(20, "Jack", 20);
        String fileName = "students.txt";

        // Serialization
        try {
            // thiết lập stream
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // ghi đối tượng vào stream
            out.writeObject(studentObj);

            // đóng stream
            file.close();
            out.close();

            System.out.println("studentObj has been serialized");
            System.out.println("data before deserialization");
            printData(studentObj);

            System.out.println("change value of data static member: count 20 -> 2000");
            studentObj.count = 2000;
        } catch (IOException e) {
            e.printStackTrace();
        }

        studentObj = null;
        System.out.println("set studentObj=null to get data from InputStream");

        // Deserialization
        try {
            // thiết lập stream
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            // đọc đối tượng từ stream
            studentObj = (Student) in.readObject();

            // đóng stream
            file.close();
            in.close();

            System.out.println("studentObj has been deserialized");
            System.out.println("data after deserialization");
            printData(studentObj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printData(Student student) {
        System.out.println("student static count: " + student.count);
        System.out.println("student name: " + student.name);
        System.out.println("student age: " + student.age);
    }
}
