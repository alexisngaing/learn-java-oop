package tgs3_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Peminjaman {
    private String buku;
    private int nomorAnggota, lamaPeminjaman, biayaPerHari; 
    private static int jumlahPeminjaman = 0;
    
    public Peminjaman() {
        buku = "Harry Potter";
        nomorAnggota = 111;
        lamaPeminjaman = 10;
        biayaPerHari = 5000;
        jumlahPeminjaman++;
    }
    
    public Peminjaman(String buku, int nomorAnggota, int lamaPeminjaman, int biayaPerHari) {
        this.buku = buku;
        this.nomorAnggota = nomorAnggota;
        this.lamaPeminjaman = lamaPeminjaman;
        this.biayaPerHari = biayaPerHari;
        this.jumlahPeminjaman++;
    }

    public String getBuku() {
        return buku;
    }
    
    public void setBuku(String buku) {
        this.buku = buku;
    }
    
    public int getNomorAnggota() {
        return nomorAnggota;
    }
    
    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }
    
    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }
    
    public void setLamaPeminjaman(int lamaPeminjaman) {
        this.lamaPeminjaman = lamaPeminjaman;
    }
    
    public int getBiayaPerHari() {
        return biayaPerHari;
    }
    
    public void setBiayaPerHari(int biayaPerHari) {
        this.biayaPerHari = biayaPerHari;
    }
    
    public static int jumlahPeminjaman() {
        return jumlahPeminjaman;
    }
    
    public int totalBiaya() {
        return lamaPeminjaman * biayaPerHari;
    }
    
    public void tampilPeminjaman() {
         System.out.println("\n=== Tampil Peminjaman ===");
         System.out.println("Buku              : " + buku);
         System.out.println("Nomor Anggota     : " + nomorAnggota);
         System.out.println("Lama Peminjaman   : " + lamaPeminjaman);
         System.out.println("Biaya Per Hari    : " + biayaPerHari);
         System.out.println("Total Biaya       : " + totalBiaya());
         System.out.println("Jumlah Peminjaman : " + jumlahPeminjaman);
    }
}
