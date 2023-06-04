package gd5_b_11407_2;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class AsistenDosen extends Mahasiswa implements ISummary {
    private String mataKuliah;
    private int jmlPertemuan;
    
    public AsistenDosen(String npm, String nama, double gajiPokok, String mataKuliah, int jmlPertemuan) {
        super(npm, nama, gajiPokok);
        this.mataKuliah = mataKuliah;
        this.jmlPertemuan = jmlPertemuan;
    }
    
    public double totalGaji(){
        return gajiPokok + (jmlPertemuan + 20000);
    }
    
    public void showData() {
        System.out.println("=== [ Asisten Dosen ] ===");
        System.out.println("NPM              : " + npm);
        System.out.println("Nama             : " + nama);
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Mata Kuliah      : " + mataKuliah);
        System.out.println("Jumlah Pertemuan : " + jmlPertemuan);
        System.out.println("======================================");
        System.out.println("Total Gaji       : Rp " + totalGaji());
    }
}
