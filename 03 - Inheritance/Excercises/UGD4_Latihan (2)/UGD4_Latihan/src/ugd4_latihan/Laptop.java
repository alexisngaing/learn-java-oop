package ugd4_latihan;

/**
 *
 * @author ASUS
 */
public class Laptop extends Elektronik {
    private String tipeProsesor;
    private String jenisBaterai;
    
    public Laptop(String merk, float harga, float berat, String tipeProsesor, String jenisBaterai) {
        super(merk, harga, berat);
        this.tipeProsesor = tipeProsesor;
        this.jenisBaterai = jenisBaterai;
    }
    
    public void showRekomendasi() {
        if (harga <= 15000000 && berat >= 3 && berat <= 5) {
            System.out.println("Rekomendasi : [ ASUS | Lenovo | HP | ACER ]");
        } else {
            
        }
    }
    
    public void showDataLaptop() {
        System.out.println("Tipe Prosesor : " + tipeProsesor);
        System.out.println("Jenis Baterai : " + jenisBaterai);
//        System.out.println("Rekomendasi   : ");
    }
}
