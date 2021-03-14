package _42_MultiThread.Les40_DeadLock;

public class DriverClass {
    public static void main(String[] args) {
        BankAccount husbandAccount = new BankAccount("husband's Acc");
        BankAccount wifeAccount = new BankAccount("wife's Acc");

        // đây là thread nắm giữ tài khoản của người chồng
        Thread husbandThread = new Thread() {
            public void run() {
                husbandAccount.transferTo(wifeAccount, 3_000_000);
            }
        };
        husbandThread.start();

        // đây là thread nắm giữ tài khoản của người vợ
        Thread wifeThread = new Thread() {
            public void run() {
                wifeAccount.transferTo(husbandAccount, 2_000_000);
            }
        };
        wifeThread.start();
    }
}
