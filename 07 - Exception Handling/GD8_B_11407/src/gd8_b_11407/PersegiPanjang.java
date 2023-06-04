package gd8_b_11407;

import exception.InvalidPanjangLebarException;
import exception.InputNegativeException;

/**
 *
 * @author Alexis Divasonda S. N.
 */
public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) throws InvalidPanjangLebarException, InputNegativeException {
        if (panjang < 0 || lebar < 0) {
            throw new InputNegativeException();
        } else if (panjang == 0 || lebar == 0) {
            throw new InvalidPanjangLebarException();
        } else {
            this.panjang = panjang;
            this.lebar = lebar;
        }
    }

    public void showTampil() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
    }
}
