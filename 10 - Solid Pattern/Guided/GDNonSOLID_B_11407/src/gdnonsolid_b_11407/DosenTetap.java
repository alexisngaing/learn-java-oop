package gdnonsolid_b_11407;

public class DosenTetap implements IMengajar {
    private String namaDosen;
    private double gajiPokok;
    private double tunjangan;

    public DosenTetap(String namaDosen, double gajiPokok, double tunjangan) {
        this.namaDosen = namaDosen;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    public void showDosenTetap() {
        System.out.println("Dosen : " + namaDosen + " - " + gajiPokok + " - " + tunjangan);
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
