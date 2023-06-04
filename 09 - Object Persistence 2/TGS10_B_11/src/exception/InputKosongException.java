package exception;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

public class InputKosongException extends Exception {
    public String message() {
        return "Field input tidak boleh kosong!";
    }
}
