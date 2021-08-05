package _45_Java_IO._04_CharacterIO_Streams._17_PipedReader_and_PipedWriter;

import java.io.*;

public class PipedWriter_PipedReader_BufferedWriter_BufferedReader {
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    private PipedWriter pipedWriter;
    private PipedReader pipedReader;

    public static void main(String[] args) throws IOException {
        new PipedWriter_PipedReader_BufferedWriter_BufferedReader().test();
    }

    private void test() throws IOException {
        pipedWriter = new PipedWriter();
        pipedReader = new PipedReader(pipedWriter);

        this.bufferedWriter = new BufferedWriter(pipedWriter);
        this.bufferedReader = new BufferedReader(pipedReader);

        new ThreadA().start();
        new ThreadB().start();
    }

    private class ThreadA extends Thread {
        @Override
        public void run() {
            try {
                String[] texts = new String[]{"One\nTwo\n", "Three\nFour\n", "Five"};
                for (String s : texts) {
                    bufferedWriter.write(s);
                    bufferedWriter.flush();
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                try {
                    closeQuietly(bufferedWriter);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void closeQuietly(Writer bufferedWriter) throws IOException {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class ThreadB extends Thread {
        @Override
        public void run() {
            try {
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(bufferedReader);
            }
        }
    }

    private void closeQuietly(Reader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
