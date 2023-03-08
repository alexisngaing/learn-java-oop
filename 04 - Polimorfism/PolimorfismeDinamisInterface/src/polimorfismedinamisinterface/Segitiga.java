package polimorfismedinamisinterface;

/**
 *
 * @author yama
 */
public class Segitiga implements iBentuk2D{
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
        System.out.println("Luas     : " + luas());
        System.out.println("Keliling : " + keliling() + "\n");
    }
}
