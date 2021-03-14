package _42_MultiThread.Les25_Anonymous_Thread_Class;

/*
    Khởi tạo 1 luồng từ 1 lớp vô danh kế thừa lớp Thread
 */

public class Main {
    public static void main(String[] args) {
        Thread countDowntThread = new Thread() {
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

        countDowntThread.start();
    }


    // khai báo 1 đối tượng vô danh từ 1 lớp vô danh kế thừa lớp Thread
    // do không có đối tượng cụ thể, nên sau khi cài đặt, tiến hành cho khởi động luồng
    // thông qua phương thức start() của lớp Thread
//    public static void main(String[] args) {
//        new Thread() {
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
//        }.start();
//    }
}
