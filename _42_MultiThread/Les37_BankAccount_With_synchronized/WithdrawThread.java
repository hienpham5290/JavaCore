package _42_MultiThread.Les37_BankAccount_With_synchronized;

public class WithdrawThread extends Thread {
    private String threadName = "";
    private long withdrawAmount = 0;
    BankAccount bankAccount;

    public WithdrawThread(String threadName, long withdrawAmount, BankAccount bankAccount) {
        this.threadName = threadName;
        this.withdrawAmount = withdrawAmount;
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(threadName, withdrawAmount);
    }
}
