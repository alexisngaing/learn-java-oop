/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd5_b_11;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author THESSALONICA A MEIL
 */
public class Gold extends PaketSewaMobil implements IPendapatan, IDurasi {
    private double tarifLepasKunci;
    private double tarifKonsumsi;
    
    public Gold (String nomorTransaksi, String jenisMobil, double jarak, double tarifBensin, String waktuBerangkat, String waktuKembali, double tarifLepasKunci, double tarifKonsumsi){
        super(nomorTransaksi, jenisMobil, jarak, tarifBensin, waktuBerangkat, waktuKembali);
        this.tarifLepasKunci = tarifLepasKunci;
        this.tarifKonsumsi = tarifKonsumsi;
    }
    
    @Override
    public double hitungPendapatan() {
        return (tarifBensin * jarak) + tarifLepasKunci + tarifKonsumsi;
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
        
        System.out.println("[Gold]");
        System.out.println("Nomor Transaksi        : " + nomorTransaksi);
        System.out.println("Jenis Mobil            : " + jenisMobil);
        System.out.println("Durasi Sewa            : " + jam + " Jam " + menit + " Menit");
        System.out.println("jarak                  : " + jarak + " km");
        System.out.println("Potongan Pajak         : 20.5%");
        System.out.println("\t>>> Pendapatan Sebelum Pajak : " + hitungPendapatan());
        System.out.println("\t>>> Pendapatan Setelah Pajak : " + hitungPendapatan(.205));
        System.out.println("======================================================\n");
    }
}
