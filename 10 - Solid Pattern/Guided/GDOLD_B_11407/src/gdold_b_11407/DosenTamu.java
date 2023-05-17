package gdold_b_11407;

public class DosenTamu extends Pengajar implements IMengajar {
    private double honor;
    private double jmlJamKerja;

    public DosenTamu(String namaDosen, double honor, double jmlJamKerja) {
        super(namaDosen);
        this.honor = honor;
        this.jmlJamKerja = jmlJamKerja;
    }

    public void showPengajar() {
        System.out.println("Dosen : " + namaPengajar + " - " + honor + " - " + jmlJamKerja);
        MengajarTeori();
        MengajarPraktikum();
        System.out.println("");
    }

    public void MengajarTeori() {
        System.out.println("Dosen " + namaPengajar + " mengajar teori");
    }

    public void MengajarPraktikum() {
        System.out.println("Dosen " + namaPengajar + " mengajar praktikum");
    }
}
