package _45_Java_IO._04_CharacterIO_Streams._19_PrintStream;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Arrays;

public class StudentPrintStream {
    private int id;
    private String name;

    public StudentPrintStream(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentPrintStream{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudentPrintStream studentPrintStream = new StudentPrintStream(10, "Jack");

        PrintStream printStream = new PrintStream(System.out);

        printStream.println(studentPrintStream);

        Socket socket = new Socket();
        Object object1 = Arrays.asList("One", "Two", "Three");
        Object object2 = null;

        printStream.println(socket);
        printStream.println(object1);
        printStream.println(object2);

        printStream.close();
    }
}
