package tgs13_b_11_factory;

/**
 *
 * @author yamacat
 */
public class TGS13_B_11_Factory {

    public static void main(String[] args) {
        SoyuzFactory sf = new SoyuzFactory();

        Soyuz soyuz1 = sf.createSoyuzModul("Modul Orbital", "Probe Docking", 600, 1.5, "Antena, kamera, dan palka");
        Soyuz soyuz2 = sf.createSoyuzModul("Modul Re-entry", "No Docking", 400, 1.0, "Window dan heat shield");
        Soyuz soyuz3 = sf.createSoyuzModul("Modul Layanan Servis", "No Docking", 700, 3.5, "Sensor, attitude, antena kurs, mesin penggerak utama, solar panel, dan tangki bahan bakar");

        soyuz1.showData();
        soyuz2.showData();
        soyuz3.showData();
    }
    
    /*
    Penjelasan
    
    Pada pattern factory, instans dibuat dari beberapa kelas turunan.
    Dalam kasus ini, yakni wahana antariksa soyuz, memiliki tiga modul,
    yaitu orbital, re-entry, dan layanan servis. Ketiga modul tersebut 
    merupakan instance atau objek yang mana dibuat dalam kelas factory
    yaitu SoyuzFactory. Ketiga kelas tersebut merupakan turunan dari
    kelas abstract Soyuz.
    */
}
