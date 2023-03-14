/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd4_latihan;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class Android extends Smartphone{
    int resolusiKamera;
    String chipset;

    public Android(int resolusiKamera, String chipset, String merk, float harga, float berat, int kapasitasBaterai, int kapasitasMemory) {
        super(merk, harga, berat, kapasitasBaterai, kapasitasMemory);
        this.resolusiKamera = resolusiKamera;
        this.chipset = chipset;
    }
    
    public void tingkatanResolusiKamera(){
        if(resolusiKamera <= 50){
            System.out.println("Good"+resolusiKamera);
        }else if(resolusiKamera <= 150){
            System.out.println("Excellent"+resolusiKamera);
        }else if(resolusiKamera <= 200){
            System.out.println("Amazing"+resolusiKamera);
        }
    }
    
    public void showDataAndroid()
    {
        showDataSmartphone();
        System.out.println("Resolusi Kamera                  :"+resolusiKamera);
        System.out.println("Chipset                          :"+chipset);
    }
}
