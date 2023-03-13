package tgs3_b_11;

import java.util.Scanner;

/**
 *
 * @author Kelompok 11
 */
public class TGS3_B_11 {

    public static void main(String[] args) {
        String nama, npm, buku, judul, jenis, id, namaKaryawan;
        int lamaPinjam, usia, nomorAnggota, lamaPeminjaman, biayaPerHari, isbn, telatKembali, jamKerja, upah;
        
        Scanner reader = new Scanner(System.in);
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.tampilMahasiswa();

        Peminjaman peminjaman1 = new Peminjaman();
        peminjaman1.tampilPeminjaman();

        Karyawan karyawan1 = new Karyawan();
        karyawan1.tampilKaryawan();

        Buku buku1 = new Buku();
        buku1.tampilBuku();

        try {     
            System.out.println("\n\n[ ***** INPUT DATA ***** ]");
            System.out.println("\n=== Input Mahasiswa ===");
            System.out.println("Nama             : "); nama = reader.nextLine();
            System.out.println("NPM              : "); npm = reader.nextLine();
            System.out.println("Lama Pinjam      : "); lamaPinjam = reader.nextInt();
            System.out.println("Usia             : "); usia = reader.nextInt();
            
            Mahasiswa mahasiswa2 = new Mahasiswa(nama, npm, lamaPinjam, usia);
            mahasiswa2.tampilMahasiswa();
            
            System.out.println("\n=== Input Peminjaman ===");
            reader.nextLine();            
            System.out.println("Buku            : "); buku = reader.nextLine();
            System.out.println("Nomor Anggota   : "); nomorAnggota = reader.nextInt();
            System.out.println("Lama Peminjaman : "); lamaPeminjaman = reader.nextInt();
            System.out.println("Biaya Per Hari  : "); biayaPerHari = reader.nextInt();
            
            Peminjaman peminjaman2 = new Peminjaman(buku, nomorAnggota, lamaPeminjaman, biayaPerHari);
            peminjaman2.tampilPeminjaman();
            
            System.out.println("\n=== Input Karyawan ===");
            reader.nextLine();  
            System.out.println("ID              : "); id = reader.nextLine();
            System.out.println("Nama            : "); namaKaryawan = reader.nextLine();
            System.out.println("Jam Kerja       : "); jamKerja = reader.nextInt();
            System.out.println("Upah            : "); upah = reader.nextInt();

            Karyawan karyawan2 = new Karyawan(id, nama, jamKerja, upah);
            karyawan2.tampilKaryawan();
            
            System.out.println("\n=== Input Buku ===");
            reader.nextLine();  
            System.out.println("");
            System.out.println("Judul            : "); judul = reader.nextLine();
            System.out.println("Jenis            : "); jenis = reader.nextLine();
            System.out.println("ISBN             : "); isbn = reader.nextInt();
            System.out.println("Telat Kembali    : "); telatKembali = reader.nextInt();

            Buku buku2 = new Buku(judul, jenis, isbn, telatKembali);
            buku2.tampilBuku();
        } catch(Exception e) {
            System.out.println("\n\tSomething wrong [!]");
        }
    }
}
