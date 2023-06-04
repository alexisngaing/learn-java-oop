package ugd4_latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class UGD4_Latihan {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        String merk, tipeProsesor, jenisBaterai, jenis;
        float harga, berat, ukuranLayar, resolusiLayar;
        int kapasitasBaterai, kapasitasMemory, n = 0, j = 0, k = 0;
      
        
        Televisi tlv[] = new Televisi[2];
        Smartphone smt[] = new Smartphone[2];
        Laptop lpt[] = new Laptop[2];
        SmartTV stv  = null;
        LaptopGamming lg  = null;
        Android and = null;
        
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Merk           : "); merk = br.readLine();
                System.out.println("Harga          : "); harga = Float.parseFloat(br.readLine());
                System.out.println("Berat          : "); berat = Float.parseFloat(br.readLine());
                System.out.println("Jenis Elektronik [Televisi | Smartphone | Laptop] : "); jenis = br.readLine();
                
                if (jenis.compareTo("Televisi") == 0) {
                    System.out.println("Ukuran Layar   : "); ukuranLayar = Float.parseFloat(br.readLine());
                    System.out.println("Resolusi Layar : "); resolusiLayar = Float.parseFloat(br.readLine());
                    
                    tlv[n] = new Televisi(merk, harga, berat, ukuranLayar, resolusiLayar);
                    n++;
                } else if (jenis.compareTo("Smartphone") == 0) {
                    System.out.println("Kapasitas Baterai : "); kapasitasBaterai = Integer.parseInt(br.readLine());
                    System.out.println("Kapasitas Memory  : "); kapasitasMemory = Integer.parseInt(br.readLine());
                    
                    smt[j] = new Smartphone(merk, harga, berat, kapasitasBaterai, kapasitasMemory);
                    j++;
                } else if (jenis.compareTo("Laptop") == 0) {
                    System.out.println("Tipe Prosesor : "); tipeProsesor = br.readLine();
                    System.out.println("Jenis Baterai : "); jenisBaterai = br.readLine();
                    
                    lpt[k] = new Laptop(merk, harga, berat, tipeProsesor, jenisBaterai);
                    k++;
                }else if (jenis.compareTo("SmartTV")==0){
                    System.out.println("Ukuran Layar            : "); ukuranLayar = Float.parseFloat(br.readLine());
                    System.out.println("Resolusi Layar          : "); resolusiLayar = Float.parseFloat(br.readLine());
                    System.out.println("Sistem Operasi          : "); String sistemOperasi = br.readLine();
                    System.out.println("Jenis Panel             : "); String jenisPanel = br.readLine();
                    
                    stv = new SmartTV (merk, harga, berat, ukuranLayar, resolusiLayar, sistemOperasi, jenisPanel);
                }else if(jenis.compareTo("Android")==0){
                    System.out.println("Kapasitas Baterai : "); kapasitasBaterai = Integer.parseInt(br.readLine());
                    System.out.println("Kapasitas Memory  : "); kapasitasMemory = Integer.parseInt(br.readLine());
                    System.out.println("Resolusi Kamera   :"); int resolusiKamera = Integer.parseInt(br.readLine());
                    System.out.println("Chipset           :"); String chipset = br.readLine();
                    
                    and = new Android (resolusiKamera, chipset, merk, harga, berat, kapasitasBaterai, kapasitasMemory);
                }else if(jenis.compareTo("LaptopGamming")==0){
                    System.out.println("Tipe Prosesor : "); tipeProsesor = br.readLine();
                    System.out.println("Jenis Baterai : "); jenisBaterai = br.readLine();
                    System.out.println("Bahan Body    :"); String bahanBody = br.readLine();
                    
                    lg = new LaptopGamming (bahanBody, merk, harga, berat, tipeProsesor, jenisBaterai);
                }
            }
            
            System.out.println("\n=== Data Televisi ===");
            for (int i = 0; i < 2; i++) {
                tlv[i].showDataTelevisi();
                System.out.println("\n");
            }
            
            System.out.println("\t=== Data Smartphone ===");
            for (int i = 0; i < 2; i++) {
                smt[i].showDataSmartphone();
                System.out.println("\n");
            }
            
            System.out.println("\t=== Data Laptop ===");
            for (int i = 0; i < 2; i++) {
                lpt[i].showDataLaptop();
            }
            System.out.println("\n");
            
            System.out.println("\t=== Data Smart TV ===");
            stv.showDataSmartTV();
            System.out.println("Biaya Tambahan : Rp. " +stv.biayaTambahan());
            
            System.out.println("\n");
            
            System.out.println("\t=== Data Laptop Gaming ===");
            for (int i = 0; i < 2; i++){
                lg.showDataLaptopGamming();
                System.out.println("\n");
            }
            
            System.out.println("\t=== Data Android ===");
            for (int i = 0; i < 2; i++){
                and.showDataAndroid();
                System.out.println("\n");
            }
            
        } catch (Exception e) {
            System.out.println("\n\t\tSomething wrong [!]");
        }
    } 
}
