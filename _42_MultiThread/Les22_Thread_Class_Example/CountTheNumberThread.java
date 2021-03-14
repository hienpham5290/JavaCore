package _42_MultiThread.Les22_Thread_Class_Example;

/*
    Class này có nhiệm vụ build 1 Thread xoay vòng các con số từ 0 đến 100

    Class này phải extends Thread class, và override những phương thức cần thiết từ Thread class
    nó mới trở thành 1 Thread trong ứng dụng

    run() method chính là method khởi động Thread, và Thread này sẽ được hệ thống thực thi song
    song với các Thread khác trong ứng dụng nếu có
 */

public class CountTheNumberThread extends Thread{
    private int count = 0;
    private boolean isStop = false;

    // run() method override từ Thread class
    // method này khởi động Thread xoay vòng dãy số từ 0 đến 100 liên tục
    // khi giá trị con số hiện tại > 100, reset lại con số thành giá trị 0
    // Thread này chỉ kết thúc nếu có tín hiệu dừng
    public void run() {
        while (!isStop) {
            count++;
            if (count > 100) {
                count = 0;
            }
        }
    }

    // end() method mục đích phát đi tín hiệu dừng
    public void end() {
        isStop = true;
    }

    // getCount() method dùng để lấy giá trị con số hiện tại
    public int getCount() {
        return count;
    }
}
