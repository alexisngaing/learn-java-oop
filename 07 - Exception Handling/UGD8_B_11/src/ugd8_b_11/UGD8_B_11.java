package ugd8_b_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;
import exception.ExceptionTarif;
import exception.ExceptionId;
import exception.ExceptionBerat;

/**
 *
 * @author ASUS
 */
public class UGD8_B_11 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String namaPenerima, noTelpPenerima, idReguler, idExpress;
        double berat, tarifPacking, tarifJemput;
        
        try {
            System.out.print("Masukkan Nama Penerima        : "); namaPenerima = br.readLine();
            System.out.print("Masukkan No Telp Penerima     : "); noTelpPenerima = br.readLine();
            System.out.print("Masukkan Berat Paket          : "); berat = Double.parseDouble(br.readLine());
            System.out.print("Masukkan ID Paket Reguler     : "); idReguler = br.readLine();
            System.out.print("Masukkan Tarif Packing        : "); tarifPacking = Double.parseDouble(br.readLine());
            Reguler R = new Reguler(namaPenerima, noTelpPenerima, berat, idReguler, tarifPacking);
            R.showPaketReguler();
            
            System.out.print("Masukkan Nama Penerima        : "); namaPenerima = br.readLine();
            System.out.print("Masukkan No Telp Penerima     : "); noTelpPenerima = br.readLine();
            System.out.print("Masukkan Berat Paket          : "); berat = Double.parseDouble(br.readLine());
            System.out.print("Masukkan ID Paket Express     : "); idExpress = br.readLine();
            System.out.print("Masukkan Tarif Jemput         : "); tarifJemput = Double.parseDouble(br.readLine());
            Express E = new Express(namaPenerima, noTelpPenerima, berat, idExpress, tarifJemput);
            E.showPaketExpress();
            
        } catch (ExceptionNama e1) {
            e1.showMessage();
        } catch (ExceptionNomorTelepon e2) {
            e2.showMessage();
        } catch (ExceptionTarif e3) {
            System.err.println(e3.getMessage());
        } catch (ExceptionId e4) {
            System.err.println(e4.getMessage());
        } catch (ExceptionBerat e5) {
            e5.showMessage();
        } catch (Exception e) {}
    }  
}
