package gd6_b_11407;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Perpustakaan {
    private String namaPerpus, alamatPerpus;
    private Buku buku[];
    
    private int counter = 0;
    
    public Perpustakaan(String namaPerpus, String alamatPerpus) {
        this.namaPerpus = namaPerpus;
        this.alamatPerpus = alamatPerpus;
        buku = new Buku[2];
    }
    
    public void addBuku(Buku b) {
        buku[counter] = b;
        counter++;
    }
    
    public void showPerpustakaan(int menu) {
        System.out.println("--- [ Tampil Perpustakaan ] ---");
        System.out.println("Nama Perpustakaan   : " + namaPerpus);
        System.out.println("Alamat Perpustakaan : " + alamatPerpus);
        System.out.println("Jumlah Buku         : " + counter);
        for (int i = 0; i < buku.length; i++) {
            System.out.println("\t--- [ Tampil Buku ] ---");
            System.out.println("Data Buku ke : " + (i + 1));
            buku[i].showbuku();
        }
    }
}
