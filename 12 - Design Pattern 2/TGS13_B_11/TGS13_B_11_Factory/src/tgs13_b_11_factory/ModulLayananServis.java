package tgs13_b_11_factory;

/**
 *
 * @author yamacat
 */
public class ModulLayananServis extends Soyuz {
    public ModulLayananServis(String docking, int daya, double tangkiOksigen, String fungsiKhusus) {
        super(docking, daya, tangkiOksigen, fungsiKhusus);
    }

    @Override
    public void showData() {
        System.out.println("\n=== Modul Layanan Servis ===");
        System.out.println("Docking        : " + this.docking);
        System.out.println("Daya           : " + this.daya + " kW");
        System.out.println("Tangki Oksigen : " + this.tangkiOksigen + " pound");
        System.out.println("Fungsi Khusus  : " + this.fungsiKhusus);
    }
}
