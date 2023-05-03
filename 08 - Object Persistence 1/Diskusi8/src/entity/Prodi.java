package entity;

public class Prodi {
    private String kodeProdi;
    private String namaProdi;
    
    public Prodi(String kodeProdi,String namaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
    }

    public String getKodeProdi() {
        return kodeProdi;
    }
    public String getNamaProdi() {
        return namaProdi;
    }

}
