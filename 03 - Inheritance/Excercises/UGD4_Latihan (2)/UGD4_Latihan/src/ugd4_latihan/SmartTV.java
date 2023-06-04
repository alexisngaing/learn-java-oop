/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd4_latihan;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class SmartTV extends Televisi{
    private String sistemOperasi, jenisPanel;

    public SmartTV(String merk, float harga, float berat, float ukuranLayar, float resolusiLayar, String sistemOperasi, String jenisPanel) {
        super(merk, harga, berat, ukuranLayar, resolusiLayar);
        this.sistemOperasi = sistemOperasi;
        this.jenisPanel = jenisPanel;
    }    
    
    public float biayaTambahan(){
        if(jenisPanel.compareTo("LCD")==0){
            return(harga * (10/100));
        }else if(jenisPanel.compareTo("LED")==0){
            return(harga * (20/100));
        }else if(jenisPanel.compareTo("OLED")==0){
            return(harga * (40/100));
        }
        return 0;
    }
    
    public void showDataSmartTV()
    {
        showDataTelevisi();
        System.out.println("Sistem Operasi                   :"+sistemOperasi);
        System.out.println("Jenis Panel                      :"+jenisPanel);
    }
    
    
}