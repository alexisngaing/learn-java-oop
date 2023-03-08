package polimorfismedinamis;

/**
 *
 * @author yama
 */
public class Segitiga extends Bentuk2D {
    protected double alas;
    protected double tinggi;
    
    public Segitiga(double a, double t) {
        alas = a;
        tinggi = t;
    }
    
    public double luas() {
        return (alas * tinggi)/2;
    }
    
    public double keliling() {
        return 3 * alas;
    }
    
    public void display() {
        System.out.println("Luas dan Keliling dari Segitiga");
        super.display();
    }
}
