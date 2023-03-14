package ugd4_latihan;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class LaptopGamming extends Laptop{
    private String bahanBody;

    public LaptopGamming(String bahanBody, String merk, float harga, float berat, String tipeProsesor, String jenisBaterai) {
        super(merk, harga, berat, tipeProsesor, jenisBaterai);
        this.bahanBody = bahanBody;
    }
    
    public void bonusAsesoris(){
        if(bahanBody.compareTo("Carbon")==0){
            System.out.println("Bonus Asesoris : Mouse"+bahanBody);
        }else if(bahanBody.compareTo("Aluminium")==0){
            System.out.println("Bonus Asesoris : Mouse dan Headset"+bahanBody);
        }else if(bahanBody.compareTo("Magnesium")==0){
            System.out.println("Bonus Asesoris : Mouse, Headset, dan Keyboard"+bahanBody);
        }
    }
    
    public void showDataLaptopGamming() {
        showDataLaptop();
        System.out.println("Bahan Body                       :"+bahanBody);
    }
}
