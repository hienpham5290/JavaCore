package _42_MultiThread.Les37_BankAccount_With_synchronized;

public class DriverClass {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        WithdrawThread wifeThread = new WithdrawThread("wife", 20000000, bankAccount);
        wifeThread.start();
        WithdrawThread husbandThread = new WithdrawThread("husband", 150000000, bankAccount);
        husbandThread.start();
    }
}
