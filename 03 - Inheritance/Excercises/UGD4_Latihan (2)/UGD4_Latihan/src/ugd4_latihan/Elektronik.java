package ugd4_latihan;

/**
 *
 * @author ASUS
 */
public class Elektronik {
    protected String merk;
    protected float harga;
    protected float berat;
    
    public Elektronik(String merk, float harga, float berat) {
        this.merk = merk;
        this.harga = harga;
        this.berat = berat;
    }
    
    public void showDataElektronik() {
        System.out.println("Merk  : " + merk);
        System.out.println("Harga : " + harga);
        System.out.println("Berat : " + berat);
    }
}
