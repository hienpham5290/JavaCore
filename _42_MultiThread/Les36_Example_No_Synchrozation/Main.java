package _42_MultiThread.Les36_Example_No_Synchrozation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        // người chồng rút 15 triệu
        WithdrawThread husbandThread = new WithdrawThread("Husband", 15000000, bankAccount);
        husbandThread.start();

        // người vợ rút 20 triệu
        WithdrawThread wifeThread = new WithdrawThread("Wife", 20000000, bankAccount);
        wifeThread.start();
    }
}
