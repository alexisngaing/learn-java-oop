public class Mahasiswa {
    private String nama, npm;
    private int lamaPinjam, usia;
   
    public Mahasiswa() {
        nama = "Anna";
        npm = "12345";
        lamaPinjam = 6;
        usia = 17;
    }
   
    public Mahasiswa(String nama, String npm, int lamaPinjam, int usia) {
        this.nama = nama;
        this.npm = npm;
        this.lamaPinjam = lamaPinjam;
        this.usia = usia;
    }
   
    public String getNama() {
        return nama;
    }
   
    public void setNama(String nama) {
        this.nama = nama;
    }
   
    public String getNpm() {
        return npm;
    }
   
    public void setNpm(String npm) {
        this.npm = npm;
    }
   
    public int getLamaPinjam() {
        return lamaPinjam;
    }
   
    public void setLamaPinjam(int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }
   
    public int getUsia() {
        return usia;
    }
   
    public void setUSia(int usia) {
        this.usia = usia;
    }
   
    public int estimasiPinjam() {
        return lamaPinjam * 7;
    }
}