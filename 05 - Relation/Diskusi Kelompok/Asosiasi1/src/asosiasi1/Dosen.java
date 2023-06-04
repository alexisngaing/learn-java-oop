package asosiasi1;

/**
 *
 * @author ASUS
 */
public class Dosen {
    private String namaDosen;
    private String nppDosen;
    private int jmlMK;
    private MataKuliah daftarMK[];
    
    public Dosen(String nama, String npp) {
        this.namaDosen = nama;
        this.nppDosen = npp;
        daftarMK = new MataKuliah[5];
        jmlMK = 0;
    }
    
    public void tambahMK(MataKuliah mk) {
        daftarMK[jmlMK] = mk;
        jmlMK++;
    }
    
    public void lihatMK() {
        System.out.println("Nama Dosen : " + namaDosen);
        for (int i = 0; i < jmlMK; i++) {
            daftarMK[i].displayMK();  
        }
    }
}
