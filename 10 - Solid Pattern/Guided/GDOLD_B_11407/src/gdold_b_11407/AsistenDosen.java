package gdold_b_11407;

public class AsistenDosen extends Pengajar implements IMengajar {
    private int jmlPertemuan;
    private int jmlModul;

    public AsistenDosen(String namaAsisten, int jmlPertemuan, int jmlModul) {
        super(namaAsisten);
        this.jmlPertemuan = jmlPertemuan;
        this.jmlModul = jmlModul;
    }

    public void showPengajar() {
        System.out.println("Asisten : " + namaPengajar + " - " + jmlPertemuan + " - " + jmlModul);
        MengajarPraktikum();
        System.out.println("");
    }

    public void MengajarTeori() {}

    public void MengajarPraktikum() {
        System.out.println("Asisten " + namaPengajar + " mengajar praktikum");
    }
}
