package _42_MultiThread.Les37_BankAccount_With_synchronized;

public class BankAccount {
    private long balance = 20_000_000;

    // đồng bộ mutual exclusive với synchronized, bây giờ chỉ có thread được gọi đến method này
    public synchronized boolean checkAccountBalance(long withdrawAmount) {
        // giả lập thời gian kiểm tra tài khoản là 2 giây
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (withdrawAmount <= balance) {
            return true;
        } else {
            return false;
        }
    }

    // đồng bộ mutual exclusive với synchronized, bây giờ chỉ có 1 thread được gọi đến method này
    public synchronized void withdraw(String threadName, long withdrawAmount) {
        System.out.println(threadName + " withdraw: " + withdrawAmount);
        // giả lập việc thực hiện rút tiền, và thiết lập lại số dư là 2 giây
        if (checkAccountBalance(withdrawAmount)) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = balance - withdrawAmount;
            System.out.println(threadName + " Withdraw successful: " + withdrawAmount);
        } else {
            System.out.println(threadName + "Withdraw error !!!");
        }
        System.out.println(threadName + " see balance: " + balance);
    }
}
