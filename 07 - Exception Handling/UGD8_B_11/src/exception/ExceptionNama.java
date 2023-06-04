package exception;

/**
 *
 * @author ASUS
 */
public class ExceptionNama extends Exception{
    public void showMessage() {
        System.err.println("[!] Nama Tidak Boleh Kosong [!]");
    }
}
