package gd6_b_11407;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Buku {
    private String judulBuku, ISBN;
    private Penulis penulis[];
    
    private int counter = 0;
    
    public Buku(String judulBuku, String ISBN) {
        this.judulBuku = judulBuku;
        this.ISBN = ISBN;
        penulis = new Penulis[2];
    }
    
    public void addPenulis(Penulis p) {
        penulis[counter] = p;
        counter++;
    }
    
    public void showbuku() {
        System.out.println("Judul Buku     : " + judulBuku);
        System.out.println("ISBN           : " + ISBN);
        System.out.println("Jumlah Penulis : " + counter);
        for (int i = 0; i < penulis.length; i++) {
            System.out.println("\t--- [ Tampil Penulis ] ---");
            System.out.println("\tData Penulis ke : " + (i + 1));
            penulis[i].showPenulis();
        }
    }
}
