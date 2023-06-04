/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd5_b_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class UGD5_B_11 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String nomorTransaksi, jenisMobil, waktuBerangkat, waktuKembali;
        double jarak, tarifBensin, tarifKebersihan, tarifMaintenance, tarifLepasKunci, tarifKonsumsi, tarifDriver, tarifFullServis;
        int menu, count, i;
        
        ArrayList<PaketSewaMobil> pktSewa = new ArrayList<>();
        
        do {
            System.out.println("=== [ MENU PENGIRIMAN PAKET SEWA MOBIL ] ===");
            System.out.println("[1] Silver");
            System.out.println("[2] Gold");
            System.out.println("[3] Platinum");
            System.out.println("[4] Show Data");
            System.out.println("[0] Exit");
            System.out.println(">>> "); menu = Integer.parseInt(br.readLine());

            switch (menu) {
                case 1 :
                    System.out.println("Banyak Data Paket Silver : "); count = Integer.parseInt(br.readLine());
                    for (i = 0; i < count; i++) { 
                        System.out.println("\t[SILVER]");
                        System.out.println("Nomor Transaksi : "); nomorTransaksi = br.readLine();
                        System.out.println("Jenis Mobil : "); jenisMobil = br.readLine();
                        System.err.println("Waktu Berangkat (dd/MM/yyyy HH:mm) : "); waktuBerangkat = br.readLine();
                        System.err.println("Waktu Kembali (dd/MM/yyyy HH:mm) : "); waktuKembali = br.readLine();
                        System.out.println("Jarak : "); jarak = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Bensin : "); tarifBensin = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Kebersihan : "); tarifKebersihan = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Maintenance : "); tarifMaintenance = Double.parseDouble(br.readLine());    

                        pktSewa.add(new Silver(nomorTransaksi, jenisMobil, jarak, tarifBensin, waktuBerangkat, waktuKembali, tarifKebersihan, tarifMaintenance));
                    }
                    break;
                    
                case 2 :
                    System.out.println("Banyak Data Paket Gold : "); count = Integer.parseInt(br.readLine());
                    for (i = 0; i < count; i++) { 
                        System.out.println("\t[GOLD]");
                        System.out.println("Nomor Transaksi : "); nomorTransaksi = br.readLine();
                        System.out.println("Jenis Mobil : "); jenisMobil = br.readLine();
                        System.err.println("Waktu Berangkat (dd/MM/yyyy HH:mm) : "); waktuBerangkat = br.readLine();
                        System.err.println("Waktu Kembali (dd/MM/yyyy HH:mm) : "); waktuKembali = br.readLine();
                        System.out.println("Jarak : "); jarak = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Bensin : "); tarifBensin = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Lepas Kunci : "); tarifLepasKunci = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Konsumsi : "); tarifKonsumsi = Double.parseDouble(br.readLine());    

                        pktSewa.add(new Gold(nomorTransaksi, jenisMobil, jarak, tarifBensin, waktuBerangkat, waktuKembali, tarifLepasKunci, tarifKonsumsi));
                    }
                    break;
                    
                case 3 :
                    System.out.println("Banyak Data Paket Platinum : "); count = Integer.parseInt(br.readLine());
                    for (i = 0; i < count; i++) { 
                        System.out.println("\t[PLATINUM]");
                        System.out.println("Nomor Transaksi : "); nomorTransaksi = br.readLine();
                        System.out.println("Jenis Mobil : "); jenisMobil = br.readLine();
                        System.err.println("Waktu Berangkat (dd/MM/yyyy HH:mm) : "); waktuBerangkat = br.readLine();
                        System.err.println("Waktu Kembali (dd/MM/yyyy HH:mm) : "); waktuKembali = br.readLine();
                        System.out.println("Jarak : "); jarak = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Bensin : "); tarifBensin = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Driver : "); tarifDriver = Double.parseDouble(br.readLine());
                        System.out.println("Tarif Full Servis : "); tarifFullServis = Double.parseDouble(br.readLine());    

                        pktSewa.add(new Platinum(nomorTransaksi, jenisMobil, jarak, tarifBensin, waktuBerangkat, waktuKembali, tarifDriver, tarifFullServis));
                    }
                    break;
                    
                case 4 :
                    for (i = 0; i < pktSewa.size(); i++) {
                        System.out.println("=== [ DATA SEWA MOBIL " + (i + 1) + " ] ===");
                        pktSewa.get(i).showDataPaketSewaMobil();
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
