package model;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

public class RekamMedis {
    private int id;
    private String diagnosis;
    private float total_biaya;
    private String tindakan;
    private TenagaMedis tenagaMedis;
    private Pasien pasien;

    public RekamMedis(int id, String diagnosis, float total_biaya, String tindakan, TenagaMedis tenagaMedis, Pasien pasien) {
        this.id = id;
        this.diagnosis = diagnosis;
        this.total_biaya = total_biaya;
        this.tindakan = tindakan;
        this.tenagaMedis = tenagaMedis;
        this.pasien = pasien;
    }
    
    public RekamMedis(String diagnosis, float total_biaya, String tindakan, TenagaMedis tenagaMedis) {
        this.diagnosis = diagnosis;
        this.total_biaya = total_biaya;
        this.tindakan = tindakan;
        this.tenagaMedis = tenagaMedis;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public float getTotalBiaya() {
        return total_biaya;
    }

    public void setTotalBiaya(float total_biaya) {
        this.total_biaya = total_biaya;
    }

    public String getTindakan() {
        return tindakan;
    }

    public void setTindakan(String tindakan) {
        this.tindakan = tindakan;
    }

    public TenagaMedis getTenagaMedis() {
        return tenagaMedis;
    }

    public void setTenagaMedis(TenagaMedis tenagaMedis) {
        this.tenagaMedis = tenagaMedis;
    }
    
    public Pasien getPasien() {
        return pasien;
    }
    
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }
}
