package tgs7_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class Obat <X,Y>{
    private X namaObat, jenisObat;
    private Y harga;
    
    public Obat(X namaObat, X jenisObat, Y harga) {
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.harga = harga;
    }
    
    public void showObat(){
        System.out.println("\tNama Obat      : " + namaObat);
        System.out.println("\tJenis Obat     : " + jenisObat);
        System.out.println("\tHarga Obat     : Rp " + harga);
    }
}
