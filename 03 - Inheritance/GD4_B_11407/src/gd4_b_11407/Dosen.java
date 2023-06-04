package gd4_b_11407;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Dosen extends Manusia {
    private String matkul;
    private float gajiPokok;
    private float tunjangan;
    
    public Dosen(String nama, int umur, String noTelp, String matkul, float gajiPokok, float tunjangan) {
        super(nama, umur, noTelp);
        this.matkul = matkul;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    public double totalPendapatanDosen() {
        return (gajiPokok * 5) + tunjangan;
    }
    
    public void showDataDosen() {
        showDataManusia();
        System.out.println("Mata Kuliah   : " + matkul);
        System.out.println("Gaji Pokok    : " + gajiPokok);
        System.out.println("Tunjangan     : " + tunjangan);
        System.out.println("Total Gaji    : Rp " + totalPendapatanDosen());
    }
}
