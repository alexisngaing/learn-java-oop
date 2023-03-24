package ugd5_b_11_latihan;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ASUS
 */
public class Reguler extends Paket implements IBiaya, IDurasi {
    private double tarifPacking;
    private double tarifAngkutanReguler;
    
    public Reguler(String nomorResi, String tujuan, double berat, double tarifBerat, String waktuPengiriman, String waktuTiba, double tarifPacking, double tarifAngkutanReguler) {
        super(nomorResi, tujuan, berat, tarifBerat, waktuPengiriman, waktuTiba);
        this.tarifPacking = tarifPacking;
        this.tarifAngkutanReguler = tarifAngkutanReguler;
    }
    
    @Override
    public double hitungBiaya() {
        return (tarifBerat * berat) + tarifPacking + tarifAngkutanReguler;
    }
    
    public double hitungBiaya(double persenPajakPengiriman) {
        return hitungBiaya() + (persenPajakPengiriman * hitungBiaya());
    }
    
    @Override
    public double hitungDurasi() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime pengiriman = LocalDateTime.parse(waktuPengiriman, format);
        LocalDateTime tiba = LocalDateTime.parse(waktuTiba, format);
        
        Duration durasi = Duration.between(pengiriman,tiba);
        return durasi.toSeconds();
    }
    
    @Override
    public void showData() {
        int menit,jam,sisa;
        jam = (int)hitungDurasi()/3600;
        sisa = (int)hitungDurasi()%3600;
        menit = (int)sisa/60;
        
        System.out.println("=== [ Reguler ] ===");
        System.out.println("Nomor Resi             : " + nomorResi);
        System.out.println("Tujuan                 : " + tujuan);
        System.err.println("Durasi Pengiriman      : " + jam + " Jam " + menit + " Menit");
        System.out.println("Berat                  : " + berat + " kg");
        System.out.println("Pajak Pengiriman       : 15%");
        System.out.println("\t>>> Biaya Pengiriman Sebelum Pajak : " + hitungBiaya());
        System.out.println("\t>>> Biaya Pengiriman Setelah Pajak : " + hitungBiaya(.15));
        System.out.println("======================================");
    }
}
