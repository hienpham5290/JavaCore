package _45_Java_IO._04_CharacterIO_Streams._19_PrintStream;

import java.io.*;

public class MyPrintStream_checkError {
    private static final String path = "D:\\Learning\\Java\\JavaOOP\\src\\_45_Java_IO\\_04_CharacterIO_Streams\\_19_PrintStream\\testCheckError.txt";

    public static void main(String[] args) throws Exception {
        File logFile = new File(path);

        MyPrintStream mps = new MyPrintStream(logFile);
        int errorCount = 0;
        while (true) {
            // Write log..
            mps.println("Some Log..");
            System.out.println("Some Log..");
            Thread.sleep(1000);

            // Check if IOException happened.
            if (mps.checkError()) {
                errorCount++;
                mps.clearError();
                if (errorCount > 10) {
                    sendAlertEmail();
                    break;
                }
            }
        }
        mps.close();
    }

    private static void sendAlertEmail() {
        System.out.println("There is a problem in the Log system.");
    }
}
