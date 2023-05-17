public interface BankAccount {
    public void openSavingAccount(double bal);
    public void storeCoins (Coins amt);
    public void withdrawal (double amt);
    public void displayBalance();

    public void openDeposit(double dep);
    public void displayDeposit();
}
