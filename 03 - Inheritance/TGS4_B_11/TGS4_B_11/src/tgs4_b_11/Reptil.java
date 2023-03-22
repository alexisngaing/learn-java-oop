package tgs4_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Reptil extends Karnivora{
     private String metodeBerburu;
    private float panjangTubuh;

    public Reptil(String metodeBerburu, float panjangTubuh, String nama, float umur, float berat, String berkembangBiak, String tingkatKeganasan, String jenisMakanan) {
        super(nama, umur, berat, berkembangBiak, tingkatKeganasan, jenisMakanan);
        this.metodeBerburu = metodeBerburu;
        this.panjangTubuh = panjangTubuh;
    }
    
    public float panjangUsiaHidup() {
        if (panjangTubuh <= 100) {
            return ((berat * (10/100)) + (panjangTubuh * (15/100)));
        } else if (panjangTubuh > 100 && panjangTubuh <= 300) {
            return ((berat * (20/100)) + (panjangTubuh * (35/100)));
        } else if (panjangTubuh > 100 && panjangTubuh <= 150) {
            return ((berat * (40/100)) + (panjangTubuh * (55/100)));
        } else {
            return 0;
        } 
    }
    
    public void showDataReptil() {
        showDataKarnivora();
        System.out.println("Metode Berburu        : " + metodeBerburu);
        System.out.println("Panjang Tubuh         : " + panjangTubuh + " cm");
        System.out.println("Panjang Usia Hidup    : " + panjangUsiaHidup());
    }
}
