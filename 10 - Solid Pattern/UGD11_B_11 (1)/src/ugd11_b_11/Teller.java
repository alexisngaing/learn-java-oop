/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class Teller extends Petugas implements ITransaksiKeuangan, IBonus{
    private int uangMasuk;
    private int tunjangan;
    
    public Teller(int uangMasuk, int tunjangan, String namaPetugas, String noIdentitas, String awalKontrak, String akhirKontrak) {
        super(namaPetugas, noIdentitas, awalKontrak, akhirKontrak);
        this.uangMasuk = uangMasuk;
        this.tunjangan = tunjangan;
    }
    
    public void TransaksiKeuangan() {
        System.out.println("Tugas Anda adalah transaksi keuangan");
    }
    
    public double hitungBonus() {
        return super.hitungKontrak() * 13000;
    }
    
    public void showPetugas() {
//        int jam, menit, sisa;
//        jam = (int)super.hitungKontrak()/3600;
//        sisa = (int)super.hitungKontrak()%3600;
//        menit = (int)sisa/60;
        
        System.out.println("\t=== Data Account Officer ===");
        System.out.println("Nama Petugas        : " + namaPetugas);
        System.out.println("Nomor Identitas     : " + noIdentitas);
        System.out.println("Awal Kontrak        : " + awalKontrak);
        System.out.println("Akhir Kontrak       : " + akhirKontrak);
        System.out.println("Jumlah Uang Masuk   : " + uangMasuk);
        System.out.println("Tunjangan           : " + tunjangan);
        System.out.println("Tugas :");
        TransaksiKeuangan();
        System.out.println("Durasi Kontrak  : " + super.hitungKontrak());
        if (super.hitungKontrak() > 30) {
            System.out.println("Anda Mendapatkan Bonus");
            System.out.println("Bonus: " + hitungBonus());
        } else {
            System.out.println("Anda tidak Mendapatkan Bonus");
            System.out.println("Bonus: 0.0");
        } 
    }
}
