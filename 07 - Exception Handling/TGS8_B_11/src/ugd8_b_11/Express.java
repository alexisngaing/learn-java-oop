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
public class Express extends Paket{
    private String idExpress;
    private double tarifJemput;
    
    public Express(String namaPenerima, String noTelpPenerima, double berat, String idExpress, double tarifJemput) throws ExceptionNama, ExceptionNomorTelepon, ExceptionTarif, ExceptionId, ExceptionBerat {
        super(namaPenerima, noTelpPenerima, berat);
        
        if (!(idExpress.contains("EXP-"))) {
            throw new ExceptionId("[!] Paket Express Harus ada unsur 'EXP-' [!]");
        } else if (!(tarifJemput >= 5000 && tarifJemput <= 22000)) {
            throw new ExceptionTarif("[!] Tarif Jemput Express Harus diantara 5000 dan 22000 [!]");
        } else {
            this.idExpress = idExpress;
            this.tarifJemput = tarifJemput;
        }
    }
    
    public void showPaketExpress() {
        showPaket();
        System.out.println("Id Paket Express    : " + idExpress);
        System.out.println("Tarif Jemput        : " + tarifJemput);
        totalBiayaExpress();
        System.out.println("\n===============================================\n");
    }
    
    public void totalBiayaExpress() {
        double totalExpress = (berat * 4000) + tarifJemput;
        System.out.println("Total Biaya         : " + totalExpress);
    }
}
