package exception;

/**
 *
 * @author ASUS
 */
public class ExceptionNomorTelepon extends Exception{
    public void showMessage() {
        System.err.println("[!] Nomor Telepon harus antara 11-13 [!]");
    }
}
