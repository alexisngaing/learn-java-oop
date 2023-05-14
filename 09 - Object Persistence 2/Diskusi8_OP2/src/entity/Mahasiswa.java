package entity;

public class Mahasiswa {
    private String npm;
    private String namaMhs;
    private Prodi prodi;
    
    public Mahasiswa(String npm,String namaMhs, Prodi prodi) {
        this.npm = npm;
        this.namaMhs = namaMhs;
        this.prodi = prodi;
    }

    public String getNPM() {
        return npm;
    }
    
    public String getNamaMahasiswa() {
        return namaMhs;
    }
    
    public Prodi getProdi() {
        return prodi;
    }

}
