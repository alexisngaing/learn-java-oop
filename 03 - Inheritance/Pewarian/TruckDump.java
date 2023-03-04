public class TruckDump extends Truk
{
    private int beratTrukKosong;

    public TruckDump(String no, int thn, int da, int b)
    {
        super(no, thn, da);
        beratTrukKosong = b;
    }

    public int hitungBeratMuatan(int totalBeratTimbang)
    {
        return totalBeratTimbang - beratTrukKosong;
    }
}
