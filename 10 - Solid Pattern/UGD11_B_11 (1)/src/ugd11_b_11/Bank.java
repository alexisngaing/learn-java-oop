/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_b_11;

import java.util.ArrayList;
/**
 *
 * @author THESSALONICA A MEIL
 */
public class Bank {
    private String namaBank;
    private String alamatBank;
    ArrayList<Petugas> listPetugas = new ArrayList<Petugas>();
    
    public Bank(String namaBank, String alamatBank) {
        this.namaBank = namaBank;
        this.alamatBank = alamatBank;
    }
    
    public void addPetugas(Petugas petugas) {
        listPetugas.add(petugas);
    }
    
    public void showPetugas() {
        System.out.println("\n\tTampil Data");
        System.out.println("Nama Bank   : " + namaBank);
        System.out.println("Alamat Bank : " + alamatBank + "\n");
        
        for (int i = 0; i < listPetugas.size(); i++) {
            System.out.println("Petugas ke- " + (i+1));
            listPetugas.get(i).showPetugas();
        }
    }
}
