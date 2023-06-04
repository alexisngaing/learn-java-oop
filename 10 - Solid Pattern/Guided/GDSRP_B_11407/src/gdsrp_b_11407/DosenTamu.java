package gdsrp_b_11407;

public class DosenTamu implements IMengajar {
    private String namaDosen;
    private double honor;
    private double jmlJamKerja;

    public DosenTamu(String namaDosen, double honor, double jmlJamKerja) {
        this.namaDosen = namaDosen;
        this.honor = honor;
        this.jmlJamKerja = jmlJamKerja;
    }

    public void showDosenTamu() {
        System.out.println("Dosen : " + namaDosen + " - " + honor + " - " + jmlJamKerja);
        MengajarTeori();
        MengajarPraktikum();
        System.out.println("");
    }

    public void MengajarTeori() {
        System.out.println("Dosen " + namaDosen + " mengajar teori");
    }

    public void MengajarPraktikum() {
        System.out.println("Dosen " + namaDosen + " mengajar praktikum");
    }
}
