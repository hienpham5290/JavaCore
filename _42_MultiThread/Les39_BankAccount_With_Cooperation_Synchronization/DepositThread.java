package _42_MultiThread.Les39_BankAccount_With_Cooperation_Synchronization;

public class DepositThread extends Thread {
    private BankAccount bankAccount;
    private String threadName = "";
    private long depositAmount = 0;

    public DepositThread(BankAccount bankAccount, String threadName, long depositAmount) {
        this.bankAccount = bankAccount;
        this.threadName = threadName;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        bankAccount.deposit(threadName, depositAmount);
    }
}
