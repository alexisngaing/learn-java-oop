package tgs3_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Karyawan {
    private String id, namaKaryawan;
    private int jamKerja, upah;
    private static int jumlahKaryawan = 0;
    
    public Karyawan() {
        id = "A123";
        namaKaryawan = "Tolstoy";
        jamKerja = 7;
        upah = 10000;
        jumlahKaryawan++;
    }
    
    public Karyawan(String id, String namaKaryawan, int jamKerja, int upah) {
        this.id = id;
        this.namaKaryawan = namaKaryawan;
        this.jamKerja = jamKerja;
        this.upah = upah;
        this.jumlahKaryawan++;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }
    
    public int getJamKerja() {
        return jamKerja;
    }
    
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    
    public int getUpah() {
        return upah;
    }
    
    public void setUpah(int upah) {
        this.upah = upah;
    }
    
    public static int jumlahKaryawan() {
        return jumlahKaryawan;
    }
    
    public int totalGaji() {
        return jamKerja * upah;
    }
    
    public void tampilKaryawan() {
        System.out.println("\n=== Tampil Karyawan ===");
        System.out.println("ID              : " + id);
        System.out.println("Nama            : " + namaKaryawan);
        System.out.println("Jam Kerja       : " + jamKerja);
        System.out.println("Upah            : " + upah);
        System.out.println("Jumlah Karyawan : " + jumlahKaryawan());
        System.out.println("Total Gaji      : " + totalGaji());
    }
}
