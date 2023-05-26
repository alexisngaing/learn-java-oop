package ugd12_b_11;

public class Kasir extends Karyawan {
    private final int jumlahLembur;
    
    public Kasir(String nama, double tunjangan, Toko toko, int jumlahLembur) {
        super(nama, tunjangan, toko);
        this.jumlahLembur = jumlahLembur;
    }
    
    public void ShowData() {
        System.out.println("[Kasir] " + nama + " - " + "Total Tunjangan : " + tunjangan);
    }
    public void Update(double jumlah) {
        double bonusKasir = jumlah + (jumlahLembur * 10000);
        System.out.println("\t--- Tunjangan " + nama + " bertambah : Rp " + bonusKasir);
        this.tunjangan += bonusKasir;
    }
}
