public interface ISavingsAccount {
    public void openSavingAccount(double bal);
    public void storeCoins (Coins amt);
    public void storeNotes (Notes amt);
    public void withdrawal (double amt);
    public void displayBalance();
}
