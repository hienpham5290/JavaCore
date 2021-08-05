package _45_Java_IO._04_CharacterIO_Streams._19_PrintStream;

import java.io.*;

public class MyPrintStream extends PrintStream {
    public MyPrintStream(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public void clearError()  {
        super.clearError();    // Call protected method.
    }
}
