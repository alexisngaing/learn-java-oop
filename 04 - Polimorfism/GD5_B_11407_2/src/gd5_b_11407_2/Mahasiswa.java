package gd5_b_11407_2;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public abstract class Mahasiswa {
    protected String npm;
    protected String nama;
    protected double gajiPokok;
    
    public Mahasiswa(String npm, String nama, double gajiPokok) {
        this.npm = npm;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    public abstract void showData();
}
