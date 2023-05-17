package gdsrp_b_11407;

public class TataUsaha {
    private String namaKepalaTU;
    private String jamLayananTU;

    public TataUsaha(String namaKepalaTU, String jamLayananTU) {
        this.namaKepalaTU = namaKepalaTU;
        this.jamLayananTU = jamLayananTU;
    }

    public void showTU() {
        System.out.println("Nama Kepala TU : " + namaKepalaTU);
        System.out.println("Jam Layanan TU : " + jamLayananTU + "\n");
    }

    public void ubahJamLayananTU(String jamLayananTU) {
        this.jamLayananTU = jamLayananTU;
    }
}
