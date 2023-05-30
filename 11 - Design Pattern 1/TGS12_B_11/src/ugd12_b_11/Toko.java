package ugd12_b_11;

import java.util.ArrayList;
import exception.JabatanManagerException;

public class Toko {
    private final String namaToko;
    private final String alamat;
    private Manager penanggungJawab;
    private final ArrayList<Karyawan> karyawan;
    private double danaToko = 20000000;
    
    public Toko(String namaToko, String alamat) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.karyawan = new ArrayList<Karyawan>();
    }
    
    public void TampilDaftarKaryawan() {
        System.out.println("Nama Toko   : " + this.namaToko);
        System.out.println("Alamat      : " + this.alamat);
        System.out.println("Dana Toko   : " + this.danaToko);
        penanggungJawab.ShowData();
    }
    
    public void RegisterObserver(Karyawan k) {
        karyawan.add(k);
    }
    
    public void NotifyObserver(double jumlah) {
        for (Karyawan k : karyawan) {
            k.Update(jumlah);
        }
    }
    
    public void PenjualanBarang(double harga, int jmlBarang) {
        double bonus = (harga * jmlBarang) / 20;
        double keuntungan = harga * jmlBarang;

        System.out.println(Karyawan.space + "Tampilkan Observernya saat terjadi penjualan dengan jumlah barang " + jmlBarang + " dan harga " + harga);
        Karyawan.space.append("   ");
        System.out.println("\t\tToko mendapatkan dana sebesar : " + keuntungan);
        this.danaToko = this.danaToko + keuntungan;
        NotifyObserver(bonus);
        Karyawan.space.setLength(Karyawan.space.length() - 3);
    }
    
    public void SetPenanggungJawab(Manager manager) throws JabatanManagerException {
        if (manager.getJenis().equalsIgnoreCase("Utama")){
            this.penanggungJawab = manager;
        } else {
            throw new JabatanManagerException();
        }
    }
    
    public void ShowTotalTunjangan() {
        System.out.println("\nTotal Tunjangan : " + penanggungJawab.GetTunjangan());
    }
}
