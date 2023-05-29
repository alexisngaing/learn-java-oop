package gd12_b_11407_2;

public class Marketing extends Observer {
    private float komisiPenjualan;
    
    public Marketing(float gaji, float komisiPenjualan, String nama, Perusahaan model) {
        super(model, gaji, nama);
        this.komisiPenjualan = komisiPenjualan;
    }
    
    @Override
    public void update(float bonus) {
        float tempGaji = gaji;
        gaji += bonus +komisiPenjualan;
        System.out.println(namaPgw + "-- Gaji sebelum: " + tempGaji + " Gaji sesudah: " + gaji);
    }
}
