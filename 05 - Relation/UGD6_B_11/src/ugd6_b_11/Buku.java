package ugd6_b_11;

/**
 *
 * @author ASUS
 */
public class Buku {
    private String namaBuku, pengarang;
    private int tahunTerbit;
    private float harga;

 

    public Buku(String namaBuku, String pengarang, int tahunTerbit, float harga) {
        this.namaBuku = namaBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }
    
    public void showBuku() {
        System.out.println("\t\tNama Buku         : " + namaBuku);
        System.out.println("\t\tPengarang Buku    : " + pengarang);
        System.out.println("\t\tTahun Terbit Buku : " + tahunTerbit);
        System.out.println("\t\tHarga Buku        : " + harga);
    }

    public float getHarga() {
        return harga;
    }
}
