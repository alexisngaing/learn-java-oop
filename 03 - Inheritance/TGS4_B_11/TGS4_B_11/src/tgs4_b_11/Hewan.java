package tgs4_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Hewan {
    protected String nama;
    protected float umur;
    protected float berat;
    protected String berkembangBiak;
    
    public Hewan(String nama, float umur, float berat, String berkembangBiak) {
        this.nama = nama;
        this.umur = umur;
        this.berat = berat;
        this.berkembangBiak = berkembangBiak;
    }
    
    public void showDataHewan() {
        System.out.println("Nama                  : " + nama);
        System.out.println("Umur                  : " + umur + " Tahun");
        System.out.println("Berat                 : " + berat + " Kg");
        System.out.println("Berkembang Biak       : " + berkembangBiak);
    }
}
