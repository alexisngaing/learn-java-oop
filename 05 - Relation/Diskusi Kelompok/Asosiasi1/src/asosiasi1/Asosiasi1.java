package asosiasi1;

/**
 *
 * @author ASUS
 */
public class Asosiasi1 {

    public static void main(String[] args) {
        Dosen pam = new Dosen("007", "PAM");
        
        MataKuliah mk1, mk2, mk3, mk4, mk5;
        mk1 = new MataKuliah("INF001", "PBO", 3);
        mk2 = new MataKuliah("INF002", "SDA", 3);
        mk3 = new MataKuliah("INF003", "P3L", 4);
        mk4 = new MataKuliah("INF004", "PPL", 3);
        mk5 = new MataKuliah("INF005", "DasPro", 3);
        
        pam.tambahMK(mk1); pam.tambahMK(mk2); pam.tambahMK(mk2);
        pam.tambahMK(mk4); pam.tambahMK(mk5); 
        
        pam.lihatMK();
    }
}
