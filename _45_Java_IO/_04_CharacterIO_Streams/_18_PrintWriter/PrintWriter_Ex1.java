package _45_Java_IO._04_CharacterIO_Streams._18_PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class PrintWriter_Ex1 {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_18_PrintWriter\\test_PrintWriter.txt";

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(path);

        LocalDateTime now = LocalDateTime.now();

        String employeeName = "Jack";
        LocalDate hireDate = LocalDate.of(2021, 12, 31);
        int salary = 1000;

        printWriter.printf("# File create on %1$tA, %1$tB %1$tY %tH:%tM:%tS %n", now, now, now);

        printWriter.println();

        printWriter.printf("Employee Name: %s%n", employeeName);
        printWriter.printf("Hire date: %1$td.%1$tm.%1$tY %n", hireDate);
        printWriter.printf(Locale.US, "Salary: $%,d %n", salary);

        printWriter.close();
    }
}
