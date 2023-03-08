package polimorfismedinamisinterface;

/**
 *
 * @author yama
 */
public class PolimorfismeDinamisInterface {

    public static void main(String[] args) {
        iBentuk2D b2d;

        PersegiPanjang pp = new PersegiPanjang(4,5);
        b2d = pp;
        b2d.display();
        
        Segitiga s3 = new Segitiga(6, 8);
        b2d = s3;
        b2d.display();
         
        b2d = new BujurSangkar(10);
        b2d.display();
    }
}
    

