package ugd6_b_11;

/**
 *
 * @author ASUS
 */
public class Perpus {
    private String namaPerpus, alamatPerpus;
    private int jumlahRak = 0, counter = 0;
    private RakBuku rakBuku[];
    
    public Perpus(String namaPerpus, String alamatPerpus, int jumlahRak) {
        this.namaPerpus = namaPerpus;
        this.alamatPerpus = alamatPerpus;
        this.jumlahRak = jumlahRak;
        rakBuku = new RakBuku[jumlahRak];
    }
    
    public RakBuku addRakBuku(String namaRak, String jenisRak, int jumlahBuku) {
        rakBuku[counter] = new RakBuku(namaRak, jenisRak, jumlahBuku);
        counter++;
        return rakBuku[counter - 1];
    }
    
    public void showPerpus() {
        System.out.println("--- Tampil Data Perpus ---");
        System.out.println("Nama Perpustakaan   : " + namaPerpus);
        System.out.println("Alamat Perpustaan   : " + alamatPerpus);
        System.out.println("Jumlah Buku         : " + counter);
        for (int i = 0; i < counter; i++) {
            System.out.println("\n\t--- Tampil Data Rak Buku ---");
            System.out.println("\tData Rak Buku ke     : " + (i+1));
            rakBuku[i].showRakBuku();
        }
    }   
}
