public class DepositAccount implements IDepositAccount {
    private String number;
    private double deposit;

    public DepositAccount (String num) {
        number = num;
    }

    public void openDeposit(double dep) {
        deposit = dep;
        displayDeposit();
    }

    public void displayDeposit() {
        System.out.println("Rekening Deposito No " + number +
                " saldo deposito : " + deposit);
    }
}
