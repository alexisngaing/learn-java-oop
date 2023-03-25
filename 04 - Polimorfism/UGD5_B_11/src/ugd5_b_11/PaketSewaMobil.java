/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd5_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public abstract class PaketSewaMobil {
    protected String nomorTransaksi;
    protected String jenisMobil;
    protected double jarak;
    protected double tarifBensin;
    
    public PaketSewaMobil(String nomorTransaksi, String jenisMobil, double jarak, double tarifBensin) {
        this.nomorTransaksi = nomorTransaksi;
        this.jenisMobil = jenisMobil;
        this.jarak = jarak;
        this.tarifBensin = tarifBensin;
    }
    
    public abstract void showDataPaketSewaMobil();
}
