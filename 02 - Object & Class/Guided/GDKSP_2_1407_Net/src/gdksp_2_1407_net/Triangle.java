/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdksp_2_1407_net;

/**
 *
 * @author Alexis Divasonda Sigat Ngaing
 */
public class Triangle 
{
    private double base;
    private double height;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle()
    {
        // initialise instance variables
        base = 3.0;
        height = 4.0;
    }

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    
    public double get_base()
    {
        return base;
    }
    
    public void set_base(double base)
    {
        this.base = base;
    }
    
    public double get_height()
    {
        return height;
    }
    
    public void set_height(double height)
    {
        this.height = height;
    }
    
    public double area()
    {
        return (base * height)/2;
    }
}
