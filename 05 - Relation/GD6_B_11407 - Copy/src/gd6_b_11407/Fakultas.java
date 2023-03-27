package gd6_b_11407;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Fakultas {
    private String namaFakultas, kodeFakultas;
    private Jurusan jurusan[];
    
    private int counter = 0;
    
    public Fakultas(String namaFakultas, String kodeFakultas) {
        this.namaFakultas = namaFakultas;
        this.kodeFakultas = kodeFakultas;
        jurusan = new Jurusan[2];
    }
    
    public void addJurusan(String namaJurusan, String kodeJurusan) {
        jurusan[counter] = new Jurusan(namaJurusan, kodeJurusan);
        counter++;
    }
    
    public void showFakultas() {
        System.out.println("--- [ Tampil Fakultas ] ---");
        System.out.println("Nama Fakultas  : " + namaFakultas);
        System.out.println("Kode Fakultas  : " + kodeFakultas);
        System.out.println("Jumlah Jurusan : " + counter);
        for (int i = 0; i < counter; i++) {
            System.out.println("\tData Jurusan ke : " + (i + 1));
            jurusan[i].showJurusan();
        }
    }
}
