package _45_Java_IO._06_Console;

import java.io.Console;

public class Console_readPassword {
    public static void main(String[] args) {
        Console cnsl = null;
        String alpha = null;
        String fmt = "%2$5s %3$10s%n";

        try {
            // creates a console object
            cnsl = System.console();

            // if console is not null
            if (cnsl != null) {

                // read line from the user input
                alpha = cnsl.readLine(fmt,"Your","Name: ");

                // prints
                System.out.println("Name is: " + alpha);

                // read password into the char array
                char[] pwd = cnsl.readPassword(fmt,"Enter","Password: ");

                // prints
                System.out.println("Password is: "+pwd);
            }

        } catch(Exception ex) {
            // if any error occurs
            ex.printStackTrace();
        }
    }
}
