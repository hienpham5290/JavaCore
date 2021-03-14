package _42_MultiThread.Les36_Example_No_Synchrozation;

public class BankAccount {
    long amount = 20_000_000; // số tiền trong tài khoản

    // method kiểm tra số dư
    public boolean checkAccountBalance(long withDrawAmount) {
        // giả lập thời gian đọc cơ sở dữ liệu và kiểm tra tiền
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (withDrawAmount <= amount) {
            return true;
        } else {
            return false;
        }
    }

    // method rút tiền
    public void withDraw(String threadName, long withDrawAmount) {
        // in ra thông tin tài khoản
        System.out.println(threadName + " withdraw : " + withDrawAmount);

        // giả lập thời gian rút tiền và cập nhật số tiền còn lại vào cơ sở dữ liệu
        if (checkAccountBalance(withDrawAmount)) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            amount = amount - withDrawAmount;
        }
        // in ra số dư còn lại sau khi rút thành công
        System.out.println(threadName + " - balance: " + amount);
    }
}
