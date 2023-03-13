package tgs3_b_11;

/**
 *
 * @author ASUS
 */
public class Buku {
    private String judul, jenis;
    private int isbn, telatKembali;
    private static int jmlBuku = 0;
    
    public Buku() {
        judul = "Pengaruh Teknologi Pada Pendidikan";
        jenis = "Skripsi";
        isbn = 54321;
        telatKembali = 4; 
        jmlBuku++;
    }
   
    public Buku(String judul, String jenis, int isbn, int telatKembali) {
        this.judul = judul;
        this.jenis = jenis;
        this.isbn = isbn;
        this.telatKembali = telatKembali;
        this. jmlBuku++;
    }
   
    public String getJudul(){
        return judul;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
   
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
   
    public int getIsbn(){
        return isbn;
    }
    
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
   
    public int getTelatKembali(){
        return telatKembali;
    }
    
    public void setTelatKembali(int telatKembali){
        this.telatKembali = telatKembali;
    }
    
    public static int jmlBuku() {
        return jmlBuku;
    }
   
    public int bayarDenda(){
        return telatKembali * 20000;
    }
    
    public void tampilBuku() {
        System.out.println("\n=== Tampil Buku ===");
        System.out.println("Judul            : " + judul);
        System.out.println("Jenis            : " + jenis);
        System.out.println("ISBN             : " + isbn);
        System.out.println("Telat Kembali    : " + telatKembali);
        System.out.println("Jumlah Buku      : " + jmlBuku()); // Jumlah ditambahkan dengan data default. Jadi, hasilnya akan 2.
        System.out.println("Denda            : " + bayarDenda());
        
    }
}
