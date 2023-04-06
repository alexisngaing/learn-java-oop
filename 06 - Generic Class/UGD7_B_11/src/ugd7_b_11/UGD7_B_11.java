package ugd7_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Kelompok 11
 */
public class UGD7_B_11 {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        String namaObat, jenisObat, idApoteker, namaApoteker;
        float harga; 
        int tahunMasuk;
        
        try {
            Apotek<Obat> AO = new Apotek<>("1 - 11");
            Obat<String, Double> O1 = new Obat<String, Double>("Paracetamol", "Tablet", 25000.0);
            AO.add(O1);
            
            System.out.println("Masukkan Nama Obat : "); namaObat = br.readLine();
            System.out.println("Masukkan Jenis Obat : "); jenisObat = br.readLine();
            System.out.println("Masukkan Harga Obat : "); harga = Integer.parseInt(br.readLine());
            Obat<String, Double> O2 = new Obat<String, Double>(namaObat, jenisObat, harga);
            AO.add(O2);
            
            Apotek<Apoteker> AA = new Apotek<>("2 - 11");
            Apoteker<String, Double> A1 = new Apoteker<String, Double>("1", "Ryan", 2007);
            AA.add(A1);
            
            System.out.println("\nMasukkan ID Apoteker : "); idApoteker = br.readLine();
            System.out.println("Nama Apoteker : "); namaApoteker = br.readLine();
            System.out.println("Tahun Masuk : "); tahunMasuk = Integer.parseInt(br.readLine());
            Apoteker<String, Integer> A2 = new Apoteker<String, Integer>(idApoteker, namaApoteker, tahunMasuk);
            AA.add(A2);
            
            System.out.println("\n================================================");
            System.out.println("\tApotek 1 - 11");
            System.out.println("\n\t\t[ Data Obat ]");
            for (int i = 0; i < AO.getDaftar().size(); i++) {
                System.out.println("\n\t\t=== Obat " + (1 + 1) + " ===");
                AO.getDaftar().get(i).showObat();
            }
            
            System.out.println("\n================================================");
            System.out.println("\tApotek 2 - 11");
            System.out.println("\n\t\t[ Data Apoteker ]");
            for (int i = 0; i < AA.getDaftar().size(); i++) {
                System.out.println("\n\t\t=== Apoteker " + (1 + 1) + " ===");
                AA.getDaftar().get(i).showApoteker();
            }
        } catch (Exception e) {}
    }
    
}
