package ugd6_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Alexis Divasonda S. N.
 */
public class UGD6_B_11 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String namaPerpus, alamatPerpus, namaRak, jenisRak, namaBuku, pengarang;
        int jumlahRak, jumlahBuku, tahunTerbit;
        float harga;
                
        try {
            System.out.println("*** Input Data Perpus ***");
            System.out.println("Nama Perpus : "); namaPerpus = br.readLine();
            System.out.println("Alamat Perpus : "); alamatPerpus = br.readLine();
            System.out.println("Jumlah Rak Buku : "); jumlahRak = Integer.parseInt(br.readLine());
            Perpus perpus = new Perpus(namaPerpus, alamatPerpus, jumlahRak);
            
            for (int i = 0; i < jumlahRak; i++) {
                System.out.println("\n\t*** Input Data Rak Buku ***");
                System.out.println("\tNama Rak Buku : "); namaRak = br.readLine();
                System.out.println("\tJenis Rak Buku : "); jenisRak = br.readLine();
                System.out.println("\tJumlah Buku : "); jumlahBuku = Integer.parseInt(br.readLine());
                RakBuku rakBuku = perpus.addRakBuku(namaRak, jenisRak, jumlahBuku);
                System.out.println(rakBuku.getJumlahBuku());
                
                for (int j = 0; j < jumlahBuku; j++) {
                    System.out.println("\n\t\t*** Input Data Buku ***");
                    System.out.println("\t\tNama Buku : "); namaBuku = br.readLine();
                    System.out.println("\t\tPengarang Buku : "); pengarang = br.readLine();
                    System.out.println("\t\tTahun Terbit Buku : "); tahunTerbit = Integer.parseInt(br.readLine());
                    System.out.println("\t\tHarga Buku : "); harga = Float.parseFloat(br.readLine());
                    rakBuku.addBuku(namaBuku, pengarang, tahunTerbit, harga);
                }
            }
            perpus.showPerpus();
        } catch (Exception e) {}
    }
}
