/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd5_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class Silver extends PaketSewaMobil implements IPendapatan{
    private double tarifKebersihan;
    private double tarifMaintenance;
    
    public Silver(String nomorTransaksi, String jenisMobil, double jarak, double tarifBensin, double tarifKebersihan, double tarifMaintenance){
        super(nomorTransaksi, jenisMobil, jarak, tarifBensin);
        this.tarifKebersihan = tarifKebersihan;
        this.tarifMaintenance = tarifMaintenance;
    }
    
    public double hitungPendapatan() {
        return (tarifBensin * jarak) + tarifKebersihan + tarifMaintenance;
    }
    
    public double hitungPendapatan(double persenPotonganPajak) {
        return hitungPendapatan() - (persenPotonganPajak * hitungPendapatan());
    }
    
    public void showDataPaketSewaMobil() {
        System.out.println("[Silver]");
        System.out.println("Nomor Transaksi        : " + nomorTransaksi);
        System.out.println("Jenis Mobil            : " + jenisMobil);
        System.out.println("jarak                  : " + jarak + " km");
        System.out.println("Potongan Pajak         : 15%");
        System.out.println("\t>>> Pendapatan Sebelum Pajak : " + hitungPendapatan());
        System.out.println("\t>>> Pendapatan Setelah Pajak : " + hitungPendapatan(.15));
        System.out.println("======================================");
    }
}
