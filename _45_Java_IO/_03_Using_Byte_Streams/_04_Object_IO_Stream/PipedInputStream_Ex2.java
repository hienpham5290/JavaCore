package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;

public class PipedInputStream_Ex2 {
    private BufferedOutputStream outBuff;
    private BufferedInputStream inBuff;

    public static void main(String[] args) throws IOException {
        new PipedInputStream_Ex2().test();
    }

    private void test() throws IOException {
        PipedOutputStream outPipe = new PipedOutputStream();
        PipedInputStream inPipe = new PipedInputStream();

        outPipe.connect(inPipe);

        outBuff = new BufferedOutputStream(outPipe);
        inBuff = new BufferedInputStream(inPipe);

        new OutThread().start();
        new InThread().start();
    }

    class OutThread extends Thread {
        @Override
        public void run() {
            try {
                byte[] b = new byte[]{'a', 97, 'b', 'c', 101};

                for (byte e : b) {
                    outBuff.write(e);
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(outBuff);
            }
        }
    }

    class InThread extends Thread {
        @Override
        public void run() {
            int b = 0;
            try {
                while ((b = inBuff.read()) != -1) {
                    System.out.println(b + " " + (char) b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(inBuff);
            }
        }
    }

    private void closeQuietly(OutputStream out) {
        try {
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeQuietly(InputStream in) {
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
