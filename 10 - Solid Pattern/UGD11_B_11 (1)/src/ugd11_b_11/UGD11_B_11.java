/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd11_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author THESSALONICA A MEIL
 */
public class UGD11_B_11 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        String namaKantor, namaKepalaKantor, pendidikanAkhirKepalaKantor, namaBank, alamatBank, fasilitas, area;
        String namaPetugas, noIdentitas, awalKontrak, akhirKontrak;
        int jumlahKeluhan, jumlahNasabah, uangMasuk, tunjangan;
        
        try {
            System.out.println("=== Input Data Kantor ===");
            System.out.print("Nama Kantor           : "); namaKantor = br.readLine();
            System.out.print("Nama kepala Kantor    : "); namaKepalaKantor = br.readLine();
            System.out.print("Pendidikan Akhir      : "); pendidikanAkhirKepalaKantor = br.readLine();
            Kantor K = new Kantor(namaKantor, namaKepalaKantor, pendidikanAkhirKepalaKantor);
            
            System.out.println("=== Input Data Bank ===");
            System.out.print("Nama Bank           : "); namaBank = br.readLine();
            System.out.print("Alamat Bank         : "); alamatBank = br.readLine();
            Bank B = new Bank(namaBank, alamatBank);
            
            System.out.println("=== Input Data Account Officer ===");
            System.out.print("Nama Petugas          : "); namaPetugas = br.readLine();
            System.out.print("Nomor Identitas       : "); noIdentitas = br.readLine();
            System.out.print("Awal Kontrak          : "); awalKontrak = br.readLine();
            System.out.print("Akhir Kontrak         : "); akhirKontrak = br.readLine();
            System.out.print("Jumlah Nasabah        : "); jumlahNasabah = Integer.parseInt(br.readLine());
            System.out.print("Area                  : "); area = br.readLine();
            AccountOfficer AO = new AccountOfficer(jumlahNasabah, area, namaPetugas, noIdentitas, awalKontrak, akhirKontrak);
            B.addPetugas(AO);
            
//            System.out.println("=== Input Data Teller ===");
//            System.out.print("Nama Petugas        : "); namaPetugas = br.readLine();
//            System.out.print("Nomor Identitas     : "); noIdentitas = br.readLine();
//            System.out.print("Awal Kontrak        : "); awalKontrak = br.readLine();
//            System.out.print("Akhir Kontrak       : "); akhirKontrak = br.readLine();
//            System.out.print("Jumlah uang masuk   : "); uangMasuk = Integer.parseInt(br.readLine());
//            System.out.print("Tunjangan           : "); tunjangan = Integer.parseInt(br.readLine());
//            Teller T = new Teller(uangMasuk, tunjangan, namaPetugas, noIdentitas, awalKontrak, akhirKontrak);
//            B.addPetugas(T);
//            
//            System.out.println("=== Input Data Customer Service ===");
//            System.out.print("Nama Petugas        : "); namaPetugas = br.readLine();
//            System.out.print("Nomor Identitas     : "); noIdentitas = br.readLine();
//            System.out.print("Awal Kontrak        : "); awalKontrak = br.readLine();
//            System.out.print("Akhir Kontrak       : "); akhirKontrak = br.readLine();
//            System.out.print("Fasilitas           : "); fasilitas = br.readLine();
//            System.out.print("Jumlah Keluhan      : "); jumlahKeluhan = Integer.parseInt(br.readLine());
//            CustomerService C = new CustomerService(fasilitas, jumlahKeluhan, namaPetugas, noIdentitas, awalKontrak, akhirKontrak);
//            B.addPetugas(C);
            
            K.showKantor();
            B.showPetugas();
        } catch (Exception e) {
        }
    }
}
