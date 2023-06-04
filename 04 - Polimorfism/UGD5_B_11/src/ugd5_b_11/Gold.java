/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd5_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class Gold extends PaketSewaMobil implements IPendapatan{
    private double tarifLepasKunci;
    private double tarifKonsumsi;
    
    public Gold (String nomorTransaksi, String jenisMobil, double jarak, double tarifBensin, double tarifLepasKunci, double tarifKonsumsi){
        super(nomorTransaksi, jenisMobil, jarak, tarifBensin);
        this.tarifLepasKunci = tarifLepasKunci;
        this.tarifKonsumsi = tarifKonsumsi;
    }
    
    public double hitungPendapatan() {
        return (tarifBensin * jarak) + tarifLepasKunci + tarifKonsumsi;
    }
    
    public double hitungPendapatan(double persenPotonganPajak) {
        return hitungPendapatan() - (persenPotonganPajak * hitungPendapatan());
    }
    
    public void showDataPaketSewaMobil() {
        System.out.println("[Gold]");
        System.out.println("Nomor Transaksi        : " + nomorTransaksi);
        System.out.println("Jenis Mobil            : " + jenisMobil);
        System.out.println("jarak                  : " + jarak + " km");
        System.out.println("Potongan Pajak         : 20.5%");
        System.out.println("\t>>> Pendapatan Sebelum Pajak : " + hitungPendapatan());
        System.out.println("\t>>> Pendapatan Setelah Pajak : " + hitungPendapatan(.205));
        System.out.println("======================================");
    }
}
