/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {      
    public static void main(String[] args) {
        String nama = "Alex";
        String npm = "210711407";
        double ipk = 3.4;
        
        Mahasiswa(nama, npm, ipk);
    }
    public static void Mahasiswa(String nama, String npm, double ipk) {
        System.out.println("Nama : " + nama);
        System.out.println("NPM  : " + npm);
        System.out.println("IPK  : " + ipk);
    }
}
