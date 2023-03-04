public class Mobil extends KendaraanBermotor
{
    private int kapasitas;
    
    public Mobil(String no, int thn, int k)
    {
        super(no, thn);
        kapasitas = k;
    }

    // public void bergerak()
    // {
    //     System.out.println("Kendaraan Bermotor : bergerak");
    // }
    
    public int getKapasitasPenumpang()
    {
        return kapasitas;
    }
}
