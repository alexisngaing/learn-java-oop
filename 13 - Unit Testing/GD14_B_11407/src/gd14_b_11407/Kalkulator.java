package gd14_b_11407;

/**
 *
 * @author yamacat
 */
public class Kalkulator {
    public static int tambah(int angka1, int angka2) {
        if (angka1 > 100) {
            throw new IllegalArgumentException("Input invalid");
        }
        return angka1 + angka2;
    }
    
    public static int kurang(int angka1, int angka2) {
        if (angka2 > angka1) {
            throw new IllegalArgumentException("Input invalid");
        }
        return angka1 - angka2;
    }
    
    public static int kali(int angka1, int angka2) {
        return angka1 * angka2;
    }
    
    public static int bagi(int angka1, int angka2) {
        if (angka2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
        return angka1 / angka2;
    }
}
