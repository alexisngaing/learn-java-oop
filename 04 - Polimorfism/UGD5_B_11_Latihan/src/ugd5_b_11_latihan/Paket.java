package ugd5_b_11_latihan;

/**
 *
 * @author ASUS
 */
public abstract class Paket {
    protected String nomorResi;
    protected String tujuan;
    protected double berat;
    protected double tarifBerat;
    protected String waktuPengiriman;
    protected String waktuTiba;
    
    public Paket(String nomorResi, String tujuan, double berat, double tarifBerat, String waktuPengiriman, String waktuTiba) {
        this.nomorResi = nomorResi;
        this.tujuan = tujuan;
        this.berat = berat;
        this.tarifBerat = tarifBerat;
        this.waktuPengiriman = waktuPengiriman;
        this.waktuTiba = waktuTiba;
    }
    
    public abstract void showData();
}
