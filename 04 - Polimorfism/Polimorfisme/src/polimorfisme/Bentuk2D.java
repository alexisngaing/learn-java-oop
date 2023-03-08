package polimorfisme;

/**
 *
 * @author yama
 */
public class Bentuk2D {
    public double luas (int panjang, int lebar) {
        return panjang * lebar;
    }

    public double luas (double sisi) {
        return sisi * sisi;
    }

    public double luas (double alas, double tinggi) {
        return (alas * tinggi)/2;
    }
}
