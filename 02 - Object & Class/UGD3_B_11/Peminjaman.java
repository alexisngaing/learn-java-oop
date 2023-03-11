public class Peminjaman {
    private String buku;
    private int nomorAnggota, lamaPeminjaman, biayaPerHari; 
    
    public Peminjaman() {
        buku = "Harry Potter";
        nomorAnggota = 111;
        lamaPeminjaman = 10;
        biayaPerHari = 5000;
    }
    
    public Peminjaman(String buku, int nomorAnggota, int lamaPeminjaman, int biayaPerHari) {
        this.buku = buku;
        this.nomorAnggota = nomorAnggota;
        this.lamaPeminjaman = lamaPeminjaman;
        this.biayaPerHari = biayaPerHari;
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
    
    public int totalBiaya() {
        return lamaPeminjaman * biayaPerHari;
    }
}
