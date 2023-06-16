package ugd14_b_11;

/**
 *
 * @author ASUS
 */
public class Kurir {
    private String nama, id_kurir;
    private double gaji_pokok;
    private double  totalGaji, bonus, pajak;
    
    public Kurir (String nama, String id_kurir, double gaji_pokok){
        if(nama.isEmpty())
            throw new IllegalArgumentException("Nama Tidak Boleh Kosong [!]");
        if(id_kurir.length() != 6 && !id_kurir.contains("KU"))
            throw new IllegalArgumentException("ID Kurir Harus 6 Digit dan diawali dengan KU[!]");
        if(gaji_pokok < 0)
            throw new IllegalArgumentException("Gaji Kurir Tidah Boleh Kurang Dari 0 [!]");
        
        this.nama = nama;    
        this.id_kurir = id_kurir;
        this.gaji_pokok = gaji_pokok;
    }
    public double getGaji_pokok() {
        return gaji_pokok;
    }
    
    public double hitungTotalGaji (double Tunjangan){
        //NPM 1 (210711122)
        //NPM 2 (210711407)
        if(Tunjangan < 0)
            throw new IllegalArgumentException("Tunjangan Tidak Boleh Kurang Dari 0 [!]");
       
        totalGaji = gaji_pokok + bonus + Tunjangan - hitungPajak(27);
        
        return totalGaji;
    }
    
    public double hitungPajak (double persentase){
        if(persentase < 0)
            throw new IllegalArgumentException("Persentase Tidak Boleh Kurang Dari 0 [!]");
        
        pajak = gaji_pokok * persentase / 100;
        
        return pajak;
    }
    
    public double hitungBonus (double jumlahPaket, double biayaPerPaket){
        if(jumlahPaket < 0)
            throw new IllegalArgumentException("Jumlah Paket Tidak Boleh Kurang Dari 0 [!]");
        if(biayaPerPaket < 0)
            throw new IllegalArgumentException("Biaya Per Paket Tidak Boleh Kurang Dari 0 [!]");
        
       bonus = jumlahPaket * biayaPerPaket * 10 / 100;
       
        return bonus;
    }
    
    public String tampil(){
       return "Kurir dengan nama "  +nama+ " id kurir " +id_kurir+ " memiliki Gaji " +gaji_pokok;
    }
}
