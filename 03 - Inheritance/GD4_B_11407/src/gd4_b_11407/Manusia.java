package gd4_b_11407;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Manusia {
    protected String nama;
    protected int umur;
    protected String noTelp;
    
    public Manusia(String nama, int umur, String noTelp) {
        this.nama = nama;
        this.umur = umur;
        this.noTelp = noTelp;
    }
    
    public void showDataManusia() {
        System.out.println("Nama       : " + nama);
        System.out.println("Umur       : " + umur);
        System.out.println("No Telepon : " + noTelp);
    }
}
