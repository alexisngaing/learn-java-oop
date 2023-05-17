public class ISPTest {
    public static void main(String[] args) {
        ISavingsAccount b = new SavingsAccount("1000");
        ISavingsAccount c = new SavingsAccount("1100");
        IDepositAccount d = new DepositAccount("1200");
        Coins cc = new Coins(5000);
        b.openSavingAccount(10000);
        c.openSavingAccount(20000);
        d.openDeposit(1000000);
        b.storeCoins(cc);
        b.withdrawal(2500);
    }
}