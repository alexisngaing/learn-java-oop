package asosiasi2;

import java.util.Vector;
/**
 *
 * @author ASUS
 */
public class Dosen {
    private String namaDosen;
    private String nppDosen;
    private Vector<MataKuliah> daftarMK;
    
    public Dosen(String nama, String npp) {
        namaDosen = nama; nppDosen = npp;
        daftarMK = new Vector<MataKuliah>();
    }
    
    public void tambahMK(MataKuliah mk) {
        daftarMK.addElement(mk);
    }
    
    public void lihatMK() {
        System.out.println("Nama Dosen : " + namaDosen);
        for (int i = 0; i < daftarMK.size(); i++) {
            daftarMK.elementAt(i).displayMK();
        }
    }
}
