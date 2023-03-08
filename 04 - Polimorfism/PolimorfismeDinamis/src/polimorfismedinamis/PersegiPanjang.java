package polimorfismedinamis;

/**
 *
 * @author yama
 */
public class PersegiPanjang extends Bentuk2D {
    protected double panjang;
    protected double lebar;
    
    public PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }
    
    public double luas() {
        return panjang * lebar;
    }
    
    public double keliling() {
        return 2 * (panjang + lebar);
    }
    
    public void display() {
        System.out.println("Luas dan Keliling dari Persegi Panjang");
        super.display();
    }
}
