package ugd6_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Perpus {
    private String namaPerpus, alamatPerpus;
    private int jumlahRak = 0, jumlahDenda = 0, counter = 0;
    private RakBuku rakBuku[];
    private Denda denda[];
    
    public Perpus(String namaPerpus, String alamatPerpus, int jumlahRak, int jumlahDenda) {
        this.namaPerpus = namaPerpus;
        this.alamatPerpus = alamatPerpus;
        this.jumlahRak = jumlahRak;
        rakBuku = new RakBuku[jumlahRak];
        denda = new Denda[jumlahDenda];
    }
    
    public RakBuku addRakBuku(String namaRak, String jenisRak, int jumlahBuku) {
        rakBuku[counter] = new RakBuku(namaRak, jenisRak, jumlahBuku);
        counter++;
        return rakBuku[counter - 1];
    }

    public void addDenda(Denda d) {
        denda[jumlahDenda] = d;
        jumlahDenda++;
    }

    public float hitungTotalDenda() {
        float temp = 0;
        for (int i = 0; i < jumlahDenda; i++) {
            temp = temp + denda[i].hitungDenda();
        }
        return temp;
    }
    
    public void showPerpus() {
        System.out.println("\n--- [ Tampil Data Perpus ] ---");
        System.out.println("Nama Perpustakaan   : " + namaPerpus);
        System.out.println("Alamat Perpustaan   : " + alamatPerpus);
        System.out.println("Jumlah Rak Buku     : " + counter);
        System.out.println("Jumlah Orang        : " + jumlahDenda);
        System.out.println("Total Denda         : Rp " + hitungTotalDenda());
        for (int i = 0; i < counter; i++) {
            System.out.println("\n\t--- [ Tampil Data Rak Buku ] ---");
            System.out.println("\tData Rak Buku ke [" + (i+1) + "]");
            rakBuku[i].showRakBuku();
        }
        for (int j = 0; j < jumlahDenda; j++) {
            System.out.println("\n\t--- [ Tampil List Denda ] ---");
            System.out.println("\tData Denda ke [" + (j+1) + "]");
            denda[j].showDenda();
        }
    }   
}
