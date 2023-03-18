package ugd4_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Kelompok 11
 */
public class UGD4_B_11 {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        String nama, berkembangBiak, tingkatKeganasan, jenisMakanan, tipePencernaan, tipeDarah, makananFavorit;
        String jenisHewan;
        float umur, berat;
        int jumlahKaki;
        int a = 0, b = 0, c = 0;
        
        Karnivora knr[] = new Karnivora[2];
        Herbivora hbr[] = new Herbivora[2];
        Omnivora omr[] = new Omnivora[2];
        
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("\nNama Hewan           : "); nama = br.readLine();
                System.out.println("Umur Hewan           : "); umur = Float.parseFloat(br.readLine());
                System.out.println("Berat Hewan          : "); berat = Float.parseFloat(br.readLine());
                System.out.println("Cara Berkembang Biak : "); berkembangBiak = br.readLine();
                System.out.println("Jenis Hewan [Karnivora | Herbivora | Omnivora] : "); jenisHewan = br.readLine();
                
                if (jenisHewan.equalsIgnoreCase("Karnivora")) {
                    System.out.println("Tingkat Keganasan    : "); tingkatKeganasan = br.readLine();
                    System.out.println("Jenis Makanan        : "); jenisMakanan = br.readLine();
                    
                    knr[a] = new Karnivora(nama, umur, berat, berkembangBiak, tingkatKeganasan, jenisMakanan);
                    a++;
                } else if (jenisHewan.equalsIgnoreCase("Herbivora")) {
                    System.out.println("Tipe Pencernaan      : "); tipePencernaan = br.readLine();
                    System.out.println("Jumlah Kaki          : "); jumlahKaki = Integer.parseInt(br.readLine());
                    
                    hbr[b] = new Herbivora(nama, umur, berat, berkembangBiak, tipePencernaan, jumlahKaki);
                    b++;
                } else if (jenisHewan.equalsIgnoreCase("Omnivora")) {
                    System.out.println("Tipe Darah           : "); tipeDarah = br.readLine();
                    System.out.println("Makanan Favorit      : "); makananFavorit = br.readLine();
                    
                    omr[c] = new Omnivora(nama, umur, berat, berkembangBiak, tipeDarah, makananFavorit);
                    c++;
                } else {
                    i = i - 1;
                    System.err.println("Jenis hewan tidak ada");
                }
            }
            
            System.out.println("\n\t=== Data Hewan Karnivora ===");
            for (int i = 0; i < 2; i++) {
                knr[i].showDataKarnivora();
                System.out.println("\n");
            }
            
            System.out.println("\n\t=== Data Hewan Herbivora ===");
            for (int i = 0; i < 2; i++) {
                hbr[i].showDataHerbivora();
                System.out.println("\n");
            }
            
            System.out.println("\n\t=== Data Hewan Omnivora ===");
            for (int i = 0; i < 2; i++) {
                omr[i].showDataOmnivora();
                System.out.println("\n");
            }
        } catch (Exception e) {
            System.err.println("Jenis hewan tidak ada");
        }
    }
    
}
