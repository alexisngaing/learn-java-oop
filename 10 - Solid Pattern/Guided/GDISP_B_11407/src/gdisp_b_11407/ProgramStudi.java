package gdisp_b_11407;

import java.util.ArrayList;

public class ProgramStudi {
    private String namaProdi;
    private String namaKaprodi;
    ArrayList<Pengajar> listPengajar = new ArrayList<Pengajar>();

    public ProgramStudi(String namaProdi, String namaKaprodi) {
        this.namaProdi = namaProdi;
        this.namaKaprodi = namaKaprodi;
    }

    public void showProdi() {
        System.out.println("Nama Prodi : " + namaProdi);
        System.out.println("Nama Kaprodi : " + namaKaprodi + "\n");
        for (int i = 0; i < listPengajar.size(); i++) {
            System.out.println("Pengajar ke-" + (i + 1));
            listPengajar.get(i).showPengajar();
        }
    }

    public void addPengajar(Pengajar pengajar) {
        listPengajar.add(pengajar);
    }
}
