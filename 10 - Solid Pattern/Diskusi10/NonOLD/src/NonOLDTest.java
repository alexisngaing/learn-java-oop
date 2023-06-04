public class NonOLDTest {
    public static void main(String[] args) {
        // TODO code application logic here
        ISavingsAccount b = new SavingsAccount("1000");
        ISavingsAccount c = new SavingsAccount("1100");
        IDepositAccount d = new DepositAccount("1200");
        Coins cc = new Coins(500);
        Notes nn = new Notes(1000);
        b.openSavingAccount(10000);
        c.openSavingAccount(20000);
        d.openDeposit(1000000);
        b.storeCoins(cc);
        b.withdrawal(2500);
        c.storeNotes(nn);
    }
}
