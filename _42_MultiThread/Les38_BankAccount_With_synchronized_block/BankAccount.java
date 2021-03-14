package _42_MultiThread.Les38_BankAccount_With_synchronized_block;

public class BankAccount {
    private long balance = 20_000_000;

    public boolean checkAccountBalance(long withdrawAmount) {
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

    public void withdraw(String threadName, long withdrawAmount) {
        System.out.println(threadName + " withdraw: " + withdrawAmount);
        synchronized (this) {
            if (checkAccountBalance(withdrawAmount)) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance = balance - withdrawAmount;
                System.out.println(threadName + " withdraw successfull: " + withdrawAmount);
            } else {
                System.out.println(threadName + " withdraw error");
            }
        }
        System.out.println(threadName + " remain balance: " + balance);
    }
}
