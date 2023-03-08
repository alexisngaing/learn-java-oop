package polimorfismedinamis;

/**
 *
 * @author yama
 */
public class BujurSangkar extends PersegiPanjang {
    public BujurSangkar(double s) {
        super(s, s);
    }
    
    public void display() {
        System.out.println("Luas dan Keliling dari Bujur Sangkar");
        super.display();
    }
}
