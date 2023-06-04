package model;

/**
 * Nama : Thessalonica Angelina Meil
 * NPM  : 210711122
 * 
 * Nama : Alexis Divasonda Sigat Ngaing
 * NPM  : 210711407
 */

public class TenagaMedis {
    private String idTenagaMedis,nama,jenis,noTelepon, npaidi;
    private int tahunMasuk,ppni;

    public TenagaMedis(String idTenagaMedis, String nama, String jenis, int tahunMasuk, String noTelepon, String npaidi, int ppni) {
        this.idTenagaMedis = idTenagaMedis;
        this.nama = nama;
        this.jenis = jenis;
        this.tahunMasuk = tahunMasuk;
        this.noTelepon = noTelepon;
        this.npaidi = npaidi;
        this.ppni = ppni;
    }

    public String getIdTenagaMedis() {
        return idTenagaMedis;
    }

    public void setIdTenagaMedis(String idTenagaMedis) {
        this.idTenagaMedis = idTenagaMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getNpaidi() {
        return npaidi;
    }

    public void setNpaidi(String npaidi) {
        this.npaidi = npaidi;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getPpni() {
        return ppni;
    }

    public void setPpni(int ppni) {
        this.ppni = ppni;
    }
    
    public String showData() {
        if (this.ppni == 0) {
            return 
                "ID       : " + this.idTenagaMedis + "\n"
                + "Nama     : " + this.nama + "\n"
                + "Tahun    : " + this.tahunMasuk + "\n"
                + "No Telp  : " + this.noTelepon + "\n"
                + "NPAIDI   : " + this.npaidi + "\n";
        } else {
            return
                "ID       : " + this.idTenagaMedis + "\n"
                + "Nama     : " + this.nama + "\n"
                + "Tahun    : " + this.tahunMasuk + "\n"
                + "Nomor    : " + this.noTelepon + "\n"
                + "NIRAPPNI :" + this.ppni + "\n";
        }
    }
}
