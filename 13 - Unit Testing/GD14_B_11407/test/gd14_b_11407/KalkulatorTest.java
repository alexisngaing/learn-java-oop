package gd14_b_11407;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yamacat
 */
public class KalkulatorTest extends junit.framework.TestCase {
    
    public KalkulatorTest() {}

    /**
     * Test of tambah method, of class Kalkulator.
     */
    @Test
    public void testTambah() {
        System.out.println("tambah");
        int angka1 = 50;
        int angka2 = 10;
        int expResult = 60;
        int result = Kalkulator.tambah(angka1, angka2);
        assertTrue(expResult == result);
    }

    /**
     * Test of kurang method, of class Kalkulator.
     */
    @Test
    public void testKurang() {
        System.out.println("kurang");
        int angka1 = 10;
        int angka2 = 5;
        int expResult = 5;
        int result = Kalkulator.kurang(angka1, angka2);
        assertEquals(expResult, result);
    }

    /**
     * Test of kali method, of class Kalkulator.
     */
    @Test
    public void testKali() {
        System.out.println("kali");
        int angka1 = 5;
        int angka2 = 7;
        int expResult = 30;
        int result = Kalkulator.kali(angka1, angka2);
        assertFalse(expResult == result);
    }

    /**
     * Test of bagi method, of class Kalkulator.
     */
    @Test
    public void testBagi() {
        System.out.println("bagi");
        int angka1 = 10;
        int angka2 = 2;
        int expResult = 5;
        int result = Kalkulator.bagi(angka1, angka2);
        assertEquals(expResult, result);
    }
    
}
