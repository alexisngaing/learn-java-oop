package ugd12_b_11;

import java.util.ArrayList;

public class Manager extends Karyawan {
    private final String jenis;
    private ArrayList<Karyawan> kasir = new ArrayList<>();
    private int jumlahBawahan = 0;
    
    public Manager(String nama, double tunjangan, Toko toko, String jenis) {
        super(nama, tunjangan, toko);
        this.jenis = jenis;
    }
    
    public void ShowData() {
        System.out.println(Karyawan.space + "[Manager] " + nama + " - " + "Total Tunjangan : " + tunjangan);
        Karyawan.space.append("   ");

        for (Karyawan k : kasir) {
            System.out.print(Karyawan.space + "{Bawahan " + nama + "} ");
            k.ShowData();
        }

        Karyawan.space.setLength(Karyawan.space.length() - 3);
    }
  
    public void Update(double jumlah) {
        double bonusManager;
        if (this.jenis.equalsIgnoreCase("Utama")) {
            bonusManager = (jumlah + 100000) + (jumlahBawahan * 20000);
        } else {
            bonusManager = (jumlah + 40000) + (jumlahBawahan * 10000);
        }

        System.out.println("\t--- Tunjangan " + nama + " bertambah sebanyak : Rp " + bonusManager);
        this.tunjangan += bonusManager;
    }

    public void RekrutBawahan(Karyawan k) {
        kasir.add(k);
        this.jumlahBawahan++;
    }
    
    public double GetTunjangan() {
        double total = tunjangan;
        
        for (Karyawan k : kasir) {
            total = total + k.tunjangan;
        }
        
        return total;
    }
    
    public String getJenis() {
        return jenis;
    }
}
