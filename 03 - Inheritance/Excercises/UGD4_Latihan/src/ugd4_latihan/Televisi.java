package ugd4_latihan;

/**
 *
 * @author ASUS
 */
public class Televisi extends Elektronik {
    private float ukuranLayar;
    private float resolusiLayar;
    
    public Televisi(String merk, float harga, float berat, float ukuranLayar, float resolusiLayar) {
        super(merk, harga, berat);
        this.ukuranLayar = ukuranLayar;
        this.resolusiLayar = resolusiLayar;
    }
    
    public float keuntunganPenjualanTv() {
        return (harga * 6) - 1000;
    }
    
    public void showDataTelevisi() {
        System.out.println("Ukuran Layar            : " + ukuranLayar);
        System.out.println("Resolusi Layar          : " + resolusiLayar);
        System.out.println("Keuntungan Penjualan TV : " + keuntunganPenjualanTv());
    }
}
