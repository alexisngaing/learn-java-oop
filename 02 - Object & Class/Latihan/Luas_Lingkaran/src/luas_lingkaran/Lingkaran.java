/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luas_lingkaran;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    private int range;
    private double pi;
    
    public Lingkaran() {
        range = 14;
        pi = 3.14;
    }
    
    public Lingkaran(int range, double pi) {
        this.range = range;
        this.pi = pi;
    }
    
    public double get_range() {
        return range;
    }
    
    public void set_range(int range) {
        this.range = range;
    }
    
    public double get_pi() {
        return pi;
    }
    
    public void set_pi(double pi) {
        this.pi = pi;
    }
    
    public double area() {
        return pi * (range^2);
    }
}
