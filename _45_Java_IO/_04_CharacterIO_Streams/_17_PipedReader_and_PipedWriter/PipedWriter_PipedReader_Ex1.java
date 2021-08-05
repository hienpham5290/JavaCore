package _45_Java_IO._04_CharacterIO_Streams._17_PipedReader_and_PipedWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriter_PipedReader_Ex1 {
    private PipedWriter pipedWriter;
    private PipedReader pipedReader;

    public static void main(String[] args) throws IOException {
        new PipedWriter_PipedReader_Ex1().test();
    }

    private void test() throws IOException {
        pipedWriter = new PipedWriter();
        pipedReader = new PipedReader();

        pipedReader.connect(pipedWriter);

        new Thread_A().start();
        new Thread_B().start();
    }

    private class Thread_A extends Thread {
        @Override
        public void run() {
            try {
                String s = "abcdefghijklmnopqrtvuwxyz";
                char[] chars = s.toCharArray();

                for (char c : chars) {
                    pipedWriter.write(c);
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                try {
                    closeQuietly(pipedWriter);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private class Thread_B extends Thread {
        @Override
        public void run() {
            try {
                int charCode;
                while ((charCode = pipedReader.read()) != -1) {
                    System.out.println((char) charCode);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    closeQuietly(pipedReader);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void closeQuietly(PipedWriter pipedWriter) throws IOException {
        if (pipedWriter != null) {
            try {
                pipedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeQuietly(PipedReader pipedReader) {
        if (pipedReader != null) {
            try {
                pipedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
