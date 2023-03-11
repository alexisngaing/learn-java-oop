package tgs3_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Kelompok 11
 */
public class TGS3_B_11 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String nama, npm, buku, judul, jenis, id, namaKaryawan;
        int lamaPinjam, usia, nomorAnggota, lamaPeminjaman, biayaPerHari, isbn, telatKembali, jamKerja, upah;
    
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.tampilMahasiswa();

        Peminjaman peminjaman1 = new Peminjaman();
        peminjaman1.tampilPeminjaman();

        Karyawan karyawan1 = new Karyawan();
        karyawan1.tampilKaryawan();

        Buku buku1 = new Buku();
        buku1.tampilBuku();

        try {
            System.out.println("\n=== Input Mahasiswa ===");
            System.out.println("Nama             : "); nama = br.readLine();
            System.out.println("NPM              : "); npm = br.readLine();
            System.out.println("Lama Pinjam      : "); lamaPinjam = Integer.parseInt(br.readLine());
            System.out.println("Usia             : "); usia = Integer.parseInt(br.readLine());
                
            Mahasiswa mahasiswa2 = new Mahasiswa(nama, npm, lamaPinjam, usia);
            mahasiswa2.tampilMahasiswa();
            
            System.out.println("\n=== Input Peminjaman ===");
//            System.out.println("");
            System.out.println("Buku            : "); buku = br.readLine();
            System.out.println("Nomor Anggota   : "); nomorAnggota = Integer.parseInt(br.readLine());
            System.out.println("Lama Peminjaman : "); lamaPeminjaman = Integer.parseInt(br.readLine());
            System.out.println("Biaya Per Hari  : "); biayaPerHari = Integer.parseInt(br.readLine());
            
            Peminjaman peminjaman2 = new Peminjaman(buku, nomorAnggota, lamaPeminjaman, biayaPerHari);
            peminjaman2.tampilPeminjaman();
            
            System.out.println("\n=== Input Karyawan ===");
            System.out.println("ID              : "); id = br.readLine();
            System.out.println("Nama            : "); namaKaryawan = br.readLine();
            System.out.println("Jam Kerja       : "); jamKerja = Integer.parseInt(br.readLine());
            System.out.println("Upah            : "); upah = Integer.parseInt(br.readLine());
            
            Karyawan karyawan2 = new Karyawan(id, nama, jamKerja, upah);
            karyawan2.tampilKaryawan();
            
            System.out.println("\n=== Input Buku ===");
            System.out.println("Judul            : "); judul = br.readLine();
            System.out.println("Jenis            : "); jenis = br.readLine();
            System.out.println("ISBN             : "); isbn = Integer.parseInt(br.readLine());
            System.out.println("Telat Kembali    : "); telatKembali = Integer.parseInt(br.readLine());
            
            Buku buku2 = new Buku(judul, jenis, isbn, telatKembali);
            buku2.tampilBuku();
        } catch(Exception e) {
            System.out.println("\n\tSomething wrong [!]");
        }
    }
}
