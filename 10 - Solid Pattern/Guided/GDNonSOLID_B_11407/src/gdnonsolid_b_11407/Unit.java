package gdnonsolid_b_11407;

public class Unit {
    private String namaProdi;
    private String namaKaprodi;
    private DosenTetap dosenTetap;
    private String namaKepalaTU;
    private String jamLayananTU;

    public Unit(String namaProdi, String namaKaprodi, String namaKepalaTU, String jamLayananTU) {
        this.namaProdi = namaProdi;
        this.namaKaprodi = namaKaprodi;
        this.namaKepalaTU = namaKepalaTU;
        this.jamLayananTU = jamLayananTU;
    }

    public void showProdi() {
        System.out.println("Nama Prodi : " + namaProdi);
        System.out.println("Nama Kaprodi : " + namaKaprodi);
        dosenTetap.showDosenTetap();
    }

    public void setDosenTetap(DosenTetap dosenTetap) {
        this.dosenTetap = dosenTetap;
    }

    public void showTU() {
        System.out.println("Nama Kepala TU : " + namaKepalaTU);
        System.out.println("Jam Layanan TU : " + jamLayananTU + "\n");
    }

    public void ubahJamLayananTU(String jamLayananTU) {
        this.jamLayananTU = jamLayananTU;
    }
}
