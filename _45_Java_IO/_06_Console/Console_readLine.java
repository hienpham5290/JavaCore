package _45_Java_IO._06_Console;

import java.io.Console;

public class Console_readLine {
    public static void main(String[] args) {
        Console cnsl = null;
        String fmt = "%1$4s %2$5s %3$10s%n";
        String alpha = null;

        try {
            // creates a console object
            cnsl = System.console();

            // if console is not null
            if (cnsl != null) {

                // read line from the user input
                alpha = cnsl.readLine(fmt, "Enter","Alphabets: ");

                // prints
                System.out.println("Alphabets entered: " + alpha);
            }

        } catch(Exception ex) {
            // if any error occurs
            ex.printStackTrace();
        }
    }
}
