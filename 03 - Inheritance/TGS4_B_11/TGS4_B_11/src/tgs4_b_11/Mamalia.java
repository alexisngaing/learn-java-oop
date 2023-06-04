package tgs4_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Mamalia extends Herbivora{
     private String tipeGigi;
    private float suhuTubuh;

    public Mamalia(String tipeGigi, float suhuTubuh, String nama, float umur, float berat, String berkembangbiak, String tipePencernaan, int jumlahKaki) {
        super(nama, umur, berat, berkembangbiak, tipePencernaan, jumlahKaki);
        this.tipeGigi = tipeGigi;
        this.suhuTubuh = suhuTubuh;
    }
    
    public void cekSuhuTubuh() {
        if (suhuTubuh > 38) {
            System.out.println("Suhu tubuh mamalia ini tinggi, perlu diperhatikan kesehatan");
        } else if (suhuTubuh <= 38) {
            System.out.println("Suhu tubuh mamalia ini normal");
        } 
    }
    
    public void showDataMamalia() {
        showDataHerbivora();
        System.out.println("Tipe Gigi             : " + tipeGigi);
        System.out.println("Suhu Tubuh            : " + suhuTubuh + " Celcius");
        cekSuhuTubuh();
    }
}
