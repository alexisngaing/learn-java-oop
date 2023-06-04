package ugd5_b_11;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ASUS
 */
public class Platinum extends PaketSewaMobil implements IPendapatan, IDurasi {
    private double tarifDriver;
    private double tarifFullServis;
    
    public Platinum(String nomorTransaksi, String jenisMobil, double jarak, double tarifBensin, String waktuBerangkat, String waktuKembali, double tarifDriver, double tarifFullServis) {
        super(nomorTransaksi, jenisMobil, jarak, tarifBensin, waktuBerangkat, waktuKembali);
        this.tarifDriver = tarifDriver;
        this.tarifFullServis = tarifFullServis;
    }
    
    @Override
    public double hitungPendapatan() {
        return (tarifBensin * jarak) + tarifDriver + tarifFullServis;
    }
    
    public double hitungPendapatan(double persenPotonganPajak) {
        return hitungPendapatan() - (persenPotonganPajak * hitungPendapatan());
    }
    
    @Override
    public double hitungDurasi() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime pengiriman = LocalDateTime.parse(waktuBerangkat, format);
        LocalDateTime tiba = LocalDateTime.parse(waktuKembali, format);
        
        Duration durasi = Duration.between(pengiriman,tiba);
        return durasi.toSeconds();
    }
    
    @Override
    public void showDataPaketSewaMobil() {
        int jam, menit, sisa;
        jam = (int)hitungDurasi()/3600;
        sisa = (int)hitungDurasi()%3600;
        menit = (int)sisa/60;
        
        System.out.println("[Platinum]");
        System.out.println("Nomor Transaksi        : " + nomorTransaksi);
        System.out.println("Jenis Mobil            : " + jenisMobil);
        System.out.println("Durasi Sewa            : " + jam + " Jam " + menit + " Menit");
        System.out.println("jarak                  : " + jarak + " km");
        System.out.println("Potongan Pajak         : 25.5%");
        System.out.println("\t>>> Pendapatan Sebelum Pajak : " + hitungPendapatan());
        System.out.println("\t>>> Pendapatan Setelah Pajak : " + hitungPendapatan(.255));
        System.out.println("======================================================\n");
    }
}
