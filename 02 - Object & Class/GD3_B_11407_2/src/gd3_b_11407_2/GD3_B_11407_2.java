package gd3_b_11407_2;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class GD3_B_11407_2 {
    
    public static void main(String[] args) {
        double panjang;
        double lebar;
        Scanner reader = new Scanner(System.in);
        
        PersegiPanjang PP1 = new PersegiPanjang();
        
        PersegiPanjang PP2 = new PersegiPanjang(68.2, 35.3);
        
        System.out.println("--- Persegi Panjang PP1 Lama ---");
        System.out.println("Panjang PP1  : " + PP1.getPanjang());
        System.out.println("Lebar PP1    : " + PP1.getLebar());
        System.out.println("Keliling PP1 : " + PP1.keliling());
        System.out.println("Luas PP1     : " + PP1.luas());
        System.out.println("---------------------------------\n");
        System.out.println("--- Persegi Panjang PP2 Lama ---");
        System.out.println("Panjang PP2  : " + PP2.getPanjang());
        System.out.println("Lebar PP2    : " + PP2.getLebar());
        System.out.println("Keliling PP2 : " + PP2.keliling());
        System.out.println("Luas PP2     : " + PP2.luas());
        System.out.println("----------------------------------\n");
        
        System.out.println("--- Input Panjang dan Lebar Baru ---");
        System.out.println("Masukkan nilai panjang yang baru : ");
        panjang = reader.nextDouble();
        
        System.out.println("Masukkan nilai lebar yang baru   : ");
        lebar = reader.nextDouble();
        
        PP2.setPanjang(panjang);
        PP2.setLebar(lebar);
        
        System.out.println("\n--- Persegi Panjang PP1 Baru ---");
        System.out.println("Panjang PP1  : " + PP1.getPanjang());
        System.out.println("Lebar PP1    : " + PP1.getLebar());
        System.out.println("Keliling PP1 : " + PP1.keliling());
        System.out.println("Luas PP1     : " + PP1.luas());
        System.out.println("---------------------------------\n");
        System.out.println("--- Persegi Panjang PP2 Baru ---");
        System.out.println("Panjang PP2  : " + PP2.getPanjang());
        System.out.println("Lebar PP2    : " + PP2.getLebar());
        System.out.println("Keliling PP2 : " + PP2.keliling());
        System.out.println("Luas PP2     : " + PP2.luas());
        System.out.println("----------------------------------\n");
    } 
}
