package model;

public class MataKuliah {
    private int id;
    private String nama;
    private String deskripsi;
    private String metode_pembelajaran;
    private String kelas;
    private Dosen dosen;

    public MataKuliah(int id, String nama, String deskripsi, String metode_pembelajaran, String kelas, Dosen dosen) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.metode_pembelajaran = metode_pembelajaran;
        this.kelas = kelas;
        this.dosen = dosen;
    }
    
    public MataKuliah(String nama, String deskripsi, String metode_pembelajaran, String kelas, Dosen dosen) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.metode_pembelajaran = metode_pembelajaran;
        this.kelas = kelas;
        this.dosen = dosen;
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

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getMetode_pembelajaran() {
        return metode_pembelajaran;
    }

    public void setMetode_pembelajaran(String metode_pembelajaran) {
        this.metode_pembelajaran = metode_pembelajaran;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
}
