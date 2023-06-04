package exception;

/**
 *
 * @author Alexis Divasonda S. N.
 */
public class InputNegativeException extends Exception {
    public void showMessage() {
        System.out.println("Panjang atau lebar tidak boleh < 0 [!]");
    }
}
