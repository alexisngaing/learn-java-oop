package ugd11_b_11;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ASUS
 */
public abstract class Petugas {
    public String namaPetugas;
    public String noIdentitas;
    public String awalKontrak;
    public String akhirKontrak;
    
    public Petugas(String namaPetugas, String noIdentitas, String awalKontrak, String akhirKontrak) {
        this.namaPetugas = namaPetugas;
        this.noIdentitas = noIdentitas;
        this.awalKontrak = awalKontrak;
        this.akhirKontrak = akhirKontrak;
    }
    
    public double hitungKontrak() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime start = LocalDateTime.parse(awalKontrak, format);
        LocalDateTime finish = LocalDateTime.parse(akhirKontrak, format);
        
        Duration durasi = Duration.between(start,finish);
        return durasi.toDays();
    }
    
    public abstract void showPetugas();
}
