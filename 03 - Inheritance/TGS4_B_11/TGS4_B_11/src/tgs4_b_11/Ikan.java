package tgs4_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Ikan extends Omnivora{
    private String warnaTubuh;
    private float kecepatanBerenang;

    public Ikan(String warnaTubuh, float kecepatanBerenang, String nama, float umur, float berat, String berkembangbiak, String tipeDarah, String makananFavorit) {
        super(nama, umur, berat, berkembangbiak, tipeDarah, makananFavorit);
        this.warnaTubuh = warnaTubuh;
        this.kecepatanBerenang = kecepatanBerenang;
    }
    
    public void kecepatanGerak() {
        if (kecepatanBerenang <= 5) {
            System.out.println("Kecepatan gerak lambat");
        } else if (kecepatanBerenang > 5 && kecepatanBerenang <= 10) {
            System.out.println("Kecepatan gerak sedang");
        } else if (kecepatanBerenang > 10 && kecepatanBerenang <= 25) {
            System.out.println("Kecepatan gerak cepat");
        }
    }
    
    public void showDataIkan() {
        showDataOmnivora();
        System.out.println("Warna Tubuh           : " + warnaTubuh);
        System.out.println("Kecepatan Berenang    : " + kecepatanBerenang + " km/h");
        kecepatanGerak();
    }
}
