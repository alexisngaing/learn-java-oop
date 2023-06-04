package exception;

/**
 *
 * @author Alexis Divasonda S. N.
 */
public class InvalidPanjangLebarException extends Exception {
    public void showMessage() {
        System.out.println("Panjang atau lebar tidak boleh == 0 [!]");
    }
}
