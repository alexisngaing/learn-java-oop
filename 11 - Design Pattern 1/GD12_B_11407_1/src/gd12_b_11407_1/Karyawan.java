package gd12_b_11407_1;

public class Karyawan implements IComposite {
    private String namaKaryawan;
    private String jabatan;
    
    public Karyawan(String namaKaryawan, String jabatan) {
        this.namaKaryawan = namaKaryawan;
        this.jabatan = jabatan;
    }
    
    @Override
    public void showData() {
        System.out.println(namaKaryawan + " - " + jabatan);
    }
}
