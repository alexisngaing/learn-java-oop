package ugd8_b_11;

import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;
import exception.ExceptionTarif;
import exception.ExceptionId;
import exception.ExceptionBerat;
/**
 *
 * @author ASUS
 */
public class Reguler extends Paket{
    private String idReguler;
    private double tarifPacking;
    
    public Reguler (String namaPenerima, String noTelpPenerima, double berat, String idReguler, double tarifPacking) throws ExceptionNama, ExceptionNomorTelepon, ExceptionTarif, ExceptionId, ExceptionBerat {
        super(namaPenerima, noTelpPenerima, berat);
        
        if (!(idReguler.contains("REG-"))) {
            throw new ExceptionId("[!] Id Paket Reguler Harus ada unsur 'REG-' [!]");
        } else if (!(tarifPacking >= 0 && tarifPacking <= 20000)) {
            throw new ExceptionTarif("[!] Tarif Packing Reguler Harus diantara 0 dan 20000 [!]");
        } else {
            this.idReguler = idReguler;
            this.tarifPacking= tarifPacking;
        }
    }
    
    public void showPaketReguler() {
        showPaket();
        System.out.println("ID Paket Reguler    : " + idReguler);
        System.out.println("Tarif Packing       : " + tarifPacking);
        totalBiayaReguler();
        System.out.println("\n===============================================\n");
    }
    
    public void totalBiayaReguler() {
        double totalReguler = (berat * 2000) + tarifPacking;
        System.out.println("Total Biaya         : " + totalReguler);
    }
}
