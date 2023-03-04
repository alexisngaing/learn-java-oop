public class KendaraanBermotor
{
    protected String noPlat;
    protected int thnPembuatan;
    
    public KendaraanBermotor(String no, int thn)
    {
        noPlat = no;
        thnPembuatan = thn;
    }

    public void bergerak()
    {
        System.out.println("Kendaraan Bermotor : bergerak");
    }
}
