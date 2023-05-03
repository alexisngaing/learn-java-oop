package exception;

public class NoIndukDosenException extends Exception {
    public String message() {
        return "NOMOR INDUK DOSEN HARUS TERDIRI DARI 5 KARAKTER [!]";
    }
}
