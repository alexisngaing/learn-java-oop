package tgs13_b_11_factory;

/**
 *
 * @author yamacat
 */
public class SoyuzFactory {
    public Soyuz createSoyuzModul(String  jenis, String docking, int daya, double tangkiOksigen, String sensor) {
        if (jenis.equalsIgnoreCase("Modul Orbital")) {
            return new ModulOrbital(docking, daya, tangkiOksigen, sensor);
        } else if (jenis.equalsIgnoreCase("Modul Re-entry")) {
            return new ModulReEntry(docking, daya, tangkiOksigen, sensor);
        } else if (jenis.equalsIgnoreCase("Modul Layanan Servis")) {
            return new ModulLayananServis(docking, daya, tangkiOksigen, sensor);
        } else {
            return null;
        }
    }
}
