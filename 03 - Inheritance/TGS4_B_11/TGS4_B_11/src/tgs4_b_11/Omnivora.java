package tgs4_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Omnivora extends Hewan{
    private String tipeDarah, makananFavorit;

    public Omnivora(String nama, float umur, float berat, String berkembangbiak, String tipeDarah, String makananFavorit){
        super(nama, umur, berat, berkembangbiak);
        this.tipeDarah = tipeDarah;
        this.makananFavorit = makananFavorit;
    }
  
    public float ketersediaanMakanan() {
        return (berat + 2000) * umur;
    }
    
    public void showDataOmnivora() {
        showDataHewan();
        System.out.println("Tipe Darah            : " + tipeDarah);
        System.out.println("Makanan Favorit       : " + makananFavorit);
        System.out.println("Ketersediaan Makanan  : " + ketersediaanMakanan());
    }
}
