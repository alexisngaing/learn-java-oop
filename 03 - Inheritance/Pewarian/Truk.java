public class Truk extends KendaraanBermotor
{
    protected int dayaAngkut;
    
    public Truk(String no, int thn, int da)
    {
        super(no, thn);
        dayaAngkut = da;
    }

    // public void bergerak()
    // {	
    //     System.out.println("Kendaraan Bermotor : bergerak");
    // }
    
    public int getDayaAngkut()
    {
        return dayaAngkut;
    }
}
