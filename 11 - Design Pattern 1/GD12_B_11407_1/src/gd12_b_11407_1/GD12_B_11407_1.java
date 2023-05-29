package gd12_b_11407_1;

public class GD12_B_11407_1 {

    public static void main(String[] args) {
        Kepala direktur = new Kepala("Direktur Alexis Divasonda S. N.");
        Kepala manager = new Kepala("Manager 210711407");
        
        Karyawan asisten = new Karyawan("Bobi", "Asisten Direktur");
        Karyawan cs = new Karyawan("Mari", "Customer Service");
        Karyawan sekret = new Karyawan("Studi", "Sekretaris");
        
        direktur.tambahBawahan(manager);
        direktur.tambahBawahan(asisten);
        
        manager.tambahBawahan(cs);
        manager.tambahBawahan(sekret);
        
        direktur.showData();
    }
}
