package ugd11_b_11;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;

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
        System.out.println("\tTampil Data");
        System.out.println("Nama Bank   : " + namaBank);
        System.out.println("Alamat Bank : " + alamatBank);
        
        for (int i = 0; i < listPetugas.size(); i++) {
            System.out.println("Petugas ke- " + (i+1));
            listPetugas.get(i).showPetugas();
        }
    }
    
    
}
