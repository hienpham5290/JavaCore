package _42_MultiThread.Les36_Example_No_Synchrozation;

public class WithdrawThread extends Thread {
    String threadName = "";
    long withdrawAmount = 0;
    BankAccount bankAccount;

    // constructor
    WithdrawThread(String threadName, long withdrawAmount, BankAccount bankAccount) {
        this.threadName = threadName;
        this.withdrawAmount = withdrawAmount;
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.withDraw(threadName, withdrawAmount);
    }
}
