package tgs7_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class AlatKesehatan <J,K> {
   private J namaAlatKesehatan;
   private K harga;

   public AlatKesehatan(J namaAlatKesehatan, K harga) {
        this.namaAlatKesehatan = namaAlatKesehatan;
        this.harga = harga;
   }

   public void showAlatKesehatan() {
       System.out.println("\tNama Alat Kesehatan    : " + namaAlatKesehatan);
       System.out.println("\tHarga                  : Rp " + harga);
   }
   
}
