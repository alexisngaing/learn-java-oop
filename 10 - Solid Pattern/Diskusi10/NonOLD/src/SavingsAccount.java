public class SavingsAccount implements ISavingsAccount {
    private String number;
    private double balance;

    public SavingsAccount (String num) {
        number = num;
    }

    public void openSavingAccount(double bal) {
        balance = bal;
        displayBalance();
    }

    public void storeCoins (Coins c) {
        balance = balance + c.getValue();
        displayBalance();
    }

    public void storeNotes (Notes c) {
        balance = balance + c.getValue();
        displayBalance();
    }

    public void withdrawal (double amt) {
        balance = balance - amt;
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Rekening Tabungan No " + number +
                " saldo tabungan : " + balance);
    }

}
