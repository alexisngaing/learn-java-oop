package gd8_b_11407;

import exception.InvalidPanjangLebarException;
import exception.InputNegativeException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Alexis Divasonda S. N.
 */
public class GD8_B_11407 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        double panjang;
        double lebar;

        try {
            System.out.print("Masukkan panjang : "); panjang = Double.parseDouble(br.readLine());
            System.out.print("Masukkan lebar   : "); lebar = Double.parseDouble(br.readLine());

            PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
            pp.showTampil();
        } catch (InputNegativeException e1) {
            e1.showMessage();
        } catch (InvalidPanjangLebarException e2) {
            e2.showMessage();
        } catch (Exception e) {
            System.out.println("Masuk di sini");
        } finally {
            System.out.println("--- Code ini ada di Finally ---");
        }
    }
}
