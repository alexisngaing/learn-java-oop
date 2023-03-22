package gd5_b_11407_1;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Mahasiswa {
    private String nama;
    private String npm;
    
    public Mahasiswa() {
        this.npm = "210711407";
        this.nama = "Alexis Ngaing";
    }
    
    public Mahasiswa(String npm) {
        this.npm = npm;
        this.nama = "-";
    }
    
    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }
    
    public void showMahasiswa() {
        System.out.println("NPM  : " + this.npm);
        System.out.println("Nama : " + this.nama);
        System.out.println("----------------------");
    }
}
