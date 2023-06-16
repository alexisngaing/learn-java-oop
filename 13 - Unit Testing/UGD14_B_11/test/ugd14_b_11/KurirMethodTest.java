package ugd14_b_11;

import org.junit.Test;
import static org.junit.Assert.*;
import ugd14_b_11.Kurir;

/**
 *
 * @author ASUS
 */
public class KurirMethodTest extends junit.framework.TestCase {
    
    Kurir k;
    
    public KurirMethodTest() {
    }
    
    public void setUp() {
        k = new Kurir("Nama", "KU1234", 1000000);
    }

    /**
     * Test of hitungTotalGaji method, of class Kurir.
     */
    @Test
    public void testHitungTotalGaji() {
        System.out.println("Hitung Total Gaji");
        double Tunjangan = -1;
        double expResult = 5.0;
        k.hitungTotalGaji(Tunjangan);
        assertFalse(k.getGaji_pokok() != expResult);
    }
    
    @Test
    public void testHitungTotalGaji2() {
        System.out.println("Hitung Total Gaji");
        double Tunjangan = 1;
        double expResult = 6.0;
        k.hitungTotalGaji(Tunjangan);
        assertFalse(k.getGaji_pokok() == expResult);
    }

    /**
     * Test of hitungPajak method, of class Kurir.
     */
    @Test
    public void testHitungPajak() {
        System.out.println("Hitung Pajak");
        double persentase = -2;
        double expResult = 7.0;
        k.hitungPajak(persentase);
        assertTrue(k.hitungPajak(persentase) == expResult);
    }
    
    @Test
    public void testHitungPajak2() {
        System.out.println("Hitung Pajak");
        double persentase = 2;
        double expResult = 8;
        k.hitungPajak(persentase);
        assertTrue(k.hitungPajak(persentase) != expResult);
    }

    /**
     * Test of hitungBonus method, of class Kurir.
     */
    @Test
    public void testHitungBonus() {
        System.out.println("Hitung Bonus");
        double jumlahPaket = 3;
        double biayaPerPaket = -3;
        double expResult = 9.0;
        k.hitungBonus(jumlahPaket, biayaPerPaket);
        assertFalse(k.hitungBonus(jumlahPaket, biayaPerPaket) == expResult);
    }
    
    @Test
    public void testHitungBonus2() {
        System.out.println("Hitung Bonus");
        double jumlahPaket = -4;
        double biayaPerPaket = 4;
        double expResult = 10.0;
        k.hitungBonus(jumlahPaket, biayaPerPaket);
        assertFalse(k.hitungBonus(jumlahPaket, biayaPerPaket) == expResult);
    }
    
    @Test
    public void testHitungBonus3() {
        System.out.println("Hitung Bonus");
        double jumlahPaket = 5;
        double biayaPerPaket = 5;
        double expResult = 2.5;
        k.hitungBonus(jumlahPaket, biayaPerPaket);
        assertEquals(k.hitungBonus(jumlahPaket, biayaPerPaket), expResult);
    }

    /**
     * Test of tampil method, of class Kurir.
     */
    @Test
    public void testTampil() {
        System.out.println("Tampil");
        String expResult = "Kurir dengan nama Nama id kurir KU1234 memiliki Gaji 1000000.0";
        assertEquals(k.tampil(), expResult);
    }
    
}
