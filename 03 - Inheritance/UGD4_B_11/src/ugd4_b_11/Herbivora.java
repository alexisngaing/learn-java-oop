package ugd4_b_11;

/**
 *
 * @author ASUS
 */
public class Herbivora extends Hewan{
    private String tipePencernaan;
    private int jumlahKaki;

    public Herbivora(String nama, float umur, float berat, String berkembangbiak, String tipePencernaan, int jumlahKaki) {
        super(nama, umur, berat, berkembangbiak);
        this.tipePencernaan = tipePencernaan;
        this.jumlahKaki = jumlahKaki;
    }
    
    public void cekKecukupanMakanan(){
       if(berat <= 10 && tipePencernaan.equalsIgnoreCase("monogastrik")){
           System.out.println("Hewan ini hanya memiliki satu ruang pencernaan");
       }else if(berat>10 && berat<=20 && tipePencernaan.equalsIgnoreCase("ruminansia")){
           System.out.println("Hewan ini memiliki empat ruang pencernaan");
       }else if(berat>20 && berat<=30 && tipePencernaan.equalsIgnoreCase("fermenters")){
           System.out.println("Hewan ini hanya memiliki tiga ruang pencernaan");
       }
    }
    
    public void showDataHerbivora() {
        showDataHewan();
        System.out.println("Tipe Pencernaan       : " + tipePencernaan);
        System.out.println("Jumlah Kaki           : " + jumlahKaki);
        cekKecukupanMakanan();
    }
}
