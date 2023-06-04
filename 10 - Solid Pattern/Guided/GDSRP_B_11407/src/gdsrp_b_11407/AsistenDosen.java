package gdsrp_b_11407;

public class AsistenDosen implements IMengajar {
    private String namaAsisten;
    private int jmlPertemuan;
    private int jmlModul;

    public AsistenDosen(String namaAsisten, int jmlPertemuan, int jmlModul) {
        this.namaAsisten = namaAsisten;
        this.jmlPertemuan = jmlPertemuan;
        this.jmlModul = jmlModul;
    }

    public void showAsistenDosen() {
        System.out.println("Asisten : " + namaAsisten + " - " + jmlPertemuan + " - " + jmlModul);
        MengajarPraktikum();
        System.out.println("");
    }

    public void MengajarTeori() {}

    public void MengajarPraktikum() {
        System.out.println("Asisten " + namaAsisten + " mengajar praktikum");
    }
}
