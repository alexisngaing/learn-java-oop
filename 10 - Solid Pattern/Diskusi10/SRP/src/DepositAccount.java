public class DepositAccount implements BankAccount {
    private String number;
    private double deposit;

    public DepositAccount (String num) {
        number = num;
    }

    public void openSavingAccount(double bal) {}
    public void storeCoins (Coins c) {}
    public void withdrawal (double amt) {}
    public void transfer(BankAccount b, double amt) {}
    public void displayBalance() {}

    public void openDeposit(double dep) {
        deposit = dep;
        displayDeposit();
    }

    public void displayDeposit() {
        System.out.println("Rekening Deposito No " + number +
                " saldo deposito : " + deposit);
    }
}
