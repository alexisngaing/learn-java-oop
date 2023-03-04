
/**
 * Write a description of class Ball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ball
{
    // instance variables - replace the example below with your own
    private int range;
    private String color;
    private int price;
    private static int jumlah;
    
    public Ball()
    {
        jumlah = jumlah + 1;
    }
    
    public Ball(int range, String color, int price)
     {
        this.range = range;
        this.color = color;
        this.price = price;
        this.jumlah = jumlah;
    }
    
    public void set_price(int price)
    {
        this.price = price;
    }
    
    public String get_color()
    {
        return color;
    }
    
    public double volume()
    {
        return ((range * range * range) * 4/3 * 3.14);
    }
}
