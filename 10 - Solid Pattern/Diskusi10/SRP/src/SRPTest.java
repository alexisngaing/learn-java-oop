public class SRPTest {
    public static void main(String[] args) {
        BankAccount b = new SavingsAccount("1000");
        BankAccount c = new SavingsAccount("1100");
        BankAccount d = new DepositAccount("1200");
        Coins cc = new Coins(5000);
        b.openSavingAccount(10000);
        c.openSavingAccount(20000);
        d.openDeposit(1000000);
        b.storeCoins(cc);
        b.withdrawal(2500);
    }
}
