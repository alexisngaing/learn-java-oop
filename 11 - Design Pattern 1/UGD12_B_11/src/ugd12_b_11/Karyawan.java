package ugd12_b_11;

public abstract class Karyawan {
    protected String nama;
    protected double tunjangan;
    protected Toko toko;
    public static StringBuffer space  = new StringBuffer();
    
    public Karyawan(String nama, double tunjangan, Toko toko) {
        this.nama = nama;
        this.tunjangan = tunjangan;
        this.toko = toko;
        this.toko.RegisterObserver(this);
    }
    
    public abstract void ShowData();
    
    public abstract void Update(double jumlah);
}
