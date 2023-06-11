/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd13_b_11;

import java.util.ArrayList;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class Toko {
    private String namaToko, alamat;
    private Karyawan penanggungJawab;
    private ArrayList<Karyawan> karyawan;
    private double danaToko;
    private static Toko TokoInstance = null;
  
    public Toko(String namaToko, String alamat, double danaToko) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.penanggungJawab = null;
        this.danaToko = danaToko;
        karyawan = new ArrayList<Karyawan>();
    }

    public static Toko getTokoInstance(String namaToko, String alamat, double danaToko) {
        if (TokoInstance == null) {
            Toko.TokoInstance = new Toko(namaToko, alamat, danaToko);
            System.out.println("Toko " + namaToko + " berhasil dibuat");
        } else {
            System.out.println("Toko " + Toko.TokoInstance.namaToko + " sudah ada sebelumnya");
            System.out.println("Toko " + namaToko + " gagal dibuat!");
        }
        
        return Toko.TokoInstance;
    }
    
    public void TampilDaftarKaryawan()
    {
        System.out.println("Toko " + namaToko);
        System.out.println("Alamat " + alamat);
        System.out.println("Jumlah Dana Toko : Rp. " + danaToko);
        
        if(penanggungJawab != null)
        {
            penanggungJawab.ShowData();
        }
        else
        {
            System.out.println("Posisi Manager sedang Kosong!");
        }
    }
    
    public void RegisterObserver(Karyawan k)
    {
        karyawan.add(k);
    }
    
    public void NotifyObserver(double jumlah)
    {
        for(Karyawan k : karyawan)
        {
            k.Update(jumlah);
        }
    }
    
    public void PenjualanBarang(double harga, int jmlBarang)
    {
        double total = harga * jmlBarang;
        double bonus = (harga * jmlBarang) / 20;
        System.out.println("\t\t Toko mendapatkan dana sebesar : Rp. " + total);
        danaToko += total;
        NotifyObserver(bonus);
    }
    
    public void SetPenanggungJawab(Karyawan manager)
    {
        if(manager.getJenis().equalsIgnoreCase("Utama")){
            this.penanggungJawab = manager;
        }else{
            System.out.println("Jabatan Manager kurang tinggi!");
            System.exit(0);
        }        
    }
    
    public void ShowTotalTunjangan()
    {
        double temp = penanggungJawab.GetTunjangan();
        System.out.println("\nTotal Tunjangan: " + temp);
    }
}
