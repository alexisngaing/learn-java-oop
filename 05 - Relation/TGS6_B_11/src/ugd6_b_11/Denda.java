package ugd6_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Denda {
    private String namaOrang;
    private int lamaHari;
    private float denda = 5000;

    public Denda(String namaOrang, int lamaHari) {
        this.namaOrang = namaOrang;
        this.lamaHari = lamaHari;
    }

    public float hitungDenda() {
        return lamaHari * denda;
    }

    public void showDenda() {
        System.out.println("\tNama yang kena Denda : " + namaOrang);
        System.out.println("\tLama Hari            : " + lamaHari + " hari");
        System.out.println("\tTotal Denda          : Rp " + hitungDenda());
    }
}
