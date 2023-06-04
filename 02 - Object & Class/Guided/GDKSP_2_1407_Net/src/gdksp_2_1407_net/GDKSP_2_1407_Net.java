/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gdksp_2_1407_net;

// Import Class
import java.util.Scanner;
/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class GDKSP_2_1407_Net {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Base;
        double Height;
        
        // Create object scanner
        Scanner sc = new Scanner(System.in);
        
        // Create object triangle1
        Triangle triangle1 = new Triangle();
        
        // Create object triangle2
        Triangle triangle2 = new Triangle(5.0, 12.0);
        
        // Print object triangle1
        System.out.println("\n[ Triangle 1 ]");
        System.out.println("\nBase   : " + triangle1.get_base());
        System.out.println("\nHeight : " + triangle1.get_height());
        System.out.println("\nArea   : " + triangle1.area());
        
        // Print object triangle2
        System.out.println("\n[ Triangle 2 ]");
        System.out.println("\nBase   : " + triangle2.get_base());
        System.out.println("\nHeight : " + triangle2.get_height());
        System.out.println("\nArea   : " + triangle2.area());
        
        // Ask user for input
        System.out.println("\n\n[ Input new triangle1 base and height ]");
        
        // Input Base
        System.out.println("\nBase   : ");
        Base = sc.nextDouble();
        System.out.println("\nHeight : ");
        Height = sc.nextDouble();
        
        triangle1.set_base(Base);
        triangle1.set_height(Height);
        
        // Print object triangle1
        System.out.println("\n[ Segitiga 1 ]");
        System.out.println("\nBase   : " + triangle1.get_base());
        System.out.println("\nHeight : " + triangle1.get_height());
        System.out.println("\nArea   : " + triangle1.area());
    }
}
