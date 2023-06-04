package ugd6_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Kelompok 11
 */
public class UGD6_B_11 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String namaPerpus, alamatPerpus, namaRak, jenisRak, namaBuku, pengarang, namaOrang;
        int jumlahRak, jumlahBuku, jumlahDenda, tahunTerbit, lamaHari;
        float harga;
                
        try {
            System.out.println("*** Input Data Perpus ***");
            System.out.print("Nama Perpus       : "); namaPerpus = br.readLine();
            System.out.print("Alamat Perpus     : "); alamatPerpus = br.readLine();
            System.out.print("Jumlah Rak Buku   : "); jumlahRak = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Orang      : "); jumlahDenda = Integer.parseInt(br.readLine());
            Perpus perpus = new Perpus(namaPerpus, alamatPerpus, jumlahRak, jumlahDenda);
            
            for (int i = 0; i < jumlahRak; i++) {
                System.out.println("\n\t*** Input Data Rak Buku ***");
                System.out.print("\tNama Rak Buku  : "); namaRak = br.readLine();
                System.out.print("\tJenis Rak Buku : "); jenisRak = br.readLine();
                System.out.print("\tJumlah Buku    : "); jumlahBuku = Integer.parseInt(br.readLine());
                RakBuku rakBuku = perpus.addRakBuku(namaRak, jenisRak, jumlahBuku);
                
                for (int j = 0; j < jumlahBuku; j++) {
                    System.out.println("\n\t\t*** Input Data Buku ***");
                    System.out.print("\t\tNama Buku         : "); namaBuku = br.readLine();
                    System.out.print("\t\tPengarang Buku    : "); pengarang = br.readLine();
                    System.out.print("\t\tTahun Terbit Buku : "); tahunTerbit = Integer.parseInt(br.readLine());
                    System.out.print("\t\tHarga Buku        : "); harga = Float.parseFloat(br.readLine());
                    rakBuku.addBuku(namaBuku, pengarang, tahunTerbit, harga);
                }
            }
            for (int n = 0; n < jumlahDenda; n++) {
                System.out.println("\n\t*** Input Data Denda ***");
                System.out.print("\tNama Orang       : "); namaOrang = br.readLine();
                System.out.print("\tTotal Hari Telat : "); lamaHari = Integer.parseInt(br.readLine());
                Denda denda = new Denda(namaOrang, lamaHari);
                perpus.addDenda(denda);
            }
            perpus.showPerpus();
        } catch (Exception e) {}
    }
}
