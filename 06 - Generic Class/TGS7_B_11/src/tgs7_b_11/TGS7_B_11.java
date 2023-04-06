package tgs7_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Kelompok 11
 */
public class TGS7_B_11 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    public static void main(String[] args) {
        String namaObat, jenisObat, namaApoteker, namaAlatKesehatan;
        double harga;
        int tahunMasuk, idApoteker;
       
        try {
            Apotek<Obat> AO = new Apotek<>("1 - 11");
            Obat<String, Double> O1 = new Obat<String, Double>("Paracetamol", "Tablet", 25000.0);
            AO.add(O1);
           
            System.out.println("Masukkan Nama Obat  : "); namaObat = br.readLine();
            System.out.println("Masukkan Jenis Obat : "); jenisObat = br.readLine();
            System.out.println("Masukkan Harga Obat : "); harga = Double.parseDouble(br.readLine());
            Obat<String, Double> O2 = new Obat<String, Double>(namaObat, jenisObat, harga);
            AO.add(O2);
           
            Apotek<Apoteker> AA = new Apotek<>("2 - 11");
            Apoteker<Integer, String> A1 = new Apoteker<Integer, String>(1, 2007, "Ryan");
            AA.add(A1);
           
            System.out.println("\nMasukkan ID Apoteker : "); idApoteker = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Nama Apoteker : "); namaApoteker = br.readLine();
            System.out.println("Masukkan Tahun Masuk : "); tahunMasuk = Integer.parseInt(br.readLine());
            Apoteker<Integer, String> A2 = new Apoteker<Integer, String>(idApoteker, tahunMasuk, namaApoteker);
            AA.add(A2);
            
            Apotek<AlatKesehatan> AK = new Apotek<>("3 - 11");
            AlatKesehatan<String, Double> K1 = new AlatKesehatan<String, Double>("Tabung Oksigen", 1000000.0);
            AK.add(K1);
           
            System.out.println("\nMasukkan Nama Alat : "); namaAlatKesehatan = br.readLine();
            System.out.println("Masukkan Harga Alat : "); harga = Double.parseDouble(br.readLine());
            AlatKesehatan<String, Double> K2 = new AlatKesehatan<String, Double>(namaAlatKesehatan, harga);
            AK.add(K2);
           
            System.out.println("\n================================================");
            System.out.println("\t\tApotek 1 - 11");
            System.out.println("\n\t\t[ Data Obat ]");
            for (int i = 0; i < AO.getDaftar().size(); i++) {
                System.out.println("\n\t\t=== Obat " + (i + 1) + " ===");
                AO.getDaftar().get(i).showObat();
            }
           
            System.out.println("\n================================================");
            System.out.println("\t\tApotek 2 - 11");
            System.out.println("\n\t\t[ Data Apoteker ]");
            for (int i = 0; i < AA.getDaftar().size(); i++) {
                System.out.println("\n\t\t=== Apoteker " + (i + 1) + " ===");
                AA.getDaftar().get(i).showApoteker();
            }
            
            System.out.println("\n================================================");
            System.out.println("\t\tApotek 3 - 11");
            System.out.println("\n\t\t[ Data Alat Kesehatan ]");
            for (int i = 0; i < AK.getDaftar().size(); i++) {
                System.out.println("\n\t\t=== Alat Kesehatan " + (i + 1) + " ===");
                AK.getDaftar().get(i).showAlatKesehatan();
            }
        } catch (Exception e) {}
    }
}
