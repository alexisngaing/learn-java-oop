/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luas_lingkaran;

// import
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Luas_Lingkaran {
    
    public static void main(String[] args) {
        int Range;
        double pi;
        
        Scanner sc = new Scanner(System.in);
        
        Lingkaran lingkaran = new Lingkaran();
        
        System.out.println("Range : " + lingkaran.get_range());
        System.out.println("pi    : " + lingkaran.get_pi());
        System.out.println("Area  : " + lingkaran.area());
    }
    
}
