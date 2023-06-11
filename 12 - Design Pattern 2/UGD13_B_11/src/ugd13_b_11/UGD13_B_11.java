/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd13_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class UGD13_B_11 {
    public static void main(String[] args) {
        Toko oneShop = Toko.getTokoInstance("One Shop", "Jl. Merdeka No.241", 20000000);
        System.out.println("");
        Toko sinarMakmur = Toko.getTokoInstance("Sinar Makmur", "Jl. Merdeka No.241", 0);
        System.out.println("");
        
        KaryawanFactory kf = new KaryawanFactory();
        Karyawan smith, michael, andreson;
        Karyawan wilson, olivia, brian, evans;
        smith = kf.createKaryawan("Manager", "Smith", 3500000, oneShop, "Utama", 0);
        michael = kf.createKaryawan("Manager", "Michael", 3000000, oneShop, "Utama", 0);
        andreson = kf.createKaryawan("Manager", "Andreson", 1000000, oneShop, "Bagian", 0);
        
        oneShop.SetPenanggungJawab(smith);
        smith.RekrutBawahan(michael);
        smith.RekrutBawahan(andreson);
        
        wilson = kf.createKaryawan("Kasir", "Wilson", 300000, oneShop, "-", 1);
        olivia = kf.createKaryawan("Kasir", "Olivia", 800000, oneShop, "-", 8);
        brian = kf.createKaryawan("Kasir", "Brian", 400000, oneShop, "-", 3);
        evans = kf.createKaryawan("Kasir", "Evans", 500000, oneShop, "-", 5);
      
        michael.RekrutBawahan(wilson);
        michael.RekrutBawahan(olivia);
        
        andreson.RekrutBawahan(brian);
        andreson.RekrutBawahan(evans);
        
        oneShop.TampilDaftarKaryawan();
        System.out.println("\n\n Tampilkan Observernya saat terjadi penjualan dengan jumlah barang 5 dan harga 450000");
        oneShop.PenjualanBarang(450000, 5);
        
        System.out.println("\n\tSetelah Penjualan Berhasil... \n");
        oneShop.TampilDaftarKaryawan();
        
        oneShop.ShowTotalTunjangan();
    } 
}
