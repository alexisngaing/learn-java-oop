package gd12_b_11407_2;

public class IT extends Observer {
    private int jumlahProjek;
    
    public IT(float gaji, int jumlahProjek, String nama, Perusahaan model) {
        super (model, gaji, nama);
        this.jumlahProjek = jumlahProjek;
    }
    
    @Override
    public void update(float bonus) {
        float tempGaji = gaji;
        gaji += bonus * (jumlahProjek + 1);
        System.out.println(namaPgw + "-- Gaji sebelum: " + tempGaji + " Gaji sesudah: " + gaji);
    }
}
