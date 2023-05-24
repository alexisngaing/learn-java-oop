package ugd11_b_11;

/**
 *
 * @author ASUS
 */
public class Kantor {
    private String namaKantor;
    private String namaKepalaKantor;
    private String pendidikanAkhirKepalaKantor;
    
    public Kantor(String namaKantor, String namaKepalaKantor, String pendidikanAkhirKepalaKantor) {
        this.namaKantor = namaKantor;
        this.namaKepalaKantor = namaKepalaKantor;
        this.pendidikanAkhirKepalaKantor = pendidikanAkhirKepalaKantor;
    }
    
    public void showKantor() {
        System.out.println("\ttampilan Data");
        System.out.println("Nama Kantor         : " + namaKantor);
        System.out.println("Nama Kepala Kantor  : " + namaKepalaKantor);
        System.out.println("Pendidikan Terakhir : " + pendidikanAkhirKepalaKantor);
    }
}
