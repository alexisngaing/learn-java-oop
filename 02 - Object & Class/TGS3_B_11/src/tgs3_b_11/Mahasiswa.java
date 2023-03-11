package tgs3_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Mahasiswa {
    private String nama, npm;
    private int lamaPinjam, usia;
    private static int jumlahMahasiswa = 0;
    
    public Mahasiswa() {
        nama = "Anna";
        npm = "12345";
        lamaPinjam = 6;
        usia = 17;
        jumlahMahasiswa++;
    }
   
    public Mahasiswa(String nama, String npm, int lamaPinjam, int usia) {
        this.nama = nama;
        this.npm = npm;
        this.lamaPinjam = lamaPinjam;
        this.usia = usia;
        this.jumlahMahasiswa++;
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
    
    public static int jumlahMahasiswa() {
        return jumlahMahasiswa;
    }
   
    public int estimasiPinjam() {
        return lamaPinjam * 7;
    }
    
    public void tampilMahasiswa() {
        System.out.println("=== Tampil Mahasiswa ===");
        System.out.println("Nama             : " + nama);
        System.out.println("NPM              : " + npm);
        System.out.println("Lama Pinjam      : " + lamaPinjam);
        System.out.println("Usia             : " + usia);
        System.out.println("Jumlah Mahasiswa : " + jumlahMahasiswa());
        System.out.println("Estimasi Pinjam  : " + estimasiPinjam());
    }
}
