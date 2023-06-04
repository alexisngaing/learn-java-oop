package diskusi74;
import java.util.Scanner;

public class UserDefinedExceptionHandlingTest {

    public static void main(String[] args) {
        try {
            double panjang, lebar, radius;
            PersegiPanjang pp;
            Lingkaran ls;

            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan panjang : ");
            panjang = in.nextInt();
            System.out.print("Masukkan lebar   : ");
            lebar = in.nextInt();

            System.out.println("Masukkan radius  : ");
            radius = in.nextInt();

            Bentuk2D b = new PersegiPanjang(panjang, lebar);
            b.display();

            ls = new Lingkaran(radius);
            b = ls;
            b.display();
        } catch (InvalidWideLengthException e1) {
            e1.printError();
        } catch (InvalidRadiusException e2) {
            e2.printError();
        }
    }

}
    
}
