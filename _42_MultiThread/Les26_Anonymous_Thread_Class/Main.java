package _42_MultiThread.Les26_Anonymous_Thread_Class;

/*
    Khởi tạo 1 luồng từ 1 lớp vô danh implements interface Runnable
    sau đó khởi tạo 1 đối tượng từ lớp Thread truyền vào luồng từ lớp vô danh
 */

public class Main {
        public static void main(String[] args) {
        Runnable countDownThread = new Runnable() {
            @Override
            public void run() {
                int count = 10;
                for (int i = count; i > 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Hết giờ");
            }
        };
        Thread thread = new Thread(countDownThread);
        thread.start();
    }

    // không cần tạo đối tượng cụ thể từ lớp Thread
    // khởi tạo 1 đối tượng vô danh từ lớp Thread, gọi start() method để khởi động luồng
//    public static void main(String[] args) {
//        Runnable countDowntThread = new Runnable() {
//            @Override
//            public void run() {
//                int count = 10;
//                for (int i = count; i > 0; i--) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println("Hết giờ");
//            }
//        };
//        new Thread(countDowntThread).start();
//    }

    // không cần tạo 1 đối tượng cụ thể từ lớp Thread
    // chỉ cần tạo 1 đối tượng vô danh từ lớp Thread
    // tham số truyền vào cho Constructor của lớp Thread là 1 đối tượng vô danh
    // từ lớp vô danh implements interface Runnable
    // do là đối tượng vô danh, nên không có đối tượng cụ thể gọi method start()
    // nên sau khi khai báo đối tượng, khởi chạy luồng luôn
//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int count = 10;
//                for (int i = count; i > 0; i--) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println("Hết giờ");
//            }
//        }).start();
//    }
}
