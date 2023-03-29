import java.util.InputMismatchException;
import java.util.Scanner;

public class Bilangan {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int array[] = {0, 2, 5};
        int idx_1, idx_2;

        try {
            System.out.print("Masukkan idx_1 : ");
            idx_1 = in.nextInt();
            System.out.print("Masukkan idx_2 : ");
            idx_2 = in.nextInt();

            System.out.println("Hasil Pembagian   : " +
                    array[1] / array[idx_1]);
            System.out.println("Hasil Penjumlahan : " +
                    (array[2] + array[idx_2]));
        } catch (ArithmeticException e) {
            System.out.println("Terjadi exception dengan tipe exception : " + e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exception dengan tipe exception  : " + e.toString());
        } catch (InputMismatchException e) {
            System.out.println("Terjadi exception dengan tipe exception  : " + e.toString());
        }
    }
}
