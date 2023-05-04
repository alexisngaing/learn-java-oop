package ugd8_b_11;

import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;
import exception.ExceptionTarif;
import exception.ExceptionId;
import exception.ExceptionBerat;
import exception.ExceptionAlamatPenerima;

/**
 *
 * @author ASUS
 */
public class Kilat extends Paket {
    private String idKilat;
    private double tarifAsuransi;
    private String alamatPenerima;
    
    public Kilat(String namaPenerima, String noTelpPenerima, double berat, String idKilat, double tarifAsuransi, String alamatPenerima) throws ExceptionNama, ExceptionNomorTelepon, ExceptionTarif, ExceptionId, ExceptionBerat, ExceptionAlamatPenerima {
        super(namaPenerima, noTelpPenerima, berat);
        
        if (!(idKilat.startsWith("KIL-"))) {
            throw new ExceptionId("[!] " + idKilat + " tidak diawali dengan 'KIL-' [!]");
        } else if (!(tarifAsuransi >= 7000 && tarifAsuransi <= 25000)) {
            throw new ExceptionTarif("[!] Tarif Asuransi Kilat harus diantara 7000 dan 25000 bukan " + tarifAsuransi + " [!]");
        } else if (!(alamatPenerima.startsWith("jln."))) {
            throw new ExceptionAlamatPenerima("[!] " + alamatPenerima + " tidak diawali dengan huruf 'jln.' [!]");
        } else {
            this.idKilat = idKilat;
            this.tarifAsuransi = tarifAsuransi;
            this.alamatPenerima = alamatPenerima;
        } 
    }
    
    public void showPaketKilat() {
        showPaket();
        System.out.println("ID Paket Kilat      : " + idKilat);
        System.out.println("Alamat Penerima     : " + alamatPenerima);
        System.out.println("Tarif Asuransi      : " + tarifAsuransi);
        totalBiayaKilat();
    }
    public void totalBiayaKilat() {
        double totalKilat = (berat * 5000) + tarifAsuransi;
        System.out.println("TotalBiaya          : " + totalKilat);
    }
}
