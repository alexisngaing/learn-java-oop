package gd4_b_11407;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Dokter extends Manusia {
    private String spesialis;
    private float gajiSpesialis;
    private float waktuKerja;
    
    public Dokter(String nama, int umur, String noTelp, String spesialis, float gajiSpesialis, float waktuKerja) {
        super(nama, umur, noTelp);
        this.spesialis = spesialis;
        this.gajiSpesialis = gajiSpesialis;
        this.waktuKerja = waktuKerja;
    }
    public double totalPendapatanDokter() {
        return (gajiSpesialis * 6) - (waktuKerja * 1000);
    }
    public void showDataDokter() {
        showDataManusia();
        System.out.println("Dokter Spesialis  : " + spesialis);
        System.out.println("Gaji Spesialis    : " + gajiSpesialis);
        System.out.println("Waktu Bekerja     : " + waktuKerja);
        System.out.println("Total Gaji        : Rp " + totalPendapatanDokter());
    }
}
