package ugd14_b_11;

import static junit.framework.TestCase.assertNotNull;
import org.junit.Test;
import static org.junit.Assert.*;
import ugd14_b_11.Kurir;

/**
 *
 * @author ASUS
 */
public class KurirObjekTest extends junit.framework.TestCase {
    
    Kurir k;
    
    public KurirObjekTest() {
    }

    @Test
    public void testKurirObjekTest() {
        System.out.println("Buat Objek");
        k = new Kurir("Saya", "KU1234", 1000000);
        assertNotNull(k);
    }
    
    @Test
    public void testKurirObjekTest2() {
        System.out.println("Buat Objek");
        k = new Kurir("", "KU2345", 2000000);
        assertNotNull(k);
    }
    
    @Test
    public void testKurirObjekTest3() {
        System.out.println("Buat Objek");
        k = new Kurir("Saya", "K1234", 3000000);
        assertNotNull(k);
    }
    
    @Test
    public void testKurirObjekTest4() {
        System.out.println("Buat Objek");
        k = new Kurir("Saya", "KU1234", -1000);
        assertNotNull(k);
    }
}
