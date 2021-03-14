package _42_MultiThread.Les39_BankAccount_With_Cooperation_Synchronization;

public class BankAccount {
    private long balance = 5_000_000;

    public synchronized boolean checkAccountBalance(long withdrawAmount) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //  trả về true hoặc false nếu biểu thức logic dưới đây true hoặc false
        return (withdrawAmount <= balance);
    }

    public void withdraw(String threadName, long withdrawAmount) {
        System.out.println(threadName + " withdraw: " + withdrawAmount);

        synchronized (this) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (checkAccountBalance(withdrawAmount)) {
                balance = balance - withdrawAmount;
                System.out.println(threadName + " withdraw successful: " + withdrawAmount);
            } else {
                System.out.println(threadName + " withdraw error");
            }
        }

        System.out.println(threadName + " remain balance: " + balance);
    }

    public synchronized void withdrawWhenBalanceEnough(String threadName, long withdrawAmount) {
        System.out.println(threadName + " check: " + withdrawAmount);

        // khi kiểm tra tài khoản không đủ trả về false, !false = true, while loop sẽ được thực hiện
        // trong while loop sẽ thông báo không đủ tiền, tiến hành rơi vào trạng thái WAITING
        // trong deposit() method bên dưới, sau mỗi lần nạp tiền sẽ đánh thức thread withdrawWhenBalanceEnough
        // while loop sẽ tiếp tục chạy, nếu thực sự đủ tiền, checkAccountBalance sẽ trả về true, !true = false
        // lúc này while loop kết thúc, dòng code bên dưới while loop lúc này mới được thực thi
        while (!checkAccountBalance(withdrawAmount)) {
            System.out.println("wait for balance enough");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = balance - withdrawAmount;
        System.out.println(threadName + " withdraw successful: " + withdrawAmount);
    }

    public synchronized void deposit(String threadName, long depositAmount) {
        System.out.println(threadName + " deposit: " + depositAmount);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = balance + depositAmount;
        System.out.println(threadName + " deposit successful: " + depositAmount);
        notify();
    }
}
