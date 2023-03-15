package komposisi;

/**
 *
 * @author ASUS
 */
public class Titik {
    private float sumbuX;
    private float sumbuY;
    
    public Titik(float x, float y) {
        this.sumbuX = x;
        this.sumbuY = y;
    }
    
    public void displayTitik() {
        System.out.println("\n=== Titik Pusat ===");
        System.out.println("Koordinat    : [" + sumbuX + "," + sumbuY + "]");
    }
}
