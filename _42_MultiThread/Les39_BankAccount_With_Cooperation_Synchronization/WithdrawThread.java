package _42_MultiThread.Les39_BankAccount_With_Cooperation_Synchronization;

public class WithdrawThread extends Thread {
    private BankAccount bankAccount;
    private String threadName = "";
    private long withdrawAmount = 0;

    public WithdrawThread(BankAccount bankAccount, String threadName, long withdrawAmount) {
        this.bankAccount = bankAccount;
        this.threadName = threadName;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        bankAccount.withdrawWhenBalanceEnough(threadName, withdrawAmount);
    }
}
