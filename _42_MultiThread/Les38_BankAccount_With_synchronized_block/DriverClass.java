package _42_MultiThread.Les38_BankAccount_With_synchronized_block;

public class DriverClass {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        WithdrawThread wifeThread = new WithdrawThread("wife", 20_000_000, bankAccount);
        wifeThread.start();
        WithdrawThread husbandThread = new WithdrawThread("husband", 15_000_000, bankAccount);
        husbandThread.start();
    }
}