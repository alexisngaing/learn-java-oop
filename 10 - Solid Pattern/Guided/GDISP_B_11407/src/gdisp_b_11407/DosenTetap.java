package gdisp_b_11407;

public class DosenTetap extends Pengajar implements IMengajarTeori, IMengajarPraktikum {
    private double gajiPokok;
    private double tunjangan;

    public DosenTetap(String namaDosen, double gajiPokok, double tunjangan) {
        super(namaDosen);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    public void showPengajar() {
        System.out.println("Dosen : " + namaPengajar + " - " + gajiPokok + " - " + tunjangan);
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
