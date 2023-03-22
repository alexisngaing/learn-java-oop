package tgs4_b_11;

/**
 *
 * @author Kelompok 11
 */
public class Karnivora extends Hewan{
    private String tingkatKeganasan;
    private String jenisMakanan;
    
    public Karnivora(String nama, float umur, float berat, String berkembangBiak, String tingkatKeganasan, String jenisMakanan) {
        super(nama, umur, berat, berkembangBiak);
        this.tingkatKeganasan = tingkatKeganasan;
        this.jenisMakanan = jenisMakanan;
    }
    
    public float hitungJumlahMakanan() {
        if (tingkatKeganasan.equalsIgnoreCase("Agresif")) {
            return berat * 5/100;
        } else if (tingkatKeganasan.equalsIgnoreCase("Buas")) {
            return berat * 15/100;
        } else if (tingkatKeganasan.equalsIgnoreCase("Ramah")) {
            return berat * 25/100;
        } else {
            return 0;
        }
    }
    
    public void showDataKarnivora() {
        showDataHewan();
        System.out.println("Tingkat Keganasan     : " + tingkatKeganasan);
        System.out.println("Jenis Makanan         : " + jenisMakanan);
        System.out.println("Hitung Jumlah Makanan : " + hitungJumlahMakanan());
    }
}
