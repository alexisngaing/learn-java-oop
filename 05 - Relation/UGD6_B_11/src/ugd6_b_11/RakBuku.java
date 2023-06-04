package ugd6_b_11;

/**
 *
 * @author ASUS
 */
public class RakBuku {
    private String namaRak, jenisRak;
    private int jumlahBuku, counter = 0;
    private Buku buku[];
   
    public RakBuku(String namaRak, String jenisRak, int jumlahBuku) {
        this.namaRak = namaRak;
        this.jenisRak = jenisRak;
        this.jumlahBuku = jumlahBuku;
        buku = new Buku[jumlahBuku];
    }
   
    public void addBuku(String namaBuku, String pengarang, int tahunTerbit, float harga) {
        buku[counter] = new Buku(namaBuku, pengarang, tahunTerbit, harga);
        counter++;
    }
    
    public float hitungTotalHargaBuku() {
        float temp = 0;
        for (int i = 0; i < jumlahBuku; i ++) {
            temp = temp + buku[i].getHarga();
        }
        return temp;
    } 
    
    public int getJumlahBuku() {
        return jumlahBuku;
    }
    
    public void showRakBuku() {
        System.out.println("\n\tNama Rak          : " + namaRak);
        System.out.println("\tJenis Rak         : " + jenisRak);
        System.out.println("\tTotal Semua Harga : " + hitungTotalHargaBuku());
        System.out.println("\tJumlah Buku       : " + jumlahBuku);
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\t\t--- [ Tampil Buku ] ---");
            System.out.println("\t\tData Buku ke : " + (i + 1));
            buku[i].showBuku();
        }
    }
}
