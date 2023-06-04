package gd6_b_11407;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Jurusan {
    private String namaJurusan;
    private String kodeJurusan;
    
    public Jurusan(String namaJurusan, String kodeJurusan) {
        this.namaJurusan = namaJurusan;
        this.kodeJurusan = kodeJurusan;
    }
    
    public void showJurusan() {
        System.out.println("Nama Jurusan : " + namaJurusan);
        System.out.println("Kode Jurusan : " + kodeJurusan);
    }
}
