package tgs4_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Kelompok 11
 */
public class TGS4_B_11 {

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
        Reptil rtl  = null;
        Mamalia mml  = null;
        Ikan ikn = null;
        
        try {
            for (int i = 0; i < 9; i++) {
                System.out.println("\nNama Hewan           : "); nama = br.readLine();
                System.out.println("Umur Hewan           : "); umur = Float.parseFloat(br.readLine());
                System.out.println("Berat Hewan          : "); berat = Float.parseFloat(br.readLine());
                System.out.println("Cara Berkembang Biak : "); berkembangBiak = br.readLine();
                System.out.println("Jenis Hewan [Karnivora | Herbivora | Omnivora | ] : "); jenisHewan = br.readLine();
                
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
                } else if (jenisHewan.equalsIgnoreCase("Reptil")) {
                    System.out.println("Tingkat Keganasan     : "); tingkatKeganasan = br.readLine();
                    System.out.println("Jenis Makanan         : "); jenisMakanan = br.readLine();
                    System.out.println("Metode Berburu        :"); String metodeBerburu = br.readLine();
                    System.out.println("Panjang Tubuh         :"); float panjangTubuh = Float.parseFloat(br.readLine());
                    
                    rtl = new Reptil (metodeBerburu, panjangTubuh, nama, umur, berat, berkembangBiak, tingkatKeganasan, jenisMakanan);
                } else if (jenisHewan.equalsIgnoreCase("Mamalia")) {
                    System.out.println("Tipe Pencernaan      : "); tipePencernaan = br.readLine();
                    System.out.println("Jumlah Kaki          : "); jumlahKaki = Integer.parseInt(br.readLine());
                    System.out.println("Tipe Gigi            :"); String tipeGigi = br.readLine();
                    System.out.println("Suhu Tubuh           :"); float suhuTubuh = Float.parseFloat(br.readLine());
                    
                    mml = new Mamalia (tipeGigi, suhuTubuh, nama, umur, berat, berkembangBiak, tipePencernaan, jumlahKaki);
                } else if (jenisHewan.equalsIgnoreCase("Ikan")) {
                    System.out.println("Tipe Darah           : "); tipeDarah = br.readLine();
                    System.out.println("Makanan Favorit      : "); makananFavorit = br.readLine();
                    System.out.println("Warna Tubuh          :"); String warnaTubuh = br.readLine();
                    System.out.println("Kecepatan Berenang   :"); float kecepatanBerenang = Float.parseFloat(br.readLine());
                    
                    ikn = new Ikan (warnaTubuh, kecepatanBerenang, nama, umur, berat, berkembangBiak, tipeDarah, makananFavorit);
                } else {
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
            
            System.out.println("\n\t=== Data Reptil ===");
                rtl.showDataReptil();
                System.out.println("\n");
        
            System.out.println("\n\t=== Data Mamalia ===");
                mml.showDataMamalia();
                System.out.println("\n");
            
            System.out.println("\n\t=== Data Ikan ===");
                ikn.showDataIkan();
                System.out.println("\n");
        } catch (Exception e) {}
    }   
}
