package _42_MultiThread.Les40_DeadLock;

public class BankAccount {
    private long balance = 5_000_000;
    private String accountName = "";

    public BankAccount(String accountName) {
        this.accountName = accountName;
    }

    public synchronized void withdraw(long withdrawAmount) {
        // in trạng thái bắt đầu rút tiền
        System.out.println(accountName + " [withdrawing...............]");
        balance -= withdrawAmount;
        System.out.println(accountName + " [withdraw end..............]");
    }

    public synchronized void deposit(long depositAmount) {
        // in trạng thái bắt đầu nạp tiền
        System.out.println(accountName + " [depositing...............]");
        balance += depositAmount;
        System.out.println(accountName + " [depositing end...........]");

    }

    public synchronized void transferTo(BankAccount toAccount, long transferAmount) {
        synchronized (this) {
            // rút tiền từ tài khoản của đối tượng đang gọi đến ( this )
            this.withdraw(transferAmount);
            // nạp tiền vào tài khoản toAccount
            synchronized (toAccount) {
                toAccount.deposit(transferAmount);
            }
            // in số dư tài khoản sau khi kết thúc chuyển tiền
            System.out.println("The amount of " + accountName + " is: " + balance);
        }
    }
}
