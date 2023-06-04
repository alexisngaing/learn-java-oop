package ugd8_b_11;

import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;
import exception.ExceptionBerat;

/**
 *
 * @author ASUS
 */
public class Paket {
    public String namaPenerima;
    public String noTelpPenerima;
    public double berat;
    
    public Paket(String namaPenerima, String noTelpPenerima, double berat) throws ExceptionNama, ExceptionNomorTelepon, ExceptionBerat {
        if (namaPenerima.isBlank()) {
            throw new ExceptionNama();
        } else if (!(noTelpPenerima.length() >= 11 && noTelpPenerima.length() <= 13)) {
            throw new ExceptionNomorTelepon();
        } else if (!(berat > 0)) {
            throw new ExceptionBerat();
        } else {
            this.namaPenerima = namaPenerima;
            this.noTelpPenerima = noTelpPenerima;
            this.berat = berat;
        }
    }
    
    public void showPaket() {
        System.out.println("\nNama Penerima       : " + namaPenerima);
        System.out.println("No Telp Penerima    : " + noTelpPenerima);
        System.out.println("Berat Paket         : " + berat);
    }
}
