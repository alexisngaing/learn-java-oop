package tgs7_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class Apoteker <T,U> {
    private T idApoteker, tahunMasuk;
    private U namaApoteker;

    public Apoteker(T idApoteker, T tahunMasuk, U namaApoteker) {
        this.idApoteker = idApoteker;
        this.tahunMasuk = tahunMasuk;
        this.namaApoteker = namaApoteker;
    }
    
    public void showApoteker(){
        System.out.println("\tID Apoteker    : "+idApoteker);
        System.out.println("\tNama Apoteker  : "+namaApoteker);
        System.out.println("\tTahun Masuk    : "+tahunMasuk);
    }
}
