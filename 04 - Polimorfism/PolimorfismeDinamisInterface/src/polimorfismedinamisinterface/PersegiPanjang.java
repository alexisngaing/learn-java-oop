/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismedinamisinterface;

/**
 *
 * @author yama
 */
public class PersegiPanjang  implements iBentuk2D{
    protected double panjang;
    protected double lebar;
    
    public PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }
    
    public double luas() {
        return panjang * lebar;
    }
    
    public double keliling() {
        return 2 * (panjang + lebar);
    }
    
    public void display() {
        System.out.println("Luas dan Keliling dari Persegi Panjang");
        System.out.println("Luas     : " + luas());
        System.out.println("Keliling : " + keliling() + "\n");
    }
}
