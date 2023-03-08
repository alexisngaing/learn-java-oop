package polimorfismedinamis; // abstract class

/**
 *
 * @author yama
 */
public abstract class Bentuk2D {
    public abstract double luas();
    
    public abstract double keliling();
    
    public void display() {
        System.out.println("Luas     : " + luas());
        System.out.println("Keliling : " + keliling());
    }
}
