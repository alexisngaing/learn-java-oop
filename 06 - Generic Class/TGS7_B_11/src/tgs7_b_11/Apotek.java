package tgs7_b_11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kelompok 11
 */
public class Apotek <X> {
    private String namaApotek;
    private List<X> daftarX;

    public Apotek(String namaApotek) {
        this.namaApotek = namaApotek;
        daftarX = new ArrayList();
    }
    
    public void add(X part){
        daftarX.add(part);
    }
    
    public String getNamaApotek() {
        return namaApotek;
    }
    
    public List<X> getDaftar() {
        return daftarX;
    }
}
