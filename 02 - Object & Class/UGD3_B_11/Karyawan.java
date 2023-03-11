public class Karyawan {
    private String id, namaKaryawan;
    private int jamKerja, upah;
    
    public Karyawan() {
        id = "A123";
        namaKaryawan = "Tolstoy";
        jamKerja = 7;
        upah = 10000;
    }
    
    public Karyawan(String id, String namaKaryawan, int jamKerja, int upah) {
        this.id = id;
        this.namaKaryawan = namaKaryawan;
        this.jamKerja = jamKerja;
        this.upah = upah;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }
    
    public int getJamKerja() {
        return jamKerja;
    }
    
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    
    public int getUpah() {
        return upah;
    }
    
    public void setUpah(int upah) {
        this.upah = upah;
    }
    
    public int totalGaji() {
        return jamKerja * upah;
    }
}
