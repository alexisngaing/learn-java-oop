package model;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

public class Pasien {
    private int id;
    private String nama;
    private String ktp;
    private String no_telepon;
    
    public Pasien(int id, String nama, String ktp, String no_telepon) {
        this.id = id;
        this.nama = nama;
        this.ktp = ktp;
        this.no_telepon = no_telepon;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getKtp() {
        return ktp;
    }
    
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    
    public String getNoTelepon() {
        return no_telepon;
    }
    
    public void setNoTelepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }
    
    @Override
    public String toString() {
        return nama;
    }
}
