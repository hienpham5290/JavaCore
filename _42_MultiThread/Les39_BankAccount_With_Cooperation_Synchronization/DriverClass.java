package _42_MultiThread.Les39_BankAccount_With_Cooperation_Synchronization;

public class DriverClass {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        WithdrawThread wifeWithdraw = new WithdrawThread(bankAccount, "wife", 10_000_000);
        wifeWithdraw.start();

        DepositThread husbandDeposit = new DepositThread(bankAccount, "husband", 5_000_000);
        husbandDeposit.start();
    }
}
