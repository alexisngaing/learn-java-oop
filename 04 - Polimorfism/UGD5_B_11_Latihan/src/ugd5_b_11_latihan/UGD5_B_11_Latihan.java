package ugd5_b_11_latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class UGD5_B_11_Latihan {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String nomorResi, tujuan, waktuPengiriman, waktuTiba;
        double berat, tarifBerat, tarifPacking, tarifAngkutanReguler, tarifJemput, tarifAngkutanPrioritas;
        int menu, count;
        
        ArrayList<Paket> pkt = new ArrayList<>();
        
        do {
            System.out.println("=== [ SICEPAT MULTIVERSE ] ===");
            System.out.println("[1] Reguler");
            System.out.println("[2] Express");
            System.out.println("[3] Show Data");
            System.out.println("[0] Exit");
            System.out.println(">>> "); menu = Integer.parseInt(br.readLine());

            switch (menu) {
                case 1 :
                    System.out.println("Banyak data Paket Reguler : "); count = Integer.parseInt(br.readLine());
                    for (int i = 0; i < count; i++) { 
                        System.out.println("Nomor resi : "); nomorResi = br.readLine();
                        System.out.println("Tujuan : "); tujuan = br.readLine();
                        System.err.println("Pengiriman (dd/MM/yyyy HH:mm : "); waktuPengiriman = br.readLine();
                        System.err.println("Tiba (dd/MM/yyyy HH:mm : "); waktuTiba = br.readLine();
                        System.out.println("Berat : "); berat = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Berat : "); tarifBerat = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Packaging : "); tarifPacking = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Angkutan reguler : "); tarifAngkutanReguler = Double.parseDouble(br.readLine());

                        pkt.add(new Reguler(nomorResi, tujuan, berat, tarifBerat, waktuPengiriman, waktuTiba, tarifPacking, tarifAngkutanReguler));
                    }
                    break;

                case 2 :
                    System.out.println("Banyak data Paket Express : "); count = Integer.parseInt(br.readLine());
                    for (int i = 0; i < count; i++) { 
                        System.out.println("Nomor resi : "); nomorResi = br.readLine();
                        System.out.println("Tujuan : "); tujuan = br.readLine();
                        System.err.println("Pengiriman (dd/MM/yyyy HH:mm : "); waktuPengiriman = br.readLine();
                        System.err.println("Tiba (dd/MM/yyyy HH:mm : "); waktuTiba = br.readLine();
                        System.out.println("Berat : "); berat = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Berat : "); tarifBerat = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Jemput : "); tarifJemput = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Angkutan Prioritas : "); tarifAngkutanPrioritas = Double.parseDouble(br.readLine());

                        pkt.add(new Express(nomorResi, tujuan, berat, tarifBerat, waktuPengiriman, waktuTiba, tarifJemput, tarifAngkutanPrioritas));
                    }
                    break;

                case 3 :
                    for (int i = 0; i < pkt.size(); i++) {
                        System.out.println("--- [ Data Paket " + (i + 1) + " ] ---");
                        pkt.get(i).showData();
                    }
                    break;

                case 0 :
                    System.out.println("Exit...");
                    break;

                default :
                    System.err.println("\tMenu invalid [!]");
                    break;
            }
        } while (menu != 0);
    }
}
