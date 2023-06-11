/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd13_b_11;

/**
 *
 * @author THESSALONICA A MEIL
 */
public class KaryawanFactory {
    public Karyawan createKaryawan(String jenisKaryawan, String nama, double tunjangan, Toko toko, String jenis, int jumlahLembur) {
        if (jenisKaryawan.equals("Manager")) {
            return new Manager(nama, tunjangan, toko, jenis);
        } else if (jenisKaryawan.equals("Kasir")) {
            return new Kasir(nama, tunjangan, toko, jumlahLembur);
        } else {
            return null;
        }
    }
}
