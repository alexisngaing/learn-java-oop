/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class AccountOfficer extends Petugas implements IMencariNasabah, IBukaRekening, IBonus{
    private int jumlahNasabah;
    private String area;
    
    public AccountOfficer(int jumlahNasabah, String area, String namaPetugas, String noIdentitas, String awalKontrak, String akhirKontrak) {
        super(namaPetugas, noIdentitas, awalKontrak, akhirKontrak);
        this.jumlahNasabah = jumlahNasabah;
        this.area = area;
    }
    
    public void MencariNasabah() {
        System.out.println("Tugas Anda adalah mencari nasabah");
    }
    
    public void BukaRekening() {
        System.out.println("Tugas Anda adalah membuka rekening");
    }
    
    public double hitungBonus() {
        return super.hitungKontrak() * 12000;
    }

    public void showPetugas() {
        int jam, menit, sisa, kontrak;
        jam = (int)super.hitungKontrak()/3600;
        sisa = (int)super.hitungKontrak()%3600;
        menit = (int)sisa/60;
        
//        kontrak = (jam + (menit/60)) / 24;
        kontrak = (int)super.hitungKontrak();

        System.out.println("\t=== Data Account Officer ===");
        System.out.println("Nama Petugas    : " + namaPetugas);
        System.out.println("Nomor Identitas : " + noIdentitas);
        System.out.println("Awal Kontrak    : " + awalKontrak);
        System.out.println("Akhir Kontrak   : " + akhirKontrak);
        System.out.println("Jumlah Nasabah  : " + jumlahNasabah);
        System.out.println("Area            : " + area);
        System.out.println("Tugas :");
        MencariNasabah();
        BukaRekening();
        System.out.println("Durasi Kontrak  : " + kontrak);
        if (kontrak > 30) {
            System.out.println("Anda Mendapatkan Bonus");
            System.out.println("Bonus: " + hitungBonus());
        } else {
            System.out.println("Anda tidak Mendapatkan Bonus");
            System.out.println("Bonus: 0.0");
        } 
    }
}
