package ugd4_latihan;

/**
 *
 * @author ASUS
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int kapasitasMemory;
    
    public Smartphone(String merk, float harga, float berat, int kapasitasBaterai, int kapasitasMemory) {
        super(merk, harga, berat);
        this.kapasitasBaterai = kapasitasBaterai;
        this.kapasitasMemory = kapasitasMemory;
    }
    
    public float diskonSmartphone() {
        return (harga - 2000)/2;
    }
    
    public void showDataSmartphone() {
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai);
        System.out.println("Kapasitas Memory  : " + kapasitasMemory);
        System.out.println("Diskon Smartphone : " + diskonSmartphone());
    }
}
