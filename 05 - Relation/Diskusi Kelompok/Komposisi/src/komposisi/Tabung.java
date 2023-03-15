package komposisi;

/**
 *
 * @author ASUS
 */
public class Tabung {
    private float tinggi;
    private Lingkaran L;
    
    public Tabung(float x, float y, float r, float t) {
        this.tinggi = t;
        L = new Lingkaran(x, y, r);
    }
    
    public float volume() {
        return L.luas() * tinggi;
    }
    
    public void displayTabung() {
        L.displayLingkaran();
        System.out.println("\n=== Tabung ===");
        System.out.println("Tinggi  : " + tinggi);
        System.out.println("Volume  : " + volume());
    }
}
