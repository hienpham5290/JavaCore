package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.*;

public class PipedInputStream_Ex1 {
    // khai báo biến toàn cục
    private PipedInputStream in;
    private PipedOutputStream out;

    public static void main(String[] args) throws IOException {
        new PipedInputStream_Ex1().test();
    }

    private void test() throws IOException {
        // tạo 1 PipedInputStream
        in = new PipedInputStream();

        // tạo 1 PipedOutputStream được kết nối với
        // 1 PipedInputStream
        // dữ liệu khi được ghi vào PipedOutputStream
        // sẽ lập tức được đọc ở PipedInputStream
        out = new PipedOutputStream(in);

        new Thread_Out().start();
        new Thread_In().start();
    }

    class Thread_Out extends Thread {
        @Override
        public void run() {
            try {
                byte[] b = new byte[]{'a', 97, 'b', 'c', 101};
                for (byte e : b) {
                    out.write(e);
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(out);
            }
        }
    }

    class Thread_In extends Thread {
        @Override
        public void run() {
            try {
                int b = 0;

                while ((b = in.read()) != -1) {
                    System.out.println(b + " " + (char) b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(in);
            }


        }
    }

    private void closeQuietly(OutputStream out) {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeQuietly(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
