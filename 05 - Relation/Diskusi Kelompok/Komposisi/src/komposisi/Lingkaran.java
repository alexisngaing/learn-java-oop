package komposisi;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    private float jejari;
    private Titik titikPusat;
    
    public Lingkaran(float x, float y, float r) {
        this.jejari = r;
        titikPusat = new Titik(x, y);
    }
    
    public float luas() {
        return (22/7) * jejari * jejari;
    }
    
    public float keliling() {
        return 2 * (22/7) * jejari;
    }
    
    public void displayLingkaran() {
        titikPusat.displayTitik();
        System.out.println("\n=== Lingkaran ===");
        System.out.println("Jejari     : " + jejari);
        System.out.println("Luas       : " + luas());
        System.out.println("Keliling   : " + keliling());
    }
}
