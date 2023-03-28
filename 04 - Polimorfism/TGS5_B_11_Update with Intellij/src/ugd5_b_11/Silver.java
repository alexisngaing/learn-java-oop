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
public class Silver extends PaketSewaMobil implements IPendapatan, IDurasi {
    private double tarifKebersihan;
    private double tarifMaintenance;
    
    public Silver(String nomorTransaksi, String jenisMobil, double jarak, double tarifBensin, String waktuBerangkat, String waktuKembali, double tarifKebersihan, double tarifMaintenance){
        super(nomorTransaksi, jenisMobil, jarak, tarifBensin, waktuBerangkat, waktuKembali);
        this.tarifKebersihan = tarifKebersihan;
        this.tarifMaintenance = tarifMaintenance;
    }
    
    @Override
    public double hitungPendapatan() {
        return (tarifBensin * jarak) + tarifKebersihan + tarifMaintenance;
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
        
        System.out.println("[Silver]");
        System.out.println("Nomor Transaksi        : " + nomorTransaksi);
        System.out.println("Jenis Mobil            : " + jenisMobil);
        System.out.println("Durasi Sewa            : " + jam + " Jam " + menit + " Menit");
        System.out.println("jarak                  : " + jarak + " km");
        System.out.println("Potongan Pajak         : 15%");
        System.out.println("\t>>> Pendapatan Sebelum Pajak : " + hitungPendapatan());
        System.out.println("\t>>> Pendapatan Setelah Pajak : " + hitungPendapatan(.15));
        System.out.println("======================================================\n");
    }
}
