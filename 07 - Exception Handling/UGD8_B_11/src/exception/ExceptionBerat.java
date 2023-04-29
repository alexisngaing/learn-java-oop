package exception;

/**
 *
 * @author ASUS
 */
public class ExceptionBerat extends Exception{
    public void showMessage() {
        System.err.println("[!] Berat harus lebih besar daripada 0 [!]");
    }
}
