package gd5_b_11407_2;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class StudentStaff extends Mahasiswa implements ISummary {
    private String jnsKantor;
    private int jamKerja;
    
    public StudentStaff(String npm, String nama, double gajiPokok, String jnsKantor, int jamKerja) {
        super(npm, nama, gajiPokok);
        this.jnsKantor = jnsKantor;
        this.jamKerja = jamKerja;
    }
    
    @Override
    public void showData() {
        System.out.println("=== [ Student Staff ] ===");
        System.out.println("NPM              : " + npm);
        System.out.println("Nama             : " + nama);
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Jenis Kantor     : " + jnsKantor);
        System.out.println("Jam Kerja        : " + jamKerja);
        System.out.println("======================================");
        System.out.println("Total Gaji       : Rp " + totalGaji());
    }
    
    @Override
    public double totalGaji() {
        return gajiPokok + (jamKerja * 30000);
    }
}
